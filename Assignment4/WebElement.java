package Assignment4;

public class WebElement {
	
	
	public void Click() {
	 System.out.println("Click");
	}
	public void setText(String text) {
		System.out.println("setText(Stringtext)");
		
	}
	
	public static void main(String[] args) {
		
		WebElement WE = new WebElement();
		WE.Click();
	    WE.setText(null);
		
		
		
	}

}
