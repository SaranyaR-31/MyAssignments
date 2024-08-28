package Assignmet3;

public class Library {
	public String addBook(String bookTitle) {
		System.out.println("Book Added Successfully");
		return bookTitle;
	}	
		public void issueBook() {
			
			System.out.println("Book Issued Successfully");
			
		}
			public static void main(String[] args) {
		       	  Library management= new Library();
		         
				@SuppressWarnings("unused")
				String Library =management.addBook ("LibraryManagement");
		       	  management. issueBook();
		
			
	}
		
	

}
