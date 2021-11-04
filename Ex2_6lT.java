class Ex2_6lT{
    public static void main(String[] args) {
       
        boolean tf = true;//논리형 변수 tf에 true리터럴 저장
        int a = 010;// 정수형 변수 a에 리터럴 8을 8진수로 저장
        int b = 0x10;//정수형 변수 b에 리터럴 16을 16진수로 저장
        long bignum = 100_000_000_000L;// 정수형변수 bignum에 100000000000저장
        float c = 3.14f;// 실수형 변수 c에 리터럴 저장
        double d = 1.618d;//실수형 변수 d에 리터럴 저장
        char f = 'A';//문자형 변수f 에 문자형 리터럴 A저장
        char g = '';//에러
        String name = "Java";
        String empty = ""; // 가능

        System.out.println(tf);
        System.out.println(a);
        System.out.println(b);
        System.out.println(bignum);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(name);
        System.out.println(empty);
        
    }
}