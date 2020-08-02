import java.util.Scanner;

public class Calculator {

    public static void main (String args []) {

        Scanner in = new Scanner(System.in);
        System. out. println ("Введите одно из перечисленых значений: add, minus, mult, div.");
        String operation = in.nextLine();
        // Сообщение об ошибке, если неправильно ввели операцию,
        // цикл прелагающий вводить операцию, пока она не будет правильная
        if (!operation.equals("add")& !operation.equals("minus")& !operation.equals("mult")& !operation.equals("div")) {
            while (!operation.equals("add") & !operation.equals("minus") & !operation.equals("mult") & !operation.equals("div")) {
                System.out.println("Введено некректное значение. Введите одно из перечисленых значений: add, minus, mult, div.");
                operation = in.nextLine();
            }
        }
        System. out. println ("Введите первый аргумент:");
        double arg1 = in.nextDouble();
        System. out. println ("Введите второй аргумент:");
        double arg2 = in.nextDouble();
        double result = Count(arg1, arg2, operation);   //вызов метода подсчета
        System. out. println ("Результат: " + result );
        operation=Rename(operation);                    //вызов метода переименования
        System. out. println ( arg1 + " " + operation + " " + arg2 + " = " + result );
    }

    public static double Count (double arg1, double arg2, String operation){ //Подсчет функций
        double  res=0;
        if (operation.equals("add")){
            res=arg1+arg2;
        }
        else if (operation .equals("minus")){
            res=arg1-arg2;
        }
        else if (operation.equals("mult")){
            res=arg1*arg2;
        }
        else if (operation.equals("div")){
            res=arg1/arg2;
        }
        return res;
    }

    public static String Rename(String operation){ // Переименование переменной operation
        if (operation.equals("add")){               // для коректнго отображения результата (ex."add"="+")
            operation="+";
        }
        else if (operation.equals("minus")){
            operation="-";
        }
        else if (operation.equals("mult")){
            operation="*";
        }
        else if (operation.equals("div")){
            operation="/";
        }
        return operation;
    }

}
