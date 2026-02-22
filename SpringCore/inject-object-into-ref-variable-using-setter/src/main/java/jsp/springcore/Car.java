package jsp.springcore;

public class Car {
	private Engine engine;
	public void start() {
		System.out.println("car is starting");
		engine.run();
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

}
