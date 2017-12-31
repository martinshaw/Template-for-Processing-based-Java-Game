package screens;

import core.Game;
import processing.core.*;

public class ExampleScreen extends BaseScreen {
	
	PApplet p = null; 
	Game game = null;
	
	public ExampleScreen(PApplet _parent, Game _game) {
		this.p = _parent;
		this.game = _game;
		
	}

	@Override
	public void move() {
		
	}

	@Override
	public void draw() {
		p.background(0);

	}
}
