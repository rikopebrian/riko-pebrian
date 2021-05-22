import java.util.Arrays;

/*
 /*NAMA : RIKO PEBRIAN
 /*NIM  : 20200040042
 /*KELAS: TI20A REGULER
 */

/**
 *
 * @author riko pebrian
 */
public class SelectionSort {
    
  public static void main(String[] args) {
    int[] arr = {20, 7, 17, 26, 21, 35,46, 48, 55}; 

    int min = arr[0];
    int index = 0;
    int swappingProcess = 0;

    long startTime = System.nanoTime();

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i; j < arr.length; j++) {
        if ( arr[j] < min ) {
          min = arr[j];
          index = j;
          swappingProcess++;
        }
        System.out.println(Arrays.toString(arr) + " - Total Swap : " + swappingProcess);
      }
      if ( min < arr[i] ) {
        arr[index] = arr[i];
        arr[i] = min;
      }
      min = arr[i + 1];
    }

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Total waktu diperlukan : " + timeElapsed + " nano detik");



  }

}