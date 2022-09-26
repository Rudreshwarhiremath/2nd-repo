class ProductInformatin{
	public static void main(String[]info){
	if(info.length==5)
	{
	    String productName=info[0];
        String productType=info[1];
		String productPrice=info[2];
		String productQuanity=info[3];
        String productQuality=info[4];
            System.out.println("Product Name : "+ productName);//Pen
            System.out.println("Product Type : "+ productType);//Statinary
            System.out.println("Product Price : "+ productPrice);//25
			System.out.println("Product Quanity  : "+ productQuanity);//20
			System.out.println("Product Quality  : "+ productQuality);//best
                 int convertedPrice=Integer.parseInt(productPrice);
                 System.out.println("Converted price: "+convertedPrice);
                    if(convertedPrice<=25)
                    {
                    System.out.println("Pen is Good");
					
                    }
                    else{
                    System.out.println("Pen is too costly");
                        }
				    int convertedQuantity=Integer.parseInt(productQuanity);
                    System.out.println("Converted Quantity: "+convertedQuantity);
	                if(convertedQuantity<=20)
					{
						System.out.println("Can use up to 2months");
					}
	               else{
					   System.out.println("have to wait");
				   }
				   int total=convertedPrice*convertedQuantity;//25*20=500
				  System.out.println("Total price:"+total);//500
				   	}
	}
}