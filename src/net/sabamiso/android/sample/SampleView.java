package net.sabamiso.android.sample;

import android.content.Context;
import net.sabamiso.android.p5.PseudoP5View;

public class SampleView extends PseudoP5View {

	public SampleView(Context context) {
		super(context);
	}

	@Override
	protected void setup() {
		size(360, 640);
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
        
		strokeWeight(10);
		stroke(255, 0, 0);
		line(10, 10, 200, 10);
		stroke(0, 255, 0);
		line(10, 10, 10, 200);

		stroke(0, 0, 255);
		line(350, 630, 350, 430);
		line(350, 630, 150, 630);

		if (mousePressed) {
			noStroke();
			fill(255, 255, 0);
			ellipse(mouseX, mouseY, 50, 50);
		}
		
	}

}
