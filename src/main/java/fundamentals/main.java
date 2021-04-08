package fundamentals;

public class main {
    public static void main(String[] args) {
        System.out.println("hi gayi");
        short n1=10;
        short n2=20;
        byte n3= (byte) (n1+n2);
        System.out.println(n3);
        int x=1;
        int y=++x + x++;
        System.out.println(x+" "+y);
        int p=10;
        int q=5;
        boolean code=(p++>10)&&(--y==4);
        //short ckt if its checks one condetion its true it immediatly go to next step
        System.out.println(code+" "+p+" "+q);
        boolean code1=(p++>10)||(--y==4);
        System.out.println(code1+" "+p+" "+q);
    }
}
