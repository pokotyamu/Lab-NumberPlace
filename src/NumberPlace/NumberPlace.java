/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberPlace;

import java.util.ArrayList;

/**
 *
 * @author pokotyamu
 */
public class NumberPlace {
    private NumberBox box;
    public NumberPlace() {
        box = new NumberBox();
        System.out.println(box);
    }

    public void solve() {
        BoxPointer bp =  new BoxPointer(0,0);
        backTrack(box,bp);
    }

    private void backTrack(NumberBox box, BoxPointer bp) {
        ArrayList<Integer> searched_number = BoxAnalysis.search(box,bp);
        System.out.println(searched_number);
    }
}
