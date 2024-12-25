package tasks.functions;

//Реализуйте метод, который из переданного шестнадцатиричного числа возвращает двоичное.
public class task1 {
    public static String hexToBin(String hexBase) {
        return Integer.toBinaryString(Integer.parseInt(hexBase,16));
    }
    public static void main(String[] args) {
        System.out.println("При вводе числа 17, метод должен вернуть 10111 - '" + task1.hexToBin("17") + "'");
    }
}

