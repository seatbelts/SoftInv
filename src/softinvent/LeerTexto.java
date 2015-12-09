package softinvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LeerTexto {
    
    private ArrayList<String> texto;
    private String path;
    
    public LeerTexto(String path){
        this.texto = new ArrayList<>();
        this.path = path;
    }
    
    public ArrayList<String> getText() throws FileNotFoundException {
        Scanner reader = new Scanner(new File(path)).useDelimiter("\n");
        
        String dummy = "";
        
        while (reader.hasNextLine()) {
            dummy = reader.next();
            texto.add(dummy);
        }
        
        return texto;
    }
    
}