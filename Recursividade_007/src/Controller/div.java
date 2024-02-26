package Controller;

public class div {
	
	public div() {
		
		super();
		
	}
	
	
	public int funcDiv (int dividendo, int divisor) {
		
		
		if (dividendo < divisor ) {
			
			return 0;
		}
		
		

			
		
		return 1 + funcDiv(dividendo - divisor, divisor);
		
	}

}
