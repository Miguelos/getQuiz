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
public class ResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		findViewById(R.id.result_button).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						goHome();
					}

				});
	}

	private void goHome() {
		Intent i = new Intent(this, MainActivity.class);
		// i.putExtra(quiz info);
		startActivity(i);
	}
}
