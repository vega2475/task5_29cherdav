import java.util.Scanner;
public class Main {

    private static int enterHeight() {
        System.out.print("Введите высоту: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    private static void drawSticks(int weidth, int height){
        System.out.print(" ");

        for(int r = 0; r <= height; r++) {

            for (int c = 0; c <= weidth; c++) {
                int i = 0;
                int k = 0;
                //boolean chechForEncrement = ((r > 0 && c > 0) && (r < height  && c < weidth )) && (((weidth - k) - i == c) && (r == i));

                i++;

                k++;
                if ((r == 0 && c == 0) || (r == 0 && c == weidth - 1) || (r == weidth - 1 && c == 0) || (r == weidth - 1 && c == weidth - 1) || (r == (weidth - 1) / 2 && c == (weidth - 1) / 2)) {
                    System.out.print("*");}
                else if( r == 0 && (c > 0 && c < weidth - 1)) System.out.print(" ");
                else if(c == 0 && (r > 0 && r < weidth - 1)) System.out.print("|");
                else if(r == height - 1 && (c > 0 && c < weidth - 1)) System.out.print(" ");
                else if(c == weidth - 1 && (r > 0 && r < weidth - 1)) System.out.print("|");
                else if(  (r == c) && c!=weidth - 1 && r!=height - 1  ) System.out.print("\\");
                else if (   ((r > 0 && c > 0) && (r < height  && c < weidth )) && (((weidth - k) - 1 == c) && (r == i))  )System.out.print("/");//нужно сделать так  чтобы когда эта была тру i и k увеличивались на 1, чем больше К тем больше пробелов от левой стороны у /
                else System.out.print(" ");
                if(c == weidth - 1) System.out.println();







            }
        }





    }


    public static void main(String[] args) {

        int height = enterHeight();
        int weidth = height;
        drawSticks(weidth, height);





    }
}