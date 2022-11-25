// Testing whether String is mutable or not
class Test123 {
public static void main(String[] args) {
    String s = "100";
    int i=Integer.parseInt(s);  
    System.out.println(s+100);
    System.out.println(i+100);
    int j=10;  
    String t=String.valueOf(j);
    System.out.println(t+10);
    String u=Integer.toString(i);
    System.out.println(u+10);

   
}    
}
