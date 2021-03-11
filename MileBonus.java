public class Main {
    public static void main(String[] args) {
        float cost = 2356.35f; // стоимость билета
        int milecount = 20; // колиичество рублей, за которые начисляется бонус
        int milebalance = (int) (cost / milecount); // количество начисленных бонусов
        System.out.println("Mile Balance: " + milebalance);

    }
}
