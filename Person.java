class Person{
	static void Work(String Compny,double Salary)
	{
		System.out.println("Entred Work details");
		 Compny="Google";
		 Salary=300000D;
					System.out.println("Working in Google Compny:"+Compny);
					System.out.println("Working in Google and Getting:"+Salary);		
	}
	static void Work(String Compny,double Salary,String Designation)
	{
		System.out.println("Entred Work details");
     Compny="Infyosis";
	 Salary=450000D;
	 Designation="HumanResource";
		System.out.println("Working in Infyosis Compny:"+Compny);	
		System.out.println("Working in Infyosis and Getting :"+Salary);
		System.out.println("Working in Infyosis and As :"+Designation);
	}	
}