import java.nio.MappedByteBuffer;
import java.time.LocalDate;

public class alumno extends Persona{
    private String ciclo;
    private int curso;
    private String[] modulos;


    public alumno(String nombre, String apellidos, LocalDate fechaNacimiento, String dni, String ciclo, int curso, String[] modulos) {
        super(nombre, apellidos, fechaNacimiento, dni);
        this.curso=curso;
        this.ciclo=ciclo;
        this.modulos= modulos;
    }

    public int getCurso() {
        return this.curso;
    }

    public String getCiclo() {
        return this.ciclo;
    }

    public String[] getModulos() {
        return this.modulos;
    }
    /*
    public String infoAlumno(){
        StringBuilder sb= new StringBuilder();
        sb.append(super.infoPersona());
        sb.append("CICLO: ").append(this.ciclo).append("\n");
        sb.append("CURSO: ").append(this.curso).append("\n");
        sb.append("MODULOS: ").append("\n");
        for (String modulo: this.modulos){
            sb.append(modulo).append("\n");
        }
        return sb.toString();
    }

     */
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(super.toString());
        sb.append("CICLO: ").append(this.ciclo).append("\n");
        sb.append("CURSO: ").append(this.curso).append("\n");
        sb.append("MODULOS: ").append("\n");
        for (String modulo: this.modulos){
            sb.append(modulo).append("\n");
        }
        return sb.toString();
    }
}
