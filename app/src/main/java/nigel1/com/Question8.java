package nigel1.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question8 extends AppCompatActivity {
    boolean []rules = new boolean[19];

    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question8);


        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);

        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");

    }
    public void Ya(View view) {
        rules[8]=true;
        Intent intent = new Intent(Question8.this, Question8b.class);
        intent.putExtra("rules",rules);
        startActivity(intent);


    }
    public void Tidak(View view) {
        Intent intent = new Intent(Question8.this, Result.class);
        intent.putExtra("rules",rules);
        startActivity(intent);


    }
}
