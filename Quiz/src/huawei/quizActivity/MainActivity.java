package huawei.quizActivity;



import huawei.quiz.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	private static final String LOGCAT = null;
	Button play,rules,credits,exit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_activity);
		
	//Add the click listeners for the buttons
		rules=(Button)findViewById(R.id.button_rules);
	rules.setOnClickListener(this);
	
	credits=(Button)findViewById(R.id.button_credits);
	credits.setOnClickListener(this);
	
	play=(Button)findViewById(R.id.button_play);
	play.setOnClickListener(this);
	
	exit=(Button)findViewById(R.id.button_exit);
	exit.setOnClickListener(this);
	
		Log.d(LOGCAT, "Pege loaded");
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent;
		switch(v.getId()){
		case R.id.button_rules:
			 intent=new Intent(this,RulesActivity.class);
			startActivity(intent);
			break;
		case R.id.button_exit:
			finish();
			break;
		case R.id.button_play:
			intent=new Intent(this,DisplayCategory.class);
			startActivity(intent);
			break;
		case R.id.button_credits:
			 intent=new Intent(this, CreditActivity.class);
			startActivity(intent);
			break;
			
		}
	}
	

}
