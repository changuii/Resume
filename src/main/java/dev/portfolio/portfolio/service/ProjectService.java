package dev.portfolio.portfolio.service;

import dev.portfolio.portfolio.dto.ProjectDTO;
import java.io.IOException;
import java.util.List;

public interface ProjectService {
    List<ProjectDTO> readAllProject() throws IOException;
}
