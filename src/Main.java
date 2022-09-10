import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("e posta:");
        String eposta = s.next();

        char[] ch=eposta.toCharArray();

        for(int i=0;i<ch.length;i++){
            if (ch[i] == '@'){
                System.out.println("E posta gecersiz.......");
                break;}

                if(ch[i]!='@'){
                for (int j=0; j<i; j++){
                    if (j==i){
                        System.out.println("E posta gecersiz");
                        break;
                    }
                    else {
                        System.out.println("E posta gecerli");
                        break;
                    }

                    }
                }
            }

    }
}
