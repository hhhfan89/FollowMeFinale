import java.io.Serializable;

public class Message implements Serializable {
	
	private int id;
	private String text;
	
	public Message() {
	}
	
	/**
	 * @param id
	 * @param text
	 */
	public Message(int id, String text) {
		this.id = id;
		this.text = text;
	}
	
	
	/**
	 * @return id
	 */
	public int getId() {
		
		if(id<=0)
			throw new NullPointerException("The attribute 'id' of class Message is null.");
		
		return id;
	}
	
	
	
	/**
	 * @param id
	 */
	public void setId(int id) {
		
		if(id<=0)
			throw new NullPointerException("The attribute 'id' of class Message is null.");
		
		this.id = id;
	}
	
	
	
	/**
	 * @return text
	 */
	public String getText() {
		
		if(text==null)
			throw new NullPointerException("The attribute 'text' of class Message is null.");
		if(text.length()>500)
			throw new IllegalArgumentException("The attribute 'text' of class Message is too long.");
		
		return text;
		
	}
	
	
	
	/**
	 * @param text 
	 */
	public void setText(String text) {
		
		if(text==null)
			throw new NullPointerException("The attribute 'text' of class Message is null.");
		if(text.length()>500)
			throw new IllegalArgumentException("The attribute 'text' of class Message is too long.");
		
		this.text = text;
	}

}