class Ex2_8CN{
    public static void main(String[] args) {
       
        int x = 100;
        int y= 20;
        int tmp;

        System.out.println(x);
        System.out.println(y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println(x);
        System.out.println(y);
    }
}