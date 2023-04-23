public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
    }
    public static void task1 () {
        System.out.println("Задача1");
        byte apple = 8;
        System.out.println("Значение переменной apple с типом byte равно " + apple );
        short fruits = 274;
        System.out.println("Значение переменной fruits с типом  short равно " + fruits);
        int garden = 493278;
        System.out.println("Значение переменной garden с типом int равно " + garden);
        long planet = 345629245;
        System.out.println("Знаечение переменной planet с типом long равно " + planet);
        float basketWeight = 6;
        System.out.println("Значение переменной basketWeight c типом float равно " + basketWeight);
        double boxWeight = 10.9616;
        System.out.print("Значение переменной boxWeight с типом double равно " + boxWeight);
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
    }
    public static void task3 () {
        System.out.println("Задача3");
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short totalSheels = 480;
        float sheetStudent1 = totalSheels / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetStudent1 + " листов бумаги");
    }
}