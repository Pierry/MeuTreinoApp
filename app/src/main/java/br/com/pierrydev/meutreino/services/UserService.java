package br.com.pierrydev.meutreino.services;

import android.content.Context;
import br.com.pierrydev.meutreino.domain.contracts.repositories.IUserRepository;
import br.com.pierrydev.meutreino.domain.contracts.services.IUserService;
import br.com.pierrydev.meutreino.domain.entities.User;
import br.com.pierrydev.meutreino.repository.UserRepository;
import com.google.inject.Inject;
import roboguice.RoboGuice;
import roboguice.inject.RoboInjector;

public class UserService implements IUserService {

  IUserRepository userRepository;

  @Inject
  public UserService(IUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override public User authenticate(String username, String password) {
    User user = userRepository.getByUsername(username);
    if (user == null) {
      return null;
    }
    if (user.getPassword().equals(password)) {
      return user;
    }
    return null;
  }

  @Override public void create(String username, String password, String email) {
    userRepository.create(new User(username, password, email));
  }
}
