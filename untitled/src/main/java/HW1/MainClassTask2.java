package HW1;

import java.util.Arrays;

//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
public class MainClassTask2 {
    public static void main(String[] args){
        int [] nums = {3,2,3,2,3};
        int val =3;
        changeArr(nums,val);
        System.out.println(Arrays.toString(nums));
    }

    private static void changeArr(int[] arr, int val) {
        int iFrom, iWhere;
        iWhere=0;
        for (iFrom=0; iFrom<arr.length; iFrom++){
            if (arr[iFrom]!=val) {
                arr[iWhere++]=arr[iFrom];
            }
        }

        for (iFrom=iWhere; iFrom<arr.length; iFrom++) {
            arr[iFrom]=val;
        }
    }
}
