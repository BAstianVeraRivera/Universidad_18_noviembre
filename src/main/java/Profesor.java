public class Profesor extends Trabajadores {
	private String tipoContrato;
	public Profesor (String titulo, String nombreTrabajador, String direccionTrabajador, String estadoCivil, String run, String horario, String tipoContrato) {
		super(titulo, nombreTrabajador, direccionTrabajador, estadoCivil,run,horario);
	}
	public String getTipo(){
		return "Profesor";
	}

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
}