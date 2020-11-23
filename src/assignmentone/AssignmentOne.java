package assignmentone;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Al-Amin Islam Joy
 */
public class AssignmentOne {
    public AssignmentOne(){
        readFromFile("test.csv");
    }
    void readFromFile(String file){
       try(RandomAccessFile raf=new RandomAccessFile(file,"r")){
           System.out.println("File Found");
           String line;
           line=raf.readLine();          
           while(true){         
               line=raf.readLine();             
             if(line==null)
                 break;            
              String data [] =line.split("\\,");
               System.out.println(data[0]+" "+data[1]); 
       
       }
       }
       
       catch(FileNotFoundException e){
           System.err.println("File Not Found");  
       }
       catch(IOException e){
           System.err.println("I/O Error");
       }
    }
    public static void main(String[] args) {
     new AssignmentOne(); 
    }
    
}
