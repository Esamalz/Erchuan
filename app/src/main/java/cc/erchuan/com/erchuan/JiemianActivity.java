package cc.erchuan.com.erchuan;

import android.R;
import android.R.id;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;


/**
 * Created by shiwu on 2018/6/12.
 */

public class JiemianActivity extends LoginActivity{



        private Button b1;
        private Text b2;
        private Text b3;
        @SuppressLint("WrongViewCast")
        public void onCreate(Bundle in) {
            super.onCreate(in);
            setContentView(R.layout.activity_list_item);
            b1 = (Button) findViewById(id.button1);
            b2 = (Text) findViewById(id.a);
            b3 = (Text) findViewById(id.s);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(JiemianActivity.this, jiemian2.class);
                    startActivity(intent);
                }
            });
        }
    }

}
