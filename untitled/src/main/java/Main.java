public class Main {

    public static void main(String [] args) {
        NumberFunctions<Integer> iOb = new NumberFunctions<>(6);
        NumberFunctions<Double> dOb = new NumberFunctions<>(-6.0);

        iOb.absEqual(dOb);
    }
}
