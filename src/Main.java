//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car_description descript1 = new Car_description();
        descript1.name = " Mersedes";
        descript1.color = " black";
        descript1.model = "c class";
        descript1.weigh = 2.5;


        Car_description descript2 = new Car_description();
        descript2.name = " hyundai";
        descript2.color = "grey";
        descript2.model = "elantra";
        descript2.weigh = 1.8;


        System.out.println("name" + " " + "-" + descript1.name);
        System.out.println("color" + " " + "-" + descript1.color);
        System.out.println("model" + " " + "-" + descript1.model);
        System.out.println("weigh" + " " + "-" + descript1.weigh);

        System.out.println();

        System.out.println("name" + " " + "-" + descript2.name);
        System.out.println("color" + " " + "-" + descript2.color);
        System.out.println("model" + " " + "-" + descript2.model);
        System.out.println("weigh" + " " + "-" + descript2.weigh);

        System.out.println();

        descript1.print_info();
        descript2.print_info();
    }
}