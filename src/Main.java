public class Main {
    public static void main(String[] args) {
        int input = 2;
        do {
            System.out.println("안녕하세요. 자판기입니다.");

            // 키입력 응용가능

            switch(input) {
                case 1:
                    System.out.println("콜라");
                    break;
                case 2:
                    System.out.println("사이다");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                default:
                    System.out.println("잘못 고름.");
            }
        } while(input == 0);
    }
}