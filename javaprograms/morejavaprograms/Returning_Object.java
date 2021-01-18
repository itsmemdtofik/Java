class ErrMssg {
    String msg[] = {

            "Output error", "Disk full", "input error", "Index of bounds error"

    };

    /** Returning an object of type error */
    String getErrorMessage(int i) {

        if (i >= 0 & i < msg.length)
            return msg[i];
        else
            return "Invalid Error code";
    }
}

public class Returning_Object {
    public static void main(String[] args) {
        ErrMssg err = new ErrMssg();
        System.out.println(err.getErrorMessage(2));
        System.out.println(err.getErrorMessage(19));
    }

}
