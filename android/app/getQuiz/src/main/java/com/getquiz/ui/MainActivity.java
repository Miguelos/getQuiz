package main.java.com.getquiz.ui;

import main.java.com.getquiz.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * 
 * @author Miguel González Pérez
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.start_button).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						startQuiz();
					}
				});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void startQuiz() {
		Intent i = new Intent(this, QuizActivity.class);
		// i.putExtra(quiz info);
		startActivity(i);
	}

}
