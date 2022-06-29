public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55; //кг
        double height = 170; //см
        double bmi = service.calculate(weight, height);

        System.out.println("Индекс массы тела" + bmi);
    }
}

