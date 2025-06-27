import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Kaç tane array değeri girmek istersiniz..:" );
        int count=scanner.nextInt();
        int[] takenArray=getArray(count);
        System.out.println("girilen değerler=" + Arrays.toString(takenArray));
        System.out.println("Array dizisinin tersten yazımı şu şekildedir");
        reverseArray(takenArray);
        int[] sortedList=sortedList(takenArray);
        System.out.println("girilen değerlerin büyükten küçüğe sıralı hali"+ Arrays.toString(sortedList));
        int minValue=minValue(takenArray);
        System.out.println("girilen array değerlerinden en küçük sayı : " + minValue);


    }
    private static int[] getArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("sayı giriniz");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;

    }
    private static int minValue(int[] array) {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value=array[i];
            if(value<min){
                min=value;
            }
        }
        return min;
    }
    private static void reverseArray(int[] array) {
      int maxIndex=array.length-1;
      int halfIndex=maxIndex/2;
      for (int i = halfIndex; i >= 0; i--) {
          int temp=array[i];
          array[i]=array[maxIndex-i];
          array[maxIndex-i]=temp;
      }
        System.out.println("reverse array ="+Arrays.toString(array));
    }
    public static int[] sortedList(int[] arrayList){
        int[] sortedList=new int[arrayList.length];
        for (int i=0;i<arrayList.length;i++) {
            sortedList[i]=arrayList[i];
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i=0;i<sortedList.length-1;i++) {
                if (sortedList[i]<sortedList[i+1]) {
                    temp=sortedList[i];
                    sortedList[i]=sortedList[i+1];
                    sortedList[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedList;
    }
}