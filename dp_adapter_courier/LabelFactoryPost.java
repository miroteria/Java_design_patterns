package design_patterns.dp_adapter;

/**
 * 
 * Adaptee class - methods here we want to run from client.
 * 
 * Client don't know the method and parameters - generate(String senderRecipientAddress, String anotherInfo)
 * So is used adapter for accessing content of this class for client
 * 
 *
 */
public class LabelFactoryPost {
	public void create(String senderAddress, String recipientAddress, String anotherInfo) {
		System.out.println("Hooray !!! -  I am generating package label for POST. ");
	}
}
