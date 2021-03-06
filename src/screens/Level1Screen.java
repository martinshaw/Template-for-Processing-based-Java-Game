package screens;

import core.Game;
import processing.core.*;

public class Level1Screen extends BaseScreen {
	
	PApplet p = null; 
	Game game = null;
	
	//for cube
	int pos = 100;
	int color_r = 255;
	int color_g = 255;
	int color_b = 255;
	int cube_w = 100, cube_h = 100;
	
	public Level1Screen(PApplet _parent, Game _game) {
		this.p = _parent;
		this.game = _game;
	}

	@Override
	public void move() {
		if ((p.mouseX <= p.width - 30) && (p.mouseX >= 30)){
			this.pos = p.mouseX;
		}
		
		if (p.mousePressed == true){
			color_r = 0 + (int)(Math.random() * ((255 - 0) + 1));
			color_g = 0 + (int)(Math.random() * ((255 - 0) + 1));
			color_b = 0 + (int)(Math.random() * ((255 - 0) + 1));
		}
		
	}

	@Override
	public void draw() {
		p.background(0);
		p.fill(255);
		p.textSize(16);
		p.text("Thank you for using this Game Template.\n\n"
				+ "This project can be easily modified and expanded to create\n"
				+ "a feature-rich and fun Processing-based game.\n\n"
				+ "You might change the splashscreen logo, write your game logic in\n"
				+ "the Level1Screen class, and add a new screen for a pause menu, etc...\n\n"
				+ "Use \"p\" for accessing Processing functionality from within a\n"
				+ "screen class, and use \"this.game\" for access to main Game class functionality.\n\n"
				+ "E-mail me at \"hello@martinshaw.co\" if you have found a good use for\n"
				+ "this template, I would love to see it. :)", 60, 60);
		
		p.fill(color_r, color_g, color_b);
		p.rect(pos - (cube_w/2), 500, cube_w, cube_h);
		
	}
	

}
