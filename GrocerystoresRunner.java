class GrocerystoresRunner
{
	public static void main(String[]rudra)
	{
		Grocerystores.setFruits("Pomogranate");
        Grocerystores.setVegetable("DrumStick");
        Grocerystores.setSoap("Dove");
        Grocerystores.setOil("SunRich");
        Grocerystores.setIteam1("Poha");
        Grocerystores.setIteam2("Rice");
        Grocerystores.setIteam3("Dala");
        Grocerystores.setIteam4("Masala");
        Grocerystores.setIteam5("Grundnut");
        Grocerystores.setMartname("Globle/LuLu");
        Grocerystores.setDistance(5);
        Grocerystores.setCustomerNo(7349021518L);
        Grocerystores.setName("Prashant");
        Grocerystores.setDelavarymood(false);
	    
      String items1=Grocerystores.getFruits();
	  System.out.println(items1);
      String items2=Grocerystores.getVegetable();
	  System.out.println(items2);
      String items3= Grocerystores.getSoap();
      System.out.println(items3);
      String items4=Grocerystores.getOil();
      System.out.println(items4);
      String items5=Grocerystores.getIteam1();
      System.out.println(items5);
      String items6= Grocerystores.getIteam2();
      System.out.println(items6);
      String items7=Grocerystores.getIteam3();
      System.out.println(items7);
      String items8= Grocerystores.getIteam4();
      System.out.println(items8);
      String items9= Grocerystores.getIteam5();
      System.out.println(items9);
      String items10=Grocerystores.getMartname();
	  System.out.println(items10);
      int items11= Grocerystores.getDistance();
      System.out.println(items11);
      long items12=Grocerystores.getCustomerNo();
      System.out.println(items12);
      String items13=Grocerystores.getName();
      System.out.println(items13);
      boolean items14=Grocerystores.isDelavarymood();
      System.out.println(items14);
	}
}