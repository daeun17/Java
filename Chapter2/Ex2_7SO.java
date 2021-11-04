class Ex2_7SO{
    public static void main(String[] args) {
       
        int a = 100;
        String str = "7";

        System.out.println(str + a);//a를 문자열로 변환하여 겷합 1007
        System.out.println("" + a + 8);//a를 문자열로 변환하여 결합, "100" + 8을 문자열로 변화 하여 결합 1008
        System.out.println(7 + 8 + "" + 3);
				//7+8 덧셈 연산, 15 + ""이므로 15를 문자열로 변환하여 결합, "15" + 3 3을 문자열로 변환하여 결합 153
        
    }
}