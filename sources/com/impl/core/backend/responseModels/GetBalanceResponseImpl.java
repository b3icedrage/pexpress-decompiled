package com.impl.core.backend.responseModels;

import defpackage.C7573xF;
import defpackage.InterfaceC1247It1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/impl/core/backend/responseModels/GetBalanceResponseImpl;", "LIt1;", "LxF;", "", "balance", "D", "getBalance", "()D", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetBalanceResponseImpl implements InterfaceC1247It1<C7573xF> {
    private final double balance;

    @Override // defpackage.InterfaceC1247It1
    public final C7573xF a() {
        return new C7573xF(this.balance);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBalanceResponseImpl) && Double.compare(this.balance, ((GetBalanceResponseImpl) obj).balance) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.balance);
    }

    @NotNull
    public final String toString() {
        return "GetBalanceResponseImpl(balance=" + this.balance + ")";
    }
}
