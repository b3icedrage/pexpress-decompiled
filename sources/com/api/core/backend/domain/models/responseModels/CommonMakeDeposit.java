package com.api.core.backend.domain.models.responseModels;

import defpackage.C5807oq;
import defpackage.C5896pG;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CommonMakeDeposit;", "", "", "amount", "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "amountUSD", "b", "currency", "c", "", "currencyId", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "status", "e", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonMakeDeposit {

    @NotNull
    private final String amount;

    @Nullable
    private final String amountUSD;

    @Nullable
    private final String currency;

    @Nullable
    private final Integer currencyId;

    @NotNull
    private final String status;

    public CommonMakeDeposit(@NotNull String amount, @Nullable String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter("success", "status");
        this.amount = amount;
        this.amountUSD = null;
        this.currency = str;
        this.currencyId = null;
        this.status = "success";
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAmountUSD() {
        return this.amountUSD;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMakeDeposit)) {
            return false;
        }
        CommonMakeDeposit commonMakeDeposit = (CommonMakeDeposit) obj;
        return Intrinsics.a(this.amount, commonMakeDeposit.amount) && Intrinsics.a(this.amountUSD, commonMakeDeposit.amountUSD) && Intrinsics.a(this.currency, commonMakeDeposit.currency) && Intrinsics.a(this.currencyId, commonMakeDeposit.currencyId) && Intrinsics.a(this.status, commonMakeDeposit.status);
    }

    public final int hashCode() {
        int iHashCode = this.amount.hashCode() * 31;
        String str = this.amountUSD;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.currencyId;
        return this.status.hashCode() + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.amount;
        String str2 = this.amountUSD;
        String str3 = this.currency;
        Integer num = this.currencyId;
        String str4 = this.status;
        StringBuilder sbA = C5896pG.a("CommonMakeDeposit(amount=", str, ", amountUSD=", str2, ", currency=");
        sbA.append(str3);
        sbA.append(", currencyId=");
        sbA.append(num);
        sbA.append(", status=");
        return C5807oq.b(sbA, str4, ")");
    }
}
