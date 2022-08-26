public class Main {
    public static void main(String[] args) {
        //Задание 1
        int f = 0;
        while (f < 10) {
            f = f+1;
            System.out.print(f + " ");
        }
        System.out.println();
        {
            for (int i = 10; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Задание 2
        for (int p = 3; p <= 31; p = p + 7){
            System.out.println("Сегодня пятница, " + p + "-е число. Необходимо подготовить отчет.");
        }
        //Задание 3
        int thisYear = 2022;
        for (int y=0; y <= thisYear +79; y = y + 79) {
            if (y > thisYear - 200)
                System.out.println(y);
        }

}
}