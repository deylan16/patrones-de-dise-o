import Singleton.patron.AgregarVehiculo;

public class main {
    public static void main(String[] args) {
        AgregarVehiculo nuevo = AgregarVehiculo.getInstance();
        nuevo.agregaCarro("Bmw","213478");
        nuevo.agregaCarro("Suzuki","654434");
        nuevo.muestraCarros();
    }
}
