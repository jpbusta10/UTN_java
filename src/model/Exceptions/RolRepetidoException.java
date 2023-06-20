package model.Exceptions;

public class RolRepetidoException extends Exception{
    private String message;
    public RolRepetidoException(String message){
        super(message);
    }
}
