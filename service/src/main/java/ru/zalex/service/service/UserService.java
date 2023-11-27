package ru.zalex.service.service;

import java.util.Optional;
import ru.zalex.database.dao.UserDao;
import ru.zalex.dto.UserDto;

public class UserService {

  private final UserDao userDao = new UserDao();

  public Optional<UserDto> getUser(Long id) {
    return userDao.findById(id)
        .map(it -> new UserDto());
  }

}
