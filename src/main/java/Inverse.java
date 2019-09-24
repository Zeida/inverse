public class Inverse {

    public static int[] inverse(int[] array) {
        int[]result=new int[array.length];
    for(int i = 0; i<array.length;i++){
        result[i] = array[i]*(-1);
    }
    return result;
    }
}