package model.Exceptions;

public class MuyPendejoException extends Exception {
    private String message;
    public MuyPendejoException(String message){
        super(message);
    }
}
