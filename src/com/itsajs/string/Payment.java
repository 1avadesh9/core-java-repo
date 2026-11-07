package com.itsajs.string;

public sealed class Payment permits UPIPayment, CardPayment
{
    public void process()
    {
        System.out.println("Processing generic payment...");
    }

    public static void main(String[] args)
    {
        System.out.println("--- Testing Sealed Classes ---");

        // Instantiate permitted subclasses
        Payment upi = new UPIPayment();
        Payment card = new CardPayment();

        // Call inherited methods
        upi.process();
        card.process();

        // Bonus: Pattern Matching (Commonly used with sealed classes)
        checkPaymentType(upi);
        checkPaymentType(card);
    }

    // Helper method demonstrating why sealed classes are useful (Exhaustive switching)
    private static void checkPaymentType(Payment payment)
    {
        switch (payment) {
            case UPIPayment u -> System.out.println("Handled with UPI Framework!");
            case CardPayment c -> System.out.println("Handled with Credit/Debit Card Gateway!");
            default -> System.out.println("Unknown payment type");
        }
    }
}
