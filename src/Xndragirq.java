public class Xndragirq {
    public static void main(String[] args) {


        int[] numbers = {-2, 2, -4, 10};
                       // 0 1    2     3
        double sum211 = 0;
        int count211 = 0;
        int res = 1;


        // xndir 211

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum211 = numbers[i] + sum211;
                count211 = count211 + 1;
            }

        }
        System.out.println(sum211 / count211);

        System.out.println();


        // xndir 214
        int count214 = 0;
        double sum214 = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sum214 = numbers[i] + sum214;
                count214 = count214 + 1;
            }

        }
        System.out.println(sum214 / count214);

        System.out.println();


        // xndir 215


        double sum215 = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum215 = numbers[i] + sum215;

            }
        }
        System.out.println(sum215);


        System.out.println();


        // xndir 216

        int count216 = 0;
        double sum216 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum216 = numbers[i] * res;
            }
        }
        System.out.println(sum216);

        System.out.println();
        // xndir 219


        int K = 2;
        int count219= 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%K==0){
                count219++;


            }

        }
        System.out.println(count219);

        System.out.println();

        // xndir 220

        int count220 = 0;
        int sum220 = 0 ;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                count220++;

            }
        }
        System.out.println("drakan tver" + " " + "-" + count220);

        for (int i = 0; i < numbers.length; i++) {


            if(numbers[i]<0){
                sum220++;

            }
    }
        System.out.println("bacasakan tver"+"  "+"-"+sum220);

        System.out.println();

        // xndir 228

        int k = 2;
        int count228 = 0 ;
        int sum228 = 0 ;

        for (int i = 0; i < numbers.length; i++) {
            if(i%k==0){
                sum228=sum228 + numbers[i];
            }

        }

        System.out.println(sum228);



        }
    }


