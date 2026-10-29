import model.Libro;

public class Biblioteca {
    //atributos
    private String codigo;
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;

    //Atributos de la clase coleccion de libros
    private Libro[] libros;
    private int nlibrosActuales;
    private final int dimensionInicial = 100;
    //constructor de la clase
    public Biblioteca(String codigo, String nombre, String direccion, String email, String telefono){
        this.codigo= codigo;
        this.nombre = nombre;
        this.direccion= direccion;
        this.email= email;
        this.telefono= telefono;

        this.libros = new Libro[this.dimensionInicial];

        this.nlibrosActuales= 0;

    }
    //getters y setters
    public String getCodigo(){

        return this.codigo;
    }
    public String getNombre(){

        return this.nombre;
    }
    public String getDireccion(){

        return this.direccion;
    }
    public String getEmail(){

        return this.email;
    }
    public String getTelefono(){

        return this.telefono;
    }
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setTelefono(String telefono) {

        this.telefono = telefono;
    }

    public int getNlibrosActuales() {
        return nlibrosActuales;
    }
    //insertar libros en la biblioteca
    public boolean insertarLibro(Libro libro){
        boolean resultado = false;
        //comprobacion si es distnto de null para evitar excepcion nullpointer
        if (libro != null){
            if (this.nlibrosActuales < this.libros.length){
                this.libros[this.nlibrosActuales] = libro;
                this.nlibrosActuales++;
                resultado= true;

            } else {
                //no hay espacio del array
                //se pasara a llamar a la funciuon de ampliar dimension agrandando el espacio del array
                this.ampliarDimensionBiblioteca();
                this.libros[this.nlibrosActuales] = libro;
                this.nlibrosActuales++;
                resultado = true;
            }
//            //algoritmo optimizado
//            if (this.nlibrosActuales>= this.libros.length){
//                this.ampliarDimensionBiblioteca();
//            }
//            this.libros[this.nlibrosActuales]= libro;
//            this.nlibrosActuales++;
//            resultado=true;
        }



        return resultado;
    }

    //eliminar libros
    public boolean eliminarLibro(Libro libro){
        boolean resultado = false;
        if (libro != null){
            int index = -1;
            for (int i = 0 ; i < this.nlibrosActuales; i++){
                if (this.libros[i] != null){
                    if (this.libros[i].equals(libro.getIsbn())){
                        index = i ;
                        break; // eliminar primera ocurrencia, en este caso el isbn es unico
                    }
                }
            }
            if (index != -1) {
                this.libros[index] = null;
                resultado = true;
                /*
                //recolocar el array
                for (int i = index ; i < this.nlibrosActuales; i ++){
                    this.libros[i] = this.libros[i+1];
                }
                this.libros[this.nlibrosActuales-1]= null;
                nlibrosActuales--;

                 */
                //segunda forma
                this.libros[index] = this.libros[this.nlibrosActuales - 1];
                this.libros[this.nlibrosActuales - 1] = null;
                this.nlibrosActuales--;
            }

        }
        return resultado;
    }



    //buscar libros por ISBN
    public Libro getLibroByIsbn(String ISBN){
        Libro libro = null;
        if (ISBN !=null && !ISBN.isEmpty()){//protego para que isbn no sea nulo y q tambien no este vacio
            for(int i =0 ; i<this.nlibrosActuales ; i++){
                if (this.libros[i].getIsbn().equals(ISBN)){//recorre el array y compara cual es igual para devolver su info
                    libro= this.libros[i];
                    return libro;
                }
            }
        }
        return libro;
    }


    //se puede hacer para buscar tambien por titulo
    public Libro getLibroByTitulo(String titulo){
        Libro libro = null;
        if (titulo !=null && !titulo.isEmpty()){//protego para que isbn no sea nulo y q tambien no este vacio
            for(int i =0 ; i<this.nlibrosActuales ; i++){
                if (this.libros[i].getTitulo().equals(titulo)){//recorre el array y compara cual es igual para devolver su info
                    libro= this.libros[i];
                    return libro;
                }
            }
        }
        return libro;
    }


    //mostrasr info de la biblioteca
    public String infoBiblioteca(){
        String infoBiblio= "";
        infoBiblio += "Codigo: " + this.codigo + "\n";
        infoBiblio += "nombre: " + this.nombre;
        infoBiblio += "Direccion: " +this.direccion + "\n";
        infoBiblio += "email. " + this.email + "\n";
        infoBiblio += "Telefono: " +this.telefono + "\n";
        infoBiblio += "Numero de libros actuales: " + this.nlibrosActuales + "\n";

        return infoBiblio;
    }

    //mostrar info de todos los libros almacenados
    public String infoLibroBiblio (){
        String infoLibros="";
        //se recorre el array para mostrar toda la informacion de cada libro con dos saltos de linea para poder separar de mejor manera cada libro
        for (int i = 0; i< this.nlibrosActuales ; i++){
            //el mas igual se utiliza para sobreescribir la nueva info de cada libro
            infoLibros+= this.libros[i].infoLibro() + "\n\n";
        }
        return infoLibros;

    }



    //ampliar la dimension del arrya
    private void ampliarDimensionBiblioteca(){
        Libro[] librosAux= new Libro[this.libros.length + this.dimensionInicial];
        for (int i = 0 ; i<libros.length; i++){
            librosAux[i] = libros[i];
        }
        this.libros = librosAux;
    }

}//final
