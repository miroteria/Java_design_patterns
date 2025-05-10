package dp_adapter_courier;


/**
 * 
 * This class represent the adapter
 * 
 * Input side (target) accessible from client is method createLabel(LabelInfoContainer labelInfoContainer)
 * and adaptee - class we want to use is LabelFactoryDPD
 * 				- adaptee method we want to use is labelFactoryDPD.generate(addresses, another)
 * 
 * This adapter prepares parameters for method labelFactoryDPD.generate and than run this method.
 * 
 * 
 * */
public class AdapterLabelPost implements PackageLabel {
	private LabelFactoryPost labelFactoryPost;
	
	public AdapterLabelPost() {
		this.labelFactoryPost = new LabelFactoryPost();
	}
	
	@Override
	public void createLabel(LabelInfoContainer labelInfoContainer) {
		String senderAddress = labelInfoContainer.getAddressSender();
		String recipientAddress = labelInfoContainer.getAddressReceipient();		
		String another = "" + labelInfoContainer.getPriceGoods() + labelInfoContainer.getPriceDeliveryCompany();
		
		this.labelFactoryPost.create(senderAddress, recipientAddress, another);;
		
	}

	@Override
	public void printLabel() {
		// TODO Auto-generated method stub
		
	}


}