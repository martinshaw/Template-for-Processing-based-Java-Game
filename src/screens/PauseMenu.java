package screens;

import processing.core.*;

public class PauseMenu extends BaseScreen {
	
	PApplet parent = null; 
	
	public PauseMenu(PApplet _parent) {
		this.parent = _parent;
	}

	@Override
	public void move() {
		
	}

	@Override
	public void draw() {
		this.parent.background(0);
		this.parent.stroke(255);
		this.parent.text("Hello, World!", 0, 0);
		
	}
	

}
