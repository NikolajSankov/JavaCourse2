
public class Demo {
	
	public static void main(String[] args) {
		int [] data = {1, 2, 3, 4, 5};
		
		int sum = sum(data);
		
		System.out.println(sum);
		
		int sumRec = sumRec(data, 0);
		
		System.out.println(sumRec);
		
		System.out.println(sumInit(data));
	}
	public static int sum(int [] a) {
		int  ret = 0;
		for(int i = 0; i< a.length; i++) {
			ret = ret + a[i];
		}
		return ret;
	}
	
	private static int sumInit(final int[] a) {
		return sumRec(a, 0);
	}
	
	public static int sumRec(final int[] a, int i) {
		//System.out.println("i ="+i);
		if(i >= a.length - 1) {
			return a[a.length-1];
		}
		return a[i] +sumRec(a, i+1);
	}
	
}
