public class BaseConverter {
    public double convert(double T, char ch){
        if (ch=='F')
            return 1.8 * T + 32;
        if (ch=='K')
            return T + 273;
        return T;
    }
}
