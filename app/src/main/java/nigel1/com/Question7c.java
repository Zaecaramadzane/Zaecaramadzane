package nigel1.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question7c extends AppCompatActivity {
    boolean []rules = new boolean[19];

    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7c);


        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);

        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");
//        if(rules[1]==true){
//            btn_yes.setText("HAHAHAHAHAHA");
//        }
//        else{
//            btn_yes.setText("Hehehehe");
//
//        }

//        btn_yes.setOnClickListener(this);
//        btn_no.setOnClickListener(this);
    }
    public void Ya(View view) {
        if (rules[7]) {
            rules[16] = true;
            Intent intent = new Intent(Question7c.this, Result.class);
            intent.putExtra("rules", rules);
            startActivity(intent);


        }
    }
    public void Tidak(View view) {

        Intent intent = new Intent(Question7c.this, Question8.class);
        intent.putExtra("rules", rules);
        startActivity(intent);
    }
}