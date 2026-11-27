package com.api.core.backend.domain.models.requestModels;

import defpackage.C1039Gc0;
import defpackage.C5807oq;
import defpackage.C5896pG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/IndicatorDirectionRequest;", "", "", "asset", "Ljava/lang/String;", "getAsset", "()Ljava/lang/String;", "timeframe", "getTimeframe", "type", "getType", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IndicatorDirectionRequest {

    @NotNull
    private final String asset;

    @NotNull
    private final String timeframe;

    @NotNull
    private final String type;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorDirectionRequest)) {
            return false;
        }
        IndicatorDirectionRequest indicatorDirectionRequest = (IndicatorDirectionRequest) obj;
        return Intrinsics.a(this.asset, indicatorDirectionRequest.asset) && Intrinsics.a(this.timeframe, indicatorDirectionRequest.timeframe) && Intrinsics.a(this.type, indicatorDirectionRequest.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + C1039Gc0.b(this.asset.hashCode() * 31, 31, this.timeframe);
    }

    @NotNull
    public final String toString() {
        String str = this.asset;
        String str2 = this.timeframe;
        return C5807oq.b(C5896pG.a("IndicatorDirectionRequest(asset=", str, ", timeframe=", str2, ", type="), this.type, ")");
    }
}
