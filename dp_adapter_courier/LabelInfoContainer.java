package dp_adapter_courier;

/*
 * 
 */
public class LabelInfoContainer {
	private String addressReceipient;
	private String addressSender;
	private int priceGoods;
	private int priceDeliveryCompany;
	
	public String getAddressReceipient() {
		return addressReceipient;
	}
	public void setAddressReceipient(String addressReceipient) {
		this.addressReceipient = addressReceipient;
	}
	
	public String getAddressSender() {
		return addressSender;
	}
	public void setAddressSender(String addressSender) {
		this.addressSender = addressSender;
	}
	
	public int getPriceGoods() {
		return priceGoods;
	}
	public void setPriceGoods(int priceGoods) {
		this.priceGoods = priceGoods;
	}
	
	public int getPriceDeliveryCompany() {
		return priceDeliveryCompany;
	}
	public void setPriceDeliveryCompany(int priceDeliveryCompany) {
		this.priceDeliveryCompany = priceDeliveryCompany;
	}
	
	
}