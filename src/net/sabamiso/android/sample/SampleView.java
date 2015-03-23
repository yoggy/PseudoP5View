package net.sabamiso.android.sample;

import android.content.Context;
import net.sabamiso.android.p5.PseudoP5View;

public class SampleView extends PseudoP5View {

	public SampleView(Context context) {
		super(context);
	}

	@Override
	protected void setup() {
		size(640, 480);
		frameRate(30);
	}

	@Override
	protected void draw() {
		background(0, 0, 0);

		noStroke();
		fill(255, 255, 255);

		for (int i = 0; i < 100; ++i) {
			float x = random(width);
			float y = random(height);
			ellipse(x, y, 20, 20);
		}
	}

}
