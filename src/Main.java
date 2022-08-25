public class Main {
    public static void main(String[] args) {


        // задание 1
        int clientOs;
        clientOs = 0;
        if (clientOs == 0) {
            System.out.println(" Установите версию на Ios");
        } else {
            System.out.println(" Установите версию на Android ");
        }


        // задание 2
        int ClientOs = 0;
        int clientDeviseYear = 2022;
                switch ( clientOs ) {
            case 1:
                if ( clientOs == 0 && clientDeviseYear >= 2015 ) {
                    System.out.println("Установите  версию на Ios по ссылке");
                }
                break;
            case 2:
                if ( clientOs == 1 && clientDeviseYear >= 2015 ) {
                    System.out.println("Установите  версию на Android по ссылке"); }
                    break;
                    default:
                        System.out.println ( " Установите  облегченную версию по ссылке") ;
                }

                // задание 3
        int year = 2020;
                if (( year % 4 == 0) && year % 100 != 0) {
                    System.out.println ( year + " год является високосным " ) ;
                }
        if (( year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)) {
            System.out.println ( year + " год является високосным " ) ;
        } else {
            System.out.println ( year + " год  не является високосным " ) ; }

        // задание 4

        int deliveryDistance = 95;
        int deliveryTime;

        if ( deliveryDistance <= 20 )
        {deliveryTime = 1;
                System.out.println ( " Время доставки составляет" + deliveryTime + " дней") ;}

        if (( deliveryDistance >= 20) && (deliveryDistance <=60 ))
        {deliveryTime = 2;
            System.out.println ( " Время доставки составляет" + deliveryTime + " дней") ; }

        if (( deliveryDistance >= 60 ) && ( deliveryDistance <=100))
        { deliveryTime = 3;
            System.out.println ( " Время доставки составляет" + deliveryTime + " дней") ;}
        }


    }
