package Implementation;

public class Search {
	
	public String displayProduct(Product product) {
		
		if(product.getProductList().contains(product.getProductName())){
			return product.getProductName();
		}
		else {
			return null;
		}
			
	}

}
