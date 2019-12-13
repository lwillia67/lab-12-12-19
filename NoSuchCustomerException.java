/*
 * Lab Exception Handling
 * Martino Laurent, Lawrence williams
 * */
public class NoSuchCustomerException extends Exception{
    public NoSuchCustomerException(int error){
        super("Customer #: "+error+ " does Not exist");
    }
}
