package nigel1.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question5 extends AppCompatActivity {
    boolean []rules = new boolean[19];

    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5);


        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);

        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");

    }
    public void Ya(View view) {
        rules[5]=true;
        Intent intent = new Intent(Question5.this, Question5b.class);
        intent.putExtra("rules",rules);
        startActivity(intent);


    }
    public void Tidak(View view) {
        Intent intent = new Intent(Question5.this, Question6.class);
        intent.putExtra("rules",rules);
        startActivity(intent);


    }
}
