package Modules;

import java.io.*;

public class Read_data {
    public static void main(String[] args) throws IOException {

// Approach 1
     String path  = "C:\\Users\\Tabinda Rana\\IdeaProjects\\B2BCortlow\\src\\main\\resources\\Test.txt";
     FileReader fr = new FileReader(path);
        BufferedReader br=new BufferedReader(fr);
        String str= br.readLine();
        System.out.println(str);
        br.close();
//        while ((str=br.readLine())!=null){
//            System.out.println(str);

// Approach 2

//        File file=new File("C:\\Users\\Tabinda Rana\\IdeaProjects\\B2BCortlow\\src\\main\\resources\\Text_file");
//        Scanner sc=new Scanner(file);
//        while (sc.hasNext()){
//            System.out.println(sc.hasNext());
//        }

//        Approach 3

//        sc.useDelimiter("\\Z");
//        System.out.println(sc.next());

    }

}
