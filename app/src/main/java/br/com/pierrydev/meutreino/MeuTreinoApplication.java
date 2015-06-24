package br.com.pierrydev.meutreino;

import android.app.Application;
import br.com.pierrydev.meutreino.di.Container;
import roboguice.RoboGuice;

public class MeuTreinoApplication extends Application {

  @Override
  public void onCreate(){
    super.onCreate();
    RoboGuice.setUseAnnotationDatabases(false);
  }

}
