
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Rucksack2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
        int total = 0;
        int loweroffset = -96;
        int upperoffset = -38;
        while (scanner.hasNext()) {
            String elf1 = scanner.nextLine();
            String elf2 = scanner.nextLine();
            String elf3 = scanner.nextLine();
            ArrayList<Character> elf2arr = new ArrayList<Character>();
            ArrayList<Character> elf3arr = new ArrayList<Character>();
            for (char c : elf2.toCharArray()) {
                elf2arr.add(c);
            }
            for (char c : elf3.toCharArray()) {
                elf3arr.add(c);
            }
            System.out.println(elf1.toCharArray());
            System.out.println(elf2arr);
            System.out.println(elf3arr);
            int priority = 0;
            HashSet<Character> set = new HashSet<Character>();
            for (char c : elf1.toCharArray()) {
                if (elf2arr.contains(c) && elf3arr.contains(c) && !set.contains(c)) {
                    set.add(c);
                    if (c > 90) {
                        priority = c + loweroffset;
                    } else {
                        priority = c + upperoffset;
                    }
                    System.out.println(priority);
                    total += priority;
                }
            }
            
        }
        System.out.println(total);
    }

    
}
