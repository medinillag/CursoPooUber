package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("hola");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Spark");
        uberX.printDataCar();

        Car car2 = new Car("WQE567", new Account("Andrea Herrera", "ANDA876"));
        car2.printDataCar();
    }
}