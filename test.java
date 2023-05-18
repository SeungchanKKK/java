import java.util.Scanner;

/*
        Scanner sc = new Scanner(System.in);
        int chulMoney = 10000;
        boolean chulExtra = true;

        System.out.println("철수와 영희에게 줄 용돈을 입력해주세요(둘은 10000원씩 가지고있습니다)");
        System.out.println("먼저 철수에게 줄용돈을 입력해주세요");
        int chulFirstMoney = sc.nextInt();
        chulMoney += chulFirstMoney;
        System.out.println("현재 철수의 용돈은 " + chulMoney + "원 입니다.");

        System.out.println("철수와영희가 먹을 떡볶이,우동,과자의 금액을 입력해주세요");
        System.out.println("떡볶이의 금액은?");
        int dduck = sc.nextInt();
        System.out.println("우동의 금액은?");
        int udon = sc.nextInt();
        System.out.println("과자의 금액은?");
        int snack = sc.nextInt();

        System.out.println("철수가 먹을 떡볶이의 개수는?");
        int dduckChul = sc.nextInt();
        if (chulMoney < dduckChul * dduck) {
            System.out.println(dduckChul * dduck - chulMoney + "만큼의 금액이 부족해 철수는 먹을수없습니다");
            System.out.println("철수에게 추가용돈을 주십시오");
            int chulSecondMoney = sc.nextInt();
            chulMoney += chulSecondMoney;
            System.out.println("현재 추가용돈으로 철수의 소지금은" + chulMoney);
            chulExtra = false;
        }
        chulMoney -= dduckChul * dduck;
        System.out.println("철수의 남은금액은" + chulMoney);
        System.out.println("철수가 먹을 우동의 개수는?");
        int udonChul = sc.nextInt();
        if (chulMoney < udonChul * udon) {
            System.out.println(udonChul * udon - chulMoney + "만큼의 금액이 부족해 철수는 먹을수없습니다");
            if (chulExtra) {
                System.out.println("철수에게 추가용돈을 주십시오");
                int chulSecondMoney = sc.nextInt();
                chulMoney += chulSecondMoney;
                System.out.println("현재 추가용돈으로 철수의 소지금은" + chulMoney);
                chulExtra = false;
                chulMoney -= udonChul * udon;
                System.out.println("철수의 남은금액은" + chulMoney);
                System.out.println("철수가 먹을 과자의 개수는?");
                int snackChul = sc.nextInt();
                if (chulMoney < snackChul * snack) {
                    System.out.println(snackChul * snack - chulMoney + "만큼의 금액이 부족해 철수는 먹을수없습니다");
                    if (chulExtra) {
                        System.out.println("철수에게 추가용돈을 주십시오");
                        chulSecondMoney = sc.nextInt();
                        chulMoney += chulSecondMoney;
                        System.out.println("현재 추가용돈으로 철수의 소지금은" + chulMoney);
                        chulExtra = false;
                        chulMoney -= snackChul * snack;
                        System.out.println("철수의 소지금은" + chulMoney);
                    } else {
                        System.out.println("철수는 쫒겨납니다");
                    }
                }
            } else {
                System.out.println("철수는 쫒겨납니다");
            }
        } else {
            System.out.println("철수의 남은금액은" + chulMoney);
            System.out.println("철수가 먹을 과자의 개수는?");
            int snackChul = sc.nextInt();
            if (chulMoney < snackChul * snack) {
                System.out.println(snackChul * snack - chulMoney + "만큼의 금액이 부족해 철수는 먹을수없습니다");
                if (chulExtra) {
                    System.out.println("철수에게 추가용돈을 주십시오");
                    int chulSecondMoney = sc.nextInt();
                    chulMoney += chulSecondMoney;
                    System.out.println("현재 추가용돈으로 철수의 소지금은" + chulMoney);
                    chulMoney -= snackChul * snack;
                    System.out.println("철수의 소지금은" + chulMoney);
                } else {
                    System.out.println("철수는 쫒겨납니다");
                }
            }
        }


 */
public class test {
    public static void main(String[] args) {
        int Ejr, dnehd, rhkwk, rlghl = 0, rotn, gkq = 10000, dydehs;
        int rlghl2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("추가 용돈 : ");
        dydehs = sc.nextInt();
        gkq = gkq + dydehs;

        System.out.println(dydehs);

        System.out.println("떡볶이 가격 : ");
        Ejr = sc.nextInt();
        System.out.println("우동 가격 : ");
        dnehd = sc.nextInt();
        System.out.println("과자 가격 : ");
        rhkwk = sc.nextInt();

        System.out.println("떡볶이 개수 : ");
        rotn = sc.nextInt();
        Ejr = Ejr * rotn;
        gkq = gkq - Ejr;
        if (gkq < 0) {
            if (rlghl != 0) {
                System.out.println("추가 용돈을 이미 받으셨습니다.");
                System.exit(0);
            }
            if (rlghl == 0) {
                System.out.println("현재 용돈이 " + gkq + "원 부족합니다.");
                System.out.println("추가 용돈 : ");
                dydehs = sc.nextInt();
                gkq = gkq + dydehs;
                gkq = gkq + Ejr;
                System.out.println("추가 용돈을 받고 " + gkq + "원 남았습니다.");
                gkq = gkq - Ejr;
                rlghl = rlghl + 1;
            }
        }
        System.out.println("떡볶이를 주문하고 " + gkq + "원 남았습니다.");

        System.out.println("우동 개수 : ");
        rotn = sc.nextInt();

        dnehd = dnehd * rotn;
        gkq = gkq - dnehd;
        if (gkq < 0) {
            if (rlghl != 0) {
                System.out.println("추가 용돈을 이미 받으셨습니다.");
                rlghl2 = 1;
                System.exit(0);
            }
            if (rlghl == 0) {
                System.out.println("현재 용돈이 " + gkq + "원 부족합니다.");
                System.out.println("추가 용돈 : ");
                dydehs = sc.nextInt();
                gkq = gkq + dydehs;
                gkq = gkq + dnehd;
                System.out.println("추가 용돈을 받고 " + gkq + "원 남았습니다.");
                gkq = gkq - dnehd;
                rlghl = rlghl + 1;
            }
        }
        System.out.println("우동 주문하고 " + gkq + "원 남았습니다.");


        System.out.println("과자 개수 : ");
        rotn = sc.nextInt();

        rhkwk = rhkwk * rotn;
        gkq = gkq - rhkwk;
        if (gkq < 0) {
            if (rlghl != 0) {
                System.out.println("추가 용돈을 이미 받으셨습니다.");
                System.exit(0);
            }
            if (rlghl == 0) {
                System.out.println("현재 용돈이 " + gkq + "원 부족합니다.");
                System.out.println("추가 용돈 : ");
                dydehs = sc.nextInt();
                gkq = gkq + dydehs;
                gkq = gkq + rhkwk;
                System.out.println("추가 용돈을 받고 " + gkq + "원 남았습니다.");
                gkq = gkq - rhkwk;
                rlghl = rlghl + 1;
            }
        }
        System.out.println("과자를 주문하고 " + gkq + "원 남았습니다.");
    }
}


















