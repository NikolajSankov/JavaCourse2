public class Transformer {
	
	public static void main(String[] args) {
		
		System.out.println(transformer("aaa Bcdh Njnns JJj j bcw", new WordsTransformer()));		
	}
	public static String transformer(String input, WordsTransformer t) {
		String[] w= input.split(" ");
		for (int i = 0; i < w.length; i++) {
			if(t.check(w[i])) {
				w[i] = t.transform(w[i]);
			}
		}
		
		return String.join(" ", w);
		
			
	}
}