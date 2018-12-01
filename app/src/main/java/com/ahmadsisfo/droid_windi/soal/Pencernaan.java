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

public class Pencernaan extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis_rangka";


    public Pencernaan(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, pil_d TEXT, pil_e TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();

        values.put("soal", "1.\t Berikut ini adalah beberapa proses pencernaan :\n" +
                "\t 1)\t Penyerapan air\n" +
                "\t 2)\t Penyerapan mineral\n" +
                "\t 3)\t Penyerapan ion-ion\n" +
                "\t 4)\t Pembusukan oleh Escherchia coli\n"
        );
        values.put("pil_a", "A.\t 1 dan 2");
        values.put("pil_b", "B.\t 2 dan 3");
        values.put("pil_c", "C.\t 1 dan 3");
        values.put("pil_d", "D.\t 2 dan 4");
        values.put("pil_e", "E.\t 1 dan 4");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "2.\t Enzim yang dihasilkan oleh pangkreas akan masuk ke duodenum (usus dua belas jari ) melalui...");
        values.put("pil_a", "A.\t Darah");
        values.put("pil_b", "B.\t Pembuluh darah");
        values.put("pil_c", "C.\t Pembuluh limfe");
        values.put("pil_d", "D.\t Kerongkongan (esofagus)");
        values.put("pil_e", "E.\t Saluran pangkreas");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "3.\t Pada sistem pencernaan manusia, zat makanan yang dicerna oleh garam empedu adalah ...");
        values.put("pil_a", "A.\t Asam amino");
        values.put("pil_b", "B.\t Protein");
        values.put("pil_c", "C.\t Karbohidrat");
        values.put("pil_d", "D.\t Vitamin");
        values.put("pil_e", "E.\t Lemak");
        values.put("jwban", "4");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "4.\t Urutan sistem pencernaan pada manusia adalah...");
        values.put("pil_a", "A.\t Mulut-kerongkongan-lambung-usus halus-usus besar-anus");
        values.put("pil_b", "B.\t Mulut-kerongkongan-usus halus-usus besar-anus");
        values.put("pil_c", "C.\t Mulut-kerongkongan-usus halus-lambung-usus besar- anus");
        values.put("pil_d", "D.\t Mulut-tenggorokan-usus halus- usus besar-anus");
        values.put("pil_e", "E.\t Mulut-tenggorokan-usus besar- usus halus-anus");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "5.\t Seseorang mengalami gangguan pencernaan makanan dengan gejala sukar buang air besar. Gangguan ini disebabkan....");
        values.put("pil_a", "A.\t Makanan kurang mengandung serat");
        values.put("pil_b", "B.\t Keracunan makanan");
        values.put("pil_c", "C.\t Kekurangan vitamin C");
        values.put("pil_d", "D.\t Infeksi kuman");
        values.put("pil_e", "E.\t Infeksi rongga tubuh");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "6.\t Enzim yang dihasilkan oleh getah pangkreas yang berfungsi untuk memecah amilum menjadi maltosa adalah...");
        values.put("pil_a", "A.\t Amilase ");
        values.put("pil_b", "B.\t Steapsin ");
        values.put("pil_c", "C.\t Ptialin");
        values.put("pil_d", "D.\t Erepsin");
        values.put("pil_e", "E.\t Tripsin");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "7.\t Penghubung cavum oris dengan esofagus adalah...");
        values.put("pil_a", "A.\t Faring");
        values.put("pil_b", "B.\t Laring");
        values.put("pil_c", "C.\t Duktus");
        values.put("pil_d", "D.\t Vesika fellea");
        values.put("pil_e", "E.\t Trakea");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "8.\t Untuk pertama kali makanan yang telah dikunyah oleh hewan pemamahbiak masuk ke...");
        values.put("pil_a", "A.\t Omasum");
        values.put("pil_b", "B.\t Retikulum lalu ke rumen");
        values.put("pil_c", "C.\t Abomasum");
        values.put("pil_d", "D.\t Retikulum");
        values.put("pil_e", "E.\t Rumen");
        values.put("jwban", "4");
        values.put("img", (byte[]) null);
        //values.put("img", R.drawable.soal8);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "9.\t Terjadinya  radang akut atau kronis pada selaput lendir dinding lambung merupakan gangguan sistem pencernaan yang disebut... ");
        values.put("pil_a", "A.\t Gastritis");
        values.put("pil_b", "B.\t Heart burn");
        values.put("pil_c", "C.\t Gastroenteritis");
        values.put("pil_d", "D.\t Stomatitis");
        values.put("pil_e", "E.\t Hernia");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);


        values.put("soal", "10.\t Gigi pada hewan ruminansia yang berfungsi untuk mengunyah makanan adalah..");
        values.put("pil_a", "A.\t Gigi tetap");
        values.put("pil_b", "B.\t Gigi taring");
        values.put("pil_c", "C.\t Gigi susu");
        values.put("pil_d", "D.\t Gigi seri");
        values.put("pil_e", "E.\t Gigi geraham");
        values.put("jwban", "4");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "11.\t Gangguan pada sistem pencernaan manusia yang disebabkan oleh kebiasaan buang air yang tidak teratur dan kurang nya makan makanan yang berserat adalah...");
        values.put("pil_a", "A.\t Konstipasi");
        values.put("pil_b", "B.\t Gastritis");
        values.put("pil_c", "C.\t Pangkreatis");
        values.put("pil_d", "D.\t Diare");
        values.put("pil_e", "E.\t Faltus");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "12.\t Gerakan mendorong dan menekan makanan (peristaltik) sangat membantu dalam perjalanan makanan pada...");
        values.put("pil_a", "A.\t Intestinum ");
        values.put("pil_b", "B.\t Esophagus");
        values.put("pil_c", "C.\t Faring");
        values.put("pil_d", "D.\t Laring");
        values.put("pil_e", "E.\t Ventrikulus");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        //values.put("img", R.drawable.soal11);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "13.\t Perhatikan makanan-makanan di bawah ini :\n" +
                "\t 1)\t Kacang\n" +
                "\t 2)\t Kangkung\n" +
                "\t 3)\t Daging sapi\n" +
                "\t 4)\t Tempe\n" +
                "Dari makanan diatas yang akan mengalami proses pencernaan paling lama dilambung adalah ..."
        );
        values.put("pil_a", "A.\t 1 dan 2");
        values.put("pil_b", "B.\t 2 dan 3");
        values.put("pil_c", "C.\t 1 dan 4");
        values.put("pil_d", "D.\t 3 dan 4");
        values.put("pil_e", "E.\t 1 dan 3");
        values.put("jwban", "0");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "14.\t Sari makanan yang diserap diusus halus aan dibawa menuju ke hati sebelum disebarkan keseluruh tubuh. Hal ini terkait fungsi hati sebagai...");
        values.put("pil_a", "A.\t Membersihkan racun racun dalam tubuh");
        values.put("pil_b", "B.\t Menyesuaikan kadar glukosa dan zat lain dalam darah ");
        values.put("pil_c", "C.\t Membersihkan darah dari bakteri penyebab penyakit");
        values.put("pil_d", "D.\t Penghasil bilirubin dan biliverdin");
        values.put("pil_e", "E.\t Perombak sel sel darah merah ");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "15.\t Proses pencernaan pada manusia dibagi menjadi dua yaitu pencernaan mekanik dan kimiawi. Pencernaan yang merubah makanan dari zat kompleks menjadi sederhana adalah...");
        values.put("pil_a", "A.\t Pencernaan mekanik");
        values.put("pil_b", "B.\t Pencernaan kimiawi");
        values.put("pil_c", "C.\t Pencernaan biasa");
        values.put("pil_d", "D.\t Pencernaan kompleks");
        values.put("pil_e", "E.\t Pencernaan sederhana");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "16.\t Enzim yang berfunfsi untuk memecah protein menjadi pepton adalah...");
        values.put("pil_a", "A.\t Renin");
        values.put("pil_b", "B.\t Lipase");
        values.put("pil_c", "C.\t Pepsin");
        values.put("pil_d", "D.\t Kim");
        values.put("pil_e", "E.\t Gastrim");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "17.\t Sumber kalori utama bagi tubuh adalah ...");
        values.put("pil_a", "A.\t Protein");
        values.put("pil_b", "B.\t Karbohidrat");
        values.put("pil_c", "C.\t Lemak");
        values.put("pil_d", "D.\t Mineral");
        values.put("pil_e", "E.\t Vitamin");
        values.put("jwban", "1");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "18.\t Secara berturut turut lambung pada ruminansia adalah...");
        values.put("pil_a", "A.\t Retikulum-rumen-abomasum-omasum");
        values.put("pil_b", "B.\t Retikulum-rumen-omasum-abomasum");
        values.put("pil_c", "C.\t Rumen- retikulum- abomasum-omasum");
        values.put("pil_d", "D.\t Rumen- retikulum- omasum-abomasum");
        values.put("pil_e", "E.\t Rumen- omasum-retikulum-abomasum");
        values.put("jwban", "3");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "19.\t Vitamin yang larut dalam air adalah...");
        values.put("pil_a", "A.\t A dan B");
        values.put("pil_b", "B.\t A dan C");
        values.put("pil_c", "C.\t B dan C");
        values.put("pil_d", "D.\t B dan K");
        values.put("pil_e", "E.\t E dan K");
        values.put("jwban", "2");
        values.put("img", (byte[]) null);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "20.\t Zat makanan berikut akan diserap oleh pembuluh pembuluh darah kapiler dalam vili/ jonjot usus halus menuju ke hati melalui vena porta, kecuali...");
        values.put("pil_a", "A.\t Glukosa");
        values.put("pil_b", "B.\t Mineral");
        values.put("pil_c", "C.\t Asam amino");
        values.put("pil_d", "D.\t Air");
        values.put("pil_e", "E.\t Protein gliserol");
        values.put("jwban", "4");
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
