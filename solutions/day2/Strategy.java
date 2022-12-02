package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Strategy {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
        int total = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            char[] arr = line.toCharArray();
            //total += comparator(arr[2], arr[0]);
            total += comparator2(arr[2], arr[0]);
        }
        System.out.println(total);
    }
    
    public static int comparator(char mine, char opponents) {
        int score = 0;
        switch (mine) {
            case 'X': //have to lose
                score += 1;
                if (opponents == 'A') {
                    score += 3;
                } 
                else if (opponents == 'B') {
                    score += 0;
                }
                else if (opponents == 'C') {
                    score += 6;
                }
                break;
            case 'Y':
                score += 2;
                if (opponents == 'A') {
                    score += 6;
                } 
                else if (opponents == 'B') {
                    score += 3;
                }
                else if (opponents == 'C') {
                    score += 0;
                }
                break;
            case 'Z':
                score += 3;
                if (opponents == 'A') {
                    score += 0;
                } 
                else if (opponents == 'B') {
                    score += 6;
                }
                else if (opponents == 'C') {
                    score += 3;
                }
                break;
        }
        return score;
    }

    public static int comparator2(char mine, char opponents) {
        int score = 0;
        switch (mine) {
            case 'X': //have to lose
                if (opponents == 'A') {
                    score += 3;
                } 
                else if (opponents == 'B') {
                    score += 1;
                }
                else if (opponents == 'C') {
                    score += 2;
                }
                break;
            case 'Y': //have to draw
                score += 3;
                if (opponents == 'A') {
                    score += 1;
                } 
                else if (opponents == 'B') {
                    score += 2;
                }
                else if (opponents == 'C') {
                    score += 3;
                }
                break;
            case 'Z': //have to win
                score += 6;
                if (opponents == 'A') {
                    score += 2;
                } 
                else if (opponents == 'B') {
                    score += 3;
                }
                else if (opponents == 'C') {
                    score += 1;
                }
                break;
        }
        return score;
    }
}
