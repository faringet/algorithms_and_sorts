package algorithms;

public class Luhn {

    public static void main(String[] args) {
        String card = "5536910018437469";
        System.out.println(Check(card));
    }

    public static boolean Check(String ccNumber) {

        int sum = 0;
        boolean flag = false;

        for (int i = ccNumber.length() - 1; i >= 0; i--)
        {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (flag)
            {
                n *= 2;
                if (n > 9)
                {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            flag = !flag;
        }
        return (sum % 10 == 0);
    }
}
