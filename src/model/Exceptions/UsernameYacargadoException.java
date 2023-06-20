package model.Exceptions;

public class UsernameYacargadoException extends Exception{
    private String message;
    public UsernameYacargadoException(String message){
        super(message);
    }
}
