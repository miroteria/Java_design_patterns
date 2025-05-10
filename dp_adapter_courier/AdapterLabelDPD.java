package design_patterns.dp_adapter;



/**
 * 
 * This class represent the adapter
 * 
 * Input side (target) accessible from client - method createLabel(LabelInfoContainer labelInfoContainer)
 * and adaptee - class we want to use is LabelFactoryDPD
 * 				- adaptee method we want to use is labelFactoryDPD.generate(addresses, another)
 * 
 * This adapter prepares parameters: 	addresses
 * 									 	another
 *  
 * for method labelFactoryDPD.generate and than run this method.
 * 
 * */
public class AdapterLabelDPD implements PackageLabel {
	private LabelFactoryDPD labelFactoryDPD;
	
	public AdapterLabelDPD() {
		this.labelFactoryDPD = new LabelFactoryDPD();
	}
	
	/**
	 * 
	 * Target method - is called from client
	 *  
	 * @param labelInfoContainer 
	 * 		  	Data from labelInfoContainer are converted into form appropriate for adaptee 
	 * 			are created local variables: 	addresses 
	 * 											another 
	 * 
	 * Theese variables are passed to adaptee method: labelFactoryDPD.generate(addresses, another)
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




