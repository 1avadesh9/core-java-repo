package com.itsajs.string;

public final class CardPayment extends Payment
{
    @Override
    public void process() {
        super.process();
        System.out.println("Processing Card payment securely via Payment Gateway.");
    }
}
