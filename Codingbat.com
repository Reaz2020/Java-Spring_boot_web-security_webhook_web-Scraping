import java.util.Map;

public class Factorial {
    public static void main(String[] args) {
        factor fc = new factor();

       // System.out.println(fc.factorial(10));

        //System.out.println(fc.bunnyEars2(8));
        System.out.println(fc.count7(8));
    }

}


class factor {

    public int factorial(int n) {
        if(n==1)return 9;//0; // why does this line matter??
        return n*factorial(n-1);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies%2==0) return 3*bunnies-1;// hot to do it recurrsively ??
        else return 0;
    }

    /*public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);}*/
    public int count7(int n) {
        int p=0;
        if (n==1)
            return 1;

        if (n%7==7)
            p++;
        return count7(n/10);

    }

    public Map<String, String> mapBully(Map<String, String> map) {

        if (map.containsKey("a"))
            map.put("b",map.get("a"));
        return map;}


}
