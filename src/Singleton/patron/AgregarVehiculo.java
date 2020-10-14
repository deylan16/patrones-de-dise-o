package Singleton.patron;

import java.util.ArrayList;
//patron singleton
public class AgregarVehiculo {
    private static AgregarVehiculo Instancia;
    private ArrayList<String> inventario = new ArrayList<>();

    // El constructor es privado, este no permitira que se genere el constructor por defecto
    private AgregarVehiculo() {
    }

    public void agregaCarro(String Carro,String placa){
        inventario.add(Carro+"@"+placa);
    }
    public void muestraCarros(){
        if (inventario.size() != 0){
            int i;
            for (i = 0;i < inventario.size(); i++){
                String informacionArray[] = inventario.get(i).split("\\@");
                System.out.println(informacionArray[0]+" = "+informacionArray[1]);
            }

        }
        else{
            System.out.println("No hay autos en el inventario");
        }
    }

    //Metodo que evalua si se crea una instancia
    public static AgregarVehiculo getInstance() {
        if (Instancia == null){
            System.out.println("Se creo una nueva instancia");
            Instancia = new AgregarVehiculo();
        }
        else{
            System.out.println("Ya sea ha creado una instancia");
        }

        return Instancia;
    }
}
