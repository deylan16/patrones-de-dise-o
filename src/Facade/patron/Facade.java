package Facade.patron;

import Singleton.patron.AgregarVehiculo;

public class Facade {

    public Facade() {
    }
    public static void AgregarCarro(String carro,String placa,String dueño){
        AgregarVehiculo nuevo = AgregarVehiculo.getInstance();
        nuevo.agregaCarro(carro,placa,dueño);
    }
    public static void MuestraInventario(){
        AgregarVehiculo nuevo = AgregarVehiculo.getInstance();
        nuevo.muestraCarros();
    }
    public static void CambiarDatoPorPlaca(String Placa,String que,String nuevodato){
        EditarInformacion cambio = new EditarInformacion();
        cambio.editarPorPlaca(Placa,que,nuevodato);
    }
}
