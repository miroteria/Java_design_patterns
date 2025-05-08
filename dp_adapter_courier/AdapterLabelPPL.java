package design_patterns.dp_adapter;

public class AdapterLabelPPL implements PackageLabel {
	private LabelFactoryPPL labelFactoryPPL;
	
	public AdapterLabelPPL() {
		this.labelFactoryPPL = new LabelFactoryPPL();
	}
	
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
