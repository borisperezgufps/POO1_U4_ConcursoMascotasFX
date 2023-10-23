package poo1.mascotas.modelo;

public class ConcursoMascota {

	private Mascota[] mascotas;
	
	public ConcursoMascota() {
		mascotas = new Mascota[10];
	}
	
	public void registrarMascota(String nombre, int edad, String raza) {
		// Validar que no hayan otras mascotas con el mismo nombre
		
		// Buscar posicion vacia
		for (int i = 0; i < mascotas.length; i++) {
			if(mascotas[i]==null) { // Esta vacia?
				// Crea el objeto mascota
				Mascota masc = new Mascota(nombre, edad, raza);
				// Lo guarda en la posicion
				mascotas[i] = masc;
				break;
			}			
		}		
	}
	
	public void asignarPuntaje(String nombreMascota, double puntaje) {
		// Validar que la mascota no tenga puntaje
		
		// Asignar puntaje a mascota
	}
	
	public int obtenerTotalMascotasRegistradas() {
		int total = 0;
		for (int i = 0; i < mascotas.length; i++) {
			if(mascotas[i]!=null) { 
				total++;
			}
		}
		return total;
	}
	
	public String listarMascotas() {
		String lista = "";
		
		return lista;
	}
	
	public String listarMascotaEdad(int edad) {
		String lista = "";
		
		return lista;
	}
	
}
