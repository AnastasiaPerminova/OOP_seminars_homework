

import java.util.Scanner;

public class View<N> {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public int getMenu(String title){
        System.out.printf("%s", title);
        return in.nextInt();
}

    // print(f'{title} = {data}')
    public void print(Object data, String title) {
        System.out.printf(" " +  title + data + "\n");
    }
}