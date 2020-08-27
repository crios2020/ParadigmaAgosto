import javax.swing.JOptionPane;
public class Programa{
	public static void main(String[] args){
		//punto de entrada de nuestro proyecto
		System.out.println("Hola Mundo!");
		
		System.out.println("-- auto1 --");
		Auto auto1=new Auto();	//creo un objeto de la clase Auto
		auto1.marca="Fiat";
		auto1.modelo="Toro";
		auto1.color="Rojo";
		auto1.acelerar();		//10
		auto1.acelerar();		//20
		auto1.acelerar();		//30
		auto1.frenar();			//20
		System.out.println(auto1.marca+" "+auto1.modelo+" "
			+auto1.color+" "+auto1.velocidad);
		
		System.out.println("-- auto2 --");
		Auto auto2=new Auto();
		auto2.marca="Ford";
		auto2.modelo="Ka";
		auto2.color="Negro";
		auto2.acelerar();		//10
		System.out.println(auto2.marca+" "+auto2.modelo+" "
			+auto2.color+" "+auto2.velocidad);
		
		System.out.println("*****************************************");
		
		//for(int a=0;a<=60;a++){
		//	auto2.acelerar();
		//}
		
		auto2.acelerar(15);				//25	
		
		//auto2.imprimirVelocidad();			//imprime la velocidad.
		System.out.println(auto2.getVelocidad());
		//JOptionPane.showMessageDialog(null,"Velocidad: "+auto2.getVelocidad());

	}
}
