package basetask;

public class TrainMethodsIf {

    public int returnNewInt(int num) {
        return num < 8 ? num * 7 : num / 4;
    }

    public long returnNewLong(long num) {
        return num > 300 ? num - 300 : num + 20;
    }

    public String returnNewChar(char symbol) {
        return symbol == 'g' ? "go" : "o" + symbol;

    }

    public float returnNewFloat(float num) {
        return num == 0.67 ? num : num * 2;
    }

    public double returnNewDouble(double num) {
        if (num > 30 && num < 80) {
            return num + 87;
        } else if (num > 80 && num < 400) {
            return num - 87;
        } else if (num > 400) {
            return num / 4;
        } else {
            return num;
        }
    }

    public void returnNewBoolean(boolean bool) {
        if (bool) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }

}
