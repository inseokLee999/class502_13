package global.exceptions;

public class ValidationException extends RuntimeException{
    public ValidationException(String message){//생성자
        super(message);
    }
}
