public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println();

        System.out.println("Задание 2");
        String fullNameToUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —" + fullNameToUpperCase);

        System.out.println();

        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
       String replacedFullName = fullName.replace("ё", "е");

        System.out.println("Данные Ф. И. О. сотрудника —" + replacedFullName);


    }

}