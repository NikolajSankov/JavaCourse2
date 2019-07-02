
public class BuilderMain {
	public static void main(String[] args) {
		BuilderExample test = new BuilderExample.Builder(12, 13).param3(5).param5(19).build();
		BuilderExample test2 = new BuilderExample.Builder(12, 13).param4(5).param5(19).build();
		System.out.println(test);
		System.out.println(test2);

	}
	
	
	
}
