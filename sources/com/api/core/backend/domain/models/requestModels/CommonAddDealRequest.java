package com.api.core.backend.domain.models.requestModels;

import defpackage.C5807oq;
import defpackage.EF0;
import defpackage.ID;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/CommonAddDealRequest;", "", "", "userId", "J", "e", "()J", "setUserId", "(J)V", "", "profit", "D", "c", "()D", "setProfit", "(D)V", "", "startAmount", "I", "d", "()I", "setStartAmount", "(I)V", "balance", R51.PUSH_ADDITIONAL_DATA_KEY, "setBalance", "", "currency", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonAddDealRequest {
    private double balance;

    @NotNull
    private String currency;
    private double profit;
    private int startAmount;
    private long userId;

    public CommonAddDealRequest(long j, double d, int i, double d2, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.userId = j;
        this.profit = d;
        this.startAmount = i;
        this.balance = d2;
        this.currency = currency;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getBalance() {
        return this.balance;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getProfit() {
        return this.profit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getStartAmount() {
        return this.startAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAddDealRequest)) {
            return false;
        }
        CommonAddDealRequest commonAddDealRequest = (CommonAddDealRequest) obj;
        return this.userId == commonAddDealRequest.userId && Double.compare(this.profit, commonAddDealRequest.profit) == 0 && this.startAmount == commonAddDealRequest.startAmount && Double.compare(this.balance, commonAddDealRequest.balance) == 0 && Intrinsics.a(this.currency, commonAddDealRequest.currency);
    }

    public final int hashCode() {
        return this.currency.hashCode() + ID.a(this.balance, EF0.a(this.startAmount, ID.a(this.profit, Long.hashCode(this.userId) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        long j = this.userId;
        double d = this.profit;
        int i = this.startAmount;
        double d2 = this.balance;
        String str = this.currency;
        StringBuilder sb = new StringBuilder("CommonAddDealRequest(userId=");
        sb.append(j);
        sb.append(", profit=");
        sb.append(d);
        sb.append(", startAmount=");
        sb.append(i);
        sb.append(", balance=");
        sb.append(d2);
        sb.append(", currency=");
        return C5807oq.b(sb, str, ")");
    }
}
