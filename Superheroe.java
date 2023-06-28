package Liga;

public class Superheroe {

	String nombre;
	int fuerza;
	int resistencia;
	int superpoderes;

	
	Superheroe(String nombre, int fuerza, int resistencia, int superpoderes){
		this.setNombre(nombre);
		this.setFuerza(fuerza);
		this.setResistencia(resistencia);
		this.setSuperpoderes(superpoderes);
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private void setFuerza(int fuerza) {
		if(fuerza < 0) {
			fuerza = 0;
		} else if (fuerza > 100) {
			fuerza = 100;
		} else {
			this.fuerza = fuerza;
		}
		
	}


	private void setResistencia(int resistencia) {
		if(resistencia < 0) {
			this.resistencia = 0;
		} else if (resistencia > 100) {
			this.resistencia = 100;
		} else {
			this.resistencia = resistencia;
		}
	}


	private void setSuperpoderes(int superpoderes) {
		if(superpoderes < 0) {
			this.superpoderes = 0;
		} else if (superpoderes > 100) {
			this.superpoderes = 100;
		} else {
			this.superpoderes = superpoderes;
		}
	}
	
	public String getNombre() {
		return nombre;
	}


	public int getFuerza() {
		return fuerza;
	}


	public int getResistencia() {
		return resistencia;
	}


	public int getSuperpoderes() {
		return superpoderes;
	}

	
	/// revisar esto !!

	public void competir(Superheroe competidor) {
		
		int victoria = 0;
		int victoriaEnemigo = 0;
		
		if(this.fuerza > competidor.getFuerza()) {
			System.out.print(Competencia.VICTORIA);
			victoria++;
		} else {
			victoriaEnemigo++;
		}
		
		if(this.resistencia > competidor.getResistencia()) {
			System.out.print(Competencia.VICTORIA);
			victoria++;
		} else {
			victoriaEnemigo++;
		}
		
		if(this.superpoderes > competidor.getSuperpoderes()) {
			System.out.print(Competencia.VICTORIA);
			victoria++;
		} else {
			victoriaEnemigo++;
		}
		
		
		if(victoria > victoriaEnemigo) {
			System.out.print(Competencia.VICTORIA);
		} else if (victoria < victoriaEnemigo) {
			System.out.print(Competencia.DERROTA);
		} else {
			System.out.print(Competencia.EMPATE);
		}
		
		
	}


	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
	
	
	
	
	
	
}


