package com.api.core.backend.domain.models.responseModels;

import defpackage.InterfaceC2691aI1;
import defpackage.LF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/Currency;", "", "", "id", "Ljava/lang/Integer;", "getId", "()Ljava/lang/Integer;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "symbol", "getSymbol", "recommendOptimalDepositValue", "getRecommendOptimalDepositValue", "recommendAggressiveDepositValue", "getRecommendAggressiveDepositValue", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Currency {

    @Nullable
    private final Integer id = 0;

    @Nullable
    private final String code = "";

    @Nullable
    private final String symbol = "-";

    @InterfaceC2691aI1("deposit_optimal")
    @Nullable
    private final Integer recommendOptimalDepositValue = 0;

    @InterfaceC2691aI1("deposit_aggressive")
    @Nullable
    private final Integer recommendAggressiveDepositValue = 0;

    @NotNull
    public final LF a() {
        Integer num = this.id;
        int iIntValue = num != null ? num.intValue() : 0;
        String str = this.code;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = this.symbol;
        if (str3 == null) {
            str3 = "-";
        }
        String str4 = str3;
        Integer num2 = this.recommendOptimalDepositValue;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = this.recommendAggressiveDepositValue;
        return new LF(iIntValue, iIntValue2, num3 != null ? num3.intValue() : 0, str2, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Currency)) {
            return false;
        }
        Currency currency = (Currency) obj;
        return Intrinsics.a(this.id, currency.id) && Intrinsics.a(this.code, currency.code) && Intrinsics.a(this.symbol, currency.symbol) && Intrinsics.a(this.recommendOptimalDepositValue, currency.recommendOptimalDepositValue) && Intrinsics.a(this.recommendAggressiveDepositValue, currency.recommendAggressiveDepositValue);
    }

    public final int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.code;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.recommendOptimalDepositValue;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.recommendAggressiveDepositValue;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Currency(id=" + this.id + ", code=" + this.code + ", symbol=" + this.symbol + ", recommendOptimalDepositValue=" + this.recommendOptimalDepositValue + ", recommendAggressiveDepositValue=" + this.recommendAggressiveDepositValue + ")";
    }
}
