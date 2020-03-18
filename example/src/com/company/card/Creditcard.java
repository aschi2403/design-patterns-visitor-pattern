package com.company.card;

import com.company.visitor.CashbackVisitor;

public interface Creditcard {
    void accept(CashbackVisitor visitor);
}
