import java.util.Scanner;

class BMI
{
    private double weight, height;

    public BMI(double weight, double height)
    {
        this.weight = weight * 0.45359237;
        this.height = height * 0.0254;
    }

    public double getBMI()
    {
        return this.weight / Math.pow(this.height, 2);
    }

    public String table()
    {
        String status;

        if (this.getBMI() < 18.5)
        {
            status = "Underweight";
        }
        else if (18.5 < this.getBMI() && this.getBMI() < 25.0)
        {
            status = "Normal";
        }
        else if (25.0 < this.getBMI() && this.getBMI() < 30.0)
        {
            status = "Overweight";
        }
        else
        {
            status = "Obese";
        }

        return status;
    }
}

public class Question1
{
    public static void main(String[] args)
    {
        System.out.print("BMI Calculator");

        Scanner input = new Scanner(System.in);

        System.out.print("\nWeight in Pound(s): ");
        double weight = input.nextDouble();

        System.out.print("Height in Inches: ");
        double height = input.nextDouble();

        BMI bmi = new BMI(weight, height);

        System.out.print("BMI is " + String.format("%.2f", bmi.getBMI()));
        System.out.print("\nBody status: " + bmi.table());
    }
}
