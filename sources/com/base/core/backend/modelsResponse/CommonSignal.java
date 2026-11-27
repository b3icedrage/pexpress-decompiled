package com.base.core.backend.modelsResponse;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C1039Gc0;
import defpackage.C5896pG;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonSignal;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "setName", "trend", "getTrend", "setTrend", "", "Lcom/base/core/backend/modelsResponse/CommonSignalInList;", "list", "Ljava/util/List;", "getList", "()Ljava/util/List;", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonSignal {

    @NotNull
    private String id;

    @NotNull
    private final List<CommonSignalInList> list;

    @NotNull
    private String name;

    @NotNull
    private String trend;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSignal)) {
            return false;
        }
        CommonSignal commonSignal = (CommonSignal) obj;
        return Intrinsics.a(this.id, commonSignal.id) && Intrinsics.a(this.name, commonSignal.name) && Intrinsics.a(this.trend, commonSignal.trend) && Intrinsics.a(this.list, commonSignal.list);
    }

    public final int hashCode() {
        return this.list.hashCode() + C1039Gc0.b(C1039Gc0.b(this.id.hashCode() * 31, 31, this.name), 31, this.trend);
    }

    @NotNull
    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.trend;
        List<CommonSignalInList> list = this.list;
        StringBuilder sbA = C5896pG.a("CommonSignal(id=", str, ", name=", str2, ", trend=");
        sbA.append(str3);
        sbA.append(", list=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }
}
