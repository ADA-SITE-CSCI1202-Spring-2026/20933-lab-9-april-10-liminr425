public class Numeric<T extends Number> {

    private final T value;

    public Numeric(T value) {
        this.value = value;
    }

    public double reciprocal() {
        double doubleValue = value.doubleValue();
        if (doubleValue == 0.0) {
            throw new ArithmeticException("Cannot compute reciprocal of zero");
        }
        return 1.0 / doubleValue;
    }

    public double fractionalPart() {
        double doubleValue = value.doubleValue();
        return doubleValue % 1.0;
    }

    public boolean isAbsoluteEqual(Number other) {
        double absThis = Math.abs(value.doubleValue());
        double absOther = Math.abs(other.doubleValue());
        return Math.abs(absThis - absOther) < 1e-9;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Numeric<Double> num1 = new Numeric<>(9.76);
        Numeric<Float> num2 = new Numeric<>(9.76f);
        Numeric<Integer> num3 = new Numeric<>(5);

        System.out.println("Reciprocal of 9.76: " + num1.reciprocal());
        System.out.println("Fractional part of 9.76: " + num1.fractionalPart());
        System.out.println("Fractional part of 5: " + num3.fractionalPart());
        System.out.println("Absolute values equal? " + num1.isAbsoluteEqual(num2.getValue()));
        System.out.println("Absolute values equal? " + num1.isAbsoluteEqual(9.0));
    }
}