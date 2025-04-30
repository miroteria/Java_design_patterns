package dp_adapter_product;

public class ProductOldAdapter implements Product {
	private ProductOld productOld;
	
	public ProductOldAdapter(ProductOld productOld) {
		this.productOld = productOld;
	}
	
	public void printProductInfo() {
		this.productOld.printProductOldInfo();
	}
}
