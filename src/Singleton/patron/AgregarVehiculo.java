package Singleton.patron;

import java.util.ArrayList;
//patron singleton
public class AgregarVehiculo {
    private static AgregarVehiculo Instancia;
    public ArrayList<String> inventario = new ArrayList<>();

    // El constructor es privado, este no permitira que se genere el constructor por defecto
    private AgregarVehiculo() {
    }

    public void agregaCarro(String Carro,String placa,String dueño){
        inventario.add(Carro+"@"+placa+"@"+dueño);
    }
    public void muestraCarros(){
        if (inventario.size() != 0){
            int i;
            for (i = 0;i < inventario.size(); i++){
                String informacionArray[] = inventario.get(i).split("\\@");
                System.out.println("-------------------------"+ "\n"+
                        "Marca:"+ informacionArray[0]+ "\n"+
                        "Placa:"+informacionArray[1]+ "\n"+
                        "Dueño:"+informacionArray[2]+ "\n"+
                        "-------------------------");
            }

        }
        else{
            System.out.println("No hay autos en el inventario");
        }
    }

    //Metodo que evalua si se crea una instancia
    public static AgregarVehiculo getInstance() {
        if (Instancia == null){
            Instancia = new AgregarVehiculo();
        }

        return Instancia;
    }
}
