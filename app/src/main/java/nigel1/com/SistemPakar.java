package nigel1.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class SistemPakar extends AppCompatActivity {

    CheckBox ChckGatalgatal,
            ChckBulunya,
            ChckNafsu,
            ChckKulitmengeluarkan,
            ChckKulitmenebal,
            ChckBulukucingrontok,
            ChckBenjolan,
            ChckBerkerak,
            ChckBintik,
            ChckBulumenipis,
            Chckkerapmenggeleng,
            ChckBaumenyengat,
            ChckMunculcairan,
            ChckTerdapattelur,
            ChckDemam,
            ChckLemas,
            ChckDiare,
            ChckMuntah,
            ChckBersin,
            ChckKotoranmata,
            ChckSesak,
            ChckLukagusi,
            ChckLukalangit,
            ChckAirliur,
            ChckMatabeng,
            ChckMatamerah,
            ChckBatuk;




    Button btnProsesDeteksi;
    TextView tvOutputNamaPenyakit;
    ImageButton Imagebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistem_pakar);

        ChckGatalgatal = (CheckBox) findViewById(R.id.checkBox);
        ChckBulunya = (CheckBox) findViewById(R.id.checkBox2);
        ChckNafsu = (CheckBox) findViewById(R.id.checkBox3);
        ChckKulitmengeluarkan = (CheckBox) findViewById(R.id.checkBox4);
        ChckKulitmenebal = (CheckBox) findViewById(R.id.checkBox5);
        ChckBulukucingrontok = (CheckBox) findViewById(R.id.checkBox6);
        ChckBenjolan = (CheckBox) findViewById(R.id.checkBox7);
        ChckBerkerak = (CheckBox) findViewById(R.id.checkBox8);
        ChckBintik= (CheckBox) findViewById(R.id.checkBox9);
        ChckBulumenipis = (CheckBox) findViewById(R.id.checkBox10);
        Chckkerapmenggeleng = (CheckBox) findViewById(R.id.checkBox11);
        ChckBaumenyengat = (CheckBox) findViewById(R.id.checkBox12);
        ChckMunculcairan = (CheckBox) findViewById(R.id.checkBox13);
        ChckTerdapattelur = (CheckBox) findViewById(R.id.checkBox14);
        ChckDemam = (CheckBox) findViewById(R.id.checkBox15);
        ChckLemas = (CheckBox) findViewById(R.id.checkBox16);
        ChckDiare = (CheckBox) findViewById(R.id.checkBox17);
        ChckMuntah = (CheckBox) findViewById(R.id.checkBox18);
        ChckBersin = (CheckBox) findViewById(R.id.checkBox19);
        ChckKotoranmata = (CheckBox) findViewById(R.id.checkBox20);
        ChckSesak = (CheckBox) findViewById(R.id.checkBox21);
        ChckLukagusi = (CheckBox) findViewById(R.id.checkBox22);
        ChckLukalangit = (CheckBox) findViewById(R.id.checkBox23);
        ChckAirliur = (CheckBox) findViewById(R.id.checkBox24);
        ChckMatabeng = (CheckBox) findViewById(R.id.checkBox25);
        ChckMatamerah = (CheckBox) findViewById(R.id.checkBox26);
        ChckBatuk = (CheckBox) findViewById(R.id.checkBox27);




        btnProsesDeteksi = (Button) findViewById(R.id.button);
        tvOutputNamaPenyakit = (TextView) findViewById(R.id.textView);

        tvOutputNamaPenyakit.setText(""); // Kosongkan textView / Nama Penyakit Saat membuka program Sisitem Pakar

        Imagebutton = (ImageButton) findViewById(R.id.imageButton);
        Imagebutton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                openActivity2();

            }
        });




        btnProsesDeteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NamaPenyakit = " Kucing Anda Mempunyai Gejala penyakit : ";


                // Jenis Gejala Untuk Output Penyakit : SCABIES
                if (ChckGatalgatal.isChecked() && ChckBulunya.isChecked() && ChckNafsu.isChecked() && ChckKulitmengeluarkan.isChecked() && ChckKulitmenebal.isChecked() && ChckBulukucingrontok.isChecked()) {

                    NamaPenyakit += "\nSCABIES";
                }
                // Jenis Gejala Untuk Output Penyakit : FOLLICULITIS
                if (ChckBenjolan.isChecked() && ChckBerkerak.isChecked() && ChckBintik.isChecked()) {
                    NamaPenyakit += "\nFOLLICULITIS";
                }

                // Jenis Gejala Untuk Output Penyakit : KUTU KUCING
                if (ChckBulumenipis.isChecked() && Chckkerapmenggeleng.isChecked() && ChckBulukucingrontok.isChecked()) {
                    NamaPenyakit += "\nKUTU";
                }

                // Jenis Gejala Untuk Output Penyakit : TUNGAU TELINGA
                if (ChckBaumenyengat.isChecked() && ChckMunculcairan.isChecked() && ChckTerdapattelur.isChecked()) {
                    NamaPenyakit += "\nTUNGAU TELINGA";
                }
                // Jenis Gejala Untuk Output Penyakit : DISTEMPER
                if (ChckNafsu.isChecked() && ChckDemam.isChecked() && ChckLemas.isChecked() && ChckDiare.isChecked() && ChckMuntah.isChecked()) {
                    NamaPenyakit += "\nDISTEMPER";
                }
                // Jenis Gejala Untuk Output Penyakit : RING WORN
                if (ChckBerkerak.isChecked()) {
                    NamaPenyakit += "\nRING WORM";
                }
                // Jenis Gejala Untuk Output Penyakit : FELINE CALICIVIRUS
                if (ChckNafsu.isChecked() && ChckDemam.isChecked() && ChckLemas.isChecked() && ChckBersin.isChecked() && ChckKotoranmata.isChecked() && ChckSesak.isChecked() && ChckLukagusi.isChecked() && ChckLukalangit.isChecked() && ChckAirliur.isChecked()) {
                    NamaPenyakit += "\nFELINE CALICIVIRUS";
                }
                // Jenis Gejala Untuk Output Penyakit : FELINE CHLAMYDIOSIS
                if (ChckNafsu.isChecked() && ChckDemam.isChecked() && ChckLemas.isChecked() && ChckDiare.isChecked() && ChckBersin.isChecked() && ChckMatabeng.isChecked() && ChckMatamerah.isChecked() &&ChckBatuk.isChecked() && ChckDiare.isChecked()) {
                    NamaPenyakit += "\nFELINE CHLAMYDIOSIS";
                }


                // Tampilkan Hasil Nama Penyakit di textView
                tvOutputNamaPenyakit.setText(""+NamaPenyakit);
            }
        });
    }

    private void openActivity2() {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);



    }


    // Baris dibawah ini dihapus juga tidak masalah : inti codingnya hanya berada di tombol proses
    public void onCheckboxClicked123 (View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch (view.getId()) {
            case R.id.checkBox:
                str = checked ? "Gejala Gatal-gatal Diseleksi " : "Gejala Gatal-gatal Tidak Diseleksi";
                break;
            case R.id.checkBox2:
                str = checked ? "Gejala Bulu botak Diseleksi " : "Gejala Bulu botak Tidak Diseleksi";
                break;
            case R.id.checkBox3:
                str = checked ? "Gejala Nafsu makan menurun Diseleksi " : "Gejala Nafsu makan menurun Tidak Diseleksi";
                break;
            case R.id.checkBox4:
                str = checked ? "Gejala Cairan eksudet Diseleksi " : "Gejala Cairan eksudet Tidak Diseleksi";
                break;
            case R.id.checkBox5:
                str = checked ? "Gejala Kulit menebal Diseleksi " : "Gejala Kulit Menebal Tidak Diseleksi";
                break;
            case R.id.checkBox6:
                str = checked ? "Gejala Bulu rontok Diseleksi " : "Gejala Bulu rontok Tidak Diseleksi";
                break;
            case R.id.checkBox7:
                str = checked ? "Gejala Benjolan Merah Diseleksi " : "Gejala Benjolan Merah Tidak Diseleksi";
                break;
            case R.id.checkBox8:
                str = checked ? "Gejala Berkerak Diseleksi " : "Gejala Berkerak Tidak Diseleksi";
                break;
            case R.id.checkBox9:
                str = checked ? "Gejala Bintik bintik Diseleksi " : "Gejala Bintik bintik Tidak Diseleksi";
                break;
            case R.id.checkBox10:
                str = checked ? "Gejala Bulu menipis Diseleksi " : "Gejala Bulu menipis Tidak Diseleksi";
                break;
            case R.id.checkBox11:
                str = checked ? "Gejala Menggelengkan kepala Diseleksi " : "Gejala Menggelengkan Kepala Tidak Diseleksi";
                break;
            case R.id.checkBox12:
                str = checked ? "Gejala Bau menyengat Diseleksi " : "Gejala Bau menyengat Tidak Diseleksi";
                break;
            case R.id.checkBox13:
                str = checked ? "Gejala Muncul cairan berwarna gelap Diseleksi " : "Gejala Muncul cairan berwarna gelap Tidak Diseleksi";
                break;
            case R.id.checkBox14:
                str = checked ? "Gejala Terdapat telur putih Diseleksi " : "Gejala Terdapat telur putih Tidak Diseleksi";
                break;
            case R.id.checkBox15:
                str = checked ? "Gejala Demam Diseleksi " : "Gejala Demam Tidak Diseleksi";
                break;
            case R.id.checkBox16:
                str = checked ? "Gejala Lemas Diseleksi " : "Gejala Lemas Tidak Diseleksi";
                break;
            case R.id.checkBox17:
                str = checked ? "Gejala Diare Diseleksi " : "Gejala Diare Tidak Diseleksi";
                break;
            case R.id.checkBox18:
                str = checked ? "Gejala Muntah Diseleksi " : "Gejala Muntah Tidak Diseleksi";
                break;
            case R.id.checkBox19:
                str = checked ? "Gejala Bersin Diseleksi " : "Gejala Bersin Tidak Diseleksi";
                break;
            case R.id.checkBox20:
                str = checked ? "Gejala Kotoran mata Diseleksi " : "Gejala Kotoran mata Tidak Diseleksi";
                break;
            case R.id.checkBox21:
                str = checked ? "Gejala Sesak Diseleksi " : "Gejala Sesak Tidak Diseleksi";
                break;
            case R.id.checkBox22:
                str = checked ? "Gejala Luka gusi  Diseleksi " : "Gejala Luka gusi Tidak Diseleksi";
                break;
            case R.id.checkBox23:
                str = checked ? "Gejala Luka langit Diseleksi " : "Gejala Luka Langit Tidak Diseleksi";
                break;
            case R.id.checkBox24:
                str = checked ? "Gejala Air Liur  Diseleksi " : "Gejala Air Liur Tidak Diseleksi";
                break;
            case R.id.checkBox25:
                str = checked ? "Gejala Mata bengkak  Diseleksi " : "Gejala Mata bengkak Tidak Diseleksi";
                break;
            case R.id.checkBox26:
                str = checked ? "Gejala Mata merah  Diseleksi " : "Gejala Mata merah Tidak Diseleksi";
                break;
            case R.id.checkBox27:
                str = checked ? "Gejala Batuk  Diseleksi " : "Gejala Batuk Tidak Diseleksi";
                break;


        }

        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }


//    void showMessage(String message){
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
//    }
}
