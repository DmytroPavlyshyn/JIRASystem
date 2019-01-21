package com.alpha;


import com.alpha.state.ChangeState;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Jira {
    List<Task> taskList;

    public Jira(List<Task> taskList) {
        this.taskList = taskList;
    }

    Task chooseTask() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for (Task task : taskList) {
            System.out.println(++i + ". " + task);
        }
        do {
            int choice = scanner.nextInt();
            if (choice >= 0 && choice - 1 < taskList.size()) {
                return taskList.get(choice - 1);
            }
        } while (true);
    }

    private Method[] availableMethods() {
        Method[] methods = ChangeState.class.getMethods();

        return methods;
    }

    Method chooseState() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        Method[] methods = availableMethods();
        Arrays.sort(methods, Comparator.comparing(Method::getName));
        for (Method method : methods) {
            System.out.println(++i + ". " + method.getName().replaceFirst("to",""));
        }
        do {
            int choice = scanner.nextInt();
            if (choice >= 0 && choice - 1 < methods.length) {
                return methods[choice - 1];
            }
        } while (true);
    }


    void setStatus(Task task) throws InvocationTargetException, IllegalAccessException {
        Method status = chooseState();
//        status.invoke(task);
        task.changeState(status.getName());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jira jira = new Jira(new ArrayList<Task>() {{
            add(new Task("Test"));
        }});
        System.out.println("What do you want ?");
        Task chosenTask = jira.chooseTask();
        while (true) {

            try {
                System.out.println("Choose state:");
                jira.setStatus(chosenTask);
                System.out.println("Task state: " + chosenTask.getCurrentState());

            } catch (Exception e) {
                System.err.println(e);
            }

        }
    }
}
