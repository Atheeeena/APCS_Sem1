class fibonacci {
    public static void main(String args[]) {
        long sum = 0;
        long num1 = 0;
        long num2 = 1;
        long count = 1;
        while (count <= 100) {
            sum = num1 + num2;
            System.out.println("The " + count + " fibonacci number is " + sum);
            num1 = num2;
            num2 = sum;
            count++;
        }
    }
}