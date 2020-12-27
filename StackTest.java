import com.stackexample.com.ArrayBasedStack;

public class StackTest {

	static final int[] STOCKS = { 31, 25, 64, 23, 75, 23, 54, 64, 23, 9, 3 };
	static final int STOCKSLENGTH = STOCKS.length;

	public static void main(String[] args) {	
		
		StackTest st = new StackTest();
		ArrayBasedStack as = new ArrayBasedStack();
		st.createStocks(as);
		//as.pop();
		System.out.println(as.size());
		
		st.Span(7);
		
	}

	private void showstack() {
		
		
	}

	private void createStocks(ArrayBasedStack as) {
		for (int i = 0; i < STOCKSLENGTH; i++) {
			if (as.isEmpty()) {
				as.push(STOCKS[i]);
				continue;
			}
			for (int j = i - 1; j > 0; j--) {
				if (STOCKS[i] > STOCKS[j]) {
					as.pop();
				}
				if (as.isEmpty() || (int) as.top() > (int) STOCKS[i])
					as.push(STOCKS[i]);
			}
		}
	
	}


	private static void Span(int i) {
		// TODO Ato-generated method stub

	}
}
