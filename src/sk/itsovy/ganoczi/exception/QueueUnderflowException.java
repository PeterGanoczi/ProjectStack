package sk.itsovy.ganoczi.exception;

public class QueueUnderflowException extends Exception {

    public QueueUnderflowException(String message){
        super(message);
    }
}
