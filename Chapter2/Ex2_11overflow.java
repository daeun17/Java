class Ex2_11overflow{
    public static void main(String[] args) {
       
        short sMIn = -32768, sMax = 32767;
        char cMin = 0, CMax = 65535;

        System.out.println("sMin = " + sMIn);
        System.out.println("sMin - 1 = " + (short) (sMIn - 1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax + 1 = " + (short) (sMax + 1));

        System.out.println("cMin= " + (int) cMin);
        System.out.println("cMin - 1 = " + (int) (--cMin));
        //--cMin을 cMin -1 로 하면 다른 결과 가 나옴 => 왜 그렇지?? 
        System.out.println("CMax = " + (int) CMax);
        System.out.println("CMax + 1 = " + (int) (++CMax));
    }
}