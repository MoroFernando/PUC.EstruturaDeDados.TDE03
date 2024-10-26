public class QuickSorter {
  public static void sort(NumbersArray numbersArray) {
    int[] arr = numbersArray.array();
    sort(arr, 0, arr.length - 1);
  }

  private static void sort(int[] arr, int left, int right) {
    if (left >= right) return;

    int middle = (left + right) / 2;
    int pivot = arr[middle];
    int current_left = left;
    int current_right = right;
    
    while (current_left <= current_right) {

      while (arr[current_left] < pivot) {
        current_left++;
      }
      while (arr[current_right] > pivot) {
        current_right--;
      }

      if (current_left <= current_right) {
        int aux = arr[current_left];
        arr[current_left] = arr[current_right];
        arr[current_right] = aux;
        
        current_left++;
        current_right--;
      }
    }

    if (left < current_right) { 
      sort(arr, left, current_right);
    } 

    if (current_left < right) {
      sort(arr, current_left, right);
    }
  }
}
