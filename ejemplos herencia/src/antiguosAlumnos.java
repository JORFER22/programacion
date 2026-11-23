import java.time.LocalDate;

public class antiguosAlumnos extends alumno{
    private LocalDate fechaGraduacion;
    private boolean isWorking;

    public antiguosAlumnos(String nombre, String apellidos, LocalDate fechaNacimiento, String dni, String ciclo, int curso, String[] modulos,LocalDate fechaGraduacion, boolean isWorking) {
        super(nombre, apellidos, fechaNacimiento, dni, ciclo, curso, modulos);
        this.fechaGraduacion= fechaGraduacion;
        this.isWorking= isWorking;

    }

    public LocalDate getFechaGraduacion() {
        return this.fechaGraduacion;
    }

    public boolean isWorking() {
        return this.isWorking;
    }
    @Override
}
