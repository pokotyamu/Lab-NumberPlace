/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberPlace;

/**
 *
 * @author pokotyamu
 */
public class BoxPointer{
    private int row;
    private int line;

    public BoxPointer(int row, int line) {
        this.row = row;
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public int getRow() {
        return row;
    }
    
    public void nextPoint(){
        if(line == 8){
            if(row != 8)
                row++;
            line = 0;
        }else
            line++;
    }
    
    public void prePoint(){
        if(line == 0){
            if(row != 0){
                row--;
                line = 8;
            }
        }else
            line--;
    }
    
    public boolean isFinal(){
        if(row == 8 && line == 8){
            return true;
        }else
            return false;
    }
}
