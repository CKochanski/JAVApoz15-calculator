package pl.sda.spring.exception;

public class DivisionByZeroException extends ArithmeticException {

    public DivisionByZeroException() {
        super("Nie dziel przez 0!");
    }
}
