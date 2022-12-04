
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Rucksack {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
        int total = 0;
        int loweroffset = -96;
        int upperoffset = -38;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            int len = line.length() - 1;
            int mid = len * 1/2;
            //split into 2
            String c1 = line.substring(0, mid+1);
            String c2 = line.substring(mid+1, len+1);
            System.out.println(c1 + " - " + c2);
            //compare 1 to 2, find matching chars
            //for each in 1, see if it exists in 2? if exists get priority and add to total
            ArrayList<Character> c1arr = new ArrayList<Character>();
            ArrayList<Character> c2arr = new ArrayList<Character>();
            for (char c : c1.toCharArray()) {
                c1arr.add(c);
            }
            for (char c : c2.toCharArray()) {
                c2arr.add(c);
            }
            System.out.println(c1arr);
            System.out.println(c2arr);
            int priority = 0;
            HashSet<Character> set = new HashSet<Character>();
            for (char c : c1arr) {
                if (c2arr.contains(c) && !set.contains(c)) {
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

    //each rucksack has two compartments
    //one item type per rucksack

    //input is list of letters, and number of rucksacks
    //first half is compartment 1 second half is compartment 2
    
    //each line is a bag
    //split into two
    //compare 1 to 2, find matching chars
    //find it's priority by subtractcing from ascii and add that to running sum
}
