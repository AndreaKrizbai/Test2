package day16;

public class Count1To10_2 {
    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 10){
            System.out.println(counter++);
        }

        counter = 0;
        while (counter < 10){
            System.out.println(++counter);
        }

        counter = 0;
        while(++counter <= 10){
            System.out.println(counter);
        }

        counter = 0;
        while(counter++ < 10){
            System.out.println(counter);
        }
    }
}
