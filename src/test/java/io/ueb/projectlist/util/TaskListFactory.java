package io.ueb.projectlist.util;

import io.ueb.projectlist.model.Task;
import io.ueb.projectlist.model.TaskStatus;

import java.util.ArrayList;
import java.util.List;

public class TaskListFactory {

    public static List<Task> buildTaskList(){
        List<Task> taskList = new ArrayList<>();
        Task task = new Task();
        task.setName("some task");
        task.setStatus(TaskStatus.NEXT);
        taskList.add(task);
        Task task2 = new Task();
        task2.setStatus(TaskStatus.WAITING);
        task2.setName("some other task");
        List<String> tradeoffs = new ArrayList<>();
        tradeoffs.add("some tradeoff");
        task2.setTradeoffs(tradeoffs);
        taskList.add(task2);

        return taskList;
    }
}
