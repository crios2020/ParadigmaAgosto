//declaración de clases
public class Auto{
	//atributos
	String marca;
	String modelo;
	String color;
	int velocidad;
	
	//métodos
	void acelerar(){
		velocidad=velocidad+10;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	//método sobrecarcargado
	void acelerar(int kilometros){
		velocidad=velocidad+kilometros;
		if(velocidad>100){
			velocidad=100;
		}
	}
	
	void acelerar(int kilometros,boolean tieneNitro){
		if(tieneNitro==true){
			acelerar(kilometros*2);
		}else{
			acelerar(kilometros);
		}
	}
	
	void frenar(){
		velocidad=velocidad-10;
	}
	
	//void: no devuelve parametros
	void imprimirVelocidad(){
		System.out.println(velocidad);
	}

	//este método tiene devolución de valor
	int getVelocidad(){
		return velocidad;
	}
	
}// end class
