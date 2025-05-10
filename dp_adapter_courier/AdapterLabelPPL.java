package design_patterns.dp_adapter;

/**
 * 
 * This class represent the adapter
 * 
 * Input side (target) accessible from client - method createLabel(LabelInfoContainer labelInfoContainer)
 * and adaptee - class we want to use is LabelFactoryPPL
 * 				- adaptee method we want to use is labelFactoryPPL.generateLabel(addresses, another)
 * 
 * This adapter prepares parameters: 	addresses
 * 									 	another
 *  
 * for method labelFactoryPPL.generateLabel and run this method.
 * 
 * */
public class AdapterLabelPPL implements PackageLabel {
	private LabelFactoryPPL labelFactoryPPL;
	
	public AdapterLabelPPL() {
		this.labelFactoryPPL = new LabelFactoryPPL();
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
	 * Theese variables are passed to adaptee method: labelFactoryPPL.generateLabel(addresses, another)
	 * 
	 */
	@Override
	public void createLabel(LabelInfoContainer labelInfoContainer) {
		String addresses = labelInfoContainer.getAddressReceipient() + labelInfoContainer.getAddressSender();
		String another = "" + labelInfoContainer.getPriceGoods() + labelInfoContainer.getPriceDeliveryCompany();
		
		this.labelFactoryPPL.generateLabel(addresses, another);
	}

	@Override
	public void printLabel() {
		
	}
}
