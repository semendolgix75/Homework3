public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
//        Объявите переменные типа int, byte, short, long, float, double.
//        Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
//        Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
        int task1Int=2147483647;
        System.out.println("Значение переменной task1Int с типом int равно "+task1Int);
        byte task1Byte=-128;
        System.out.println("Значение переменной task1Byte с типом byte равно "+task1Byte);
        short task1Short=-32767;
        System.out.println("Значение переменной task1Short с типом Short равно "+task1Short);
        long task1Long=-9223372036854775808L;
        System.out.println("Значение переменной task1Long с типом long равно "+task1Long);
        float task1Float=689.4f;
        System.out.println("Значение переменной task1Float с типом float равно "+task1Float);
        double task1Double=-1111111111.11111111111;
        System.out.println("Значение переменной task1Double с типом double равно "+task1Double);
        System.out.println();

        System.out.println("Задача 2");
//        Ниже дан список различных значений.
//        Инициализируйте переменные, используйте изученные ранее типы переменных.
        float task2Float =27.12f;
        System.out.println("Значению "+task2Float+" присвоен тип float");
        long task2Long =987678965549L;
        System.out.println("Значению "+task2Long+" присвоен тип long");
        float task2Float1 =2.786f;
        System.out.println("Значению "+task2Float1+" присвоен тип float");
        int task2Int =569;
        System.out.println("Значению "+task2Int+" присвоен тип int");
        int task2Int1 =-159;
        System.out.println("Значению "+task2Int1+" присвоен тип int");
        short task2short =27897;
        System.out.println("Значению "+task2short+" присвоен тип short");
        byte task2Byte =67;
        System.out.println("Значению "+task2Byte+" присвоен тип Byte");
        System.out.println();

        System.out.println("Задача 3");

//          Три учительницы закупили все вместе 480 листов бумаги на все три класса.
//          Посчитайте, сколько достанется листов каждому ученику.
//          Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        int pupilLP=23;    //  Людмилы Павловны — 23 ученика
        int pupilAS=27;    //  Анны Сергеевны — 27 учеников
        int pupilEA=30;    //  Екатерины Андреевны — 30 учеников
        float allList=480f;  //  закупили все вместе 480 листов бумаги
        float list=allList/(pupilLP+pupilAS+pupilEA);
        System.out.println("На каждого ученика рассчитано "+list+" листов бумаги");
        System.out.println();

        System.out.println("Задача 4");
//  Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.

        float efficiencyPer2min=16f;
        int minutesPerHour=60;
        int hourPerDay=24;
        int dayPerMouth=30;
        float efficiency=efficiencyPer2min/2;                                           //Производительность машины для изготовления бутылок в минуту
        float efficiencyPer20min=efficiency*20;                                         //за 20 минут
        float efficiencyPerDay=efficiency*minutesPerHour*hourPerDay;                    //за сутки
        float efficiencyPerTreeDay=efficiency*minutesPerHour*hourPerDay*3;              //за 3 дня
        float efficiencyPerMouth=efficiency*minutesPerHour*hourPerDay*dayPerMouth;      //за 1 месяц
        System.out.println("За 20 минут машина произвела "+efficiencyPer20min+" штук бутылок ");
        System.out.println("За сутки машина произвела "+efficiencyPerDay+",штук бутылок");
        System.out.println("За 3 дня машина произвела "+efficiencyPerTreeDay+",штук бутылок");
        System.out.println("За 1 месяц машина произвела "+efficiencyPerMouth+",штук бутылок");
        System.out.println();

        System.out.println("Задача 5");
//        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
//        На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        int qtyPot=120;
        int normWhitePaint=2;
        int normBrownPaint=4;
        int qtyOffice=qtyPot/(normBrownPaint+normWhitePaint);    // Количество классов на требуемую норму краски
        int qtyWhitePaint=qtyOffice*normWhitePaint;
        int qtyBrownPaint=qtyOffice*normBrownPaint;
        System.out.println("В школе, где "+qtyOffice+" классов, " +
         "нужно "+qtyWhitePaint+" банок белой краски " +
                qtyBrownPaint+" банок коричневой краски ");
        System.out.println();

        System.out.println("Задача 6");

//        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
//        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        int weightBananas=5*80;             // Бананы — 5 штук (1 банан — 80 грамм).
        int weightMilk=200/100*105;         //Молоко — 200 мл (100 мл = 105 грамм).
        int weightIce=2*100;         // Мороженое-пломбир — 2 брикета по 100 грамм.
        int weightEgg=200/100*105;         // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        float weightBreakfast=(float)(weightBananas+weightMilk+weightIce+weightEgg);
        float weightBreakfastKg =weightBreakfast/1000;
        System.out.println("Bес спортзавтрака "+weightBreakfast+"г. ("+weightBreakfastKg+"кг)");
        System.out.println();

        System.out.println("Задача 7");
//  Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
//  Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
//  Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
//  Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
//  Результаты всех подсчетов выведите в консоль.
        float weightLose=7000f;
        float loseMin=250f;
        float loseMax=500f;
        float dayLoseMin=weightLose/loseMin;
        System.out.println(dayLoseMin+" дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        float dayLoseMax=weightLose/loseMax;
        System.out.println(dayLoseMax+" дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        float dayLoseAvg=(dayLoseMin+dayLoseMax)/2f;
        System.out.println(dayLoseAvg+" дней потребоваться в среднем, чтобы добиться результата похудения");
        System.out.println();

        System.out.println("Задача 8");
        float percentUp=10f;
        float upSalary=(100+percentUp)/100f;     //Увеличение зарплаты
        int mouthPerYear=12;        //Месяцев в году
        float salaryMary=67_760f;   //Маша получала 67 760 рублей в месяц.
        float salaryMaryUp=salaryMary*upSalary;
        float salaryMaryUpYear=(salaryMary*upSalary-salaryMary)*mouthPerYear;
        System.out.println("Маша теперь получает "+salaryMaryUp+" рублей. Годовой доход вырос на "+salaryMaryUpYear+" рублей».");
        float salaryDen=83_690f;    // Денис получает 83 690 рублей в месяц.
        float salaryDenUp=salaryDen*upSalary;
        float salaryDenUpYear=(salaryDen*upSalary-salaryDen)*mouthPerYear;
        System.out.println("Денис теперь получает "+salaryDenUp+" рублей. Годовой доход вырос на "+salaryDenUpYear+" рублей».");
        float salaryKrist=76_230f;  // Кристина получает 76 230 рублей в месяц.
        float salaryKristUp=salaryKrist*upSalary;
        float salaryKristUpYear=(salaryKrist*upSalary-salaryKrist)*mouthPerYear;
        System.out.println("Кристина теперь получает "+salaryKristUp+" рублей. Годовой доход вырос на "+salaryKristUpYear+" рублей».");

    }
}