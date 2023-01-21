package day5assignment;
public class PowerOf2 {public static void main(String[] args) {

    int N = Integer.parseInt(args[0]);
    double out = 0;
      if(N>=0 && N<31 ) {
          for (int i = 0; i <= N; i++) {
              out = Math.pow(2, i);
              System.out.println(out);

          }
      }
}

}
