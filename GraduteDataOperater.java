class GraduteDataOperater{
	
	static String[]Gradute={null,null,null,null,null};
	static int position=0;
	static void save(String GraduteS){
	System.out.println("save start agide");
	Gradute[position]=GraduteS;
	System.out.println("name:"+position);
	position++;
	System.out.println("save agiide");
	}
	static void displayName(){
	for(int index=0;index<Gradute.length;index++){
	String ref=Gradute[index];
	System.out.println("names"+ref);
     	}
	}
	
}