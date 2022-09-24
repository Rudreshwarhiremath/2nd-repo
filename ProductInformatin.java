class ProductInformatin{
	public static void main(String[]info)
	{
	    String productname=info[0];
        String producttype=info[1];
		String productprice=info[2];
		String productquanity=info[3];
        String productquality=info[4];
            System.out.println("Product Name : "+ productname);//Pen
            System.out.println("Product Type : "+ producttype);//Statinary
            System.out.println("Product Price : "+ productprice);//25
			System.out.println("Product Quanity  : "+ productquanity);//20
			System.out.println("Product Quality  : "+ productquality);//best
                 int convertedPrice=Integer.parseInt(productprice);
                 System.out.println("Converted price: "+convertedPrice);
                    if(convertedPrice<=25)
                    {
                    System.out.println("Pen is Good");
					
                    }
                    else{
                    System.out.println("Pen is too costly");
                        }
				    int convertedQuantity=Integer.parseInt(productquanity);
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