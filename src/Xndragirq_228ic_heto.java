public class Xndragirq_228ic_heto {
    public static void main(String[] args) {

        int[] numbers = {1000, 2, -4, 10 , 11, 9};
        // 0  1    2   3


        // xndir 229
        int res229 = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] - i >= 0) {
                res229 = numbers[i] * res229;
            }

        }
        System.out.println(res229);

        System.out.println();


        //xndir  232

        int count232 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count232++;
            }

        }
        System.out.println("zuyg tveri  qanaak" + " " + count232);

        System.out.println();

        // xndir 233


        int sum = 0;
        int count233 = 0;
        int res233 = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count233 = count233 + numbers[i];
                res233 = res233 * numbers[i];
            }

        }
        System.out.println("zuygeri gumar" + " " + count233);
        System.out.println("zuygeri artadryal" + " " + res233);

        System.out.println();


        // xndir 234

        int sum234 = 0;
        int count234 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum234 = numbers[i] + sum234;
                count234 = count234 + 1;
            }

        }
        System.out.println(sum234 / count234);

        System.out.println();


       //  xndir 236

       int sum236 =1;
       int count236 =0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2!=0){
                count236++;
                sum236=numbers[i]*sum236;

            }

        }
        System.out.println("kenteri qanak"+" "+count236);
        System.out.println("artadryal  "+sum236);

        System.out.println();
        // xndir 237

        int count237 =0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==0){
                count237++;
            }

        }
        System.out.println(count237);



        // xndir 238

        int  count238=0;
        int sum238=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%3==0){
                count238++;
                sum238=sum238+numbers[i];
            }


        }
        System.out.println(sum238/count238);

        System.out.println();



        // xndir 240

      int  count240=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%7==0) {
                count240++;
            }
        }
        System.out.println(count240);
        System.out.println();


        // xndir 241
        int count241 = 0;
        int k1 = 27;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%k1==0){
                count241++;

            }

        }
        System.out.println(count241);
        System.out.println();


        // xndir 242

        int count242 = 0;
        int m = 27;
        for (int i = 0; i < numbers.length; i++) {
            if(m%numbers[i]==0){
                count242++;

            }

        }
        System.out.println(count242);
        System.out.println();


       //  xndir 243

        int count243 = 0;
        int k = 16;
        for (int i = 0; i < numbers.length; i++) {
            if(k%numbers[i]==0){
                count243++;

            }

        }
        System.out.println(count243);
        System.out.println();



        // xndir 244

        int sum244=1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%5==2){
                sum244=sum244*numbers[i];


            }

        }
        System.out.println(sum244);
        System.out.println();

       // xndir  251


        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>max) {
                max = numbers[i];
            }
        }

        System.out.println("mecaguyny  "+max);
    }
}
