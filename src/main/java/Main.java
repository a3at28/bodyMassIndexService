public class Main {
    public static void main(String[] args) {
        BodeMassIndexService service = new BodeMassIndexService();
        double bodyMassIndex = service.calculate(69.6,168.6);
        System.out.println(bodyMassIndex);


    }
}
