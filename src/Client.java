import java.util.ArrayList;

public class Client{
	private String username;
	private String password;
	private ArrayList<Picture>myPics;
	
	
	Client(String username, String password){
		this.username = username;
		this.password = password;
		this.myPics = new ArrayList<Picture>();
	}
	
	String getUsername(){
		return this.username;
	}
	
	String getPass(){
		return this.password;
	}
}
