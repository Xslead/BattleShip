import java.util.Scanner;
public class Run {
    private int smallShip; //3x1
    private int middleShip; //4x1
    private int longShip; //5x1
    private enum axis{x,y}
    private int[][] matrix = new int[5][5];

    public void printMatrix(){
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
                putShips("largeShip");
                break;
            default:
                System.out.println("Try Again");
                break;
            
        }
    }
    public void putShips(String shipType){
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;

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

        if(shipType.equals("smallShip")){
            if(chosen.equals(axis.x)){
                System.out.println("Pls write x axis");
                x = sc.nextInt();
                System.out.println("Pls write y side to start");
                y = sc.nextInt();
                if(y+2<=5 && y>=0) {
                    matrix[x][y] = 1;
                    matrix[x][y + 1] = 1;
                    matrix[x][y + 2] = 1;
                    printMatrix();
                    selectShip();
                }else{
                    System.exit(1);
                }

            }
            else if(chosen.equals(axis.y)){
                System.out.println("Pls write y axis");
                y = sc.nextInt();
                System.out.println("Pls write x side to start");
                x = sc.nextInt();
                if(x+2<=5 && x>=0) {
                    matrix[x][y] = 1;
                    matrix[x + 1][y] = 1;
                    matrix[x + 2][y] = 1;
                    printMatrix();
                    selectShip();
                }else{
                    System.exit(1);
                }


            }
        }else if(shipType.equals("middleShip")){
            if(chosen.equals(axis.x)){
                System.out.println("Pls write x axis");
                x = sc.nextInt();
                System.out.println("Pls write y side to start");
                y = sc.nextInt();
                if(y+3<=5 && y>=0) {
                    matrix[x][y] = 1;
                    matrix[x][y + 1] = 1;
                    matrix[x][y + 2] = 1;
                    matrix[x][y + 3] = 1;
                    printMatrix();
                    selectShip();
                }else{
                    System.exit(1);
                }
            }
            else if(chosen.equals(axis.y)){
                System.out.println("Pls write y axis");
                y = sc.nextInt();
                System.out.println("Pls write x side to start");
                x = sc.nextInt();
                if(x+3<=5 && x>=0) {
                    matrix[x][y] = 1;
                    matrix[x + 1][y] = 1;
                    matrix[x + 2][y] = 1;
                    matrix[x + 3][y] = 1;
                    printMatrix();
                    selectShip();
                }else{
                    System.exit(1);
                }
            }
        }else if(shipType.equals("largeShip")){
            System.out.println("Pls write x axis");
            if(chosen.equals(axis.x)){
                x = sc.nextInt();
                System.out.println("Pls write y side to start");
                y = sc.nextInt();
                if(y+4<=5 && y>=0) {
                    matrix[x][y] = 1;
                    matrix[x][y + 1] = 1;
                    matrix[x][y + 2] = 1;
                    matrix[x][y + 3] = 1;
                    matrix[x][y + 4] = 1;
                    printMatrix();
                    selectShip();
                }else{
                    System.exit(1);
                }
            }
            else if(chosen.equals(axis.y)){
                System.out.println("Pls write y axis");
                y = sc.nextInt();
                System.out.println("Pls write x side to start");
                x = sc.nextInt();
                if(x+4<=5 && x>=0) {
                    matrix[x][y] = 1;
                    matrix[x + 1][y] = 1;
                    matrix[x + 2][y] = 1;
                    matrix[x + 3][y] = 1;
                    matrix[x + 4][y] = 1;
                    printMatrix();
                    selectShip();
                }else{
                    System.exit(1);
                }
            }
        }

    }

}



