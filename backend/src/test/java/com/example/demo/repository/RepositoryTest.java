package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.example.models.Task;
import com.example.repository.TaskRepository;

@DataJpaTest
public class RepositoryTest {
    
    @Autowired
    private TaskRepository taskRepository;

    @Test
    public void testFindTaskByDescription() {
        final String test_str = "test_str";
        Task task = taskRepository.findByTaskdescription(test_str);

        assertTrue(null == task, "no task should have a description yet");

        Task t = new Task();
        t.setTaskdescription(test_str);
        taskRepository.save(t);

        task = taskRepository.findByTaskdescription(test_str);
        assertEquals(t.getTaskdescription(), task.getTaskdescription());
    }
}
