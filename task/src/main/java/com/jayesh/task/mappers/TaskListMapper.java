package com.jayesh.task.mappers;

import com.jayesh.task.domain.dto.TaskListDto;
import com.jayesh.task.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);

}
