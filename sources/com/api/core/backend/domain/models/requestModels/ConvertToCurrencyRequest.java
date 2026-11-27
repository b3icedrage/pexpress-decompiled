package com.api.core.backend.domain.models.requestModels;

import defpackage.InterfaceC2691aI1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/ConvertToCurrencyRequest;", "", "", "", "currencyCodes", "Ljava/util/List;", "getCurrencyCodes", "()Ljava/util/List;", "", "amount", "I", "getAmount", "()I", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConvertToCurrencyRequest {
    private final int amount;

    @InterfaceC2691aI1("currencies")
    @NotNull
    private final List<String> currencyCodes;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertToCurrencyRequest)) {
            return false;
        }
        ConvertToCurrencyRequest convertToCurrencyRequest = (ConvertToCurrencyRequest) obj;
        return Intrinsics.a(this.currencyCodes, convertToCurrencyRequest.currencyCodes) && this.amount == convertToCurrencyRequest.amount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.amount) + (this.currencyCodes.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ConvertToCurrencyRequest(currencyCodes=" + this.currencyCodes + ", amount=" + this.amount + ")";
    }
}
