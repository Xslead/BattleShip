import java.util.Scanner;
public class Run {
    private int smallShip; //3x1
    private int middleShip; //4x1
    private int longShip; //5x1
    private enum axis{x,y}

    public void matris(){
        int[][] matris = new int[5][5];
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println();
        }
    }public void selectShip(){
        System.out.println("Select Your Ship");
        System.out.println("1 = Small Ship (3x1) \n 2 = Middle Ship (4x1) \n 3 = Long Ship (5x1)");

        Scanner sc = new Scanner(System.in);
        int shipType = sc.nextInt();
        switch(shipType){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }public void putShips(){
        Scanner sc = new Scanner(System.in);    
        if(Integer.parseInt(selectShip)==1){
                System.out.println("Which side do you want to place the ship on? x or y");
                axis = sc.nextEnum();

                if(axis.x){
                    System.out.println("Pls select your x axis");
                    int k = sc.nextInt();
                    matris[k][0] = 1;

                }
            }
        }
    
    }


