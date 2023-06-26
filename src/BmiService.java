public class BmiService {

    public int calculate (double wKilogram, double hMeter){
        double bodyMassIndexDouble = wKilogram / (hMeter * hMeter);
        int bodyMassIndex = (int) bodyMassIndexDouble;
        return bodyMassIndex;
    }
}
