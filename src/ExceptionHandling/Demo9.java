package ExceptionHandling;

import java.io.IOException;

public class Demo9 {
    public static void main(String[] args) {
        try{
            readFile();
        }
        catch (IOException e){
            System.out.println("Caugh IOEXception:"+e);
        }
    }
    public static void readFile() throws IOException{
        boolean fileError=true;
        if(fileError){
            throw new IOException("Error reading file");
        }
    }
}
