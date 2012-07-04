package jp.androidgroup.nyartoolkit;

import android.app.Activity;
import android.content.Context;
import android.content.ContentValues;  
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.os.Bundle;
import android.widget.Toast;

public class WeightingWord extends Activity {
	
	public void WeightingWord(){
		
	}
	
	WeightDBcreate WeightDB = null;
	SQLiteDatabase db = null;
	
	private int PattID;

	public void weightingRotate(){

		
		WeightDB = new WeightDBcreate(WeightingWord.this);
		db = WeightDB.getWritableDatabase(); 
		
		//setContentView(R.layout.sub);  
		
		GlobalMarkername gmn =new GlobalMarkername();
        PattID = gmn.GetData();
		
        String sql = "SELECT Weight FROM Personal_Profaile";
		int Weight = db.rawQuery(sql,null).getInt(0) + 1;
		
		ContentValues values = new ContentValues();
		values.put("Weight",Weight);
		System.out.println("単語Weight " + Weight);
		
		int ret;
        try {  
            ret = db.update("Personal_Profaile", values, "PattID = ?", null);  
        } finally {
        	WeightDB.close();  
        }
        if (ret == -1){
            //Toast.makeText(WeightDB.this, "Update失敗", Toast.LENGTH_SHORT).show(); 
        } else {
            //Toast.makeText(this, "Update成功", Toast.LENGTH_SHORT).show();
        }
	}


}
