import Facade.patron.Facade;
import Singleton.patron.AgregarVehiculo;

public class main {
    public static void main(String[] args) {
        Facade administrador = new Facade();
        administrador.AgregarCarro("BMW","233435","Deylan Sandoval");
        administrador.AgregarCarro("Suzuki","984565","Sebastian Sandoval");
        administrador.MuestraInventario();
        administrador.CambiarDatoPorPlaca("233435","Dueño","Helen Sanchez");
        administrador.MuestraInventario();

    }
}
