public class Satelites extends ASTROS{

    private double distanciaPlanetaria;
    private double orbitaPlanetaria;
    Planeta planeta;

    public Satelites(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad, double distanciaPlanetaria, double orbitaPlanetaria, Planeta planeta) {
        super(radioEcuatorial, rotacion, masa, temperaturaMedia, gravedad);
        this.distanciaPlanetaria=distanciaPlanetaria;
        this.orbitaPlanetaria=orbitaPlanetaria;
        this.planeta=planeta;
    }




    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("distanciaPlanetaria=").append(distanciaPlanetaria).append("\n");
        sb.append("orbitaPlanetaria=").append(orbitaPlanetaria).append("\n");
        sb.append("planeta=").append(planeta).append("\n");
        return sb.toString();
    }
    @Override
    public String muestra() {
        return super.toString()+this.toString();
    }
}
