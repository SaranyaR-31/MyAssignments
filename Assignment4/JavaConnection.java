package Assignment4;


public class JavaConnection extends MysqlConnection {

	public void connect() {
		System.out.println("Connect from Subclass");
		
	}

	public void disconnect() {
		System.out.println("Disconnected from Subclass");
		
	}

	public void executeUpdate() {
		System.out.println("Execute the update from Subclass");
		
	}
	
	public static void main(String[] args) {
		JavaConnection JC = new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
	
		
	}

	
	}
	
	

