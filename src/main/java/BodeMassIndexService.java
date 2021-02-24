public class BodeMassIndexService {
    int calculate (double massKg, double heightSm) {
        double heightM = heightSm / 100;
        double bodyMassIndex = massKg / (heightM * heightM);
        return (int)bodyMassIndex;
    }
}
