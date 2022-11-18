public abstract class Trabajadores {
	private String titulo;
	private String nombreTrabajador;
	private String direccionTrabajador;
	private String estadoCivil;
	private String run;
	private String horario;

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombreTrabajador() {
		return this.nombreTrabajador;
	}

	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}

	public String getDireccionTrabajador() {
		return this.direccionTrabajador;
	}

	public void setDireccionTrabajador(String direccionTrabajador) {
		this.direccionTrabajador = direccionTrabajador;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}