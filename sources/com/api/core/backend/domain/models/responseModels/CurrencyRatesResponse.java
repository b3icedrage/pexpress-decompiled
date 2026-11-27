package com.api.core.backend.domain.models.responseModels;

import defpackage.InterfaceC2691aI1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R*\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CurrencyRatesResponse;", "", "", "", "", "rates", "Ljava/util/Map;", "getRates", "()Ljava/util/Map;", "ratesBeauty", "getRatesBeauty", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CurrencyRatesResponse {

    @InterfaceC2691aI1("rates")
    @Nullable
    private final Map<String, Double> rates = null;

    @InterfaceC2691aI1("rates_beauty")
    @Nullable
    private final Map<String, Double> ratesBeauty = null;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrencyRatesResponse)) {
            return false;
        }
        CurrencyRatesResponse currencyRatesResponse = (CurrencyRatesResponse) obj;
        return Intrinsics.a(this.rates, currencyRatesResponse.rates) && Intrinsics.a(this.ratesBeauty, currencyRatesResponse.ratesBeauty);
    }

    public final int hashCode() {
        Map<String, Double> map = this.rates;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Double> map2 = this.ratesBeauty;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CurrencyRatesResponse(rates=" + this.rates + ", ratesBeauty=" + this.ratesBeauty + ")";
    }
}
