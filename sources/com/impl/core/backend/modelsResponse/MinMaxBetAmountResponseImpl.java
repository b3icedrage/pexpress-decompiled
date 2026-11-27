package com.impl.core.backend.modelsResponse;

import com.api.core.backend.domain.models.responseModels.CommonMinMaxBet;
import com.impl.core.backend.abstractModels.WebSocketResponseAbstractImpl;
import defpackage.InterfaceC1247It1;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/impl/core/backend/modelsResponse/MinMaxBetAmountResponseImpl;", "Lcom/impl/core/backend/abstractModels/WebSocketResponseAbstractImpl;", "LIt1;", "Lcom/api/core/backend/domain/models/responseModels/CommonMinMaxBet;", "", "min", "D", "getMin", "()D", "max", "getMax", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MinMaxBetAmountResponseImpl extends WebSocketResponseAbstractImpl implements InterfaceC1247It1<CommonMinMaxBet> {

    @InterfaceC2691aI1("minBetAmount")
    private final double min = 1.0d;

    @InterfaceC2691aI1("maxBetAmount")
    private final double max = 20000.0d;

    @Override // defpackage.InterfaceC1247It1
    public final CommonMinMaxBet a() {
        return new CommonMinMaxBet(this.min, this.max);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinMaxBetAmountResponseImpl)) {
            return false;
        }
        MinMaxBetAmountResponseImpl minMaxBetAmountResponseImpl = (MinMaxBetAmountResponseImpl) obj;
        return Double.compare(this.min, minMaxBetAmountResponseImpl.min) == 0 && Double.compare(this.max, minMaxBetAmountResponseImpl.max) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.max) + (Double.hashCode(this.min) * 31);
    }

    @NotNull
    public final String toString() {
        return "MinMaxBetAmountResponseImpl(min=" + this.min + ", max=" + this.max + ")";
    }
}
