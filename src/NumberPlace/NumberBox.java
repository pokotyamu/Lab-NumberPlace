/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberPlace;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pokotyamu
 */
public class NumberBox {
    ArrayList<ArrayList<Integer>>matrix;
    public NumberBox() {
        newgame();
    }

    public void newgame() {
        matrix = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("/Users/pokotyamu/Desktop/work/lab/problem1.csv")));
            String str = br.readLine();
            while(str != null){
                ArrayList<Integer> numlist = new ArrayList();
                for (String numSplit : str.split(",")) {
                    numlist.add(Integer.valueOf(numSplit));
                }
                matrix.add(numlist);
                str = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberBox.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NumberBox.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();
        for (ArrayList<Integer> lineNumber : matrix) {
            strb.append(lineNumber);
            strb.append("\n");
        }
        
        
        return strb.toString();
    }

    
    
}
