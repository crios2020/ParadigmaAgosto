<?php
	//php
	echo '<h1>Hola Mundo!</h1>';

	//declaración de clase
	class Cuenta{
		//atributos
		public $nro;
		public $moneda;
		public $saldo;
		
		//método constructor
		public function Cuenta($nro,$moneda){
			$this->nro=$nro;		//this.nro=nro;
			$this->moneda=$moneda;
		}
		
		public function depositar($monto){
			$this->saldo+=$monto;
		}
		
		public function debitar($monto){
			if($this->saldo>$monto){
				$this->saldo-=$monto;
			}else{
				echo '<h3>No hay saldo suficiente!</h3>';
			}
		}
		
		public function getEstado(){
			echo $this->nro.' '.$this->moneda.' '.$this->saldo;
		}
	}//end class Cuenta

	echo '<h3>-- $cuenta1--</h3>';
	$cuenta1=new Cuenta(1,'arg$');
	$cuenta1->depositar(20000);
	$cuenta1->depositar(20000);
	$cuenta1->debitar(8000);
	$cuenta1->getEstado();
	
	class Cliente{
		public $nro;
		public $nombre;
		public $cuenta;
		
		public function Cliente($nro, $nombre, $nroCuenta){
			$this->nro=$nro;
			$this->nombre=$nombre;
			$this->cuenta=new Cuenta($nroCuenta,'arg$');
		}
		
		public function getEstado(){
			echo $this->nro.' '.$this->nombre;
		}
		
		public function getCuenta(){
			return $this->cuenta;
		}
		
	}//end class
	
	echo '<h3>-- $cliente1--</h3>';
	$cliente1=new Cliente(1,'Diego Lozada',2);
	//$cliente1->depositar(50000); //error el método depositar no pertence a cliente
	
	//Error se deposito en cualquier cuenta
	//$cuentax=new Cuenta(x,'arg$');
	//$cuentax->depositar(50000);
	
	//Correcto
	//$cuentaCliente1=$cliente1->getCuenta();
	//$cuentaCliente1->depositar(50000);
	
	//Modo funcional
	$cliente1->getCuenta()->depositar(50000);
	
	echo $cliente1->getEstado();
	echo '<br>';
	echo $cliente1->getCuenta()->getEstado();
	
?>
