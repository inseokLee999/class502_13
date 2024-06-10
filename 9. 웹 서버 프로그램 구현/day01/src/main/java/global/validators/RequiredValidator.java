package global.validators;

public interface RequiredValidator {
    default void checkRequired(String field, RuntimeException e){
        if(field == null || field.isBlank()){
            throw e;
        }
    }
    default void checkTrue(boolean reseult, RuntimeException e){
        if (!reseult)throw e;
    }
    default void checkPasswordMatch(String password, String confirmpassword, RuntimeException e){
        if(!password.equals(confirmpassword)) throw e;
    }

}
