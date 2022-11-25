class InstanceVariable {
    
 
        public String instance; // Declared Instance Variable
     
        public InstanceVariable()
        { // Default Constructor
     
            this.instance = "Instance variable "; // initializing Instance Variable
        }
    //Main Method
        public static void main(String[] args)
        {
            
            // Object Creation
            InstanceVariable name = new InstanceVariable();
            // Displaying O/P
            System.out.println("Instance name is: " + name.instance);
        }
    }

