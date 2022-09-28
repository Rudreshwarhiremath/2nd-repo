class bilion{
	static String[]bilionarie={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	static void save(String name)
	{
		if (position>=10)
		{
			System.out.println("ready");
			return;
		}
		if(bilionarie!=null && name.length()>=4)
		{
			bilionarie[position]=name;
			System.out.println("name:"+name+"::"+position);
			position++;
		}
	}
	static void display()
	{
		for (int i=0;i<bilionarie.length;i++)
		{
			String ref=bilionarie[i];
			System.out.println(ref);
		}
	}
	static boolean find(String name)
	{
		if(bilionarie!=null && name.length()>=4)
		{
			for(int j=0;j<bilionarie.length;j++)
			{
				String ref=bilionarie[j];
				if(ref==name)
				{
					System.out.println("name found:"+ref);
					return true;
				}	
				
			}
			
		}
		return false;
	}
	static String update(String oldName,String newName)
	{
		if(oldName!=null && newName!=null)
		{
			if(oldName.length()>=4 &&newName.length()>=4)
			{
				for(int point=0;point<bilionarie.length;point++)
				{
					String ref=bilionarie[point];
					if(ref==oldName)
					{
					System.out.println("old Name:"+ref);	
					bilionarie[point]=newName;
                    System.out.println("update Name:"+newName);					
						return newName;
					}
					
				}
				
			}
		}return  null;
	}
	static String update1(int index,String newName)
	{
		if(newName!=null && newName.length()>=4)
		{   
     		System.out.println("old point:"+index);
		    bilionarie[index]=newName;
			System.out.println("update Name:"+newName);
					return newName;
		}return null;
	}
    static boolean delete(String name)
	{
		if(bilionarie!=null && name.length()>=4)
		{
			for(int pet=0;pet<bilionarie.length;pet++)
			{
				String ref=bilionarie[pet];
				if(ref==name)
				{
					System.out.println("entred name:"+name);
					ref=null;
					System.out.println("name deleted:"+ref);
					return true;
				}	
			}
			
		}
		return false;	
	}
	static boolean delete1(int index,String name)
	{
		if(name!=null && name.length()>=4)
		{   
     		System.out.println(" index:"+index);
		    bilionarie[index]=name;
			name=null;
			System.out.println("update Name:"+name);
			return true;
		}return false;
    }
	
}