package br.com.pierrydev.meutreino.domain.contracts.services;

import br.com.pierrydev.meutreino.domain.entities.User;

public interface IUserService {

  User authenticate(String username, String password);
  void create(String username, String password, String email);

}
