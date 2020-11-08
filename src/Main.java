public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bodyWeight = 63.5f;                   //масса тела в килограммах
        float bodyHeight = 1.85f;                   //рост в метрах
        float BodyMassIndex = service.calculate(bodyWeight, bodyHeight);
        System.out.printf("Ваш индекс массы равен %.2f", BodyMassIndex);
    }
}
