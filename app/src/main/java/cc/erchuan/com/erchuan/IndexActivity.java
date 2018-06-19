package cc.erchuan.com.erchuan;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class IndexActivity extends AppCompatActivity {
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        b1=(ImageButton) findViewById(R.id.imageButton7);
        b2=(ImageButton)findViewById(R.id.imageButton8);
        b3=(ImageButton)findViewById(R.id.imageButton9);
        b4=(ImageButton)findViewById(R.id.imageButton10);
        b5=(ImageButton)findViewById(R.id.imageButton11);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(IndexActivity.this,IndexActivity.class);
                startActivity(intent1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(IndexActivity.this, ListActivity.class);
                startActivity(intent2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(IndexActivity.this,ChatActivity.class);
                startActivity(intent3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(IndexActivity.this,FavoriteActivity.class);
                startActivity(intent4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(IndexActivity.this,UserActivity.class);
                startActivity(intent5);
            }
        });
    }
}
