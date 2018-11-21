package engine;

import processing.core.PApplet;

public abstract class GameObject extends ProcessingEntity {

	public GameObject(PApplet p) {
		super(p);
		// TODO Auto-generated constructor stub
	}
	
	public String name;
	public String tag;
	
	public Transform transform = new Transform();
	public abstract void start();
	public abstract void update();
	public abstract void render();
	public String ToString() 
	{
		return this.name;
	}
}
