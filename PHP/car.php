<?php
require_once('account.php');
class Car {
    public $id;
    public $license;
    public $driver;
    protected $passenger;

    public function __construct($license, $driver)
    {
        $this->license = $license;
        $this->driver = $driver;        
    }

    public function printDataCar() {
        echo "Lincencia: " . $this->license . " Driver: " . $this->driver->name . "Número de pasajeros: " . $this->passenger;
    }

    public function getPassegner() {
        return $this->passenger;
    }

    public function setPassenger($passenger) {
        if ($passenger != null && $passenger != 4){
            echo "Necesitas asignar 4 pasajeros";
            return;
        }
        $this->passenger = $passenger;
    }
}
?>