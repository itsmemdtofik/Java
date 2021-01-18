//lower to  Uppercase conversion using bitwise &
class biwise_Lower {
    public static void main(String[] args) {  
        char ch; 
        for(int i=0; i < 10; i++)
         {   ch = (char) ('a' + i);      
              System.out.print(ch);    
             // The below statement turns off the 6th bit.  
             ch = (char) ((int) ch & 65503); 
             // ch is now uppercase    
            System.out.print(ch + " ");    
         }  
   }
}
