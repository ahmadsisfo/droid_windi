package com.ahmadsisfo.droid_windi.soal;

/**
 * Created by inside on 9/10/2017.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.ahmadsisfo.droid_windi.R;

import java.util.ArrayList;
import java.util.List;

public class Hormon extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis_rangka";


    public Hormon(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, pil_d TEXT, pil_e TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();

        values.put("soal", "1.\t Berikut ini merupakan fungsi rangka manusia, kecuali . . . .");
        values.put("pil_a", "A.\t Melindungi alat tubuh yang penting");
        values.put("pil_b", "B.\t Sebagai alat gerak aktif");
        values.put("pil_c", "C.\t Tempat melekatnya otot");
        values.put("pil_d", "D.\t Menegakkan dan memberi bentuk tubuh");
        values.put("pil_e", "E.\t Mencegah penyakit");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "2.\t Skeleton pada manusia di kelompokkan menjadi 2, yaitu skeleton  aksial dan skleton apendikuler. Di bawah ini yang termasuk rangka aksial adalah ....");
        values.put("pil_a", "A.\t Tulang tengkorak");
        values.put("pil_b", "B.\t Tulang bahu");
        values.put("pil_c", "C.\t Tulang panggul");
        values.put("pil_d", "D.\t Tulang paha");
        values.put("pil_e", "E.\t Tulang pengumpil");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "3.\t Tulang yang bentuknya segitiga dan pipih yang menyusun gelang bahu adalah ....");
        values.put("pil_a", "A.\t Clavicula");
        values.put("pil_b", "B.\t Maxilla");
        values.put("pil_c", "C.\t Scapula");
        values.put("pil_d", "D.\t Zygomaticum");
        values.put("pil_e", "E.\t Patella");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "4.\t Menurut bahan penyusunnya, tulang digolongkan menjadi …");
        values.put("pil_a", "A.\t Tulang pipa dan tulang pipih");
        values.put("pil_b", "B.\t Tulang tengkorak dan tulang badan");
        values.put("pil_c", "C.\t Tulang keras dan tulang pendek");
        values.put("pil_d", "D.\t Tulang rawan dan tulang keras");
        values.put("pil_e", "E.\t Tulang atas dan tulang bawah");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "5.\t Menurut bentuknya. tulang tengkorak termasuk tulang …");
        values.put("pil_a", "A.\t Pipa");
        values.put("pil_b", "B.\t Pendek");
        values.put("pil_c", "C.\t Keras ");
        values.put("pil_d", "D.\t Tak beraturan ");
        values.put("pil_e", "E.\t Pipih");
        values.put("jwban", "4");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "6.\t Sel-sel awal pembentuk tulang rawan disebut sebagai…");
        values.put("pil_a", "A.\t Mesenkim ");
        values.put("pil_b", "B.\t Osteoblas ");
        values.put("pil_c", "C.\t Kondroblas");
        values.put("pil_d", "D.\t Kondrosit");
        values.put("pil_e", "E.\t Osteosit");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "7.\t Korelasi atau hubungan antar tulang yang tidak memiliki celah sendi sehingga tidak memungkinkan terjadinya suatu pergerakan disebut dengan …");
        values.put("pil_a", "A.\t Sinfibrosis");
        values.put("pil_b", "B.\t Kifosis");
        values.put("pil_c", "C.\t Diarthosis");
        values.put("pil_d", "D.\t Skolosis");
        values.put("pil_e", "E.\t Sinkondrosis");
        values.put("jwban", "4");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "8.\t Bagian yang ditunjukkan huruf X menunjukkan hubungan tulang membentuk persendian ....");
        values.put("pil_a", "A.\t Peluru");
        values.put("pil_b", "B.\t Putar");
        values.put("pil_c", "C.\t Engsel");
        values.put("pil_d", "D.\t Pelana");
        values.put("pil_e", "E.\t Luncur");
        values.put("jwban", "0");
        values.put("img", R.drawable.soal8);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "9.\t Kebiasaan duduk miring ke kiri atau ke kanan pada anak yang masih dalam masa pertumbuhan dapat menyebabkan ...");
        values.put("pil_a", "A.\t Lordosis");
        values.put("pil_b", "B.\t Skoliosis");
        values.put("pil_c", "C.\t Kifosis");
        values.put("pil_d", "D.\t Nekrosis");
        values.put("pil_e", "E.\t Osteoporosis");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);


        values.put("soal", "10.\t Persendian antara tulang rusuk dengan tulang dada merupakan contoh dari persendian ...");
        values.put("pil_a", "A.\t Sinartrosis sinfibrosis");
        values.put("pil_b", "B.\t Diartrosis");
        values.put("pil_c", "C.\t Sinartrosis sinkondrosis ");
        values.put("pil_d", "D.\t Amfiartrosis");
        values.put("pil_e", "E.\t Osteoklas");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "11.\t Berikut ini adalah ciri-ciri otot polos, kecuali …");
        values.put("pil_a", "A.\t Bekerja involunter");
        values.put("pil_b", "B.\t Tidak adanya bagian terang dan gelap");
        values.put("pil_c", "C.\t Menyusun beberapa organ tubuh bagian dalam");
        values.put("pil_d", "D.\t Bekerja volunter");
        values.put("pil_e", "E.\t Berinti banyak");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "12.\t Perhatikan Gambar di atas, Gerak yang dilakukan oleh anak pada gambar di atas adalah ....");
        values.put("pil_a", "A.\t Abduksi ");
        values.put("pil_b", "B.\t Adduksi");
        values.put("pil_c", "C.\t Flesksi");
        values.put("pil_d", "D.\t Ekstensi");
        values.put("pil_e", "E.\t Pronasi");
        values.put("jwban", "0");
        values.put("img", R.drawable.soal11);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "13.\t Ketika makan mulut akan mengunyah makanan. Gerak yang dilakukan dalam proses mengunyah adalah ....");
        values.put("pil_a", "A.\t Fleksi – ekstensi");
        values.put("pil_b", "B.\t Abduksi – adduksi");
        values.put("pil_c", "C.\t Elevasi – depresi");
        values.put("pil_d", "D.\t Supinasi – pronasi");
        values.put("pil_e", "E.\t Inversi – eversi");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "14.\t Gangguan pada persendian yang terjadi akibat gerakan yang tiba-tiba atau tidak biasa dilakukan sehingga ligamen tertarik dan membengkak adalah ...");
        values.put("pil_a", "A.\t Artritis sika");
        values.put("pil_b", "B.\t Terkilir");
        values.put("pil_c", "C.\t Artritis ");
        values.put("pil_d", "D.\t Artritis eksudatif");
        values.put("pil_e", "E.\t Dislokas");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "15.\t Otot yang dilatih terus-menerus akan membesar. Peristiwa ini disebut ... ");
        values.put("pil_a", "A.\t Atrofi");
        values.put("pil_b", "B.\t Hipertropi");
        values.put("pil_c", "C.\t Osifikasi");
        values.put("pil_d", "D.\t Ekstensi");
        values.put("pil_e", "E.\t Tonus");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

    }

    public List<Soal> getSoal(){
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setPil_d(cursor.getString(5));
                s.setPil_e(cursor.getString(6));
                s.setJwban(cursor.getInt(7));
                s.setGambar(cursor.getInt(8));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        onCreate(db);
    }

}
