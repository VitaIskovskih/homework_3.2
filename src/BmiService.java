public class BmiService {
    public float calculate(float weight, float growth) {
        float doubleGrowth = growth * growth;
        float dividedGrowth = doubleGrowth / 10_000;
        float index = weight / dividedGrowth;

        return index;
    }
}
