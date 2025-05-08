package design_patterns.dp_adapter;

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
