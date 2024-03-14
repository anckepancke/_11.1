
import java.util.*;

class SkrivTal {

    public static void main(String [] arg) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[1000];
        int number = 0;
        while (sc.hasNextInt())
            list[number++] = sc.nextInt();

        System.out.println("du skrev:");

        for (int i=0; i<number; i++) {
            boolean funnen = false;
            for (int j=0; j<i && !funnen; j++)
                if (list[j] == list[i])
                    funnen = true;
            if (!funnen)
                System.out.print(list[i] + "  ");
        }
        System.out.flush();
    }
}
