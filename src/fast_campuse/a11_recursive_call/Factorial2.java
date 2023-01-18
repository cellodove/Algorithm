package fast_campuse.a11_recursive_call;

public class Factorial2 {

    public Integer unFactorial(Integer number){
        if (number<=1){
            return 1;
        }else {
            return number * this.unFactorial(number - 1);
        }
    }

    public static void main(String[] args) {
        Factorial2 factorial2 = new Factorial2();
        System.out.println(factorial2.unFactorial(31));
    }
}
