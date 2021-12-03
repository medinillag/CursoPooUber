package Java;

public class Car {

    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
        this.passenger = 4;
    }

    void printDataCar() {
        boolean error = false;
        String mensaje = "";
        String coma = "";
        if (this.license == null) {
            mensaje += coma + "Agregar licencia";
            coma = ", ";
            error = true;
        }
        if (this.driver == null) {
            mensaje += coma + "Agregar conductor";
            coma = ", ";
            error = true;
        }
        if (this.driver != null && this.driver.name == null) {
            mensaje += coma + "Agregar nombre de conductor";
            coma = ", ";
            error = true;
        }
        if (this.passenger == null) {
            mensaje += coma + "Agregar pasajeros";
            coma = ", ";
            error = true;
        }
        if (error) {
            System.out.println(mensaje);
            return;
        }
        System.out.println("License: " + license + " Driver: " + driver.name + " Passengers: " + passenger);
    }

    public Integer getPassenger() {
        return this.passenger;
    }

    public void setPassenger(Integer passenger) {
        if (passenger != null && passenger != 4) {
            System.out.println("Necesitas asignar 4 pasajeros");
            return;
        }
        this.passenger = passenger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
