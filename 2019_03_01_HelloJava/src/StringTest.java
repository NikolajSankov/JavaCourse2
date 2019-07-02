public class StringTest {
 
    public static void main(String[] args) {
         
        String str1="Hello";
        String str2="world";
        System.out.println(str1);
        System.out.println(str1+" "+str2);
         
        String str3=1+"1"+2+(2+3);
        System.out.println(str3);
         
        greetings("Vasya");
         
        String name1="Petya";
        greetings(name1);
         
        calculator(2, 3, "+");
        calculator(3.4, 5.8, "*");
 
    }
    public static void calculator(double a, double b, String oper) {
        switch(oper) {
        case "+":
            System.out.println(a+b);
            break;
        case "-":
            System.out.println(a-b);
            break;
        case "*":
            System.out.println(a*b);
            break;
        case "/":
            if(b!=0) {
                System.out.println(a/b);
                break;
            }
            System.out.println("Error: division by zero");
            break;
        default: 
            System.out.println("Error no such operation");
        }
    }
     
    public static void greetings(String name) {
        System.out.println("Hello dear, "+name);
    }
 
}