package com.company.visitor;

import com.company.card.Mastercard_Creditcard;
import com.company.card.Visa_Creditcard;

public interface CashbackVisitor {
    void visit(Visa_Creditcard card);
    void visit(Mastercard_Creditcard card);
}
