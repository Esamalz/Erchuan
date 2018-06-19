package cc.erchuan.com.erchuan;

import android.R;
import android.R.id;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class UserActivity extends AppCompatActivity {
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;
    private ImageButton s;
    private ImageButton n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        b1=(ImageButton) findViewById(id.imageButton36);
        b2=(ImageButton)findViewById(id.imageButton37);
        b3=(ImageButton)findViewById(id.imageButton35);
        b4=(ImageButton)findViewById(id.imageButton38);
        b5=(ImageButton)findViewById(id.imageButton34);
        s=(ImageButton)findViewById(id.imageButton42);
        n=(ImageButton)findViewById(id.imageButton43);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(UserActivity.this,IndexActivity.class);
                startActivity(intent1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(UserActivity.this, ListActivity.class);
                startActivity(intent2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(UserActivity.this,ChatActivity.class);
                startActivity(intent3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(UserActivity.this,FavoriteActivity.class);
                startActivity(intent4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(UserActivity.this,UserActivity.class);
                startActivity(intent5);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(UserActivity.this,ResearchActivity.class);
                startActivity(intent6);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(UserActivity.this,NewthingsActivity.class);
                startActivity(intent7);
            }
        });
    }
}
