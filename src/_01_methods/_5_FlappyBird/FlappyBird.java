package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
 
    }
    
    @Override
    public void setup() {
        size(800,600);
    }

    @Override
    public void draw() {
    	int birdYVelocity = -10;  
    	int gravity = 1;
    	int x = 600;
        int y = 600;
        background(100,100,100);
        fill(50,50,50);
        stroke(50,50,50);
		ellipse(x,y,100,100);
    }
    
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
