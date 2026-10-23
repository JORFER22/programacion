public class persona {
    String nombre;
    String apellido;
    int edad;
    String genero;


    public  persona(String nombre, String apellido, int edad, String genero){
        this.nombre= nombre;
        this.apellido= apellido;
        this.edad= edad;
        this.genero= genero;

    }
    public persona(){}
    public String personaToString(){
        String texto = this.nombre + " " + this.apellido + " "+this.edad + " " + this.genero;
        return texto;
    }
}

