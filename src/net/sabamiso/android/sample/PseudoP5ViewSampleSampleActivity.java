package net.sabamiso.android.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class PseudoP5ViewSampleSampleActivity extends Activity {

	SampleView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

		super.onCreate(savedInstanceState);
		
		view = new SampleView(this);
		setContentView(view);

		view.setup(); // don't forget to call setup()!
	}

	@Override
	protected void onResume() {
		super.onResume();
		view.onResume();
		hideSystemUI();
	}

	@Override
	protected void onPause() {
		view.onPause();
		super.onPause();
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		hideSystemUI();
	}

	private void hideSystemUI() {
		View decor = this.getWindow().getDecorView();
		decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
				| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
				| View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
				| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
				| View.SYSTEM_UI_FLAG_FULLSCREEN
				| View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
	}
}
