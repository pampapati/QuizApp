package huawei.quizActivity;

import huawei.quiz.R;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class CreditActivity extends Activity{

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.display_credit);
	ActionBar act=getActionBar();
	act.setDisplayHomeAsUpEnabled(true);
	}

	
}
