class MoviedataOperater{
	
	static String[]movieNames={null,null,null,null,null};
	static int position=0;
	static void save(String movie){
	System.out.println("save start agide");
	movieNames[position]=movie;
	System.out.println("name:"+position);
	position++;
	System.out.println("save agiide");
	}
	static void displayName(){
	for(int index=0;index<movieNames.length;index++){
	String ref=movieNames[index];
	System.out.println(ref+"names");
     	}
	}
	
}