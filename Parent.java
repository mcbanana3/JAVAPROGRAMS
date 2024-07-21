package JAVACTOOOD;

public interface Parent {
	public abstract void Display();
}

public class child implements Parent{

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
	}
	
}