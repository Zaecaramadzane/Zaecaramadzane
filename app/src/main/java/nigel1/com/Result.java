package nigel1.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
public class Result extends AppCompatActivity {
    private boolean []rules = new boolean[19];
    Button btn_home;
    ImageButton Imagebutton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Bundle extras = getIntent().getExtras();
        rules = extras.getBooleanArray("rules");

        Imagebutton2 = (ImageButton) findViewById(R.id.imageButton2);
        Imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();

            }
        });

        TextView hasil;

        ImageView planet = (ImageView) findViewById(R.id.planet);
        String Shasil = "Gejala Penyakit Kucing Tidak Ditemukan";
        if(rules[10]){
            Shasil="Scabies";
        }
        if(rules[11]){
            Shasil="Folliculitis";
        }
        if(rules[12]){
            Shasil="Kutu";
        }
        if(rules[13]){
            Shasil="Tungau Telinga";
        }
        if(rules[14]){
            Shasil="Distemper";
        }
        if(rules[15]){
            Shasil="Ring Worm";
        }
        if(rules[16]){
            Shasil="Feline Calicivirus";
        }
        if(rules[17]){
            Shasil="Feline Chlamydiosis";
        }
        if(rules[18]){
            Shasil="Kucing Anda Terkena Penyakit";

        }
        hasil = (TextView)findViewById(R.id.hasil);
        hasil.setText(Shasil);
    }
    public void Back(View view) {
        Intent activityA = new Intent(getApplicationContext(), Question1.class);
        activityA.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(activityA);

    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }



}
