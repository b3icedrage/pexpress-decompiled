package com.impl.core.backend.modelsResponse;

import com.api.core.backend.domain.models.responseModels.ChartEntryPointsHistoryResponseApi;
import com.impl.core.backend.abstractModels.WebSocketResponseAbstractImpl;
import defpackage.BF;
import defpackage.EF0;
import defpackage.InterfaceC2691aI1;
import defpackage.XE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/impl/core/backend/modelsResponse/CandlesHistoryResponseImpl;", "Lcom/api/core/backend/domain/models/responseModels/ChartEntryPointsHistoryResponseApi;", "Lcom/impl/core/backend/abstractModels/WebSocketResponseAbstractImpl;", "", "asset", "Ljava/lang/String;", "getAsset", "()Ljava/lang/String;", "", "timeframeSeconds", "I", "getTimeframeSeconds", "()I", "", "", "candles", "Ljava/util/List;", "getCandles", "()Ljava/util/List;", "Companion", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CandlesHistoryResponseImpl extends WebSocketResponseAbstractImpl implements ChartEntryPointsHistoryResponseApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String responseName = "updateHistoryNewFast";

    @NotNull
    private final String asset;

    @InterfaceC2691aI1("history")
    @NotNull
    private final List<List<Double>> candles;

    @InterfaceC2691aI1("period")
    private final int timeframeSeconds;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/impl/core/backend/modelsResponse/CandlesHistoryResponseImpl$Companion;", "", "<init>", "()V", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // defpackage.InterfaceC1247It1
    public final List<? extends BF> a() {
        List<List<Double>> list = this.candles;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            long jDoubleValue = (long) ((Number) list2.get(0)).doubleValue();
            float fDoubleValue = (float) ((Number) list2.get(1)).doubleValue();
            arrayList.add(new BF(jDoubleValue, jDoubleValue, fDoubleValue, fDoubleValue, fDoubleValue));
        }
        return arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandlesHistoryResponseImpl)) {
            return false;
        }
        CandlesHistoryResponseImpl candlesHistoryResponseImpl = (CandlesHistoryResponseImpl) obj;
        return Intrinsics.a(this.asset, candlesHistoryResponseImpl.asset) && this.timeframeSeconds == candlesHistoryResponseImpl.timeframeSeconds && Intrinsics.a(this.candles, candlesHistoryResponseImpl.candles);
    }

    public final int hashCode() {
        return this.candles.hashCode() + EF0.a(this.timeframeSeconds, this.asset.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "CandlesHistoryResponseImpl(asset=" + this.asset + ", timeframeSeconds=" + this.timeframeSeconds + ", candles=" + this.candles + ")";
    }
}
