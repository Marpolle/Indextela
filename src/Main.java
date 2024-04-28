public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 72;
        double height = 1.75;
        int bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела:" + bmi);

    }
}