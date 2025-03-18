public class TestProg{
    public static void main(String[] args){
        try{
            ThreeByte validvalue = new ThreeByte(250000);
            System.out.println("valid value:"+validvalue);
        }catch(IllegalArgumentException e){
            System.out.println("Error:"+e.getMessage());
        }
        System.out.println("Minimum value for 3-byte signed integer:"+ThreeByte.getMinValue());
        System.out.println("Maximum value for 3-byte signed integer:"+ThreeByte.getMaxValue());
        try{
            ThreeByte invalidvalue = new ThreeByte(9500000);
            System.out.println("Invalid value:"+invalidvalue);
        }catch(IllegalArgumentException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
