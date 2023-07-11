public class CustomException {
    public static void main(String[] args) throws AgeInvalidException {
        // handle
        try{
            validateAge(19);
            validateAge('\0');
        }catch(AgeInvalidException exception){
            System.out.println(exception.getMessage());
        }
    }
    public static void validateAge(int age) throws AgeInvalidException{
        if(age>=18){
            System.out.println("Eligible to Vote");
        }else{
            // suppress
            throw new AgeInvalidException("Age has to be greater than 18");
        }
    }
}
class AgeInvalidException extends Exception {
    public AgeInvalidException(String errorMessage) {
        super(errorMessage);
    }
}