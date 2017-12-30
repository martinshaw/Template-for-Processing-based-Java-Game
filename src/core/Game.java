package core;

import processing.core.*;
import screens.*;
import utils.*;

public class Game extends PApplet {
	
	public BaseScreen currentScreen;
	public SettingsManager settings = new SettingsManager();
	
	public static void main(String[] args) {
		PApplet.main(new String[] {core.Game.class.getName()});	
	}
	
	
	public void settings(){
		size(
			(int) settings.get("WINDOW_WIDTH"),
			(int) settings.get("WINDOW_HEIGHT")
		);
    }

    public void setup(){
    	this.currentScreen = new SplashScreen(this);
    }

	public void draw(){
		surface.setTitle((String) settings.get("GAME_TITLE"));
		
		currentScreen.move();
    	currentScreen.draw();
    }
    
	public void changeScreen(BaseScreen _screen){
		this.currentScreen = _screen;
	}

}
