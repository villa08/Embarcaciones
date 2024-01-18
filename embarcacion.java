class Embarcacion {
    Capitan capitan;
    double precioBase;
    double valorAdicional;
    int anoFabricacion;
    double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
    }

    public double calcularMontoAlquiler() {
        double montoAlquiler = precioBase;
        if (anoFabricacion > 2020) {
            montoAlquiler += 20000;
        }
        return montoAlquiler;
    }
}