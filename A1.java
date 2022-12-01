import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class A1{
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);

        ArrayList<String> calories = new ArrayList<String>();

        while (myReader.hasNextLine()) {
            String data;
            data = myReader.nextLine();
            calories.add(data);
        }
        myReader.close();

        Integer elf = 1;
        Integer maxelf = 0;
        Integer max = 0;
        Integer elfsum = 0;

        for(int i = 0; i < calories.size(); i++){
            if(calories.get(i) != ""){
                elfsum = elfsum + Integer.parseInt(calories.get(i));
                System.out.println(elfsum);
            }
            else if(elfsum > max){
                max = elfsum;
                maxelf = elf;
                elf +=1;
                elfsum = 0;
            }
            else{
                elf +=1;
                elfsum = 0;
            }
        }

        System.out.println(maxelf + " " + max);
    }
}