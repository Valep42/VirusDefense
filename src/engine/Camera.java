package engine;

public class Camera extends Entity{

	public Camera(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void addX(int amount) {
		this.x += amount;
	}
	
	public void addY(int amount) {
		this.y += amount;
	}
	
}