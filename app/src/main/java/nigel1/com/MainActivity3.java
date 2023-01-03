package nigel1.com;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class MainActivity3 extends AppCompatActivity {
    private ImageButton Imagebutton2;
            Button button8;
            Button button19;
            Button button11;
            Button button12;
            Button button13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Imagebutton2 = (ImageButton) findViewById(R.id.imageButton2);
        Imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCatangora();
            }
        });
        button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCatpersia();

            }
        });

        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCatbritish();

            }
        });

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCatcalico();

            }
        });
        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCatsphynx();

            }
        });

    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void openCatangora(){
        Intent intent = new Intent(this, catangora.class);
        startActivity(intent);

    }
    public void openCatpersia(){
        Intent intent = new Intent(this, catpersia3.class);
        startActivity(intent);

    }
    public void openCatbritish(){
        Intent intent = new Intent(this, catbritish.class);
        startActivity(intent);

    }
    public void openCatsphynx(){
        Intent intent = new Intent(this, catsphynx.class);
        startActivity(intent);

    }
    public void openCatcalico(){
        Intent intent = new Intent(this, catcalico.class);
        startActivity(intent);

    }
}