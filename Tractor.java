class Tractor{
	static String Type;
	static String Brand;
	static int WheelDrive;
	static int[]FGears;
	static int[]RGears;
	static String[]color;
	static double[]Tyresizes;
	static int HP;
	static double[]PTOrpm;
	static String[]Instruments;
	static String[]maileze;
	static boolean comfert;
	static String clutchtype;
	static char[] Loadgears;
    static String[] Trailer;
    static String[] Uses;
	static String[] BrandsinINDIA;
	static void printDetails()
	{
	System.out.println(Type);
	System.out.println(Brand);
	System.out.println(WheelDrive);
	System.out.println(HP);
	System.out.println(comfert);
	System.out.println(clutchtype);
	if (FGears!=null)
	  {for(int i=0;i<FGears.length;i++)	
	   {System.out.println(FGears[i]);}
	  }
	else{System.out.println("no");}		
	if (FGears!=null)
	  {for(int j=0;j<RGears.length;j++)	
	   {System.out.println(RGears[j]);}
	  }   
	else{System.out.println("no");}		
	if (FGears!=null)
	  {for(int k=0;k<color.length;k++)	
	  {System.out.println(color[k]);}
      }  
	else{System.out.println("no");}		
	if (Tyresizes!=null)
	{for(int l=0;l<Tyresizes.length;l++)	
	{System.out.println(Tyresizes[l]);}
	}
	else{System.out.println("no");}		
	if (PTOrpm!=null)
	{for(int m=0;m<PTOrpm.length;m++)
	{System.out.println(PTOrpm[m]);}	
	}
	else{System.out.println("no");}		
	if (Instruments!=null)
	{for(int n=0;n<Instruments.length;n++)	
	{System.out.println(Instruments[n]);}	
	}else{System.out.println("no");}		
	if (maileze!=null)
	{for(int o=0;o<maileze.length;o++)	
	{System.out.println(maileze[o]);}	
	}else{System.out.println("no");}		
	if (Loadgears!=null)
	{for(int p=0;p<Loadgears.length;p++)	
	{System.out.println(Loadgears[p]);}	
	}
	else{System.out.println("no");}		
	if (Trailer!=null)
	{for(int q=0;q<Trailer.length;q++)	
	{System.out.println(Trailer[q]);}	
	}
	else{System.out.println("no");}		
	if (Uses!=null)
	{for(int r=0;r<Uses.length;r++)	
	{System.out.println(Uses[r]);}	
	}
	else{System.out.println("no");}		
	if (BrandsinINDIA!=null)
	{for(int s=0;s<BrandsinINDIA.length;s++)	
	{System.out.println(BrandsinINDIA[s]);}	
	}
	else{System.out.println("no");}		
	}
}