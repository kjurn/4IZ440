public class NumberFunctions<T extends Number> {

    T num;

    NumberFunctions(T num) {
        this.num = num;
    }

    boolean absEqual(NumberFunctions<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }

}
