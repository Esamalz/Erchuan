package cc.erchuan.com.erchuan;

import android.R;
import android.R.id;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class FavoriteActivity extends AppCompatActivity {
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        b1=(ImageButton) findViewById(id.imageButton24);
        b2=(ImageButton)findViewById(id.imageButton27);
        b3=(ImageButton)findViewById(id.imageButton28);
        b4=(ImageButton)findViewById(id.imageButton29);
        b5=(ImageButton)findViewById(id.imageButton26);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(FavoriteActivity.this,IndexActivity.class);
                startActivity(intent1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(FavoriteActivity.this, ListActivity.class);
                startActivity(intent2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(FavoriteActivity.this,ChatActivity.class);
                startActivity(intent3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(FavoriteActivity.this,FavoriteActivity.class);
                startActivity(intent4);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(FavoriteActivity.this,UserActivity.class);
                startActivity(intent5);
            }
        });
    }
}
