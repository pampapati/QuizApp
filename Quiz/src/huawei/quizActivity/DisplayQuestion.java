package huawei.quizActivity;

import huawei.quiz.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class DisplayQuestion extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Intent i=getIntent();
	setContentView(R.layout.display_question);
	}

	
}
