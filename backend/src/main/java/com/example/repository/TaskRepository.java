package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.models.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    public Task findByTaskdescription(String taskdescription);
}
