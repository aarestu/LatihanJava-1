
package latihanjava1;

public class LatihanJava1 {

    private static int getIntegerComplement(int desimal){
        StringBuilder str_desimal = new StringBuilder(Integer.toBinaryString(desimal));
                
        for(int i = 0; i < str_desimal.length(); i++){
            if(str_desimal.charAt(i) == '0'){
                str_desimal.setCharAt(i, '1');
            }else{
                str_desimal.setCharAt(i, '0');
            }
        }
        
        return Integer.parseInt(str_desimal.toString(), 2);        
    }
    
    public static void main(String[] args) {
              
        if(args.length < 1){
            System.exit(0);
        }
        
        int N=0;
        
        try {
            N = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException ex) {
            System.out.println("args[0] was not integer: " + args[0]+"\n"+ex.getMessage());
            System.exit(0);
        }
        
        if(N < 0 || N > 100000){
            System.out.print("error : 0 ≤ N ≤ 100000");
            System.exit(0);
        }
        
        int invert = getIntegerComplement(N);
        
        System.out.println(
                N +" in decimal form equals: "+ 
                Integer.toBinaryString(N)+". Inverting the bit sequence: "+
                Integer.toBinaryString(invert)+". This is "+
                invert+" in decimal "
                );
        
    }
}
