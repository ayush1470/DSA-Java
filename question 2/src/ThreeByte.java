public class ThreeByte {
    private static final int min_value = -(1<<23);
    private static final int max_value = (1<<23)-1;
    private int value;
    public ThreeByte(int value){
        if(value < min_value || value > max_value){
            throw new IllegalArgumentException("value is out of range for a 3-byte signed integer");
        }
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public String toString(){
        return "Three Byte Value:"+value;
    }
    public static int getMinValue(){
        return min_value;
    }
    public static int getMaxValue(){
        return max_value;
    }
}

