package com.example.flower;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivityg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityg2);

    }

    public void kuwait(View view) {
        Intent i= null, chooser = null;
      if (view.getId()==R.id.textView17) {
          i = new Intent(Intent.ACTION_VIEW);
          i.setData(Uri.parse("geo:19.078,72.8777"));
          chooser=Intent.createChooser(i,"japan");
          startActivity(chooser);
      }
    }
}