package paintcostestimator;

/**
 * Main part of the Code
 *
 */

public class Main {

    public static void main(String[] args) {

        PaintCostEstimator one = new PaintCostEstimator();  
        one.NoOfRooms();
        one.roomDetails();
        one.heightInput();
        one.ceiling();
        double Choice = one.paintChoice();
        one.inputDoorsWindows();
        one.calculateRoomArea();
        double area = one.TotalroomArea();
        double PaintType = one.paintCostEstimate(area, Choice);
        double labourCost = one.labourCostEstimate(area);
        double totalCost = one.totalCostEstimate(PaintType,labourCost);
        
        

        System.out.println("Room Area (in Sq.ft) = " + area + " Sq.ft");                             //display the total area
        System.out.println("Labour Cost = " + labourCost + " Rs");                        //display the labour cost 
        System.out.println("Paint & Materials cost = " + PaintType + " Rs");                       //display the paint cost
        System.out.println("Total Cost = " + totalCost + " Rs");                          //display the total cost
    }

}
