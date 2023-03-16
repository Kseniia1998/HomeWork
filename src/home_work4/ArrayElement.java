package home_work4;

public class ArrayElement {
    public static void main(String[] args) {

        int[] fullArray = new int[5];
        int sum = 0;
        for (int i = 0; i < fullArray.length; i++) {
            fullArray[i] = (int) (Math.random() * 100);
            System.out.println(fullArray[i]);
            sum = sum + fullArray[i];
        }
        float averageValue = (float)sum / (float)fullArray.length;

        int firstElem = fullArray[0];

        for (int i = 0; i < fullArray.length; i++) {

            int elem = fullArray[i];

            float firstDiff;
            if (firstElem > averageValue){
                 firstDiff = firstElem - averageValue;
            }else{
                 firstDiff = averageValue - firstElem;
            }

            float allDiff;
            if (elem > averageValue){
                allDiff = elem - averageValue;
            }else{
                allDiff = averageValue - elem;
            }

            if (allDiff < firstDiff) {
                firstElem = fullArray[i];
            }
        }

        System.out.println("среднее значение: "+averageValue);
        System.out.println("результат: "+firstElem);
    }
}
