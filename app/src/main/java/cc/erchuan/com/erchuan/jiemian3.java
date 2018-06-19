package cc.erchuan.com.erchuan;


import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class jiamian3 extends Activity {
    private Button b1;
    private ImageButton b3;
    public void onCreate(Bundle in){
        super.onCreate(in);
        setContentView(R.layout.jiemian2);

        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent01 = new Intent(activity_3.this,activity_1.class);
                startActivity(intent01);
            }
        });
        b3 = (ImageButton)findViewById(R.id.imageButton);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent02 = new Intent(activity_3.this, activity_04.class);
                startActivity(intent02);
            };
        });
    }
}
