import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("1.구구단 2.음식점 3.계산기 4.종료");
            int choice1 = sc.nextInt();
            if (choice1 == 1) {
                int num = 1;
                while (num < 10) {
                    System.out.println("2x" + num + "=" + num * 2);
                    num++;
                }
            }
            if (choice1 == 2) {
                System.out.println("볶음밥 가격입력");
                int price1 = sc.nextInt();
                System.out.println("자장면 가격입력");
                int price2 = sc.nextInt();;
                System.out.println("탕수 소 가격입력");
                int price3 = sc.nextInt();;
                System.out.println("탕수 중 가격입력");
                int price4 = sc.nextInt();;
                System.out.println("탕수 대 가격입력");
                int price5 = sc.nextInt();;
                while (true) {w
                    System.out.println(" [1.볶음밥 2.자장면 3.탕수육[소`중`대 따로] 4.종료]");
                    int choice2 = sc.nextInt();
                    if (choice2 == 1) {
                        sum += price1;
                    } else if (choice2 == 2) {
                        sum += price2;
                    } else if (choice2 == 3) {
                        System.out.println("1소,2중,3대 중에 선택해주세요 4.이전메뉴로");
                        int choice3 = sc.nextInt();
                        if (choice3 == 1) {
                            sum += price3;
                        } else if (choice3 == 2) {
                            sum += price4;
                        } else {
                            sum += price5;
                        }
                    } else {
                        System.out.println("합산금액은" + sum);
                        System.out.println("메인메뉴로 돌아갑니다");
                        break;
                    }
                }
            }
            if (choice1 == 3) {
                System.out.println("1.더하기, 2빼기");
                int choice4=sc.nextInt();
                if (choice4==1){
                    System.out.println("더하기시작 숫자두개를 입력해주세요");
                    int a =sc.nextInt();
                    int b = sc.nextInt();
                    int c = a + b;
                    System.out.println(a + "+" + b + "=" + c);
                } else {
                    while (true) {
                        System.out.println("빼기시작 숫자두개를 입력해주세요");
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        int c = a - b;
                        if (c < 0) {
                            System.out.println("두 번재 숫자가 더 클 수 없습니다!!");
                        }else {
                            System.out.println(a + "-" + b + "=" + c);
                            break;
                        }
                    }
                }
            }
            if (choice1 == 4) {
                System.out.println("프로그램을 종료합니다");
                System.out.println("합산금액은"+sum);
                System.exit(0);
            }
        }
    }
}


//public class test {
//    public static void main(String[] args) {
//        int Ejr, dnehd, rhkwk, rlghl = 0, rotn, gkq = 10000, dydehs;
//        int rlghl2 = 0;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("추가 용돈 : ");
//        dydehs = sc.nextInt();
//        gkq = gkq + dydehs;
//
//        System.out.println(dydehs);
//
//        System.out.println("떡볶이 가격 : ");
//        Ejr = sc.nextInt();
//        System.out.println("우동 가격 : ");
//        dnehd = sc.nextInt();
//        System.out.println("과자 가격 : ");
//        rhkwk = sc.nextInt();
//
//        System.out.println("떡볶이 개수 : ");
//        rotn = sc.nextInt();
//        Ejr = Ejr * rotn;
//        gkq = gkq - Ejr;
//        if (gkq < 0) {
//            if (rlghl != 0) {
//                System.out.println("추가 용돈을 이미 받으셨습니다.");
//                System.exit(0);
//            }
//            if (rlghl == 0) {
//                System.out.println("현재 용돈이 " + gkq + "원 부족합니다.");
//                System.out.println("추가 용돈 : ");
//                dydehs = sc.nextInt();
//                gkq = gkq + dydehs;
//                gkq = gkq + Ejr;
//                System.out.println("추가 용돈을 받고 " + gkq + "원 남았습니다.");
//                gkq = gkq - Ejr;
//                rlghl = rlghl + 1;
//            }
//        }
//        System.out.println("떡볶이를 주문하고 " + gkq + "원 남았습니다.");
//
//        System.out.println("우동 개수 : ");
//        rotn = sc.nextInt();
//
//        dnehd = dnehd * rotn;
//        gkq = gkq - dnehd;
//        if (gkq < 0) {
//            if (rlghl != 0) {
//                System.out.println("추가 용돈을 이미 받으셨습니다.");
//                rlghl2 = 1;
//                System.exit(0);
//            }
//            if (rlghl == 0) {
//                System.out.println("현재 용돈이 " + gkq + "원 부족합니다.");
//                System.out.println("추가 용돈 : ");
//                dydehs = sc.nextInt();
//                gkq = gkq + dydehs;
//                gkq = gkq + dnehd;
//                System.out.println("추가 용돈을 받고 " + gkq + "원 남았습니다.");
//                gkq = gkq - dnehd;
//                rlghl = rlghl + 1;
//            }
//        }
//        System.out.println("우동 주문하고 " + gkq + "원 남았습니다.");
//
//
//        System.out.println("과자 개수 : ");
//        rotn = sc.nextInt();
//
//        rhkwk = rhkwk * rotn;
//        gkq = gkq - rhkwk;
//        if (gkq < 0) {
//            if (rlghl != 0) {
//                System.out.println("추가 용돈을 이미 받으셨습니다.");
//                System.exit(0);
//            }
//            if (rlghl == 0) {
//                System.out.println("현재 용돈이 " + gkq + "원 부족합니다.");
//                System.out.println("추가 용돈 : ");
//                dydehs = sc.nextInt();
//                gkq = gkq + dydehs;
//                gkq = gkq + rhkwk;
//                System.out.println("추가 용돈을 받고 " + gkq + "원 남았습니다.");
//                gkq = gkq - rhkwk;
//                rlghl = rlghl + 1;
//            }
//        }
//        System.out.println("과자를 주문하고 " + gkq + "원 남았습니다.");
//    }
//}


















