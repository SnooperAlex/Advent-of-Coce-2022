import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class B1{
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
        Integer max1 = 0;
        Integer max2 = 0;
        Integer max3 = 0;
        Integer elfsum = 0;

        for(int i = 0; i < calories.size(); i++){
            if(calories.get(i) != ""){
                elfsum = elfsum + Integer.parseInt(calories.get(i));
                System.out.println(elfsum);
            }
            else if(elfsum > max1){
                max3 = max2;
                max2 = max1;
                max1 = elfsum;
                maxelf = elf;
                elf +=1;
                elfsum = 0;
            }
            else if(elfsum > max2){
                max3 = max2;
                max2 = elfsum;
                maxelf = elf;
                elf +=1;
                elfsum = 0;
            }
            else if(elfsum > max3){
                max3 = elfsum;
                maxelf = elf;
                elf +=1;
                elfsum = 0;
            }
            else{
                elf +=1;
                elfsum = 0;
            }
        }

        Integer sum = max1 + max2 + max3;
        System.out.println(maxelf + " " + sum);
    }
}