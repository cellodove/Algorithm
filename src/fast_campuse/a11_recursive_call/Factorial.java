package fast_campuse.a11_recursive_call;

public class Factorial {

    public Integer unFactorial(Integer number){
        if (number>1){
            return number * this.unFactorial(number - 1);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.unFactorial(31));
    }
}
