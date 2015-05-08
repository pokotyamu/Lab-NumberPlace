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
    private ArrayList<ArrayList<Integer>> matrix;
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

    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }
    
    public ArrayList<Integer> getLineNumbers(int line_index){
        return matrix.get(line_index);
    }

    public ArrayList<Integer> getRowNumbers(int row_index) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (ArrayList<Integer> line_list : matrix) {
            temp.add(line_list.get(row_index));
        }
        return temp;
    }

    public ArrayList<Integer> getBrockNumbers(BoxPointer bp) {
        ArrayList<Integer> temp = new ArrayList<>();
        int row_index = bp.getRow() - bp.getRow() % 3;
        for (int count = 0; count < 3; count++,row_index++) {
            int line_index = bp.getLine() - bp.getLine() % 3;
            for (int j = 0; j < 3; j++,line_index++) {
                temp.add(matrix.get(row_index).get(line_index));
            }
        }
        return temp;
    }
    
}
