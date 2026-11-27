public abstract class ASTROS {
    private double radioEcuatorial;
    private double rotacion;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;

    public ASTROS(double radioEcuatorial, double rotacion, double masa, double temperaturaMedia, double gravedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacion = rotacion;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public double getRotacion() {
        return rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public abstract String muestra();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("radioEcuatorial= ").append(radioEcuatorial).append("\n");
        sb.append("rotacion= ").append(rotacion).append("\n");
        sb.append("masa= ").append(masa).append("\n");
        sb.append("temperaturaMedia= ").append(temperaturaMedia).append("\n");
        sb.append("gravedad= ").append(gravedad).append("\n");
        return sb.toString();
    }
}
