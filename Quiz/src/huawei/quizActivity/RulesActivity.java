package huawei.quizActivity;

import huawei.quiz.R;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

@SuppressLint("NewApi")
public class RulesActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.display_rules);
		ActionBar act=getActionBar();
		act.setDisplayHomeAsUpEnabled(true);
	}

}
