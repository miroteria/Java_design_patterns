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
public class AdapterLabelDPD implements PackageLabel {
	private LabelFactoryDPD labelFactoryDPD;
	
	public AdapterLabelDPD() {
		this.labelFactoryDPD = new LabelFactoryDPD();
	}
	
	/**
	 * 
	 * This method with parameter labelInfoContainer is called from client. 
	 * @param labelInfoContainer 
	 * 		  	Data from labelInfoContainer are converted into form appropriate for 
	 * 			adaptee - are created local variables address and another. 
	 * 
	 * Then theese variables are passed to adaptee method - labelFactoryDPD.generate(addresses, another)
	 * 
	 */
	@Override
	public void createLabel(LabelInfoContainer labelInfoContainer) {
		
		String addresses = labelInfoContainer.getAddressReceipient() + labelInfoContainer.getAddressSender();
		String another = "" + labelInfoContainer.getPriceGoods() + labelInfoContainer.getPriceDeliveryCompany();
		
		this.labelFactoryDPD.generate(addresses, another);
	}

	@Override
	public void printLabel() {
		
	}



}