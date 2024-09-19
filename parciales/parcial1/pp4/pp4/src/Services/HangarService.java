package Services;

import Models.Avion;

import java.util.ArrayList;

public class HangarService {

    private final int id = ++HangarService.cantHangares;
    private ArrayList<Avion> aviones;
    public static int cantHangares = 0;

    public HangarService(ArrayList<Avion> aviones) {
        this.aviones = new ArrayList<>();
    }

    public void listarHangar(){
        for(Avion a : aviones){
            System.out.println(a);
        }
    }

    public void agregarAvion(Avion a){
        aviones.add(a);
    }

//    public String eliminarAvion(String id){
//        String msj = "El avion no se encuentra dentro del hangar.";
//
//        for(int i = 0; i < aviones.size(); i++){
//            if(id.equals(aviones.get(i).getId())){
//                aviones.remove(i);
//                msj = "El avion fue eliminado del hangar.";
//            }
//        }
//
//        return msj;
//    }


}
