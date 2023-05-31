import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = start(sc);

        boolean chance1 = false;
        boolean chance2 = false;

        System.out.println("\n" + "1번 플레이어의 이름을 입력하여 주십시오.");
        String player1 = sc.next();
        System.out.println("\n" + "2번 플레이어의 이름을 입력하여 주십시오.");
        String player2 = sc.next();

        int turn =0;
        System.out.println("1.플레이어가 제시한 숫자보다 크거나 작을 시 컴퓨터가 알려줍니다.그럼 게임을 시작하겠습니다.");
        System.out.println(player1+"님부터 시작합니다.");
        int one1 =0;
        int one2 =0;

        while (true){
            turn++;
            System.out.println(player1+"님이 입력할번호");
            int answer1 = sc.nextInt();
            answer = getAnswer(answer, player1, turn, answer1);

            System.out.println(player2+"님이 입력할번호");
            int answer2 = sc.nextInt();
            answer = getAnswer(answer, player2, turn, answer1);
        }
    }

    private static int start(Scanner sc) {
        System.out.println(" 지금부터 게임을 진행합니다");
        System.out.println("첫번째 번호 입력");
        int one = sc.nextInt();
        System.out.println("두번째 번호 입력");
        int two = sc.nextInt();
        System.out.println("세번째 번호 입력");
        int three = sc.nextInt();
        System.out.println("네번째 번호 입력");
        int four = sc.nextInt();
        int answer = one+two+three+four;
        return answer;
    }

    private static int getAnswer(int answer, String player1, int turn, int answer1) {
        if (answer1 == answer){
            if (turn %7==0){
                answer -=560;
                System.out.println("오답입니다");
            } else if (turn %5==0) {
                answer +=1200;
                System.out.println("오답입니다");
            }else {
                System.out.println("정답입니다!! 완벽하십니다!! 멋지세요!!");
                System.out.println(player1 +"님 승리");
                System.exit(0);
            }
        }else {
            if (answer1 > answer){
                System.out.println(player1 +"님이 입력하신 숫자가 정답보다 큽니다");
            }else {
                System.out.println(player1 +"님이 입력하신 숫자가 정답보다 작습니다");
            }
        }
        return answer;
    }
}
