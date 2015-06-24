package br.com.pierrydev.meutreino.domain.entities;

import java.io.InvalidObjectException;

public class User {

  private int id;
  private String username;
  private String password;
  private String email;

  public User(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
  }

  public int auth(String password) {
    if (password.equals(this.password)) {
      return 201;
    }
    return 404;
  }

  public void changePassword(String newPassword, String confirmNewPassword)
      throws InvalidObjectException {
    if (!newPassword.equals(confirmNewPassword)) {
      throw new InvalidObjectException("Password incorrect");
    }
    this.password = newPassword;
  }

  public String resetPassword() {
    // Create new password
    return "";
  }

  public void isValid() {
    // AssertionConcern to validate
  }

  public int getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  @Override public String toString() {
    return username;
  }
}
