import java.awt.*;

public class RegionalLanguage{
    public static void main(String[] args){
        Frame f = new Frame("Display name:");
        f.setSize(400,300);
        f.setBackground(Color.BLUE);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        String name = (char)2310+ (char)2351+ (char)2369+ (char)2359+" "+ (char)2325 + (char)2369+ (char)2350+ (char)2366 +(char)2352;
        Label namelabel = new Label(name);
        f.add(namelabel);
        System.out.println("Name in English is: Ayush Kumar");
        System.out.println("2310-> "+(char)2310);
        System.out.println("2351-> "+(char)2351);
        System.out.println("2369-> "+(char)2369);
        System.out.println("2359-> "+(char)2359);
        System.out.println("2325-> "+(char)2325);
        System.out.println("2369-> "+(char)2369);
        System.out.println("2350-> "+(char)2350);
        System.out.println("2366-> "+(char)2366);
        System.out.println("2352-> "+(char)2352);
    }
}