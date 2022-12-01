
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
        public static void task1 () {
            System.out.println("______Задача 1______");
            byte cenaLadu = 126;
            short cenaKia = 250;
            int cenaBmv = 33000;
            long cenaLambo = 65000L;
            float pereplataCredita = 1002.125698f;
            double denegNexvataet = 12.2698741236;

            System.out.println("Значение переменной cenaLadu с типом byte равно " + cenaLadu);
            System.out.println("Значение переменной cenaKia с типом short равно " + cenaKia);
            System.out.println("Значение переменной cenaBmw с типом int равно " + cenaBmv);
            System.out.println("Значение переменной cenaLambo с типом long равно " + cenaLambo);
            System.out.println("Значение переменной pereplataCredita с типом float равно " + pereplataCredita);
            System.out.println("Значение переменной denegNexvataet с типом double равно " + denegNexvataet);

        }
        public static void task2 () {
            System.out.println("______Задача 2______");
            float q = 27.12f;
            long w = 987678965549L;
            double e = 2.786;
            short r = 569;
            short t = -159;
            int y = 27897;
            byte u = 67;
            System.out.println(q);
            System.out.println(w);
            System.out.println(e);
            System.out.println(r);
            System.out.println(t);
            System.out.println(y);
            System.out.println(u);
        }
        public static void task3 () {
            System.out.println("______Задача 3______");
            byte klass1 = 23;
            byte klass2 = 27;
            byte klass3 = 30;
            //short allSchoolboy = (short) (klass1 + klass2 + klass3);
            short allPaper = 480;
            short paperForOneSchoolboy = (short) (allPaper / ( klass1+klass2+klass3));
            System.out.println("На каждого ученика расчитано " + paperForOneSchoolboy + " листов бумаги");
        }
        public static void task4 () {
            System.out.println("______Задача 4______");
            byte bottles2min = 16;   // 16 бутылок за 2 мин
            byte timeFirst = 2; // врямя на производства 16 бутылок
            byte bottlesForOneMin = (byte) (bottles2min / timeFirst); // кол-во бутылок в мин
            short bottlesFor20min = (short) (bottlesForOneMin * 20);
            System.out.println("За 20 минут машина произвела " + bottlesFor20min + " штук бутылок");
            short minInDay = 24*60; // минут в сутках
            short bottlesForOneDay = (short) (bottlesForOneMin * minInDay);
            System.out.println("За одни сутки машина произвела " + bottlesForOneDay + " штук бутылок");
            int bottlesFor3Day = bottlesForOneDay * 3;
            System.out.println("За трое суток машина произвела " + bottlesFor3Day + " штук бутылок");
            int bottlesForMonth = bottlesForOneDay * 30;
            System.out.println("За 1 месяц машина произвела " + bottlesForMonth + " штук бутылок");
            }
        public static void task5 () {
            System.out.println("______Задача 5______");
            byte vsegoKraski = 120;
            byte belayaKraska1klass = 2;
            byte korichnevayaKraska1klass = 4;
            byte vsegoKlassov = (byte) (vsegoKraski / (belayaKraska1klass + korichnevayaKraska1klass));//Всего классов в школе
            byte vsegoBeloyKrasky = (byte) (vsegoKlassov * belayaKraska1klass);
            byte vsegoKorichnevojKrasky = (byte) (vsegoKlassov * korichnevayaKraska1klass);
            System.out.println("В школе, где " + vsegoKlassov + " классов, нужно " + vsegoBeloyKrasky + " банок белой краски и " + vsegoKorichnevojKrasky + " банок коричневой краски.");
        }
        public static void task6 () {
            System.out.println("______Задача 6______");
            byte bannanaMass = 80;
            byte milkMass = 105;
            byte icecreamMass = 100;
            byte eggMass = 70;
            short receptOfChampion = (short) (bannanaMass * 5 + milkMass * 2 + icecreamMass * 2 + (eggMass * 4));
            float weightInKg = (bannanaMass*5 + milkMass*2 +icecreamMass*2 + eggMass*4)/1000f;
            System.out.println("Вес завтрака чемпиона в граммах равен " + receptOfChampion + " а в килограммах - " + weightInKg);
        }
        public static void task7 () {
            System.out.println("______Задача 7______");
            byte lishnieKg = 7;
            short racion1 = 250; // при похудении на 250 грамм
            short racion2 = 500; // при похудении на 500 грамм
            short po1raciony = (short) ((lishnieKg*1000)/racion1);
            short po2raciony = (short) ((lishnieKg*1000)/racion2);
            short sredneeZnachenie = (short) ((po1raciony+po2raciony)/2);
            System.out.println("Если спортсмен будет худеть по 250гр/день, он похудеет за " + po1raciony + " дней.");
            System.out.println("Если спортсмен будет худеть по 500гр/день, он похудеет за " + po2raciony + " дней.");
            System.out.println("В среднем спортсмен будет худеть похудеет за " + sredneeZnachenie + " дней.");
        }

            public static void task8 () {
            System.out.println("______Задача 8______");
            int mishaSalary = 67760;
            int denisSalary = 83690;
            int kristinaSalary = 76230;
            int increaseSalary = 10;
            //повышаем всем зарплату
            int mishaNewSal = (mishaSalary/increaseSalary + mishaSalary);
            int denisNewSal = (denisSalary/increaseSalary + denisSalary);
            int kristyNewSal = (kristinaSalary/increaseSalary + kristinaSalary);
            //выщитываем годовую разницу в зарплате
            int mishaDiffYear = (mishaNewSal%mishaSalary)*12;
            int denisDiffYear = (denisNewSal%denisSalary)*12;
            int kristyDiffYear = (kristyNewSal%kristinaSalary)*12;
            System.out.println("Миша теперь получает " + mishaNewSal + " рублей. Годовой доход вырос на " + mishaDiffYear + " рублей!");
            System.out.println("Денис теперь получает " + denisNewSal + " рублей. Годовой доход вырос на " + denisDiffYear + " рублей!");
            System.out.println("Кристина теперь получает " + kristyNewSal + " рублей. Годовой доход вырос на " + kristyDiffYear + " рублей!");
        }


    }





