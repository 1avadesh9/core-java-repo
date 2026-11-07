package com.itsajs.string;

public final class UPIPayment extends Payment
{
    @Override
    public void process() {
        super.process();
        System.out.println("Processing UPI payment securely via UPI PIN.");
    }
}
