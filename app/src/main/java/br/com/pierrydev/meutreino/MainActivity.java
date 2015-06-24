package br.com.pierrydev.meutreino;

import android.widget.EditText;
import android.widget.Toast;
import br.com.pierrydev.meutreino.domain.contracts.services.IUserService;
import br.com.pierrydev.meutreino.domain.entities.User;
import com.google.inject.Inject;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;
import roboguice.activity.RoboActionBarActivity;

@OptionsMenu(R.menu.menu_main) @EActivity(R.layout.activity_main) public class MainActivity
    extends RoboActionBarActivity {

  @ViewById EditText username;
  @ViewById EditText password;

  @Inject IUserService userService;

  @Click void logon() {
    User user = userService.authenticate(username.getText().toString(), password.getText().toString());
    if (user == null){
      Toast.makeText(this, "User not found", Toast.LENGTH_LONG).show();
      return;
    }
    Toast.makeText(this, user.toString(), Toast.LENGTH_LONG).show();
  }
}
