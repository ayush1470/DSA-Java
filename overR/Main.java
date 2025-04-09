class one
{
    final int marks=100;

    void calculate(int a)
    {
        System.out.println("ans="+a*a);
    }
}

class two extends one
{
    void calculate(int a)
    {
        System.out.println("ans="+a*a*a);
    }

}

class OverR {
    public static void main(String[] args) {

        // two obj; //reference
        // obj=new two();   //object
        // obj.calculate(3);

        one obj1=new one();
        one obj2=new two();
        obj2.calculate(2);
        obj1.calculate(2);
        //funtion call as per the content of object, NOT type of object



    }
}