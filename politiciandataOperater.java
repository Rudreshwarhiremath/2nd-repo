class politiciandataOperater{
	
	static String[]politicianNames={null,null,null,null,null};
	static int position=0;
	static void save(String political){
	System.out.println("save start agide");
	politicianNames[position]=political;
	System.out.println("name:"+position);
	position++;
	System.out.println("save agiide");
	}
	static void displayName(){
	for(int index=0;index<politicianNames.length;index++){
	String ref=politicianNames[index];
	System.out.println("names"+ref);
     	}
	}
	
}