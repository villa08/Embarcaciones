class Yate extends Embarcacion {
    int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anoFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public String comprar() {
        if (cantidadCamarotes > 7) {
            return "¡Compra exitosa! Este yate tiene un lujo adicional.";
        } else {
            return "¡Compra exitosa! Yate comprado.";
        }
    }
}
