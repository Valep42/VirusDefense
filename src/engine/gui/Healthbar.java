package engine.gui;

import engine.MyVector2f;
import engine.graphics.TwoColoredBar;


public class Healthbar extends GUI {
	//protected MyVector2f coordinates;
	private int maxHealth;
	private float healthLeft;
	private int length;
	private int height;
	private TwoColoredBar bar;
	
	
	public Healthbar(float x, float y, int maxHealth, int length, int height) {
		super(x,y);
		//this.coordinates = new MyVector2f(x, y);
		this.maxHealth = maxHealth;
		this.healthLeft = maxHealth;
		this.length = length;
		this.height = height;
		
		this.bar = new TwoColoredBar(this.length, this.height);
		
		
	}

	
	
	public void changeHealth(float amount) {
		this.healthLeft += amount;
		this.bar.setFractionLeft(this.healthLeft/this.maxHealth);
	}
	
	public void setHealth(float amount) {
		this.healthLeft = amount;
		this.bar.setFractionLeft(this.healthLeft/this.maxHealth);
	}
	



	@Override
	public void draw() {
		this.bar.setFractionLeft(this.healthLeft/this.maxHealth);
		this.bar.draw(this.x, this.y);
		
	}

}
