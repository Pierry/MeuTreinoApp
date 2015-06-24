package br.com.pierrydev.meutreino.repository;

import br.com.pierrydev.meutreino.domain.contracts.repositories.IUserRepository;
import br.com.pierrydev.meutreino.domain.entities.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {

  @Override public List<User> get(int page) {
    List<User> users = new ArrayList<>();
    users.add(new User("Pierry", "123", "pieerry@gmail.com"));
    users.add(new User("João", "123", "joao@gmail.com"));
    return users;
  }

  @Override public User getById(int id) {
    return new User("Pierry", "123", "pieerry@gmail.com");
  }

  @Override public User getByUsername(String user) {
    return new User("Pierry", "123", "pieerry@gmail.com");
  }

  @Override public void create(User user) {
    // Insert
  }
}
