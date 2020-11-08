public class BmiService {
    public float calculate(float bodyWeight, float bodyHeight){

        float bodyMassIndex = bodyWeight/(bodyHeight*bodyHeight);

        return bodyMassIndex;
    }
}
