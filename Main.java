public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Juan", "Perez", "ABC123");
        Velero velero1 = new Velero(capitan1, 50000, 0, 2022, 10, 5);
        System.out.println(velero1.calcularMontoAlquiler()); // Calcula el monto de alquiler del velero

        Capitan capitan2 = new Capitan("Maria", "Lopez", "XYZ789");
        Yate yate1 = new Yate(capitan2, 80000, 0, 2021, 15, 8);
        System.out.println(yate1.calcularMontoAlquiler()); // Calcula el monto de alquiler del yate
        System.out.println(yate1.comprar()); // Intenta comprar el yate
    }
}