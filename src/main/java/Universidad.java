import java.util.ArrayList;

public class Universidad {
	private String nombreUniversidad;
	private String direccionUniversidad;
	private String tipoUniversidad;
	public ArrayList<Facultad> facultades = new ArrayList<Facultad>();
	public ArrayList<Trabajadores> trabajadores = new ArrayList<Trabajadores>();

	public String getNombreUniversidad() {
		return this.nombreUniversidad;
	}

	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}

	public String getDireccionUniversidad() {
		return this.direccionUniversidad;
	}

	public void setDireccionUniversidad(String direccionUniversidad) {
		this.direccionUniversidad = direccionUniversidad;
	}

	public String getTipoUniversidad() {
		return this.tipoUniversidad;
	}

	public void setTipoUniversidad(String tipoUniversidad) {
		this.tipoUniversidad = tipoUniversidad;
	}
}