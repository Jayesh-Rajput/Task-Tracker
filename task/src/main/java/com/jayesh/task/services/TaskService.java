package com.jayesh.task.services;

import com.jayesh.task.domain.entities.Task;
import com.jayesh.task.domain.entities.TaskList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskService {

    List<Task> listTasks(UUID taskListId);

    Task createTask(UUID taskListId, Task task);

    Optional<Task> getTask(UUID taskListId, UUID taskId);

    Task updateTask(UUID taskListId , UUID taskId , Task task);

    void deleteTask(UUID taskListId , UUID taskId);
}
