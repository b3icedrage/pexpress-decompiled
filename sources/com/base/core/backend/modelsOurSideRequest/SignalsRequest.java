package com.base.core.backend.modelsOurSideRequest;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C1039Gc0;
import defpackage.C5491nL;
import defpackage.C5896pG;
import defpackage.SK;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/base/core/backend/modelsOurSideRequest/SignalsRequest;", "", "", "Lcom/base/core/backend/modelsOurSideRequest/SignalsRequest$SignalsAsset;", "assets", "Ljava/util/List;", "getAssets", "()Ljava/util/List;", "", "period", "J", "getPeriod", "()J", "", "numberOfAssets", "I", "getNumberOfAssets", "()I", "Companion", "SignalsAsset", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SignalsRequest {

    @NotNull
    private final List<SignalsAsset> assets;
    private final int numberOfAssets;
    private final long period;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/base/core/backend/modelsOurSideRequest/SignalsRequest$SignalsAsset;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "", "profit", "I", "getProfit", "()I", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SignalsAsset {

        @NotNull
        private final String id;

        @NotNull
        private final String name;
        private final int profit;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignalsAsset)) {
                return false;
            }
            SignalsAsset signalsAsset = (SignalsAsset) obj;
            return Intrinsics.a(this.id, signalsAsset.id) && Intrinsics.a(this.name, signalsAsset.name) && this.profit == signalsAsset.profit;
        }

        public final int hashCode() {
            return Integer.hashCode(this.profit) + C1039Gc0.b(this.id.hashCode() * 31, 31, this.name);
        }

        @NotNull
        public final String toString() {
            String str = this.id;
            String str2 = this.name;
            return SK.b(C5896pG.a("SignalsAsset(id=", str, ", name=", str2, ", profit="), this.profit, ")");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalsRequest)) {
            return false;
        }
        SignalsRequest signalsRequest = (SignalsRequest) obj;
        return Intrinsics.a(this.assets, signalsRequest.assets) && this.period == signalsRequest.period && this.numberOfAssets == signalsRequest.numberOfAssets;
    }

    public final int hashCode() {
        return Integer.hashCode(this.numberOfAssets) + C5491nL.a(this.assets.hashCode() * 31, 31, this.period);
    }

    @NotNull
    public final String toString() {
        return "SignalsRequest(assets=" + this.assets + ", period=" + this.period + ", numberOfAssets=" + this.numberOfAssets + ")";
    }
}
