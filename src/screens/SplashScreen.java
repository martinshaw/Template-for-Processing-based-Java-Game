package screens;

import core.Game;
import processing.core.*;

public class SplashScreen extends BaseScreen {
	
	PApplet p = null;
	Game game = null;
	
	int backgroundShade = 50;
	PImage logo_image;
	int logo_width = 350, logo_height = 350;
	
	public SplashScreen(PApplet _parent, Game _game) {
		this.p = _parent;
		this.game = _game;
		
		logo_image = p.loadImage("logo.png");
		
	}

	@Override
	public void move() {
		backgroundShade += 2;
	}

	@Override
	public void draw() {
		if (backgroundShade <= 255)	p.background(backgroundShade);	
		
		p.image(
			this.logo_image, 
			p.width /2 - (logo_width/2),
			p.height /2 - (logo_height/2) -50,
			this.logo_width,
			this.logo_height
		);
		
		if ((p.frameCount / Math.round(p.frameRate)) >= 4) { // approximately after 4 seconds
			this.game.changeScreen(new Level1Screen(p, this.game));
		}
		 
	}

}
