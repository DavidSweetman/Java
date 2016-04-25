import java.util.Scanner;
public class NumeralConvert{
	
     public static void main(String []args){
        String Roman = "";
        
        Scanner scan = new Scanner(System.in);
        int Num;
        System.out.print("Enter your Number: ");
        Num = scan.nextInt();
        while (Num != 0) {
            if (Num >= 1000) {
                Roman += "M";
                Num -= 1000;}
            else if (Num >= 900){
                Roman += "CM";
                Num -= 900;}
            else if (Num >= 500){
                Roman += "D";
                Num -= 500;}
            else if (Num >= 400){
                Roman += "CD";
                Num -= 400;}            
            else if (Num >= 100){
                Roman += "C";
                Num -= 100;}         
            else if (Num >= 90){
                Roman += "XC";
                Num -= 90;}         
            else if (Num >= 50){
                Roman += "L";
                Num -= 50;}
            else if (Num >= 40){
                Roman += "XL";
                Num -= 40;}                
            else if (Num >= 10){
                Roman += "X";
                Num -= 10;}
            else if (Num >= 9){
                Roman += "IX";
                Num -= 9;}
            else if (Num >= 5){
                Roman += "V";
                Num -= 5;}
            else if (Num >= 4){
                Roman += "IV";
                Num -= 4;}
            else if (Num >= 1){
                Roman += "I";
                Num -= 1;}                  
                
        }
     System.out.println("The number in roman numerals is " + Roman);
                
    }
}
