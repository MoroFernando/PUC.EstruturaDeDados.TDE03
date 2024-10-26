public class App {
    public static void main(String[] args) throws Exception {
      // Alogritimos de Ordenação
      Sorter quickSort = new QuickSorter();
      Sorter gnomeSorter = new GnomeSorter();

      // RODADA 01 (R1)
      int SEED_R1 = 11111;
      NumbersArray R1_1000 = NumbersArray.generate(1000, SEED_R1);
      NumbersArray R1_10000 = NumbersArray.generate(10000, SEED_R1);
      NumbersArray R1_100000 = NumbersArray.generate(100000, SEED_R1);
      NumbersArray R1_500000 = NumbersArray.generate(500000, SEED_R1);
      NumbersArray R1_1000000 = NumbersArray.generate(1000000, SEED_R1);

      // RODADA 02 (R2)
      int SEED_R2 = 22222;
      NumbersArray R2_1000 = NumbersArray.generate(1000, SEED_R2);
      NumbersArray R2_10000 = NumbersArray.generate(10000, SEED_R2);
      NumbersArray R2_100000 = NumbersArray.generate(100000, SEED_R2);
      NumbersArray R2_500000 = NumbersArray.generate(500000, SEED_R2);
      NumbersArray R2_1000000 = NumbersArray.generate(1000000, SEED_R2);

      // RODADA 03 (R3)
      int SEED_R3 = 33333;
      NumbersArray R3_1000 = NumbersArray.generate(1000, SEED_R3);
      NumbersArray R3_10000 = NumbersArray.generate(10000, SEED_R3);
      NumbersArray R3_100000 = NumbersArray.generate(100000, SEED_R3);
      NumbersArray R3_500000 = NumbersArray.generate(500000, SEED_R3);
      NumbersArray R3_1000000 = NumbersArray.generate(1000000, SEED_R3);

      // R4 (R4)
      int SEED_R4 = 4444;
      NumbersArray R4_1000 = NumbersArray.generate(1000, SEED_R4);
      NumbersArray R4_10000 = NumbersArray.generate(10000, SEED_R4);
      NumbersArray R4_100000 = NumbersArray.generate(100000, SEED_R4);
      NumbersArray R4_500000 = NumbersArray.generate(500000, SEED_R4);
      NumbersArray R4_1000000 = NumbersArray.generate(1000000, SEED_R4);

      // RODADA 05 (R5)
      int SEED_R5 = 5555;
      NumbersArray R5_1000 = NumbersArray.generate(1000, SEED_R5);
      NumbersArray R5_10000 = NumbersArray.generate(10000, SEED_R5);
      NumbersArray R5_100000 = NumbersArray.generate(100000, SEED_R5);
      NumbersArray R5_500000 = NumbersArray.generate(500000, SEED_R5);
      NumbersArray R5_1000000 = NumbersArray.generate(1000000, SEED_R5);

      
      // Rodagens do QUICK SORT #################################################################
      quickSort.run(R1_1000);
      quickSort.run(R2_1000);
      quickSort.run(R3_1000);
      quickSort.run(R4_1000);
      quickSort.run(R5_1000);

      quickSort.run(R2_1000);
      quickSort.run(R3_1000);
      quickSort.run(R4_1000);
      quickSort.run(R5_1000);

      quickSort.run(R1_10000);
      quickSort.run(R2_10000);
      quickSort.run(R3_10000);
      quickSort.run(R4_10000);
      quickSort.run(R5_10000);

      quickSort.run(R2_10000);
      quickSort.run(R3_10000);
      quickSort.run(R4_10000);
      quickSort.run(R5_10000);

      quickSort.run(R1_100000);
      quickSort.run(R3_100000);
      quickSort.run(R2_100000);
      quickSort.run(R4_100000);
      quickSort.run(R5_100000);

      quickSort.run(R3_100000);
      quickSort.run(R2_100000);
      quickSort.run(R4_100000);
      quickSort.run(R5_100000);

      quickSort.run(R1_500000);
      quickSort.run(R2_500000);
      quickSort.run(R3_500000);
      quickSort.run(R4_500000);
      quickSort.run(R5_500000);

      quickSort.run(R2_500000);
      quickSort.run(R3_500000);
      quickSort.run(R4_500000);
      quickSort.run(R5_500000);

      quickSort.run(R1_1000000);
      quickSort.run(R2_1000000);
      quickSort.run(R3_1000000);
      quickSort.run(R4_1000000);
      quickSort.run(R5_1000000);

      // Rodagens do GNOME SORTER #################################################################
      gnomeSorter.run(R1_1000);
      gnomeSorter.run(R2_1000);
      gnomeSorter.run(R3_1000);
      gnomeSorter.run(R4_1000);
      gnomeSorter.run(R5_1000);

      gnomeSorter.run(R1_10000);
      gnomeSorter.run(R2_10000);
      gnomeSorter.run(R3_10000);
      gnomeSorter.run(R4_10000);
      gnomeSorter.run(R5_10000);

      gnomeSorter.run(R1_100000);
      gnomeSorter.run(R3_100000);
      gnomeSorter.run(R2_100000);
      gnomeSorter.run(R4_100000);
      gnomeSorter.run(R5_100000);

      gnomeSorter.run(R1_500000);
      gnomeSorter.run(R2_500000);
      gnomeSorter.run(R3_500000);
      gnomeSorter.run(R4_500000);
      gnomeSorter.run(R5_500000);
      
      gnomeSorter.run(R1_1000000);
      gnomeSorter.run(R2_1000000);
      gnomeSorter.run(R3_1000000);
      gnomeSorter.run(R4_1000000);
      gnomeSorter.run(R5_1000000);
    }
}
