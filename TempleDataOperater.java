class TempleDataOperater{
	
	static String[]TempleNames={null,null,null,null,null};
	static int position=0;
	static void save(String names){
	System.out.println("save start agide");
	TempleNames[position]=names;
	System.out.println("name:"+position);
	position++;
	System.out.println("save agiide");
	}
	static void displayName(){
	for(int index=0;index<TempleNames.length;index++){
	String ref=TempleNames[index];
	System.out.println(ref);
     	}
	}
	
}