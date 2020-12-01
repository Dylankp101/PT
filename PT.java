import java.lang.Math;

public class PT {
        public static void main(String[] args){
            PT iD = new PT();
            double answer = iD.calculateHypotenuse(96,78);
            System.out.println(answer);
        }
    
    public double calculateHypotenuse(int legA, int legB) {
        int angleA = legA * legA;
        int angleB = legB * legB;
        int c = angleA + angleB;
        return (Math.sqrt(c));
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
    }
}