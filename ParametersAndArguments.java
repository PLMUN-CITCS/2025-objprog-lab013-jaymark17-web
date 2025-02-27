public class AreaCalculator {
    public static void main(String[] args) {
        
        int length = 10;
        int width = 15;
        
        int area = calculateArea(length, width); // Calling method with arguments
        System.out.println("The calculated area is: " + area);
    }

    // Method to calculate area (using parameters)
    public static int calculateArea(int length, int width) {
        return length * width;
    }
}