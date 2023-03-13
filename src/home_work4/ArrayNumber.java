package home_work4;

import java.util.Arrays;

public class ArrayNumber {
    public static void main(String[] args) {
        float[] fullArray = new float[10];

        for (int i = 0; i < fullArray.length; i++) {
            fullArray[i] = (float) (Math.random() * 10);

        }
        System.out.println(Arrays.toString(fullArray));

        for (int i = 0; i < fullArray.length; i++) {

            float num = fullArray[i];

            float res = num - (num*25)/100;

            if(res<1){
                res = num + (num*25)/100;
            }
            fullArray[i] = res;
        }
        System.out.println(Arrays.toString(fullArray));
    }
}
