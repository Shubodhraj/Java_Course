class UppertoLower{
    public static void main(String args[]) {
        String S1 = new String("UPPERCASE CONVERTED TO LOWERCASE");
        //Convert to LowerCase
        System.out.println(S1.toLowerCase());
        String s2  = "lower case to upper case";
        System.out.println(s2.toUpperCase());

    }
}



class lOWER2uPPER {
    public static void main(String args[]) {
        String S1 = new String("lowercase converted to uppercase");
        //Convert to UpperCase
        System.out.println(S1.toUpperCase());
    }
}


class CharacterAt{
    public static void main(String[] args) {
        String s = "Hello world";
        for(int i = 0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}



class StringGetCharsExample{  
    public static void main(String args[]){  
     String str = new String("hello javatpoint how r u");  
          char[] ch = new char[10];  
          try{  
             str.getChars(6, 16, ch, 0);  
             System.out.println(ch);  
          }catch(Exception ex){System.out.println(ex);}  
    }}  