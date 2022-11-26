public class main {
    public static void main(String[] args) {

        int cost = 200;
        int add = 1100;

        int bonus = 0;

        if (add > 1000) {
            bonus = add / 100;
        }

        int finalcost = cost + add + bonus;

        System.out.println("Итоговый счет: " + finalcost);
        System.out.println("Бонус: " + bonus);

    }
}
