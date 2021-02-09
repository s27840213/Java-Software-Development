package hw5;

public class Email extends Document {
	String sender;
	String recipient;
	String title;
	
	public String toString() {
		return text;
	}
	
	public void setSender(String s) {
		sender = s;
	}
	
	public String getSender() {
		return sender;
	}

	public void setRecipient(String r) {
		recipient = r;
	}
	
	public String getRecipient() {
		return recipient;
	}
	public void setTitle(String t) {
		title = t;
	}
	
	public String getTitle() {
		return title;
	}
}
