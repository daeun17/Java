import java.util.Scanner;//Scanner 클래스를 이용하기 위해 추가

class Ex2_10Scanner{
    public static void main(String[] args) {
       
        Scanner scanner  = new Scanner(System.in);//Scannser 클래스의 생성

        System.out.print("두자리 정수중 하나를 입력하세요");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);//입력 받은 문자열을 숫자로 변환
        //nextInt(), nextFloat() 메서드를 통해 변환 없이 숫자를 바로 입력 받을 수도 있다.
        System.out.println("입력내용: "+input);
        System.out.printf("num =%d %n", num);
    }
}