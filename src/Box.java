public class Box<T extends Number, S extends Number> implements Printable{

    private T number1;
    private S number2;

    public Box(T number1, S number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Box() {
    }

    @Override
    public void print(Object number1, Object number2) {
        System.out.println("Первое число: " + number1 + "\nВторое число: " + number2);
    }
}
