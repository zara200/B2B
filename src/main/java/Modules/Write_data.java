package Modules;

import Utilities.Elements;
import com.github.javafaker.Faker;
import java.io.FileWriter;
import java.io.IOException;

public class Write_data {

    public static void main(String[] args) throws IOException {

        Faker f=new Faker();
        Elements e=new Elements();

        FileWriter file=new FileWriter("C:\\Users\\Tabinda Rana\\IdeaProjects\\B2BCortlow\\src\\main\\resources\\test.txt",true);

        String lname = f.name().lastName().toLowerCase();
        file.write(f.name().lastName());
        file.write("\n");
        file.close();



    }
}

