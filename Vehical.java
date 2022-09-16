class Vehical{
	static double Transport(String Source,String Destination)
	{
	if (Source=="Basavakalyan" &&Destination=="Hubbali")
	 {
	System.out.println("Vehical Source:"+Source);	
    System.out.println("Vehical Destination:"+Destination);
	 }	
	return 505D;
	}
	static double Transport(String Source,String Destination,double ontime)
	{
	if (Source=="Bidar" &&Destination=="Banglore"&&ontime==5.00)	
	{
	System.out.println("Vehical Source:"+Source);	
    System.out.println("Vehical Destination:"+Destination);
	System.out.println("Vehical reaches ontime:"+ontime);
	 }	
	return 500d;	
	}
	static boolean Transport(String Destination)
	{
	if (Destination=="Belagavi")
    {
	System.out.println("Vehical Destination:"+Destination);	
	}		
    return true;
	}
	static boolean Transport(String Destination, double ontime)
	{
    if (Destination=="Belagavi"&&ontime==6.30)
    {
	System.out.println("Vehical Destination:"+Destination);
    System.out.println("Vehical reaches ontime:"+ontime);	
	}		
    return true;
	}
    static boolean Transport(double ontime)
	{
    if (ontime==7.30)
    {
    System.out.println("Vehical reaches ontime:"+ontime);	
	}		
    return true;	
	}
	}
	
	
	
	
	
