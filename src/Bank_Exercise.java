public class Bank_Exercise {

}
class SBI extends Bank_Exercise {
    public float getRateOfInterest() {
        return 0.08f;
    }
}
class ICICI extends Bank_Exercise {
    public float getRateOfInterest() {
        return 0.07f;
    }
}

class AXIS extends Bank_Exercise {
    public float getRateOfInterest() {
        return 0.09f;
    }
}

class main {
    public static void main(String[] args) {
        SBI s = new SBI();
        System.out.println("Rate of Interest of SBI is: " + s.getRateOfInterest());
        ICICI i = new ICICI();
        System.out.println("Rate of Interest of ICICI is: " + i.getRateOfInterest());
        AXIS a = new AXIS();
        System.out.println("Rate of Interest of AXIS is: " + a.getRateOfInterest());
    }}

