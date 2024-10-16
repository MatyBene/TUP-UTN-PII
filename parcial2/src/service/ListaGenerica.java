package service;

import java.util.ArrayList;

public class ListaGenerica <E>{

    private ArrayList<E> lista;

    public ListaGenerica(ArrayList<E> lista) {
        this.lista = new ArrayList<>();
    }

    public ArrayList<E> getLista() {
        return lista;
    }

    public void agregar(E e){
        this.lista.add(e);
    }

    public void eliminar(E e){
        this.lista.remove(e);
    }

    public E buscarXPos(int pos){
        return lista.get(pos);
    }

    public int contar(){
        return lista.size();
    }
}
