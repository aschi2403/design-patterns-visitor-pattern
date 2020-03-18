package com.company.card;

import com.company.visitor.CashbackVisitor;

public class Visa_Creditcard implements Creditcard {
    @Override
    public void accept(CashbackVisitor visitor) {
        visitor.visit(this);
    }
}
