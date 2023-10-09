package cycletask;

public class ForTask {

    public void returnOddNumber() {
        for (int i = 3; i <= 19; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }


}

