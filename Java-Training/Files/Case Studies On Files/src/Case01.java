import java.io.File;
import java.io.IOException;

public class Case01 {
    public static void main(String[] args) throws IOException {
        File file= new File("data/Student.txt");

       if(file.exists())
       {
           if(file.isDirectory())
           {
               System.out.println("The Current File is A Directory");
               System.out.println("The Directory Path :- "+file.getPath());
               System.out.println("The Absolute Directory Path :-" +file.getAbsolutePath());
           }
           else
           {
               System.out.println("The Current File is A Data File");
               if(file.canWrite() && file.canRead())
               {
                   System.out.println("Both Read And Write Can Be Done on This File ");
               }
               else if(file.canWrite())
               {
                   System.out.println("The File Is WriteOnly");
               }
               else
               {
                   System.out.println("The File Is ReadOnly");
               }
               System.out.println("The File Path :- "+file.getPath());
               System.out.println("The Absolute File Path :-" +file.getAbsolutePath());
           }

       }
       else
       {
           System.out.println("File Doesnot Exists !");
           file.createNewFile();
           file.setReadOnly();
           System.out.println("File Created Successfully...");
       }
    }
}
