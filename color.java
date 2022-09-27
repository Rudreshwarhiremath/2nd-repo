class color{
	static String[]allColors={null,null,null,null,null,null,null};
	static int position=0;
	static void save(String colors)
	{
		if(position>=7)
		{
			System.out.println("main ");
			return;
		}
		if(allColors!=null && colors.length()>=3)
		{
			System.out.println("start");
	        allColors[position]=colors;
	        System.out.println("position"+position+"=:"+colors);
            position++;	
		}
	}
	static void desply()
	{
		for(int point=0;point<allColors.length;point++)
		{
			String index=allColors[point];
			System.out.println(index);
		}
	}
	static void checkColor(String colors)
	{
		if(allColors!=null && colors.length()>=3)
		{
			System.out.println("color will find in memory");
			for(int info=0;info<allColors.length;info++)
			{
				String ref=allColors[info];
				if(ref==colors)
				{
					System.out.println("colour found:"+colors);
				}
			}
		}       
			else
		         {
			      System.out.println("color not in memory");
		         }
	}	
}