package jsp.springcore;

public class Car {
	Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		engine.run();
		System.out.println("Car is Starting");
	}
	

}
