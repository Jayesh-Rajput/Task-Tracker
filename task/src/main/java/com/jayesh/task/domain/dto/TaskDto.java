package com.jayesh.task.domain.dto;

import com.jayesh.task.domain.entities.TaskPriority;
import com.jayesh.task.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status

) {
}
