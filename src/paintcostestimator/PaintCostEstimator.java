package paintcostestimator;

import java.util.Scanner;

/**
 *
 * @author MANOJ
 */
public class PaintCostEstimator {

    /**
     * @param args the command line arguments
     */
    private static final int MAX_SIZE = 10;
    int No_of_rooms = 0;
    double[] length = new double[MAX_SIZE];
    double[] width = new double[MAX_SIZE];
    public int flag = 0;
    Scanner read = new Scanner(System.in);

    public PaintCostEstimator() {
        System.out.print("Enter No. Of Rooms: ");
        No_of_rooms = read.nextInt();
        for (int count = 1; count <= No_of_rooms; count++) {
            System.out.print("Enter Length of room " + count);
            length[count] = read.nextDouble();
            System.out.print("Enter Width of room " + count);
            width[count] = read.nextDouble();
            System.out.print("Select Height: 1. 8ft 2. 9ft 3. 10ft: " + No_of_rooms);
            int choice = read.nextInt();
            System.out.print("Include Ceiling for room " + No_of_rooms + "?");
            int option = read.nextInt();
        }

    }

    public void display() {
        for (int index = 1; index <= No_of_rooms; index++) {
            System.out.println(length[index]);
            System.out.println(width[index]);
        }
    }

    public static void main(String[] args) {

        PaintCostEstimator Estimate = new PaintCostEstimator();
        Estimate.display();
    }

}
