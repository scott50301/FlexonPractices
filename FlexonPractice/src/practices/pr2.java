package practices;

public class pr2 {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 80;
        double num3 = (num1 + num2) * 80;
        System.out.println(num3);
        double remain = num3 % 40;
        if (remain <= 20){
            System.out.println("Total was over the limit");
        }
    }
}

