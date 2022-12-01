package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Calories {
    public static void main(String[] args) throws FileNotFoundException {
      System.out.println(part1());
      System.out.println(part2());
    }

    public static int part1() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
        int max = 0;
        int total = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line != "") {
                total += Integer.parseInt(line);
            }
            if (line == "") {
                if (total > max) {
                    max = total;
                }
                total = 0;
            }
        }
        return max;
    }

    public static int part2() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
        int total = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line != "") {
                total += Integer.parseInt(line);
            }
            if (line == "") {
                list.add(total);
                total = 0;
            }
        }
        list.sort((a,b) -> b - a);
        int top3 = list.get(0) + list.get(1) + list.get(2);
        return top3;
    }
}
