package jp.co.meaning.babyry;

import android.app.Activity;
import android.os.Bundle;

import com.parse.ParseAnalytics;
import jp.co.meaning.babyry.R;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpenedInBackground(getIntent());
	}
}