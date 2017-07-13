package paintcostestimator;

import java.util.Scanner;

/**
 * PROGRAM TO ESTIMATE THE COST OF PAINTING A HOUSE
 * THE COST INCLUDES:
 * 1.LABOUR COST/SQ.FT
 * 2.COST OF MATERIALS/SQ.FT
 * @author MANOJ
 */

//CLASS TO READ DATA
 public class PaintCostEstimator {

    /**
     * @param args the command line arguments
     */
    private static final int MAX_SIZE = 10;  //SIMILAR TO #DEFINE MAXSIZE 10 IN C/C++
    int No_of_rooms = 0;
    double[] length = new double[MAX_SIZE];
    double[] width = new double[MAX_SIZE];
    public int flag = 0;
    char option;
    Scanner read = new Scanner(System.in);

    //CONSTRUCTOR TO READ THE DEATAILS OF N ROOMS
    public PaintCostEstimator() {
        System.out.print("Enter No. Of Rooms: ");
        No_of_rooms = read.nextInt();
        for (int count = 1; count <= No_of_rooms; count++) {
            System.out.print("Enter Length of room " + count +": ");
            length[count] = read.nextDouble();
            System.out.print("Enter Width of room " + count +": ");
            width[count] = read.nextDouble();
            System.out.print("Select Height: 1. 8ft \n2. 9ft \n3. 10ft: ");
            int choice = read.nextInt();
            System.out.print("Include Ceiling for room " + No_of_rooms + "(Y or N)? ");
            option = read.next().charAt(0);
        }

    }

   //CLASS TO COMPUTE DATA
   public class Calculations extends PaintCostEstimator{
       int labourCost=0;
       int BasicPaint=0;
       int PremiumPaint=0;
       
   }

    public static void main(String[] args) {

        PaintCostEstimator Estimate = new PaintCostEstimator();
        
    }

}
