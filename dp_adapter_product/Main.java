package dp_adapter_product;

public class Main {

	public static void main(String[] args) {
		Product product = new ProductOldAdapter(new ProductOld());
		product.printProductInfo();
	}

}
