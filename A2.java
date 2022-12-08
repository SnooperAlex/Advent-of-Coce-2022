import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("inputA2.txt");
        Scanner myReader = new Scanner(myObj);
        Integer counter = 0;
        ArrayList<String> opponentTurn = new ArrayList<String>();
        ArrayList<String> myTurn = new ArrayList<String>();

        while (myReader.hasNextLine()) {
            String data;
            data = myReader.nextLine();
            opponentTurn.add(Character.toString(data.charAt(0)));
            myTurn.add(Character.toString(data.charAt(2)));
        }

        for(int i = 0; i < myTurn.size(); i++){
            String myhand = myTurn.get(i);
            String opponHand = opponentTurn.get(i);

            switch(opponHand){
                case "A":
                switch(myhand){
                    case "X":
                        counter = counter + 4;
                        break;
                    case "Y":
                        counter = counter + 8;
                        break;
                    case "Z":
                        counter = counter + 3;
                        break;
                }
                break;

                case "B":
                switch(myhand){
                    case "X":
                        counter = counter + 1;
                        break;
                    case "Y":
                        counter = counter + 5;
                        break;
                    case "Z":
                        counter = counter + 9;
                        break;
                }
                break;

                case "C":
                switch(myhand){
                    case "X":
                        counter = counter + 7;
                        break;
                    case "Y":
                        counter = counter + 2;
                        break;
                    case "Z":
                        counter = counter + 6;
                        break;
                }
                break;
            }

            System.out.println(counter);
        }
    }
}
