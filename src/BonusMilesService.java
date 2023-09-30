public class BonusMilesService {
    public int calculate(int price) {
        int miles = 20; // рублей за одну милю
        System.out.println((price / miles) + " бонусных миль");
        return miles;
    }
}
