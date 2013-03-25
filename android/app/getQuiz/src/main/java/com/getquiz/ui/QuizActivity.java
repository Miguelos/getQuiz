/**
 * 
 */
package main.java.com.getquiz.ui;

import main.java.com.getquiz.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * @author Miguel González Pérez
 * 
 */
public class QuizActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);

		findViewById(R.id.next_question).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						nextQuestion();
					}

				});
	}

	private void nextQuestion() {
		Intent i = new Intent(this, ResultActivity.class);
		// i.putExtra(quiz info);
		startActivity(i);
	}
}
