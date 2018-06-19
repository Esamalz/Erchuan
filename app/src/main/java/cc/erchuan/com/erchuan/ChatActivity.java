package cc.erchuan.com.erchuan;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ChatActivity extends AppCompatActivity {
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        b1=(ImageButton) findViewById(R.id.IimageButton16);
        b2=(ImageButton)findViewById(R.id.mageButton17);
        b3=(ImageButton)findViewById(R.id.imageButton20);
        b4=(ImageButton)findViewById(R.id.imageButton18);
        b5=(ImageButton)findViewById(R.id.imageButton19);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ChatActivity.this,IndexActivity.class);
                startActivity(intent1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ChatActivity.this, ListActivity.class);
                startActivity(intent2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ChatActivity.this,ChatActivity.class);
                startActivity(intent3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                public void onClick(View v){
                    Intent intent4 = new Intent(ChatActivity.this,FavoriteActivity.class);
                    startActivity(intent4);
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(ChatActivity.this,UserActivity.class);
                startActivity(intent5);
            }
        });
    }
}
