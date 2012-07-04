package jp.androidgroup.nyartoolkit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class WeightDBcreate extends SQLiteOpenHelper {
    	
	    //データベース名の定義		
		private static final String DB_NAME = "PersonalProfaile";
		
		//コンストラクタ
		public WeightDBcreate (Context context){
			super(context, DB_NAME, null, 1);
		}

		//データベースの生成
		@Override
		public void onCreate(SQLiteDatabase db) {
			//db.beginTransaction();
			CreateTable(db);
		}
		
		private void CreateTable(SQLiteDatabase db){
			try{
				db.execSQL(
						"create table PersonalProfaile("+
						"PattID integer not null,"+
					    "Name text not null,"+
						"Weight integer"+
						");"
				);
				
				db.execSQL("insert into PersonalProfaile(PattID,Name,Weight) values (0,'ニジマス',0);");
				db.execSQL("insert into PersonalProfaile(PattID,Name,Weight) values (1,'カマキリ',0);");
				
				db.setTransactionSuccessful();
				db.endTransaction();
				
		    } catch (Exception e){
		    	
		    } 
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO 自動生成されたメソッド・スタブ
		}
}
