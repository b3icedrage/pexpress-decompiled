package com.base.core.backend.modelsOurSideResponse;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C1039Gc0;
import defpackage.C5653o60;
import defpackage.C5807oq;
import defpackage.C5896pG;
import defpackage.EF0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u000f\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/base/core/backend/modelsOurSideResponse/SignalResponse;", "", "Lcom/base/core/backend/modelsOurSideResponse/SignalResponse$Data;", "data", "Lcom/base/core/backend/modelsOurSideResponse/SignalResponse$Data;", "getData", "()Lcom/base/core/backend/modelsOurSideResponse/SignalResponse$Data;", "", "Lcom/base/core/backend/modelsOurSideResponse/SignalResponse$CurrentSignal;", "pairsList", "Ljava/util/List;", "getPairsList", "()Ljava/util/List;", "setPairsList", "(Ljava/util/List;)V", "Data", "CurrentSignal", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SignalResponse {

    @NotNull
    private final Data data;

    @Nullable
    private List<CurrentSignal> pairsList;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/base/core/backend/modelsOurSideResponse/SignalResponse$CurrentSignal;", "", "", "buySum", "I", "getBuySum", "()I", "sellSum", "getSellSum", "", "trend", "Ljava/lang/String;", "getTrend", "()Ljava/lang/String;", "id", "getId", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CurrentSignal {
        private final int buySum;

        @NotNull
        private final String id;

        @NotNull
        private final String name;
        private final int sellSum;

        @NotNull
        private final String trend;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurrentSignal)) {
                return false;
            }
            CurrentSignal currentSignal = (CurrentSignal) obj;
            return this.buySum == currentSignal.buySum && this.sellSum == currentSignal.sellSum && Intrinsics.a(this.trend, currentSignal.trend) && Intrinsics.a(this.id, currentSignal.id) && Intrinsics.a(this.name, currentSignal.name);
        }

        public final int hashCode() {
            return this.name.hashCode() + C1039Gc0.b(C1039Gc0.b(EF0.a(this.sellSum, Integer.hashCode(this.buySum) * 31, 31), 31, this.trend), 31, this.id);
        }

        @NotNull
        public final String toString() {
            int i = this.buySum;
            int i2 = this.sellSum;
            String str = this.trend;
            String str2 = this.id;
            String str3 = this.name;
            StringBuilder sb = new StringBuilder("CurrentSignal(buySum=");
            sb.append(i);
            sb.append(", sellSum=");
            sb.append(i2);
            sb.append(", trend=");
            C5896pG.b(sb, str, ", id=", str2, ", name=");
            return C5807oq.b(sb, str3, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/base/core/backend/modelsOurSideResponse/SignalResponse$Data;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "setName", "trend", "getTrend", "setTrend", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {

        @NotNull
        private String id;

        @NotNull
        private String name;

        @NotNull
        private String trend;

        public Data() {
            this(0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.a(this.id, data.id) && Intrinsics.a(this.name, data.name) && Intrinsics.a(this.trend, data.trend);
        }

        public final int hashCode() {
            return this.trend.hashCode() + C1039Gc0.b(this.id.hashCode() * 31, 31, this.name);
        }

        @NotNull
        public final String toString() {
            String str = this.id;
            String str2 = this.name;
            return C5807oq.b(C5896pG.a("Data(id=", str, ", name=", str2, ", trend="), this.trend, ")");
        }

        public Data(int i) {
            Intrinsics.checkNotNullParameter("", "id");
            Intrinsics.checkNotNullParameter("", AppMeasurementSdk.ConditionalUserProperty.NAME);
            Intrinsics.checkNotNullParameter("", "trend");
            this.id = "";
            this.name = "";
            this.trend = "";
        }
    }

    public SignalResponse() {
        Data data = new Data(0);
        C5653o60 c5653o60 = C5653o60.d;
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.pairsList = c5653o60;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalResponse)) {
            return false;
        }
        SignalResponse signalResponse = (SignalResponse) obj;
        return Intrinsics.a(this.data, signalResponse.data) && Intrinsics.a(this.pairsList, signalResponse.pairsList);
    }

    public final int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        List<CurrentSignal> list = this.pairsList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public final String toString() {
        return "SignalResponse(data=" + this.data + ", pairsList=" + this.pairsList + ")";
    }
}
