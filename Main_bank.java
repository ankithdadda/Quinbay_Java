class Bank {
    protected double baseCharge = 100;
    public double getBaseTransactionCharge() {
        return baseCharge;
    }
}

class ICICI extends Bank {
    private double icici = 1.25;
    public double calculateTransactionCharge() {
        return baseCharge * icici;
    }
}

class HDFC extends Bank {
    private double hdfc = 1.35;
    public double calculateTransactionCharge() {
        return baseCharge * hdfc;
    }
}

public class Main_bank {
    public static void main(String[] args) {
        ICICI iciciBank = new ICICI();
        HDFC hdfcBank = new HDFC();

        System.out.println("ICICI Transaction Charge: Rs. " + iciciBank.calculateTransactionCharge());
        System.out.println("HDFC Transaction Charge: Rs. " + hdfcBank.calculateTransactionCharge());
    }
}
