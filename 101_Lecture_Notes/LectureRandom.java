/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        System.out.println(Math.random() * 5);
        System.out.println(Math.random() * 20 + 15);
        System.out.println(Math.random() * (15235-5234) + 5234);
        int low = (int)(Math.random() * (80-30) + 30);
        int high = (int)(Math.random() * (140-90) + 90);
        int x = (int)(Math.random() * (high - low) + low);
        System.out.print(x);
	}
}
