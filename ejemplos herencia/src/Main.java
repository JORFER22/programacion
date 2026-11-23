//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] modulos={"FERNANDA","PASO POR CURVA","ADELANTAMIENTO","EL ULTIMO PIE"};
    Persona pp = new Persona("pepe", "fernadez", LocalDate.now(), "123456789p");
    alumno a1 = new alumno("marc", "marquez", LocalDate.now(), "123456789p", "motogp", 2026,modulos);

    IO.println(pp);
    IO.println(a1);

    Persona[] decrolyComunidad = new Persona[5];
    decrolyComunidad[0]= pp;
    decrolyComunidad[1]=a1;
    for (int i =0; i < decrolyComunidad.length; i++){
        if (decrolyComunidad[i] != null){
            if (decrolyComunidad[i] instanceof alumno){
                IO.println("OJO QUE SOY UN ALUMNO");
                IO.println(decrolyComunidad[i]);
            }

        }
    }
}
