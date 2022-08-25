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
        }

    }
