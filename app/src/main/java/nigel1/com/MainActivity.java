package nigel1.com;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private Button button,
                   button2,
                   button7,
                   button8,
                   button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSistemPakar();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJenisKucing();
            }
        });
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivityPerawatan();

            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPenjelasanPenyakit();

            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCaraMenanganiPenyakit();

            }
        });

    }
    public void openSistemPakar(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);

    }
    public void openJenisKucing(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }
    public void openMainActivityPerawatan(){
        Intent intent = new Intent(this, Perawatan.class);
        startActivity(intent);

    }

    public void openPenjelasanPenyakit(){
        Intent intent = new Intent(this, PenjelasanPenyakit.class);
        startActivity(intent);

    }
    public void openCaraMenanganiPenyakit(){
        Intent intent = new Intent(this, Caramenanganipenyakit.class);
        startActivity(intent);

    }



}