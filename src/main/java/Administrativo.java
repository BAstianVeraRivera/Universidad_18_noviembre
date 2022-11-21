public class Administrativo extends Trabajadores {
    public Administrativo (String titulo, String nombreTrabajador, String direccionTrabajador, String estadoCivil, String run, String horario) {
        super(titulo, nombreTrabajador, direccionTrabajador, estadoCivil,run,horario);
    }
    public String getTipo(){
        return "Administrativo";
    }
}