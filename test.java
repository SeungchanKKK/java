import java.util.Scanner;

public class test {
    static class ChulYoung{
        int money;
        boolean chance;
        public ChulYoung(int money, boolean chance){
            this.money =money;
            this.chance = chance;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChulYoung chulYoung = new ChulYoung(10000,true);

        System.out.println("용돈을 입력하세요");
        int add = sc.nextInt();
        chulYoung.money+=add;

        System.out.println("소지금 : "+chulYoung.money);

        System.out.println("철수와영희가 먹을 떡볶이,우동,과자의 금액을 입력해주세요");
        System.out.println("떡볶이의 금액은?");
        int dduck = sc.nextInt();
        System.out.println("우동의 금액은?");
        int udon = sc.nextInt();
        System.out.println("과자의 금액은?");
        int snack = sc.nextInt();
        System.out.println("아이스크림의 금액은?");
        int ice = sc.nextInt();
        System.out.println("밥의 금액은?");
        int rice = sc.nextInt();

        perchase(sc, chulYoung, dduck, "떡볶이");
        perchase(sc, chulYoung, udon,"우동");
        perchase(sc, chulYoung, snack,"과자");
        perchase(sc, chulYoung, ice,"아이스크림");
        perchase(sc, chulYoung, rice,"밥");

    }

    private static ChulYoung perchase(Scanner sc, ChulYoung chulYoung, int dduck, String name) {
        System.out.println(name+"의 개수는?");
        int amount = sc.nextInt();
        int charge = dduck *amount;
        int money = chulYoung.money;
        if (money <charge){
            int need = charge- money;
            System.out.println(need+"만큼의 금액이 부족합니다");
            if(!chulYoung.chance){
                System.out.println("이미 추가용돈이 지급되었습니다");
                System.exit(0);
            }else {
                System.out.println("추가용돈을 입력하세요");
                int addMoney = sc.nextInt();
                money +=addMoney;
                chulYoung.chance=false;
            }
        }
        System.out.println(name+"의 금액은"+charge);
        money-=charge;
        chulYoung.money = money;
        System.out.println("남은금액은"+ money);
        return chulYoung;
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


















