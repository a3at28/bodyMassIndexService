public class BodeMassIndexService {
    double calculate (double massKg, double heightSm) {
        double heightM = heightSm / 100;
        double bodyMassIndex = massKg / (heightM * heightM);
        return bodyMassIndex;
    }
}
