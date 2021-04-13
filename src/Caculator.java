import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class Caculator {

    public static final String CAN_NOT_DIVIDE_BY_0 = "can not divide by 0";
    public static final String UNSUPPORTED_OPERATION = "Unsupported operation";
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int Caculate(int a, int b, char o){
        switch (o){
            case ADDITION:
                return a+b;
            case SUBTRACTION:
                return a-b;
            case MULTIPLICATION:
                return a*b;
            case DIVISION:
                if(b!=0)
                return a/b;
                else
                    throw new RuntimeException(CAN_NOT_DIVIDE_BY_0);
            default:
                throw new RuntimeException(UNSUPPORTED_OPERATION);
        }
    }

    public static void main(String[] args) {

        System.out.println(Caculate(2,4,'*'));
    }
}
