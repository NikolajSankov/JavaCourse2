package telran.webinar.Static;

public class StaticTest {
	public int param1;
	public String param2;
	public static String param3;
	public StaticTest(int param1, String param2) {
		super();
		this.param1 = param1;
		this.param2 = param2;
	}
	public int getParam1() {
		return param1;
	}
	public void setParam1(int param1) {
		this.param1 = param1;
	}
	public String getParam2() {
		return param2;
	}
	public void setParam2(String param2) {
		this.param2 = param2;
	}
	public static String getParam3() {
		return param3;
	}
	public static void setParam3(String param3) {
		StaticTest.param3 = param3;
	}
	
	
	
	
}
