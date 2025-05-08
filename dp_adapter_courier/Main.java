package design_patterns.dp_adapter;

public class Main {

	/*
	 * labelInfoContainer - object which contains data needed for creating 
	 * 						package label. This data are in format compatible with client.
	 * 						
	 * 
	 *  adapterPPL, adapterPPL - here are the data from labelInfoContainer converted into format appropriet for 
	 * 						particular label Factory (DPD, PPL, ...)
	 * 							and is called method for creating label in particular label factory 
	 *  
	 */
	public static void main(String[] args) {				
		LabelInfoContainer labelInfoContainer = new LabelInfoContainer();
		labelInfoContainer.setAddressReceipient("Recepient address data");
		labelInfoContainer.setAddressSender("Sender address data");
		labelInfoContainer.setPriceGoods(2540);
		labelInfoContainer.setPriceDeliveryCompany(120);
		
				
		AdapterLabelPPL adapterPPL = new AdapterLabelPPL();
		adapterPPL.createLabel(labelInfoContainer);
		
		AdapterLabelDPD adapterDPD = new AdapterLabelDPD();
		adapterDPD.createLabel(labelInfoContainer);

	}

}
