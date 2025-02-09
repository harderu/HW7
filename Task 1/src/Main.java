import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        int toadEyesCount = 0;          //Жабьи глаза
//        int ghoulTearsCount = 0;        //Слезы вурдалака
//        int ravenBonesCount = 0;        //Кости ворона
//        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        System.out.println("***Введите количество ингредиентов от 0 до 20 чтобы создать эликсир!!!***");
        Scanner sc = new Scanner(System.in);

        // Ввод количества ингредиентов от пользователя
        System.out.print("Введите количество Жабьих глаз: ");
        int toadEyesCount = sc.nextInt();

        System.out.print("Введите количество Слез вурдалака: ");
        int ghoulTearsCount = sc.nextInt();

        System.out.print("Введите количество Костей ворона: ");
        int ravenBonesCount = sc.nextInt();

        System.out.print("Введите количество Пельменей: ");
        int dumplingsCount = sc.nextInt();

        boolean zork = toadEyesCount >= 3 && ravenBonesCount >= 1;
        boolean stoy = ravenBonesCount >= 2 && dumplingsCount >= 4;
        boolean skrit = ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2;
        boolean zapret = ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3;


        if (zork) {
            System.out.println("Эликсир зоркости");
        }
        if (stoy) {
            System.out.println("Эликсир стойкости");
        }
        if (skrit) {
            System.out.println("Эликсир скрытности");
        }
        if (zapret) {
            System.out.println("Запретный Эликсир!!!!!!!!!!!!!!");
        } else {

            System.out.println("Вы не можете создать эликсир(");

        }

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона == Эликсир зоркости == zorc
        // 2. 2 кости ворона + 4 пельменя == Эликсир стойкости == stoy
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза == Эликсир скрытности == skrit
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона == Запретный эликсир == zapret


    }
}


//2. В первом задании вам будет нужно создать программу,
// в которой пользователь примет участие в составлении волшебных эликсиров.
// Суть программы в следующем:
// Есть рецепты эликсиров, есть ингредиенты, количество которых вводит пользователь.
// Нужно показать пользователю, какие эликсиры с введенным кол-вом ингредиентов он сможет изготовить.
// Если пользователю не хватает ингредиентов ни на один эликсир, то необходимо как то об этом сообщить.