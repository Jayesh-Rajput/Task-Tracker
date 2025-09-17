package com.jayesh.task.mappers;

import com.jayesh.task.domain.dto.TaskDto;
import com.jayesh.task.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
