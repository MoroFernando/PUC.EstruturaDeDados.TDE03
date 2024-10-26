import utils.TimeCalculator;

public class QuickSorter {
  private TimeCalculator timer;
  private double duration;
  private int swaps;
  private int iterations;

  public QuickSorter(){
    this.duration = 0;
    this.swaps = 0;
    this.iterations = 0;
    this.timer = new TimeCalculator();
  }

  public void sort(NumbersArray numbersArray) {
    this.timer.start();

    int[] arr = numbersArray.array();
    sort(arr, 0, arr.length - 1);

    this.duration = this.timer.stop();
    this.printMetrics(arr.length - 1);
  }

  private void sort(int[] arr, int left, int right) {
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
      sort(arr, left, current_right);
    } 

    if (current_left < right) {
      sort(arr, current_left, right);
    }
  }

  private void printMetrics(int arrLength){
    System.out.println("QUICK SORT - " + arrLength + " elementos");
    System.out.println("-> Tempo de execução: " + this.duration + " milisegundos");
    System.out.println("-> Total de trocas: " + this.swaps);
    System.out.println("-> Total de iterações: " + this.iterations);
    System.out.println("");
  }
}
