class Ex2_5CL{
    public static void main(String[] args) {
       final int a;// 상수 a 를 선언
       a = 100; //상수 a에 리터럴 100을 저장 
       System.out.println(a);

       a = 200;// 에러 => 상수는 값을 한번만 저장이 가능하다
       System.out.println(a);
        
    }
}