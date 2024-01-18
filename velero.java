class Velero extends Embarcacion {
    int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean esGrande() {
        return cantidadMastiles > 4;
    }
}
