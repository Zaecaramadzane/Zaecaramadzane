package nigel1.com;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Question1 extends AppCompatActivity {
    private boolean []rules = new boolean[19];
    Button btn_yes;
    Button btn_no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
        for(int i=0;i<18;i++){
            rules[i]=false;
        }
        btn_yes = (Button) findViewById(R.id.btn_yes);
        btn_no = (Button) findViewById(R.id.btn_no);
    }
    public void Ya(View view) {
        for(int i=0;i<18;i++){
            rules[i]=false;
        }
        rules[1]=true;
        Intent intent = new Intent(Question1.this, Question1b.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }
    public void Tidak(View view) {
        for(int i=0;i<18;i++){
            rules[i]=false;
        }
        rules[1]=false;
        Intent intent = new Intent(Question1.this, Question2.class);
        intent.putExtra("rules",rules);
        startActivity(intent);
    }

}
