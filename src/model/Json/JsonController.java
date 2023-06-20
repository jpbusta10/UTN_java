package model.Json;

import model.Exceptions.MuyPendejoException;
import model.Exceptions.UsernameYacargadoException;
import model.Persona;
import model.Personal;
import model.profile.Location;
import model.profile.Profile;
import model.role.Rol;
import model.role.Roles;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonController {
    public static Personal PersonalFromJson(String miArreglo) {
        try {
            JSONArray arreglo = new JSONArray(miArreglo);
            Personal<Persona> personal = new Personal<>();
            for (int i = 0; i < arreglo.length(); i++) {
                Persona nueva = new Persona();
                JSONObject personaJson = arreglo.getJSONObject(i);
                nueva.setId(personaJson.getString("id"));
                nueva.setEmail(personaJson.getString("email"));
                JSONArray roles = personaJson.getJSONArray("roles");
                for (int j = 0; j < roles.length(); j++) {
                    String aux = null;
                    aux = roles.getString(j);
                    if (aux.equals("guest")) {
                        nueva.agregarRol(Rol.GUEST);
                    } else if (aux.equals("owner")) {
                        nueva.agregarRol(Rol.OWNER);
                    } else if (aux.equals("admin")) {
                        nueva.agregarRol(Rol.ADMIN);
                    } else if (aux.equals("member")) {
                        nueva.agregarRol(Rol.MEMBER);
                    }
                }

                JSONObject profileJson = personaJson.getJSONObject("profile");

                Profile nuevoPerfil = new Profile(profileJson.getString("dob"), profileJson.getString("name"), profileJson.getString("about"), profileJson.getString("address"), profileJson.getString("company"));
                Location newLocation = new Location(profileJson.getJSONObject("location").getFloat("lat"), profileJson.getJSONObject("location").getFloat("long"));
                nuevoPerfil.agregarLocation(newLocation);
                nueva.agregarPerfil(nuevoPerfil);


                nueva.setUserName(arreglo.getJSONObject(i).getString("username"));
                nueva.setCreatedAt(arreglo.getJSONObject(i).getString("createdAt"));
                nueva.setUpdatedAt(arreglo.getJSONObject(i).getString("updatedAt"));

                personal.agregar(nueva.getUserName(), nueva);
                return personal;
            }
        }catch (UsernameYacargadoException e) {
            System.out.println(e.getClass() +" "+ e.getMessage());
        }catch (MuyPendejoException e) {
            System.out.println(e.getClass()+" "+e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
       return null;
}
}
