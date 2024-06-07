package org.example.exam1.services;

import org.example.exam1.entities.Project;
import org.example.exam1.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;


    public List<Project> getAllProjects() {
        return projectRepository.getAllProjects();
    }

}
