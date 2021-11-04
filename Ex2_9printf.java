class Ex2_9printf{
    public static void main(String[] args) {
       
        String url = "www.code.com";
        float num1 = .10f;//0.10, 1.0e-1(1*10의-1승)
        float num2 = 1e1f;//10.0, 1.0e1, 1.0e+1
        int num3 = 1;
        double num4 = 1.12345678;
        char chr = 'A';
        boolean true1 = true;

        System.out.printf("num1 = %f, %e,%g \n", num1, num1, num1);
        System.out.printf("num2 = %f\n", num2);
        System.out.printf("num3 = %d, %c, %s \n", num3, num3, num3);
        System.out.printf("num4 = %f, %14.10f, %7.6f \n", num4, num4, num4);
        System.out.printf("url = %s \n", url, url, url, url);
        System.out.printf("char = %c, %s, %d %n", chr, chr, (int)chr);
        System.out.printf("boolean = %s %n", true1);
    }
}