public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println(service.calculate(98, 1.87));
        System.out.println(service.calculate(53.5, 1.58));
    }
}
