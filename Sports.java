class Sports{
	static void cricketTeamMembers(String[]names)
	{
		System.out.println("Start");
	System.out.println("noof Players:="+names.length);
	for(int index=0;index<names.length;index++)
	{
    String ref=names[index];
    System.out.println("Player name:"+ref);
	}
	System.out.println("End");	
	}
	static void kabbadiTeamMembersJerseyNos(int[]numbers)
	{
		System.out.println("Start");
	    System.out.println("noof Players:="+numbers.length);
	for(int index=0;index<numbers.length;index++)
	{
    int ref=numbers[index];
    System.out.println("Player J number:"+ref);
	}
	System.out.println("End");
    }
	static void FootBallTeamMembersSalary(double[] salaries)
	{
		System.out.println("Start");
	    System.out.println("noof members:="+salaries.length);
	for(int index=0;index<salaries.length;index++)
	{
    double ref=salaries[index];
    System.out.println("Team members Salary:"+ref);
	}
	System.out.println("End");
    }
	static void ludoTeamMobileNumber(long[] nos)
	{
		System.out.println("Start");
	    System.out.println("noof members:="+nos.length);
	for(int index=0;index<nos.length;index++)
	{
    long ref=nos[index];
    System.out.println("Team members mobile no:"+ref);
	}
	System.out.println("End");
    }
	static void hockeyTeamMembersNoOfMatches(int[] matches)
	{
		System.out.println("Start");
	    System.out.println("noof matches:="+matches.length);
	for(int index=0;index<matches.length;index++)
	{ 
    int reference=matches[index];
    System.out.println("Team members matches:"+reference);
	}
	System.out.println("End");
    }
	static void kokoTeamMembersCountryCode(long[] names1)
	{
		System.out.println("Start");
	    System.out.println("total members:="+names1.length);
	for(int index=0;index<names1.length;index++)
	{ 
    long reference=names1[index];
    System.out.println("members country code:"+reference);
	}
	System.out.println("End");
    }
	static void lagoriTeamMembersAlive(boolean[] names2)
	{
		System.out.println("Start");
	    System.out.println("total members:="+names2.length);
	for(int index=0;index<names2.length;index++)
	{ 
    boolean reference=names2[index];
    System.out.println("members alive:"+reference);
	}
	System.out.println("End");
    }
}