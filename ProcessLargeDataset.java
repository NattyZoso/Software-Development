//Mark Newbury	
//CIS315
//Process Large Dataset
//10/5/2106

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class ProcessLargeDataset {

    private static final int assistant = 0;
    private static final int associate = 1;
    private static final int full = 2;

    public static void main(String[] args) throws Exception {

        ArrayList<ArrayList<Double>> ranks = new ArrayList<>(3);
        ranks.add(assistant, new ArrayList<>());
        ranks.add(associate, new ArrayList<>());
        ranks.add(full, new ArrayList<>());

        URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
        Scanner input = new Scanner(url.openStream());


        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            String rank = input.next();
            if (rank.contains("assistant")) {
                ranks.get(assistant).add(input.nextDouble());
            } else if (rank.contains("associate")) {
                ranks.get(associate).add(input.nextDouble());
            } else {
                ranks.get(full).add(input.nextDouble());
            }
        }

        double assistantTotal = (double)getTotal(ranks.get(assistant).toArray());
        double associateTotal = (double)getTotal(ranks.get(associate).toArray());
        double fullTotal = (double)getTotal(ranks.get(full).toArray());
        double total = assistantTotal + associateTotal + fullTotal;
        System.out.println("Data were retrieved from http://cs.armstrong.edu/liang/data/Salary.txt");
        System.out.println();
        System.out.printf("Total salary for assistant professors is $%,.2f \n", assistantTotal);
        System.out.printf("Total salary for associate professors is $%,.2f \n", associateTotal);
        System.out.printf("Total salary for full professors is $%,.2f \n", fullTotal);
        System.out.printf("Total salary for all professors is $%,.2f \n", total);
        System.out.println();
        System.out.printf("Average salary for assistant professors is $%,.2f \n", getAverage(assistantTotal, ranks.get(assistant).size()));
        System.out.printf("Average salary for associate professors is $%,.2f \n", getAverage(associateTotal, ranks.get(associate).size()));
        System.out.printf("Average salary for full professors is $%,.2f \n", getAverage(fullTotal, ranks.get(full).size()));
        System.out.printf("Average salary for all professors is $%,.2f \n", getAverage(total, getInternalSize(ranks)));



    }

    private static double getTotal(Object[] objects) {
        double total = 0;
        for (Object o : objects) {
            total += (double)o;
        }
        return total;
    }

    private static int getInternalSize(ArrayList<ArrayList<Double>> lists) {

        int size = 0;
        for (ArrayList<Double> list : lists) {
            size += list.size();
        }

        return size;
    }

    private static double getAverage(double total, int size) {

        return (double)total / size;
    }
}