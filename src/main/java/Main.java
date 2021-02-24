public class Main {
    public static void main(String[] args) {
        BodeMassIndexService service = new BodeMassIndexService();
        int bodyMassIndex = service.calculate(69.5,168.5);
        System.out.println(bodyMassIndex);


    }
}
