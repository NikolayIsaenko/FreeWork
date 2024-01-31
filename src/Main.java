public class Main {
    public static void main(String[] args) {

        var egg = 10;
        System.out.println(egg);

        var Salary = 125.635;
        var TheIncrease = 1.04;
        TheIncrease = Salary * TheIncrease;

        var Deprivation = (10 * TheIncrease) / 100;

        Deprivation = TheIncrease - Deprivation;


        System.out.println(" Была зарплата - " + Salary + " , если добавить 4%, то будет - " + TheIncrease + " , если убавить 10%, то будет - " + Deprivation);

        var travel = 375.300;
        var sell = 0.07;

        var travelsell = travel * sell;
        System.out.println(travel);

        var travelsell1 = travel - travelsell;
        System.out.println(travel);

        var onePlace = 0.023;
        travel = travel * onePlace;
        System.out.println(travel);

        System.out.println(" Путевка стоит - 375.300 руб. При скидке в 7% стоимость упадёт до  " + travelsell1 + ". При заказе доп.места надо будет доплатить - " + travel);








    }

    }