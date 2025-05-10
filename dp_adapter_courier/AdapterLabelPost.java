package design_patterns.dp_adapter;


/**
 * 
 * This class represent the adapter
 * 
 * Input side (target) accessible from client - method createLabel(LabelInfoContainer labelInfoContainer)
 * and adaptee - class we want to use is LabelFactoryPost
 * 				- adaptee method we want to use is 
 * 					labelFactoryPost.create(senderAddress, recipientAddress, another);
 * 
 * This adapter prepares parameters: 	senderAddress
 * 										recipientAddress 
 * 										another 
 * 
 * for method labelFactoryDPD.create and than run this method.
 * 
 * */
public class AdapterLabelPost implements PackageLabel {
	private LabelFactoryPost labelFactoryPost;
	
	public AdapterLabelPost() {
		this.labelFactoryPost = new LabelFactoryPost();
	}
	
	/**
	 * 
	 * Target method - is called from client
	 *  
	 * @param labelInfoContainer 
	 * 		  	Data from labelInfoContainer are converted into form appropriate for adaptee
	 * 			are created local variables: 	senderAddress 
	 * 											recipientAddress 
	 * 											another 
	 * 
	 * Theese variables are passed to adaptee method: labelFactoryPost.create(senderAddress, recipientAddress, another)
	 * 
	 */
	@Override
	public void createLabel(LabelInfoContainer labelInfoContainer) {
		String senderAddress = labelInfoContainer.getAddressSender();
		String recipientAddress = labelInfoContainer.getAddressReceipient();		
		String another = "" + labelInfoContainer.getPriceGoods() + labelInfoContainer.getPriceDeliveryCompany();
		
		this.labelFactoryPost.create(senderAddress, recipientAddress, another);
		
	}

	@Override
	public void printLabel() {
		// TODO Auto-generated method stub
		
	}


}