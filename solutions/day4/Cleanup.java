
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cleanup {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
        int includedcount = 0;
        int overlapcount = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Scanner sc = new Scanner(line);
            sc.useDelimiter(",");

            String elf1 = sc.next();
            Scanner sc1 = new Scanner(elf1);
            System.out.println(elf1);
            sc1.useDelimiter("-");
            int[] arr1 = {sc1.nextInt(), sc1.nextInt()};

            String elf2 = sc.next();
            Scanner sc2 = new Scanner(elf2);
            System.out.println(elf2);
            sc2.useDelimiter("-");
            int[] arr2 = {sc2.nextInt(), sc2.nextInt()};

            //case1
            if ((arr1[0] >= arr2[0] && arr1[1] <= arr2[1]) || (arr2[0] >= arr1[0] && arr2[1] <= arr1[1])) {
                includedcount++;
            }

            //case2
            if ((arr1[0] >= arr2[0] && arr1[0] <= arr2[1]) || (arr2[0] >= arr1[0] && arr2[0] <= arr1[1])) {
                overlapcount++;
            }
        }
        System.out.println(includedcount + " " + overlapcount);
    }
}
