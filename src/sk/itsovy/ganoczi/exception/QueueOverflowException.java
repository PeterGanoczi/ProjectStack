package sk.itsovy.ganoczi.exception;

public class QueueOverflowException extends Exception {

    public QueueOverflowException(String message){
        super(message);
    }
}
