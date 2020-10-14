package Facade.patron;

import Singleton.patron.AgregarVehiculo;

import java.util.Objects;

import static java.lang.String.valueOf;

public class EditarInformacion {
    public EditarInformacion() {
    }
    public static void editarPorPlaca(String Placa,String que,String nuevodato){
        AgregarVehiculo cambiar = AgregarVehiculo.getInstance();
        if (cambiar.inventario.size() != 0){
            int i;
            for (i = 0;i < cambiar.inventario.size(); i++){
                String[] informacionArray = cambiar.inventario.get(i).split("\\@");
                if (Objects.equals(valueOf(informacionArray[1]), Placa)){
                    if (que.equals("Dueño")){
                        informacionArray[2] = nuevodato;
                        cambiar.inventario.set(i, informacionArray[0]+"@"+ informacionArray[1]+"@"+ informacionArray[2]);
                    }
                    else{
                        if(que.equals("Marca")){
                            informacionArray[0] = nuevodato;
                            cambiar.inventario.set(i, informacionArray[0]+"@"+ informacionArray[1]+"@"+ informacionArray[2]);
                        }
                    }
                }

            }

        }
        else{
            System.out.println("No hay autos en el inventario");
        }
    }
}
