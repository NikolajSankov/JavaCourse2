public interface Countable {
	
	int initValue = 10;
 	
	int count(int i);
	
	default int value() { return 10; }
	
}
