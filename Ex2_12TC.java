class Ex2_12TC{
    public static void main(String[] args) {
       
        String str = "34";

        System.out.println(3 + '0' - 1); // ASCII에서 3은 51
        System.out.println('3' - '0' + 1);// 문자 3이 숫자로 변경 되어서 +1 했을 때 4출력 
        System.out.println(Integer.parseInt("3") + 4);//문자열 3이 숫자로 변경되어 +4 했을 때 7출력
        System.out.println("3" + 4);// 4가 문자열로 변환되어 문자열 34 출력
        System.out.println(str.charAt(0) - 1);//34가 문자로 변환 되면서 3 만 문자로 변환, ASCII에서 3은 51
        System.out.println('3' + "" + 4);//문자 3이 문자열로 변환됨, 4가 문자열로 변환되어 문자열 3과 결합
        
    }
}