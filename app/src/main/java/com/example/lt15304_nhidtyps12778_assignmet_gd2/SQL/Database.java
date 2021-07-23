package com.example.lt15304_nhidtyps12778_assignmet_gd2.SQL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    public Database(Context context) {
        super(context, "QLCT.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE LOAI_TC(Maloai INTEGER PRIMARY KEY AUTOINCREMENT, Tenloai text, Trangthai text)");
        db.execSQL("INSERT INTO LOAI_TC(Tenloai,Trangthai) VALUES('Lãi ngân hàng', 'Thu')");
        db.execSQL("INSERT INTO LOAI_TC(Tenloai,Trangthai) VALUES('Mua quần áo', 'Chi')");

        db.execSQL("CREATE TABLE GIAO_DICH(MaGD INTEGER PRIMARY KEY AUTOINCREMENT, Tieude text, Ngay text, Tien double, Mota text, Maloai int, FOREIGN KEY (Maloai) REFERENCES LOAI_TC(Maloai))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS LOAI_TC");
        db.execSQL("DROP TABLE IF EXISTS GIAO_DICH");
    }
}
