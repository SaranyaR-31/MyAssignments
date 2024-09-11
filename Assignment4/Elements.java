package Assignment4;

public class Elements extends Button{
	
	public void Execution() {
		System.out.println("Execution");
	}
	public static void main(String[] args) {
		
		Elements E1 = new Elements();
		E1.Submit();
		E1.Click();
	    E1.setText(null);
	    E1.Execution();
	    
	    
		
		
	}

}
