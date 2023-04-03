public class Mobile {
    public void displayName(){
        System.out.println("Smart mobile");

    }
}
class Samsung extends Mobile{
    @Override
    public void displayName() {
        System.out.println("Samsung Galaxy Note 22 ULTRA");
        super.displayName();
    }
}
class Apple extends Samsung{
    @Override
    public void displayName() {
        System.out.println("Iphone 14 Pro max");
        super.displayName();
    }
}
class run{
    public static void main(String[] args) {
        Samsung s = new Samsung();
        Apple   a = new Apple();
        s.displayName();
        a.displayName();
    }
}