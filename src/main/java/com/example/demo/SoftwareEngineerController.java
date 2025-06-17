package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    @GetMapping
    List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(UUID.randomUUID(), "John Doe", "Java"),
                new SoftwareEngineer(UUID.randomUUID(), "Jane Doe", "Python"),
                new SoftwareEngineer(UUID.randomUUID(), "Jack Doe", "JavaScript")
        );
    }
}
