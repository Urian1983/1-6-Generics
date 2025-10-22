package level1.exceptiions;

public class NegativeNumberException  extends Exception{
    public NegativeNumberException() {
        super("Negative numbers not allowed in this context");
    }
}
