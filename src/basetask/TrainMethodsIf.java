package basetask;

public class TrainMethodsIf {

    public int returnNewInt(int num) {
        if (num < 8) {
            return num * 7;
        } else {
            return num / 4;
        }
    }

    public long returnNewLong(long num) {
        if (num > 300) {
            return num - 300;
        } else {
            return num + 20;
        }
    }

    public String returnNewChar(char symbol) {
        if (symbol == 'g') {
            return "go";
        } else {
            return "o" + symbol;
        }
    }

    public float returnNewFloat(float num) {
        if (num == 0.67) {
            return num;
        } else {
            return num * 2;
        }
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
