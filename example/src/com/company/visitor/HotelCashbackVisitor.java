package com.company.visitor;

import com.company.card.Mastercard_Creditcard;
import com.company.card.Visa_Creditcard;

public class HotelCashbackVisitor implements CashbackVisitor{
    @Override
    public void visit(Visa_Creditcard card) {
        System.out.println("You have successfully tried to calculate the Cashback for paying a hotel with some Visa card.");
    }

    @Override
    public void visit(Mastercard_Creditcard card) {
        System.out.println("You have successfully tried to calculate the Cashback for paying a hotel with some Mastercard.");
    }
}
