public class Array_Min_Max {
    public static void main(String[] args) {
        int max=0;
        int min=0;
        int[] names={12,2,32,42,11,34,55,43,22,1,10};
        for(int i=0; i<names.length; i++){
            if(names[i] <min)
            min=names[i];
            if(names[i] >max)
            max=names[i];
        }
        System.out.println("Maximum value is = "+max+"\nMinimum value is = "+min);
    }
    
}
