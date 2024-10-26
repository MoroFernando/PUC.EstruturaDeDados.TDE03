import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class NumbersArray {
  private int[] array;

  private NumbersArray(int[] array){
    this.array = array;
  }

  public static NumbersArray generate(int arrayLength, int seed){
    int[] array = IntStream.range(0, arrayLength + 1).toArray();
    Random random = new Random(seed);

    for (int i = array.length - 1; i > 0; i--) {
      int j = random.nextInt(i + 1);
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }

    return new NumbersArray(array);
  }

  public void print(){
    System.out.println(Arrays.toString(this.array));
  }
}
