public class GnomeSorter extends Sorter{
  public GnomeSorter(){
    super();
  }

  @Override
  protected void sort(int[] arr) {
    int index = 0;
    while (index < arr.length) {
      if (index == 0 || arr[index] >= arr[index - 1]) {
        index++;
      } else {
        int temp = arr[index];
        arr[index] = arr[index - 1];
        arr[index - 1] = temp;
        index--;
      }
    }
  }
}
