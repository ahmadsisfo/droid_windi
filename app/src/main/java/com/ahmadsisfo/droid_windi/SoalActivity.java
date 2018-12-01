package com.ahmadsisfo.droid_windi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ahmadsisfo.droid_windi.soal.Pencernaan;
import com.ahmadsisfo.droid_windi.soal.Soal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class SoalActivity extends AppCompatActivity {

    private TextView txtnama, txtno, txttanggal, txtwaktu, txtsoal;
    private ImageView img;
    private RadioGroup rg;
    private RadioButton rdA, rdB, rdC, rdD, rdE;
    private List<Soal> listSoal;
    private CountDownTimer mCountDownTimer;
    private int detik = 600 * 1000; // --> 10 menit
    private Button btnPrev, btnNext, btnSelesai;
    int jawabanYgDiPilih[] = null;
    int jawabanYgBenar[] = null;
    boolean cekPertanyaan = false;
    int urutanPertanyaan = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(getIntent().getExtras().getString("name"));

        listSoal = new ArrayList<Soal>();
        String tipe = getIntent().getExtras().getString("tipe", null);
        switch (tipe){
            case "pencernaan":
                Pencernaan db1 = new Pencernaan(this);
                listSoal = db1.getSoal();
                break;
            case "indra":
                //Indra db2 = new Indra(this);
                //listSoal = db2.getSoal();
                break;
            case "saraf":
                //Saraf db3 = new Saraf(this);
                //listSoal = db3.getSoal();
                break;
            default:
                Pencernaan db0 = new Pencernaan(this);
                listSoal = db0.getSoal();
                break;
        }

        txtnama = (TextView) findViewById(R.id.textViewNama);
        txtno = (TextView) findViewById(R.id.textViewHalaman);
        txttanggal = (TextView) findViewById(R.id.textViewTanggal);
        txtwaktu = (TextView) findViewById(R.id.textViewWaktu);
        txtsoal = (TextView) findViewById(R.id.textViewSoal);
        img = (ImageView) findViewById(R.id.imageView1);
        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        rdA = (RadioButton) findViewById(R.id.radio0);
        rdB = (RadioButton) findViewById(R.id.radio1);
        rdC = (RadioButton) findViewById(R.id.radio2);
        rdD = (RadioButton) findViewById(R.id.radio3);
        rdE = (RadioButton) findViewById(R.id.radio4);
        btnPrev = (Button) findViewById(R.id.buttonPrev);
        btnNext = (Button) findViewById(R.id.buttonNext);
        btnSelesai = (Button) findViewById(R.id.buttonSelesai);
        final Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        txttanggal.setText(Integer.toString(day)+"-"+ Integer.toString(month+1)+"-"+ Integer.toString(year));

        btnSelesai.setOnClickListener(klikSelesai);
        btnPrev.setOnClickListener(klikSebelum);
        btnNext.setOnClickListener(klikBerikut);
        //new GetSoal().execute();
        jawabanYgDiPilih = new int[listSoal.size()];
        Arrays.fill(jawabanYgDiPilih, -1);
        jawabanYgBenar = new int[listSoal.size()];
        Arrays.fill(jawabanYgBenar, -1);
        showInputUser();
    }

    private void showInputUser() {
        LayoutInflater mInflater = LayoutInflater.from(this);
        View v = mInflater.inflate(R.layout.nama, null);

        final AlertDialog dialog = new AlertDialog.Builder(this).create();

        dialog.setView(v);
        dialog.setTitle("Ketikkan Nama Anda");
        //dialog.setIcon(R.drawable.splash);
        dialog.setCancelable(false);

        final Button btnOk = (Button) v.findViewById(R.id.buttonOK);
        final EditText inputUser = (EditText) v.findViewById(R.id.editTextNama);

        btnOk.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                if(inputUser.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(), "Silahkan Isi Nama Anda!", Toast.LENGTH_LONG).show();
                }else{
                    txtnama.setText(inputUser.getText().toString());
                    mulaiKuis();
                    dialog.dismiss();
                }

            }
        });

        txtnama.setText("Soal Latihan");
        mulaiKuis();
        //dialog.show();
    }

    protected void mulaiKuis() {
        setUpWaktu();
        setUpSoal();

    }

    private void setUpSoal() {
        this.tunjukanPertanyaan(0, cekPertanyaan);
    }

    private void tunjukanPertanyaan(int urutan_soal_soal, boolean review) {
        try {
            rg.clearCheck();
            Soal soal = new Soal();
            soal = listSoal.get(urutan_soal_soal);
            String pertanyaan = soal.getSoal();
            if (jawabanYgBenar[urutan_soal_soal] == -1) {
                jawabanYgBenar[urutan_soal_soal] = soal.getJwban();
            }

            int gambar = soal.getGambar();
            txtsoal.setText(pertanyaan.toCharArray(), 0, pertanyaan.length());
            img.setImageResource(gambar);
            rg.check(-1);
            String jwb_a = soal.getPil_a();
            rdA.setText(jwb_a.toCharArray(), 0,
                    jwb_a.length());
            String jwb_b = soal.getPil_b();
            rdB.setText(jwb_b.toCharArray(), 0,
                    jwb_b.length());
            String jwb_c = soal.getPil_c();
            rdC.setText(jwb_c.toCharArray(), 0,
                    jwb_c.length());
            String jwb_d = soal.getPil_d();
            rdD.setText(jwb_d.toCharArray(), 0,
                    jwb_d.length());
            String jwb_e = soal.getPil_e();
            rdE.setText(jwb_e.toCharArray(), 0,
                    jwb_e.length());


            Log.d("", jawabanYgDiPilih[urutan_soal_soal] + "");
            if (jawabanYgDiPilih[urutan_soal_soal] == 0)
                rg.check(R.id.radio0);
            if (jawabanYgDiPilih[urutan_soal_soal] == 1)
                rg.check(R.id.radio1);
            if (jawabanYgDiPilih[urutan_soal_soal] == 2)
                rg.check(R.id.radio2);
            if (jawabanYgDiPilih[urutan_soal_soal] == 3)
                rg.check(R.id.radio3);
            if (jawabanYgDiPilih[urutan_soal_soal] == 4)
                rg.check(R.id.radio4);


            pasangLabelDanNomorUrut();

            if (urutan_soal_soal == (listSoal.size() - 1))
                btnNext.setEnabled(false);

            if (urutan_soal_soal == 0)
                btnPrev.setEnabled(false);

            if (urutan_soal_soal > 0)
                btnPrev.setEnabled(true);

            if (urutan_soal_soal < (listSoal.size() - 1))
                btnNext.setEnabled(true);

        } catch (Exception e) {
            Log.e(this.getClass().toString(), e.getMessage(), e.getCause());
        }
    }

    private void setUpWaktu() {
        mCountDownTimer = new CountDownTimer(detik, 1000)
        {

            @Override
            public void onTick(long millisUntilFinished)
            {
                // TODO Auto-generated method stub
                txtwaktu.setText("Sisa waktu: " +(int) (millisUntilFinished / 60000) +
                        " menit");
            }

            @Override
            public void onFinish()
            {
                // TODO Auto-generated method stub
                txtwaktu.setText("Sisa waktu: 0 menit");
                Toast.makeText(SoalActivity.this, "Waktu Habis",
                        Toast.LENGTH_SHORT).show();
            }
        };

        mCountDownTimer.start();
    }

    private View.OnClickListener klikSelesai = new View.OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            // hitung berapa yg benar
            int jumlahJawabanYgBenar = 0;
            for (int i = 0; i < jawabanYgBenar.length; i++) {
                if ((jawabanYgBenar[i] != -1) && (jawabanYgBenar[i] == jawabanYgDiPilih[i]))
                    jumlahJawabanYgBenar++;
            }
            AlertDialog tampilKotakAlert;
            tampilKotakAlert = new AlertDialog.Builder(SoalActivity.this).create();
            tampilKotakAlert.setTitle("Nilai");
            tampilKotakAlert.setMessage("Benar " +jumlahJawabanYgBenar + " dari "
                    + (listSoal.size() +" soal"));

            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "Lagi",
                    new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            urutanPertanyaan = 0;

                            SoalActivity.this.tunjukanPertanyaan(0,
                                    cekPertanyaan);
                        }
                    });

            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEGATIVE, "Keluar",
                    new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            finish();
                        }
                    });

            tampilKotakAlert.show();

        }
    };

    private void aturJawaban_nya() {
        if (rdA.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 0;
        if (rdB.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 1;
        if (rdC.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 2;
        if (rdD.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 3;
        if (rdE.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 4;

        Log.d("", Arrays.toString(jawabanYgDiPilih));
        Log.d("", Arrays.toString(jawabanYgBenar));

    }

    private View.OnClickListener klikBerikut = new View.OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            urutanPertanyaan++;
            if (urutanPertanyaan >= listSoal.size())
                urutanPertanyaan = listSoal.size() - 1;

            //checkKesalahan();
            tunjukanPertanyaan(urutanPertanyaan, cekPertanyaan);
        }
    };

    private View.OnClickListener klikSebelum = new View.OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            urutanPertanyaan--;
            if (urutanPertanyaan < 0)
                urutanPertanyaan = 0;

            tunjukanPertanyaan(urutanPertanyaan, cekPertanyaan);
        }
    };

    private void pasangLabelDanNomorUrut() {
        txtno.setText("Soal ke-" + (urutanPertanyaan + 1) + " dari "
                + listSoal.size());
    }

    @Override
    public Intent getSupportParentActivityIntent() {
        this.finish();
        return null;
    }

    private void checkKesalahan(){
        //aturJawaban_nya();
        // hitung berapa yg benar
        int jumlahJawabanYgBenar = 0;
        int jumlahJawabanYgSalah = 0;
        for (int i = 0; i < jawabanYgBenar.length; i++) {
            if ((jawabanYgBenar[i] != -1) && (jawabanYgBenar[i] == jawabanYgDiPilih[i]))
                jumlahJawabanYgBenar++;
            else
                jumlahJawabanYgSalah++;
        }

        if(jumlahJawabanYgSalah > 2 && urutanPertanyaan > 2) {
            AlertDialog tampilKotakAlert;
            tampilKotakAlert = new AlertDialog.Builder(SoalActivity.this).create();
            tampilKotakAlert.setTitle("Belajar Lagi !");
            tampilKotakAlert.setMessage("Jawaban salah anda lebih dari 2 soal");

            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEGATIVE, "Keluar",
                    new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            finish();
                        }
                    });

            tampilKotakAlert.show();
        }
    }
}
