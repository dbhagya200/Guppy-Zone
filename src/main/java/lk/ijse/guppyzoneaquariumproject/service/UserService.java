package lk.ijse.guppyzoneaquariumproject.service;

import lk.ijse.guppyzoneaquariumproject.dto.UserDTO;

public interface UserService {
    int saveUser(UserDTO userDTO);
    UserDTO searchUser(String username);
}
