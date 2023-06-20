package model;

import model.profile.Profile;
import model.role.Rol;
import model.role.Roles;

import java.util.Date;

public class Persona {
    private String id;
    private String email;
    private String apiKey;
    private String userName;
    private String createdAt;
    private String updatedAt;
    private Roles<Rol> rolesGen;
    private Profile perfil;

    public Persona(String id, String email, String apiKey, String userName) {
        this.id = id;
        this.email = email;
        this.apiKey = apiKey;
        this.userName = userName;
        this.rolesGen = new Roles<>();
    }

    public Persona() {
        this.rolesGen = new Roles<>();
        this.perfil = new Profile();
    }

    public Profile getPerfil() {
        return perfil;
    }

    public void agregarPerfil(Profile nuevo){
        this.perfil = nuevo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    public void agregarRol(Rol nuevo){
        try {
            this.rolesGen.agregarRol(nuevo);
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    @Override
    public String toString() {
        return "Persona{\n" +
                "\nid='" + id + '\'' +
                ", \nemail='" + email + '\'' +
                ", \napiKey='" + apiKey + '\'' +
                ", \nuserName='" + userName + '\'' +
                ", \ncreatedAt='" + createdAt + '\'' +
                ", \nupdatedAt='" + updatedAt + '\'' +
                ", \nrolesGen=" + rolesGen +
                ", \nperfil=" + perfil +
                '}';
    }
}
