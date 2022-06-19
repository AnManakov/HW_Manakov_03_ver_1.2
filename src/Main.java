import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        // Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их).
        byte byte1 = 127;
        short short2 = 32_767;
        int int3 = 2_147_483_647;
        long long4 = 2_147_483_648L;
        float float5 = 1.333f;
        double double6 = 2.333333333333333333333333333;
        System.out.println("byte1 = " + byte1);
        System.out.println("short2 = " + short2);
        System.out.println("int3 = " + int3);
        System.out.println("long4 = " + long4);
        System.out.println("float5 = " + float5);
        System.out.println("double6 = " + double6);

        System.out.println(" ");
        System.out.println("Задача 2");
        //В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории, и бой будет честным.
        //Вес одного боксера – 78,2 кг
        //Вес второго боксера – 82,7 кг
        //Подсчитайте и выведите в консоль общий вес двух бойцов.
        //Подсчитайте и выведите в консоль разницу между весами бойцов
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float totalWeight = boxer1 + boxer2;
        float differenceWeight = (boxer1 - boxer2);
        System.out.println("Общий вес двух бойцов равен " + totalWeight);
        System.out.println("Разница между весами бойцов " + (Math.abs(differenceWeight)));

        System.out.println(" ");
        System.out.println("Задача 3");
        //– Бананы – 5 штук (1 банан - 80 грамм);
        //– Молоко – 200 мл (100 мл = 105 грамм);
        //– Мороженое пломбир – 2 брикета по 100 грамм;
        //– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        //Смешать всё в блендере и готово.
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        //Результат напечатайте в консоль.
        short bananaWeight = 80;
        short bananaQuality = 5;
        int bananaTotalWeight = bananaWeight * bananaQuality;
        short milkWeight = 105;
        short milkQuality = 2;
        int milkTotalWeight = milkWeight * milkQuality;
        short icecreamWeight = 100;
        short icecreamQuality = 2;
        int icecreamTotalWeight = icecreamWeight * icecreamQuality;
        short eggWeight = 70;
        short eggQuality = 4;
        int eggTotalWeight = eggWeight * eggQuality;
        float breakfastGrWeight = bananaTotalWeight + milkTotalWeight + icecreamTotalWeight + eggTotalWeight;
        float breakfastKgWeight = breakfastGrWeight / 1000;
        System.out.println("Завтрак спортсмена весит " + breakfastKgWeight + "кг.");

        System.out.println(" ");
        System.out.println("Задача 4");
        //Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        //Результаты подсчетов выведите в консоль.
        float weightLossKG = 7;
        float weightLossGr = weightLossKG * 1000;
        float diet250 = 250;
        float diet500 = 500;
        float durationDiet250 = weightLossGr / diet250;
        float durationDiet500 = weightLossGr / diet500;
        float averageDiet = (diet250 + diet500) / 2;
        float averageDurationDiet = weightLossGr / averageDiet;
        String result = String.format("%.0f", averageDurationDiet);

        System.out.println("Длительность диеты по 250 грамм составит " + durationDiet250 + " дней.");
        System.out.println("Длительность диеты по 500 грамм составит " + durationDiet500 + " дней.");
        System.out.println("Средняя продолжительность диеты составит " + result + " дней.");

        System.out.println(" ");
        System.out.println("Задача 5");
        //Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        //В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
        //Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
        //Каждый год повышение составляет 10% от текущей зарплаты.
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //Маша получает 67 760 рублей в месяц
        //Денис получает 83 690 рублей в месяц
        //Кристина получает 76 230 рублей в месяц
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения. Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //Выведите в консоль информацию по каждому сотруднику.
        //Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”
        int monthlySalaryMasha = 67_760;
        int monthlySalaryDenis = 83_690;
        int monthlySalaryChristina = 76_230;
        float monthsPerYear = 12;
        float increase = 10;
        float increaseRate = increase / 100;
        float increasedMonthlySalaryMasha = monthlySalaryMasha + monthlySalaryMasha * increaseRate;
        float increasedMonthlySalaryDenis = monthlySalaryDenis + monthlySalaryDenis * increaseRate;
        float increasedMonthlySalaryChristina  = monthlySalaryChristina * (1 + increaseRate);
        float annualIncreasedSalaryMasha = (increasedMonthlySalaryMasha - monthlySalaryMasha) * monthsPerYear;
        float annualIncreasedSalaryDenis = (increasedMonthlySalaryDenis - monthlySalaryDenis) * monthsPerYear;
        float annualIncreasedSalaryChristina = (increasedMonthlySalaryChristina - monthlySalaryChristina) * monthsPerYear;

        System.out.println("Маша теперь получает " + increasedMonthlySalaryMasha + " рублей. Годовой доход вырос на " + annualIncreasedSalaryMasha + " рублей.");
        System.out.println("Денис теперь получает " + increasedMonthlySalaryDenis + " рублей. Годовой доход вырос на " + annualIncreasedSalaryDenis + " рублей.");
        System.out.println("Кристина теперь получает " + increasedMonthlySalaryChristina + " рублей. Годовой доход вырос на " + annualIncreasedSalaryChristina + " рублей.");

    }

}