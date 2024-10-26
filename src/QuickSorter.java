public class QuickSorter extends Sorter{
  public QuickSorter(){
    super();
  }

  @Override
  protected void sort(int[] arr) {
    sortRecrsive(arr, 0, arr.length - 1);
  }

  private void sortRecrsive(int[] arr, int left, int right) {
    if (left >= right) return;

    int middle = (left + right) / 2;
    int pivot = arr[middle];
    int current_left = left;
    int current_right = right;
    
    while (current_left <= current_right) {
      this.iterations++;

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
        
        this.swaps++;
      }
    }

    if (left < current_right) { 
      sortRecrsive(arr, left, current_right);
    } 

    if (current_left < right) {
      sortRecrsive(arr, current_left, right);
    }
  }
}
