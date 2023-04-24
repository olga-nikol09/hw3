public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1 () {
        System.out.println("Задача1");
        byte apple = 8;
        System.out.println("Значение переменной apple с типом byte равно " + apple );
        short fruits = 274;
        System.out.println("Значение переменной fruits с типом  short равно " + fruits);
        int garden = 493278;
        System.out.println("Значение переменной garden с типом int равно " + garden);
        long planet = 345629245L;
        System.out.println("Знаечение переменной planet с типом long равно " + planet);
        float basketWeight = 6f;
        System.out.println("Значение переменной basketWeight c типом float равно " + basketWeight);
        double boxWeight = 10.9616;
        System.out.println("Значение переменной boxWeight с типом double равно " + boxWeight);
    }
    public static void task2 () {
        System.out.println("Задача2");
        float one = 27.12f;
        long two = 987678965549L;
        double three = 2.786;
        short four = 569;
        short five = 159;
        int six = 27897;
        byte seven = 67;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
    }
    public static void task3 () {
        System.out.println("Задача3");
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int totalSheets = 480;
        int sheetStudent1 = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetStudent1 + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача4");
        byte performans = 16;
        byte time = 2;
        int performansBottleMinutes1 = performans / time;
        byte minutes20 = 20;
        int performans20m = performansBottleMinutes1 * minutes20;
        System.out.println("За " + minutes20 + " минут машина произвела " + performans20m + " штук бутылок");
        int day = 24 * 60 * performansBottleMinutes1;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int day3 = day * 3;
        System.out.println("За 3 дня машина произвела " + day3 + " штук былок");
        int month = day3 * 10;
        System.out.println("За 1 месяц машина произвела " + month + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача5");
        byte school = 120;
        byte wightPoint = 2;
        byte brownPoint = 4;
        int totalPoint = wightPoint + brownPoint;
        int totalClass = school / totalPoint;
        int totalWightPoint = totalClass * wightPoint;
        int totalBrowPoint = totalClass * brownPoint;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWightPoint + " банок белой краски  и " + totalBrowPoint + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача6");
        byte bananas = 80;
        int totalBananas = bananas * 5;
        byte milk = 105;
        int totalMIlk = milk * 2;
        byte iceCream = 100;
        int totalIceCream = iceCream * 2;
        byte egg = 70;
        int totalEgg = egg * 4;
        int breakfast = totalBananas + totalMIlk + totalIceCream + totalEgg;
        System.out.println("Завтрак спортсмена " + breakfast + " гр");
        float breakfastKg = breakfast / 1000f;
        System.out.println("Завтрак спортсмена " + breakfastKg + " кг");
    }
    public static void task7 () {
        System.out.println("Задача7");
        short excessWeight = 7000;
        short weightLoss = 250;
        int daysFirstOption = excessWeight / weightLoss;
        System.out.println("Если каждый день спортсмен будет терять по " + weightLoss + " гр, то потребуется " + daysFirstOption + " дней");
        short weightLoss2 = 500;
        int daysSecondOption = excessWeight / weightLoss2;
        System.out.println("Если каждый день спортсмен будет терять по " + weightLoss2 + " гр, то потребуется " + daysSecondOption + " дней");
        int everageOption = daysFirstOption + daysSecondOption;
        everageOption = everageOption / 2;
        System.out.println(everageOption + " дней в среднем");
    }
    public static void task8 () {
        System.out.println("Задача8");
        float masha = 67760f;
        float denis = 83690f;
        float christina = 76230f;
        float annualIncomeMashaBefore = masha * 12;
        float annualIncomeDenisBefore = denis * 12;
        float annualIncomeChristinaBefore = christina * 12;
        masha = masha * 1.1f;
        denis = denis * 1.1f;
        christina = christina * 1.1f;
        float aIMashaAfter = masha * 12;
        float aIDenisAfter = denis * 12;
        float aIChristina = christina * 12;
        float salaryDifferenceMasha = aIMashaAfter % annualIncomeMashaBefore;
        float salaryDifferenceDenis = aIDenisAfter % annualIncomeDenisBefore;
        float salaryDifferenceChristina = aIChristina % annualIncomeChristinaBefore;
        System.out.println("Маша теперь получает " + masha + " рублей. Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + denis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + christina + " рублей. Годовой доход вырос на " + salaryDifferenceChristina + " рублей");
    }
}