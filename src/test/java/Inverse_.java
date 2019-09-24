import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class Inverse_ {

    @Test
    public void  the_inverse_of_array_of_size_one_is(){
        int[] result;
        int[] initial= {1};
        int[] check ={-1};
        result= Inverse.inverse(initial);
        assertArrayEquals(check,result);
    }
    @Test
    public void the_inverse_of_array_of_size_two_is(){
        int[] result;
        int[] initial= {1,-2};
        int[] check ={-1,2};
        result= Inverse.inverse(initial);
        assertArrayEquals(check,result);
    }

}
