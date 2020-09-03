class Programa2{
	public static void main(String[] args){
		
		Auto.acelerar();
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto("VW","Gol","Blanco");
		Auto.acelerar();
		//auto1.acelerar();	//10
		//auto1.acelerar();	//20
		System.out.println(auto1.marca+" "+auto1.modelo+" "
			+auto1.color+" "+auto1.velocidad);
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto("Citroen","C4","Bordo");
		Auto.acelerar();
		//auto2.acelerar();	//30
		System.out.println(auto2.marca+" "+auto2.modelo+" "
			+auto2.color+" "+auto2.velocidad);
		System.out.println(auto1.marca+" "+auto1.modelo+" "
			+auto1.color+" "+auto1.velocidad);
		
	}
}
