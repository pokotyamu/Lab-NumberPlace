/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberPlace;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author pokotyamu
 */
public class BoxAnalysis {
    
    private static final ArrayList<Integer> NUMBERS = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    public static ArrayList<Integer> search(NumberBox box, BoxPointer bp) {
        return lineSearch(box,bp);
    }

    private static ArrayList<Integer> lineSearch(NumberBox box, BoxPointer bp) {
        ArrayList<Integer> search_list = (ArrayList<Integer>) NUMBERS.clone();
        search_list.removeAll(box.getLineNumbers(bp.getLine()));
        return search_list;
    }
}
