import java.util.Arrays;
import java.util.Scanner;
public class Run {
    private int smallShip; //3x1
    private int middleShip; //4x1
    private int longShip; //5x1
    private enum axis{x,y}
    private int[][] matrix;

    public void matris(){
        matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public void selectShip(){
        System.out.println("Select Your Ship");
        System.out.println("1 = Small Ship (3x1) \n 2 = Middle Ship (4x1) \n 3 = Long Ship (5x1)");

        Scanner sc = new Scanner(System.in);
        int shipType = sc.nextInt();
        switch(shipType){
            case 1:
                putShips("smallShip");
                break;
            case 2:
                putShips("middleShip");
                break;
            case 3:
                putShips("longShip");
                break;
            
        }
    }
    public void putShips(String shipType){
        Scanner sc = new Scanner(System.in);    
        if(Integer.parseInt(shipType)==1){
            System.out.println("Which side do you want to place the ship on? x or y");
            String input = sc.nextLine();
            axis chosen = null;
            switch (input.toLowerCase()) {
                case "x":
                    chosen = axis.x;
                    break;
                case "y":
                    chosen = axis.y;
                    break;
                default:
                    System.out.println("Try again");
                    System.exit(0);
                    break;
            }
            
            int x = 0;
            int y = 0;
            
            if(chosen == axis.x){
                x = sc.nextInt();
            }else if(chosen == axis.y){
                y = sc.nextInt();
            }
            int shipLength = 0;
            if(shipType=="smallShip"){
                shipLength = 3;
            }else if(shipType=="middleShip"){
                shipLength = 4;
            }else if(shipType=="longShip"){
                shipLength = 5;
            }
            boolean canPlace = true;
            for (int i = 0; i < shipLength; i++) {
                if(chosen==axis.x) y++;
                else if(chosen==axis.y) x++;
                if(matrix[x][y]==1){
                    canPlace=false;
                    break;
                }
            }
            if(canPlace){
                for (int i = 0; i < shipLength; i++) {
                   matrix[x][y] = 1;
                    
                }   
            }
            System.out.println(Arrays.toString(matrix));
        }
    }    
}


