/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softinvent;

import java.io.File;


public class SoftInvent {
    public static void main(String[] args) {
        
        File f = new File("C:/Arantza");
        
        if (!f.exists()) {
            f.mkdir();
        }
        
        
        VMenu vv = new VMenu ();
        vv.setVisible(true);// TODO code application logic here
    }
    
}
