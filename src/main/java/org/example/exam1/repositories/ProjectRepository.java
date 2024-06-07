package org.example.exam1.repositories;

import org.example.exam1.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> getAllProjects();

}
