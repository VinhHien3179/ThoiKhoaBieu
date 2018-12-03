package hoxucompany.thoikhoabieu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Admin on 12/01/2018.
 */

public class AddActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        //Khai Báo;
        Button btn_Exit =(Button) findViewById(R.id.btnExit);
        Button btn_Save =(Button) findViewById(R.id.btnSave);

        final CheckBox cbT2 =(CheckBox) findViewById(R.id.cb2);
        final CheckBox cbT3 =(CheckBox) findViewById(R.id.cb3);
        final CheckBox cbT4 =(CheckBox) findViewById(R.id.cb4);
        final CheckBox cbT5 =(CheckBox) findViewById(R.id.cb5);
        final CheckBox cbT6 =(CheckBox) findViewById(R.id.cb6);
        final CheckBox cbT7 =(CheckBox) findViewById(R.id.cb7);
        final CheckBox cbCN =(CheckBox) findViewById(R.id.cb8);

        //cbT2.setChecked(false);

        //Khi click btn Exit
        btn_Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i = new Intent(AddActivity.this,MainActivity.class);
                    startActivity(i);
            }
        });

        //Khi click btnSave
        btn_Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(AddActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


        //---------------------------------------------------------
    }
}
