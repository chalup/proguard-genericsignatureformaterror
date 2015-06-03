package org.chalup.proguardgsonguavacrash;

import com.google.common.collect.LinkedHashMultimap;
import com.google.gson.Gson;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    LinkedHashMultimap<Long, String> map = LinkedHashMultimap.create();
    map.put(1l, "1");
    map.put(1l, "2");
    map.put(1l, "3");

    new Gson().toJson(map.asMap().get(1l));
  }
}
