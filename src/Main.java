import model.Json.JsonController;
import model.Json.JsonUtiles;
import model.Persona;
import model.Personal;

public class Main {
    public static void main(String[] args) {
        Personal<Persona> personas = JsonController.PersonalFromJson(JsonUtiles.leer("datos"));
        if (personas != null) {
            System.out.println(personas.toString());
        }
//        if (personas.existe("Gina", "Ellis")) {
//            System.out.println("existe");
//        }
//        else {
//            System.out.println("no existe");
//        }
    }
}