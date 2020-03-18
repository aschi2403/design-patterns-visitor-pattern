package com.company;

import com.company.card.Creditcard;
import com.company.card.Visa_Creditcard;
import com.company.visitor.CashbackVisitor;
import com.company.visitor.HotelCashbackVisitor;

public class Main {

    public static void main(String[] args) {
        CashbackVisitor visitor = new HotelCashbackVisitor();
        Creditcard creditcard = new Visa_Creditcard();
        creditcard.accept(visitor);
    }
}
