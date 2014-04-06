package huawei.quizActivity;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataBase extends SQLiteOpenHelper{

	private static final String LOGCAT = null;
	

	public DataBase(Context context) {
		
		
		super(context,"quiz.db",null,1);
		Log.d(LOGCAT, "Creating datbse");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		Log.d(LOGCAT, "Creating Table");
db.execSQL("create table history(qid INTEGER PRIMARY KEY ASC,question TEXT,option1 TEXT,option2 TEXT,option3 TEXT,option4 TEXT,ans TEXT,level TEXT)");
	Log.d(LOGCAT, "History Table created");	
	}

	public void insertQuestion(HashMap<String, String> query){
		
		Log.d(LOGCAT, "Starind database");
		SQLiteDatabase database = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("question",query.get("quest"));
		values.put("option1",query.get("A"));
		values.put("option2",query.get("B"));
		values.put("option3",query.get("C"));
		values.put("option4",query.get("D"));
		values.put("level",query.get("level"));
		values.put("ans",query.get("ans"));
		database.insert("history", null, values);
		Log.d(LOGCAT,"One question inserted");
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
