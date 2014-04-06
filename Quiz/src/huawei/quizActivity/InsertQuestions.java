package huawei.quizActivity;

import huawei.quiz.R;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class InsertQuestions extends Activity{

	private static final String LOGCAT = null;
	EditText q,o1,o2,o3,o4,ans,level;
	Button b1,b2;
	DataBase db=new DataBase(this);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.insert_quest);
		
		q=(EditText)findViewById(R.id.question);
		o1=(EditText)findViewById(R.id.option1);
		o2=(EditText)findViewById(R.id.option2);
		o3=(EditText)findViewById(R.id.option3);
		o4=(EditText)findViewById(R.id.option4);
		ans=(EditText)findViewById(R.id.ans);
		level=(EditText)findViewById(R.id.level);
		b1=(Button)findViewById(R.id.insert);
		b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				HashMap<String,String> query=new HashMap<String, String>();
				query.put("quest",q.getText().toString());
				query.put("A",o1.getText().toString());
				query.put("B",o2.getText().toString());
				query.put("C",o3.getText().toString());
				query.put("D",o4.getText().toString());
				query.put("ans",ans.getText().toString());
				query.put("level",level.getText().toString());
				db.insertQuestion(query);			
			}
		});
		
		final Intent i=new Intent(this, DisplayQuestion.class);
		b2=(Button)findViewById(R.id.goto_display);
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
startActivity(i);

			}
		});
		Log.d(LOGCAT, "Pege loaded");
	}
	

}
