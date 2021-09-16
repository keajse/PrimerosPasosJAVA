package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	private int pesoTotal;
	
	private boolean asientosCuero, climatizador;
	
	
	public Coche() {
		ruedas= 4;
		largo=2000;
		ancho=300;
		
		motor= 1600;
		pesoPlataforma= 500;
	}
	
	public String dimeDatosGenerales() { //Método getters
		return "La plataforma del vehículo tiene " + ruedas + " ruedas"+
				". Mide " + largo/1000 + " metros con un ancho de "+ ancho +
				" cm y un peso de plataforma de "+ pesoPlataforma + " kg";
	}
	
	public void estableceColor(String color_coche) { //Método Setters
		color= color_coche;
	}
	
	public String dimeColor(){
		return "El color del coche es " + color;
	}
	
	public void configuraAsientos(String asientosCuero) {
		
		if(asientosCuero.equalsIgnoreCase("Si")) {
			this.asientosCuero = true;
		}else {
			this.asientosCuero = false;
		}
		
	}
	
	public String dimeAsientos() {
		if(asientosCuero==true) {
			return "El coche tiene asientos de CUERO";
		}else {
			return "El coche tiene asientos de SERIE";
		}
	}
	
	public void configuraClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("Si")) {
			this.climatizador= true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dimeClimatizador() {
		if(climatizador == true) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	//un método setters y getters a la vez, práctica no recomendada.
	
	public String dimePesoCoche() {
		int pesoCarroceria =500;
		
		pesoTotal= pesoPlataforma+pesoCarroceria;
		
		if(asientosCuero==true) {
			pesoTotal= pesoTotal+50;
		}
		if(climatizador==true) {
			pesoTotal= pesoTotal+20;
		}
		
		return "El peso del coche es: " + pesoTotal;
		
	}
	
	public String precioCoche() {
		int precioFinal = 10000;
		
		if(asientosCuero==true) {
			precioFinal+=2000;
		}
		if(climatizador==true) {
			precioFinal+=1500;
		}
		
		return "El precio del coche es: " + precioFinal;
	}

}
