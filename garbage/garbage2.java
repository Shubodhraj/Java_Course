class TestGarbage1{  
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is garbage collected");
    }  
    //The finalize method is made protected here because:
    //this method belongs to super class Object, which is super class
    //Since, we are inheriting finalize method from super class object,
    //we have make the method protected to overide it. Otherwise we can 
    //make it public, but cannot make any changes to it.
    public static void main(String args[]){  
     TestGarbage1 s1=new TestGarbage1();  
     TestGarbage1 s2=new TestGarbage1();  
     s1=null;  
     s2=null;  
     System.gc();  

     //gc() is the function of class System which is responsible for 
     //deleting unreferenced objects from heap memory
    }  
   }  


