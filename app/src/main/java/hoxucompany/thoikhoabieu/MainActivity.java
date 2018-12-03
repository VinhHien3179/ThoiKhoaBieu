package hoxucompany.thoikhoabieu;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_Input =(Button) findViewById(R.id.btnInput);
        Button btn_ViewWeek =(Button) findViewById(R.id.btnViewWeek);
        Button btn_ViewDay =(Button) findViewById(R.id.btnViewDay);
// Khi Nhấn Vào btn_Input
        btn_Input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AddActivity.class);
                startActivity(i);
            }
        });
// Khi Nhấn Vào btn_ViewWeek
        btn_ViewWeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

// Khi Nhấn Vào btn_ViewDay
        btn_ViewDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
