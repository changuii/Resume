package dev.portfolio.portfolio.service;

import dev.portfolio.portfolio.dto.UserDTO;
import java.io.IOException;

public interface UserService {
    UserDTO readUser() throws IOException;
}
