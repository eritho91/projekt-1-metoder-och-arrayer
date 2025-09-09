package se.iths.erikthorell.projekt1;

import java.util.ArrayList;
import java.util.Random;

public class Logic {

    public void findLargestNumber() {
        Random random = new Random();
        ArrayList<Integer> randomNumberList = new ArrayList<>();
        int largestNumber = 0;
        for(int i = 1; i <= 10; i++) {
            randomNumberList.add(random.nextInt(100));
        }
        System.out.print("Genererade tal: ");
        for(int num : randomNumberList) {
            System.out.print(num + " ");
        }
        for(int num : randomNumberList) {
            if(num > largestNumber) {
                largestNumber = num;
            }
        }
        System.out.println("\n\nStörsta talet är: " + largestNumber);
    }

    public void printSyntaxLoop(){
        String[] syntax = {"Hello", " ", "World", "!"};
        for(String s : syntax){
            System.out.print(s);
        }
    }
}
