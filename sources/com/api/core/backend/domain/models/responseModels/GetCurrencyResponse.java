package com.api.core.backend.domain.models.responseModels;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C1039Gc0;
import defpackage.C5807oq;
import defpackage.InterfaceC1247It1;
import defpackage.KF;
import defpackage.LF;
import defpackage.XE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/GetCurrencyResponse;", "LIt1;", "LKF;", "", "Lcom/api/core/backend/domain/models/responseModels/GetCurrencyResponse$Currency;", "currencies", "Ljava/util/List;", "getCurrencies", "()Ljava/util/List;", "Currency", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetCurrencyResponse implements InterfaceC1247It1<KF> {

    @NotNull
    private final List<Currency> currencies;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/GetCurrencyResponse$Currency;", "", "", "id", "I", "getId", "()I", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "symbol", "getSymbol", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Currency {
        private final int id;

        @NotNull
        private final String name;

        @NotNull
        private final String symbol;

        public Currency() {
            Intrinsics.checkNotNullParameter("USD", AppMeasurementSdk.ConditionalUserProperty.NAME);
            Intrinsics.checkNotNullParameter("$", "symbol");
            this.id = 1;
            this.name = "USD";
            this.symbol = "$";
        }

        @NotNull
        public final LF a() {
            return new LF(this.id, 0, 0, this.name, this.symbol);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Currency)) {
                return false;
            }
            Currency currency = (Currency) obj;
            return this.id == currency.id && Intrinsics.a(this.name, currency.name) && Intrinsics.a(this.symbol, currency.symbol);
        }

        public final int hashCode() {
            return this.symbol.hashCode() + C1039Gc0.b(Integer.hashCode(this.id) * 31, 31, this.name);
        }

        @NotNull
        public final String toString() {
            int i = this.id;
            String str = this.name;
            String str2 = this.symbol;
            StringBuilder sb = new StringBuilder("Currency(id=");
            sb.append(i);
            sb.append(", name=");
            sb.append(str);
            sb.append(", symbol=");
            return C5807oq.b(sb, str2, ")");
        }
    }

    public GetCurrencyResponse(@NotNull List<Currency> currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.currencies = currencies;
    }

    @Override // defpackage.InterfaceC1247It1
    public final KF a() {
        List<Currency> list = this.currencies;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Currency) it.next()).a());
        }
        ArrayList currency = CollectionsKt.f0(arrayList);
        Intrinsics.checkNotNullParameter(currency, "currency");
        KF kf = new KF();
        kf.a = currency;
        return kf;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetCurrencyResponse) && Intrinsics.a(this.currencies, ((GetCurrencyResponse) obj).currencies);
    }

    public final int hashCode() {
        return this.currencies.hashCode();
    }

    @NotNull
    public final String toString() {
        return "GetCurrencyResponse(currencies=" + this.currencies + ")";
    }
}
