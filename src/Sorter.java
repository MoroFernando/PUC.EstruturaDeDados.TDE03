import utils.TimeCalculator;

public abstract class Sorter {
  protected TimeCalculator timer;
  protected double duration;
  protected int swaps;
  protected int iterations;

  public Sorter() {
    this.timer = new TimeCalculator();
    this.duration = 0;
    this.swaps = 0;
    this.iterations = 0;
  }

  public void run(NumbersArray numbersArray){
    int[] arr = numbersArray.array().clone();

    this.iterations = 0;
    this.swaps = 0;
    this.timer.start();
    
    sort(arr);

    this.duration = this.timer.stop();
    this.printMetrics(arr.length - 1);
  }

  protected abstract void sort(int[] arr);

  private void printMetrics(int arrLength) {
      System.out.println(this.getClass().getSimpleName() + " - " + arrLength + " elementos");
      System.out.println("-> Tempo de execução: " + this.duration + " milissegundos");
      System.out.println("-> Total de trocas: " + this.swaps);
      System.out.println("-> Total de iterações: " + this.iterations);
      System.out.println("");
  }
}
