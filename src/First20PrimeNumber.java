

public class First20PrimeNumber {

    public static void main(String[] args) {
        System.out.println("First 20 Prime Number: ");
        int count = 0;
        int nextNumber = 2;
        while (count <= 20) {
            if (isPrime(nextNumber)) {
                if(count<20){
                    System.out.print(nextNumber+", ");
                }else {
                    System.out.print(nextNumber);
                }
                count++;
            }
            nextNumber++;
        }
    }

    private static boolean isPrime(int in) {
        if (in < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(in); i++) {
                if (in % i == 0) return false;
            }
            return true;
        }
    }


}
