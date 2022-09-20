class Card{
	static	String type;
	static	double heigth;
	static	double width;
	static	int price;
	static	String[] colour;
       static void printDetails() 
	{
		System.out.println(type);
		System.out.println(heigth);
		System.out.println(width);
		System.out.println(price);
		if(colour!=null)
		{
		for(int index=0;index<colour.length;index++)
		{
		String ref=colour[index];
		System.out.println(ref);
		}
		}
		else{
			System.out.println("dark");
			}
		}
}
