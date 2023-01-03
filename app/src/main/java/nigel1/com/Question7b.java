package nigel1.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Question7b extends AppCompatActivity {
    boolean []rules = new boolean[19];
    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7b);

        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);
        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");

//        btn_yes.setOnClickListener(this);
//        btn_no.setOnClickListener(this);
    }
    public void Ya(View view) {
        Intent intent = new Intent(Question7b.this, Question7c.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }

    public void Tidak(View view) {
        Intent intent = new Intent(Question7b.this, Result.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }
}
