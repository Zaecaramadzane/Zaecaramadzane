package nigel1.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question1c extends AppCompatActivity {
    boolean []rules = new boolean[19];
    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1c);

        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);
        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");

//        btn_yes.setOnClickListener(this);
//        btn_no.setOnClickListener(this);
    }
    public void Ya(View view) {
        if(rules[1]){
            rules[10]=true;
            Intent intent = new Intent(Question1c.this, Result.class);
            intent.putExtra("rules",rules);
            startActivity(intent);
        }
    }
    public void Tidak(View view) {

        Intent intent = new Intent(Question1c.this, Question2.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }
}
