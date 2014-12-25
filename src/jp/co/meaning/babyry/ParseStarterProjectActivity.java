package jp.co.meaning.babyry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.parse.ParseAnalytics;

import jp.co.meaning.babyry.R;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpenedInBackground(getIntent());
		
		Button transitionButton = (Button)findViewById(R.id.transitionButton);
		transitionButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(ParseStarterProjectActivity.this, ORMLiteActivity.class);
				startActivity(intent);
			}
		});
	}
}
