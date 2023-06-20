package model;

import model.Exceptions.UsernameYacargadoException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Personal <T>{
    private HashMap<String, T> personas;

    public Personal(){
        this.personas = new HashMap<>();
    }
    public void agregar(String username, T nuevo) throws UsernameYacargadoException {
        Iterator<Map.Entry<String, T>> it = personas.entrySet().iterator();
        while(it.hasNext()){
            Persona data = (Persona) it.next();
            if(data.getUserName() == username){
                throw new UsernameYacargadoException("ya existe este user");
            }
        }
        this.personas.put(username, nuevo);
    }
    public boolean existe(String nombre, String apellido){
        boolean rta = false;
        Iterator it = personas.entrySet().iterator();
        while(it.hasNext()){
            Persona data = (Persona) it.next();
            if(data.getPerfil().getName() == nombre.concat(apellido)){
                rta = true;
            }
        }
        return rta;
    }

    @Override
    public String toString() {
        return "\nPersonal{" +
                "\nPersonas=" + personas +
                '}';
    }
}
