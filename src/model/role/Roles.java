package model.role;

import model.Exceptions.RolRepetidoException;

import java.util.HashSet;
import java.util.Iterator;

public class Roles <T>{
    private HashSet<T> roles;

    public Roles() {
        this.roles = new HashSet<>();
    }

    public void agregarRol(T nuevo) throws RolRepetidoException {
        Iterator<Rol> it = (Iterator<Rol>) roles.iterator();
        while(it.hasNext()){
            Rol data = it.next();
            if(data == nuevo){
                throw new RolRepetidoException("ya esta cargado este rol");
            }
        }
        this.roles.add(nuevo);
    }
    public int contarGuest(){
        int contador = 0;
        Iterator<Rol> it = (Iterator<Rol>) roles.iterator();
        while(it.hasNext()){
            Rol data = it.next();
            if(data.equals(Rol.GUEST)){
                contador++;
            }

        }
        return contador;
    }
    public int contarAdmin(){
        int contador = 0;
        Iterator<Rol> it = (Iterator<Rol>) roles.iterator();
        while(it.hasNext()){
            Rol data = it.next();
            if(data.equals(Rol.ADMIN)){
                contador++;
            }

        }
        return contador;
    }public int contarOwner(){
        int contador = 0;
        Iterator<Rol> it = (Iterator<Rol>) roles.iterator();
        while(it.hasNext()){
            Rol data = it.next();
            if(data.equals(Rol.OWNER)){
                contador++;
            }

        }
        return contador;
    }


    @Override
    public String toString() {
        return "Roles{" +
                "roles=" + roles +
                '}';
    }
}
