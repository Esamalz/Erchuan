package cc.erchuan.com.erchuan;


import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class jiemian2 extends Activity {
    private Button b1;
    private ImageButton b2;
    public void onCreate(Bundle in){
        super.onCreate(in);
        setContentView(R.layout.jiemian);

        b1 = (Button)findViewById(R.id.c);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01 = new Intent(jiemian2.this,LoginActivity.class);
                startActivity(intent01);
            }
        });
        b2 = (ImageButton)findViewById(R.id.imageButton);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent02 = new Intent(jiemian2.this, jiemian3.class);
                startActivity(intent02);
            };
        });
    }
}
