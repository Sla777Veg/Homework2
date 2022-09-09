public class Main {
    public static void main(String[] args) {
        //Задача 1
        int firstVariable = 1000;
        System.out.println("Значение переменной  firstVariable с типом int  равно " + firstVariable);
        byte secondVariable = 10;
        System.out.println("Значение переменной secondVariable с типом byte равно " + secondVariable);
        short thirdVariable = 100;
        System.out.println("Значение переменной thirdVariable с типом short  равно " + thirdVariable);
        long fourthVariable = 10000;
        System.out.println("Значение переменной fourthVariable с типом long  равно " + fourthVariable);
        float fifthVariable = 5.0F;
        System.out.println("Значение переменной fifthVariable с типом short  равно " + fifthVariable);
        double sixthVariable = 0.55;
        System.out.println("Значение переменной sixthVariable с типом short  равно " + sixthVariable);

        //Задача 2
        double Variable1 = 27.12;
        System.out.println(Variable1);
        long Variable2 = 987678965549L;
        System.out.println(Variable2);
        byte Variable3 =  2;
        System.out.println(Variable3);
        short Variable4 = 786;
        System.out.println(Variable4);
        boolean Variable5 = false;
        System.out.println(Variable5);
        short Variable6 = 569;
        System.out.println(Variable6);
        short Variable7 = -159;
        System.out.println(Variable7);
        int Variable8 = 27897;
        System.out.println(Variable8);
        byte Variable9 = 67;
        System.out.println(Variable9);

        //Задача 3
        int LydPav = 23;
        int AnSer = 27;
        int EkAn = 30;
        int totalNumberSheets = 480;
        int totalNumberStudent = LydPav+AnSer+EkAn;
        int sheetsStudent = totalNumberSheets/totalNumberStudent;
        System.out.println(sheetsStudent);

        //Задача 4
        int machineOperationInTwoMin = 16;
        System.out.println("За 2 минута машина произвела бутылок "+ machineOperationInTwoMin+" штук");
        int machineOperationInMin = machineOperationInTwoMin/2;
        System.out.println("За 1 минуту машина произвела бутылок "+machineOperationInMin+" штук");
        int machineOperationInMinTwenty = machineOperationInMin*20;
        System.out.println("За 20 минута машина произвела бутылок "+machineOperationInMinTwenty+" штук");
        int machineOperationInMinDay = machineOperationInMin *60*24;
        System.out.println("За сутки машина произвела бутылок "+machineOperationInMinDay+" штук");
        int machineOperationInMinThreeDays = machineOperationInMinDay*3;
        System.out.println("За три дня машина произвела бутылок "+machineOperationInMinThreeDays+" штук");
        int machineOperationInMinMonth = machineOperationInMinDay*30;
        System.out.println("За меесяц машина произвела бутылок "+machineOperationInMinMonth+" штук");

        //Задача 5
        int titleRequired = 120;
        int whiteRequiretOneClass = 2;
        int brownRequiretOneClass = 4;
        int expendedOnClass = whiteRequiretOneClass + brownRequiretOneClass;
        int amountClasses =titleRequired/expendedOnClass;
        System.out.println(amountClasses);
        int whiteRequiretAllClass = whiteRequiretOneClass * amountClasses;
        int brownRequiretAllClass = brownRequiretOneClass * amountClasses;
        System.out.println("В школе, где "+amountClasses+" классов, нужно "+whiteRequiretAllClass+ " банок белой краски и "+brownRequiretAllClass+ " банок коричневой краски");

        //Задача 6
        int massBananas = 5*80;
        int massMilk = 105*2;
        int massIceCream = 2*100;
        int massEggs = 4*70;
        double titleWeight = massBananas + massMilk + massIceCream + massEggs;
        System.out.println(titleWeight);
        double titleWeightKg = titleWeight/1000;
        System.out.println(titleWeightKg);

        //Задача 7
        int target = 7;
        int targetG = 1000*target;
        int amountDay = targetG/250;
        System.out.println(amountDay);
        int amountDay2 = targetG/500;
        System.out.println(amountDay2);
        int meanamountDay = (amountDay + amountDay2)/2;
        System.out.println(meanamountDay);
        //Задача 8

        int MariaGet = 67760;
        int DenisGet = 83690;
        int KristinaGet = 76230;
        int MariaGetRaise = MariaGet + (MariaGet/10);
        int DenisGetRaise = DenisGet + (DenisGet/10);
        int KristinaGetRaise = KristinaGet + (KristinaGet/10);
        int MariaGetYear = MariaGet*12;
        int DenisGetYear = DenisGet*12;
        int KristinaGetYear = KristinaGet*12;
        int MariaGetRaiseYear = MariaGetRaise*12;
        int DenisGetRaiseYear = DenisGetRaise*12;
        int KristinaGetRaiseYear = KristinaGetRaise*12;
        int differenceMariaGetYear = MariaGetRaiseYear - MariaGetYear;
        int differenceDenisGetYear = DenisGetRaiseYear - DenisGetYear;
        int differenceKristinaGetYear = KristinaGetRaiseYear - KristinaGetYear;
        System.out.println("Маша теперь получает " +MariaGetRaise+ " рублей. Годовой доход вырос на "+differenceMariaGetYear+ " рублей");
        System.out.println("Денис теперь получает " +DenisGetRaise+ " рублей. Годовой доход вырос на "+differenceDenisGetYear+ " рублей");
        System.out.println("Кристина теперь получает " +KristinaGetRaise+ " рублей. Годовой доход вырос на "+differenceKristinaGetYear+ " рублей");
    }
}