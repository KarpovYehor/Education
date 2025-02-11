Итеративный и рекурсивный подход
Итеративный подход - это наш обычный цикл (закончится в любом случае)

Рекурсивный подход - это процесс когда функция(метод) вызывает сама себя
1) Рекуррентный случай - то действие когда мы вызываем рекурсию
2) Базовый случай - то действие когда нужно перестать вызывать рекурсию


    public static void printDigit(int n){
        // base case
        if (n == 6){
            return;
        }
        //recurrent case
        System.out.println(n);
        printDigit(n + 1);
    }

{  // n = 5








}

    public static void printDigitRevers(int n){
        // base case
        if (n == 0){
            return;
        }
        //recurrent case
        System.out.println(n);
        printDigitRevers(n - 1);
    }

    public static void printDigitReversTwo(int n){
        // base case
        if (n == 0){
            return;
        }
        //recurrent case
        printDigitReversTwo(n - 1);
        System.out.println(n);
    }