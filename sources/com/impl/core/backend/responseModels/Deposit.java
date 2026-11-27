package com.impl.core.backend.responseModels;

import defpackage.C5491nL;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/impl/core/backend/responseModels/Deposit;", "", "", "amount", "D", R51.PUSH_ADDITIONAL_DATA_KEY, "()D", "", "serverTimeMs", "J", "b", "()J", "Lcom/impl/core/backend/responseModels/DepositStatus;", "status", "Lcom/impl/core/backend/responseModels/DepositStatus;", "c", "()Lcom/impl/core/backend/responseModels/DepositStatus;", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Deposit {
    private final double amount;
    private final long serverTimeMs;

    @NotNull
    private final DepositStatus status;

    public Deposit(double d, long j, @NotNull DepositStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.amount = d;
        this.serverTimeMs = j;
        this.status = status;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getServerTimeMs() {
        return this.serverTimeMs;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final DepositStatus getStatus() {
        return this.status;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Deposit)) {
            return false;
        }
        Deposit deposit = (Deposit) obj;
        return Double.compare(this.amount, deposit.amount) == 0 && this.serverTimeMs == deposit.serverTimeMs && this.status == deposit.status;
    }

    public final int hashCode() {
        return this.status.hashCode() + C5491nL.a(Double.hashCode(this.amount) * 31, 31, this.serverTimeMs);
    }

    @NotNull
    public final String toString() {
        return "Deposit(amount=" + this.amount + ", serverTimeMs=" + this.serverTimeMs + ", status=" + this.status + ")";
    }
}
