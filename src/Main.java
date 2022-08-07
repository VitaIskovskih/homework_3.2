public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 81;
        float growth = 178;
        float bodyMassIndex = service.calculate(weight, growth);
        System.out.println("Индекс массы тела:" + bodyMassIndex);
    }
}
