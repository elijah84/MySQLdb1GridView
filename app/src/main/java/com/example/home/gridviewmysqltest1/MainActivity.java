package com.example.home.gridviewmysqltest1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    final static String urlAddress="http://r3mm1k5.net/database1/spacecraft_select.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final GridView gv= (GridView) findViewById(R.id.gv);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Downloader(MainActivity.this,urlAddress,gv).execute();
            }
        });
    }
}
