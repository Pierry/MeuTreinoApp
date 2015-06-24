package br.com.pierrydev.meutreino.di;

import com.google.inject.AbstractModule;
import br.com.pierrydev.meutreino.domain.contracts.repositories.IUserRepository;
import br.com.pierrydev.meutreino.domain.contracts.services.IUserService;
import br.com.pierrydev.meutreino.repository.UserRepository;
import br.com.pierrydev.meutreino.services.UserService;

public class Container extends AbstractModule {

  @Override protected void configure() {
    binder.bind(IUserRepository.class).to(UserRepository.class);
    binder.bind(IUserService.class).to(UserService.class);
  }
}
