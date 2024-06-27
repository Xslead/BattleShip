import java.util.*;
public class Run {
    private int smallShip;
    private int middleShip;
    private int largeShip;
    private ArrayList<Integer> containNumber = new ArrayList<>();

    private enum axis {x, y}

    private int[][] matrix = new int[5][5];
    private int[][] computerMatrix = new int[5][5];

    public Run() {
        containNumber.add(1);
        containNumber.add(2);
        containNumber.add(3);
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void selectShip() {
        System.out.println("Select Your Ship ");
        printMatrix();
        System.out.println("\n1 = Small Ship (3x1) \n 2 = Middle Ship (4x1) \n 3 = Long Ship (5x1)");

        Scanner sc = new Scanner(System.in);

        boolean found = false;

        int shipType = sc.nextInt();

        if (containNumber.contains(shipType)) {
            int index = containNumber.indexOf(shipType);
            containNumber.set(index, 0);
            found = true;
        }
        if (found) {
            switch (shipType) {
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
            found = false;
        } else {
            System.out.println("Pls write different number");
            selectShip();
        }

    }

    public void putShips(String shipType) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;

        if (shipType.equals("smallShip")) {
            smallShip = 3;
        }
        else if (shipType.equals("middleShip")){
            middleShip = 4;
    }
        else if(shipType.equals("largeShip")){
            largeShip = 5;
        }

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

        if (shipType.equals("smallShip")) {
            if (chosen.equals(axis.x)) {
                System.out.println("Pls write x axis");
                x = sc.nextInt();
                System.out.println("Pls write y side to start");
                y = sc.nextInt();
                for (int i = 0; i < smallShip; i++) {
                    if (matrix[x][y + i] == 0) {
                        if (y + 2 <= 5 && y >= 0) {
                            matrix[x][y + i] = 1;


                        } else {
                            System.exit(1);
                        }
                    } else {
                        System.exit(1);
                    }
                }
                printMatrix();
                selectShip();
            } else if (chosen.equals(axis.y)) {
                System.out.println("Pls write y axis");
                y = sc.nextInt();
                System.out.println("Pls write x side to start");
                x = sc.nextInt();

                for (int i = 0; i < smallShip ; i++) {
                    if (matrix[x + i][y] == 0) {
                        if (x + 2 <= 5 && x >= 0) {
                            matrix[x + i][y] = 1;


                        } else {
                            System.exit(1);
                        }
                    } else {
                        System.exit(1);
                    }
                }
                printMatrix();
                selectShip();

            }
        } else if (shipType.equals("middleShip")) {
            if (chosen.equals(axis.x)) {
                System.out.println("Pls write x axis");
                x = sc.nextInt();
                System.out.println("Pls write y side to start");
                y = sc.nextInt();

                for (int i = 0; i < middleShip; i++) {
                    if (matrix[x][y + i] == 0) {
                        if (y + 3 <= 5 && y >= 0) {
                            matrix[x][y + i] = 1;


                        } else {
                            System.exit(1);
                        }
                    } else {
                        System.exit(1);
                    }

                }
                printMatrix();
                selectShip();
            } else if (chosen.equals(axis.y)) {
                System.out.println("Pls write y axis");
                y = sc.nextInt();
                System.out.println("Pls write x side to start");
                x = sc.nextInt();

                for (int i = 0; i < middleShip; i++) {
                    if (matrix[x + i][y] == 0) {
                        if (x + 3 <= 5 && x >= 0) {
                            matrix[x + i][y] = 1;
                        } else {
                            System.exit(1);
                        }
                    } else {
                        System.exit(1);
                    }
                }
                printMatrix();
                selectShip();
            }
        } else if (shipType.equals("largeShip")) {
            System.out.println("Pls write x axis");
            if (chosen.equals(axis.x)) {
                x = sc.nextInt();
                System.out.println("Pls write y side to start");
                y = sc.nextInt();

                for (int i = 0; i < largeShip; i++) {
                    if (matrix[x][y + i] == 0) {
                        if (y + 4 <= 5 && y >= 0) {
                            matrix[x][y + i] = 1;
                        } else {
                            System.exit(1);
                        }
                    } else {
                        System.exit(1);
                    }
                }
                printMatrix();
                selectShip();
            } else if (chosen.equals(axis.y)) {
                System.out.println("Pls write y axis");
                y = sc.nextInt();
                System.out.println("Pls write x side to start");
                x = sc.nextInt();

                for (int i = 0; i < largeShip; i++) {
                    if (matrix[x + i][y] == 0) {
                        if (x + 4 <= 5 && x >= 0) {
                                matrix[x + i][y] = 1;
                        } else {
                            System.exit(1);
                        }
                    } else {
                        System.exit(1);
                    }
                }
                printMatrix();
                selectShip();
            }
        }
    }
    public void attackHuman(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Pls select your attack coordination");
        System.out.println("Pls select your attacking x and y axis");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(computerMatrix[x][y] == 1){
            computerMatrix[x][y] = 9;
            System.out.println("Was Shot!");
            if (checkMatrix(computerMatrix)) {
                attackComputer();
            } else {
                System.out.println("Game Finished! \nYou Win!");
            }
        }else{
            System.out.println("You Missed");
            attackComputer();
        }
    }
    public void attackComputer(){
        Random rnd = new Random(5);

        int x = rnd.nextInt();
        int y = rnd.nextInt();

        if(matrix[x][y] == 1){
            matrix[x][y] = 9;
            System.out.println("Your Ship was hit");
            printMatrix();
            if (checkMatrix(matrix)) {
                attackHuman();
            } else {
                System.out.println("Game Finished! \nYou Lose!");
            }

        }else{
            System.out.println("Computer missed your Ship");
            printMatrix();
            attackHuman();
        }
    }
    public void computerSelectShip(){
        Random rnd = new Random(4);

        boolean found = false;

        int shipType = rnd.nextInt();

        if (containNumber.contains(shipType)) {
            int index = containNumber.indexOf(shipType);
            containNumber.set(index, 0);
            found = true;
        }
        if (found) {
            switch (shipType) {
                case 1:
                    computerPutShips("smallShip");
                    break;
                case 2:
                    computerPutShips("middleShip");
                    break;
                case 3:
                    computerPutShips("longShip");
                    break;

            }
            found = false;
        } else {
            selectShip();
        }

    }
    public void computerPutShips(String shipType) {
        Random rnd = new Random(4);

        int x = 0;
        int y = 0;

        if (shipType.equals("smallShip")) {
            smallShip = 3;
        } else if (shipType.equals("middleShip")) {
            middleShip = 4;
        } else if (shipType.equals("largeShip")) {
            largeShip = 5;
        }
        int rNumber = rnd.nextInt(2);
        axis chosen = null;

        if (rNumber == 0) {
            chosen = axis.x;
        } else {
            chosen = axis.y;

            if (shipType.equals("smallShip")) {
                if (chosen.equals(axis.x)) {
                    x = rnd.nextInt();
                    y = rnd.nextInt();
                    for (int i = 0; i < smallShip; i++) {
                        if (computerMatrix[x][y + i] == 0) {
                            if (y + 2 <= 5 && y >= 0) {
                                computerMatrix[x][y + i] = 1;
                            } else {
                                System.exit(1);
                            }
                        } else {
                            System.exit(1);
                        }
                    }
                    selectShip();
                } else if (chosen.equals(axis.y)) {
                    y = rnd.nextInt();
                    x = rnd.nextInt();

                    for (int i = 0; i < smallShip; i++) {
                        if (computerMatrix[x + i][y] == 0) {
                            if (x + 2 <= 5 && x >= 0) {
                                computerMatrix[x + i][y] = 1;


                            } else {
                                System.exit(1);
                            }
                        } else {
                            System.exit(1);
                        }
                    }
                    computerSelectShip();

                }
            } else if (shipType.equals("middleShip")) {
                if (chosen.equals(axis.x)) {
                    x = rnd.nextInt();
                    y = rnd.nextInt();

                    for (int i = 0; i < middleShip; i++) {
                        if (computerMatrix[x][y + i] == 0) {
                            if (y + 3 <= 5 && y >= 0) {
                                computerMatrix[x][y + i] = 1;


                            } else {
                                System.exit(1);
                            }
                        } else {
                            System.exit(1);
                        }

                    }
                    computerSelectShip();

                } else if (chosen.equals(axis.y)) {
                    y = rnd.nextInt();
                    x = rnd.nextInt();

                    for (int i = 0; i < middleShip; i++) {
                        if (computerMatrix[x + i][y] == 0) {
                            if (x + 3 <= 5 && x >= 0) {
                                computerMatrix[x + i][y] = 1;
                            } else {
                                System.exit(1);
                            }
                        } else {
                            System.exit(1);
                        }
                    }
                    computerSelectShip();
                }
            } else if (shipType.equals("largeShip")) {
                if (chosen.equals(axis.x)) {
                    x = rnd.nextInt();
                    y = rnd.nextInt();

                    for (int i = 0; i < largeShip; i++) {
                        if (computerMatrix[x][y + i] == 0) {
                            if (y + 4 <= 5 && y >= 0) {
                                computerMatrix[x][y + i] = 1;
                            } else {
                                System.exit(1);
                            }
                        } else {
                            System.exit(1);
                        }
                    }
                    computerSelectShip();
                } else if (chosen.equals(axis.y)) {
                    y = rnd.nextInt();
                    x = rnd.nextInt();

                    for (int i = 0; i < largeShip; i++) {
                        if (computerMatrix[x + i][y] == 0) {
                            if (x + 4 <= 5 && x >= 0) {
                                computerMatrix[x + i][y] = 1;
                            } else {
                                System.exit(1);
                            }
                        } else {
                            System.exit(1);
                        }
                    }
                    computerSelectShip();
                }

            }

        }

    }
    public static boolean checkMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == 1) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkMatrixComputer(int[][] computerMatrix) {
        for (int[] row : computerMatrix) {
            for (int element : row) {
                if (element == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}





