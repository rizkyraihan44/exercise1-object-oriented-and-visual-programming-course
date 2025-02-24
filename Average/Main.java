import java.util.Scanner;

class Average {
  void calculateAndPrintAverage(double[] numbers) {
    double sum = 0;
    for (double num : numbers) {
      sum += num;
    }
    double average = sum / numbers.length;
    System.out.println("Average: " + average);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of values: ");
    int count = scanner.nextInt();

    double[] numbers = new double[count];

    for (double i = 0; i < numbers.length; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[(int) i] = scanner.nextDouble();
    }
    Average avg = new Average();
    avg.calculateAndPrintAverage(numbers);
  }
}