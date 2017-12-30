package screens;

import processing.core.*;

public class SplashScreen extends BaseScreen {
	
	PApplet parent = null;
	
	int backgroundShade = 50;
	PImage logo_image;
	int logo_width = 350, logo_height = 350;
	
	public SplashScreen(PApplet _parent) {
		this.parent = _parent;
		
		logo_image = this.parent.loadImage("logo.png");
		
		
	}

	@Override
	public void move() {
		backgroundShade += 2;
	}

	@Override
	public void draw() {
		if (backgroundShade <= 255)	this.parent.background(backgroundShade);	
		
		this.parent.image(
			this.logo_image, 
			this.parent.width /2 - (logo_width/2),
			this.parent.height /2 - (logo_height/2) -50,
			this.logo_width,
			this.logo_height
		);
		
	}

}
