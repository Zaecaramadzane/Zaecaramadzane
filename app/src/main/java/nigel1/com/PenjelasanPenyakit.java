package nigel1.com;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
public class PenjelasanPenyakit extends AppCompatActivity {
private ImageButton Imagebutton2;
        Button Button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjelasan_penyakit);
        Imagebutton2 = (ImageButton) findViewById(R.id.imageButton2);
        Imagebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
        Button3 = (Button) findViewById(R.id.Button3);
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpenjelasan2();
            }
        });
    }
    public void openMainActivity(){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    public void openpenjelasan2(){
        Intent intent = new Intent(this, PenjelasanPenyakit2.class);
        startActivity(intent);
    }

}
