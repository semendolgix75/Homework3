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
        float task1Float=689.4F;
        System.out.println("Значение переменной task1Float с типом float равно "+task1Float);
        double task1Double=-1111111111.11111111111;
        System.out.println("Значение переменной task1Double с типом double равно "+task1Double);
//        int str = 256;
//        System.out.println(str.getClass().getSimpleName()); // => String
        System.out.println("Задача 2");
//        Ниже дан список различных значений.
//        Инициализируйте переменные, используйте изученные ранее типы переменных.
        float task2Float =27.12f;
        System.out.println("Значению "+task2Float+" присвоен тип float");
        long task2Long =987678965549L;
        System.out.println("Значению "+task2Long+" присвоен тип long");
        float task2Float1 =2.786F;
        System.out.println("Значению "+task2Float1+" присвоен тип float");
        int task2Int =569;
        System.out.println("Значению "+task2Int+" присвоен тип int");
        int task2Int1 =-159;
        System.out.println("Значению "+task2Int1+" присвоен тип int");
        short task2short =27897;
        System.out.println("Значению "+task2short+" присвоен тип short");
        byte task2Byte =67;
        System.out.println("Значению "+task2Byte+" присвоен тип Byte");
        System.out.println("Задача 3");
//  Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
//  У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
//  Три учительницы закупили все вместе 480 листов бумаги на все три класса.
//  Посчитайте, сколько достанется листов каждому ученику.
//  Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        int pupilLP=23;    //  Людмилы Павловны — 23 ученика
        int pupilAS=27;    //  Анны Сергеевны — 27 учеников
        int pupilEA=30;    //  Екатерины Андреевны — 30 учеников
        int allList=480;  //  закупили все вместе 480 листов бумаги
        int List=allList/(pupilLP+pupilAS+pupilEA);
        System.out.println("На каждого ученика рассчитано "+List+" листов бумаги");
        System.out.println("Задача 4");
//  Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        float perfomance=16/2;  //Производительность машины для изготовления бутылок в минуту
//
        System.out.println("За 20 минут машина произвела "+perfomance*20+" штук бутылок ");
        System.out.println("За сутки машина произвела "+perfomance*24*60+",штук бутылок");
        System.out.println("За 3 дня машина произвела "+perfomance*24*60*3+",штук бутылок");
        System.out.println("За 1 месяц машина произвела "+perfomance*20*60*30+",штук бутылок");
        float perfomance2=perfomance*24*60;     //,
        float perfomance3=perfomance*24*60*3;   //за 3 дня
        float perfomance4=perfomance*24*60*30;  //за 1 месяц
        System.out.println("Задача 5");
//        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
//        На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        byte qtyOffice=120/(2+4);    // Количество классов на требуемую краску
        System.out.println("В школе, где "+qtyOffice+" классов, нужно "+qtyOffice*2+" банок белой краски " +
                "и "+qtyOffice*4+" банок коричневой краски ");
        System.out.println("Задача 6");
//        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
//        Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        int weightBananas=5*80;             // Бананы — 5 штук (1 банан — 80 грамм).
        int weightMilk=200/100*105;         //Молоко — 200 мл (100 мл = 105 грамм).
        int weightIce=2*100;         // Мороженое-пломбир — 2 брикета по 100 грамм.
        int weightEgg=200/100*105;         // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        float weightBreakfest=weightBananas+weightMilk+weightIce+weightEgg;
        float weitghtBreakfestKg =weightBreakfest/1000;
        System.out.println("Bес спортзавтрака "+weightBreakfest+"г. ("+weitghtBreakfestKg+"кг)");
        System.out.println("Задача 7");
//  Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
//  Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
//  Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
//  Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
//  Результаты всех подсчетов выведите в консоль.
        float dayLoseMin=7000/250;
        System.out.println(dayLoseMin+" дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        float dayLoseMax=7000/500;
        System.out.println(dayLoseMax+" дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        float dayLoseAvg=(dayLoseMin+dayLoseMax)/2;
        System.out.println(dayLoseAvg+" дней потребоваться в среднем, чтобы добиться результата похудения");

        System.out.println("Задача 8");
        float percentUp=10;
        float upSalary=(100+percentUp)/100;
        float salaryMary=67_760;   //Маша получала 67 760 рублей в месяц.
        System.out.println("Маша теперь получает "+salaryMary*upSalary+" рублей. Годовой доход вырос на "+(salaryMary*upSalary-salaryMary)*12+" рублей».");
        float salaryDen=83_690;    // Денис получает 83 690 рублей в месяц.
        System.out.println("Маша теперь получает "+salaryDen*upSalary+" рублей. Годовой доход вырос на "+(salaryDen*upSalary-salaryDen)*12+" рублей».");
        float salaryKrist=76_230;  // Кристина получает 76 230 рублей в месяц.
        System.out.println("Маша теперь получает "+salaryKrist*upSalary+" рублей. Годовой доход вырос на "+(salaryKrist*upSalary-salaryKrist)*12+" рублей».");
    }
}