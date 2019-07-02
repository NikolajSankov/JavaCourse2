import java.util.Comparator;

public class InnerClassDemo {
	
	private String someField;

	public static void main(String[] args) {
		
		
		StringByLengthComparator sc = new StringByLengthComparator();
		InnerClassDemo m = new InnerClassDemo();
		m.InnerMethodDemo();
	}
	
	public void InnerMethodDemo() {
		SomeClass s = new SomeClass("text");
		System.out.println(s.value);
	}
	
	 
	public static class StringByLengthComparator implements Comparator<String>{

		@Override
		public int compare(String c1, String c2) {
			if(c1.length()>c2.length()) {
				return 1;
				} else if(c1.length()<c2.length()) {
					return -1;
				}
				return 0;
		}
		
	}
	private class SomeClass {
		private String value;
		
		public SomeClass(String value) {
			this.value = value;
		}
	}
	
	public interface Double {
		void doSomething();
	}
	
}
