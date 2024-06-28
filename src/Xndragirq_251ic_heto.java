public class Xndragirq_251ic_heto {
    public static void main(String[] args) {

        int[] numbers = {1000, 2, -4, 10 , 11, 9};


        // xndir 251 - 254
        int result = 0;
        int sum253=0;
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]<min) {
                min = numbers[i];
            }if(numbers[i]>max){
                max=numbers[i];
            }
        }
        sum253=min+max;
        result=min*max;
        System.out.println("poqraguyn  "+min);
        System.out.println("mecaguyny  "+max);
        System.out.println("nranc gumary  "+sum253);
        System.out.println("nranc artadryaly  "+result );


        // xndir 254

        

    }
}
