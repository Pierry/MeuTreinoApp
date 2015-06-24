package br.com.pierrydev.meutreino.domain.contracts.repositories;

import br.com.pierrydev.meutreino.domain.entities.User;
import java.util.List;

public interface IUserRepository {

  List<User> get(int page);
  User getById(int id);
  User getByUsername(String user);
  void create(User user);

}
