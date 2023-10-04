package tp1;

/**
 * Ma première classe en Java
 * 
 * @author Caroline 
 * @version 1.0
 */


public class Premiere {
	private String message;
	
	/**
	 * On utilise le constructeur par defaut
	 */
	public Premiere() {
		this.message = "Bonjour tout le monde!";
	}
	
	/**
	 * constructeur qui prend en paramètre une chaine de caractères 
	 * qui sera utilisée pour initialiser l'attribut message
	 */
	public Premiere(String message) {
		this.message = message;
	}
	
	/** getter de message
	 * @return String message
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * Setter
	 * @param newMessage
	 */
	public void setMessage(String newMessage) {
		this.message = newMessage;
	}
}
