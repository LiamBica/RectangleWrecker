package engine;

import processing.core.*;

public abstract class ProcessingEntity {
	
	public String name;
	public int ID;
	public PApplet parent;
	
	public ProcessingEntity(PApplet p) 
	{
		parent = p;
	}

	
}
