class ReturnExample {
    double calculateArea(){
        double l = 2.5;
        double b = 3.5;
        double area = l*b;
        return area ;
    }

    void printArea(){
        double area = calculateArea();
        System.out.println("The area of rectangle is: "+ area);
    }

    

    double calculateVolume(double vlm){
        double area = calculateArea();
        double volume = area*vlm;
        return volume;

    }

    void printVolume(){
        double volum = calculateVolume(5.5);
        System.out.println("The volume of rectangle is: "+volum);
    }

    public static void main(String[] args) {
        ReturnExample re = new ReturnExample();
        //re.calculateArea();
        re.printArea();
        re.printVolume();
    }
}


//Write a program that takes length and bredth as input from user and return the area and volume after calculation.
//Write a program that takes two different numbers as input from user and returns the highest value after comparing the
//two numbers.