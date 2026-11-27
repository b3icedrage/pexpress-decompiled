package com.base.core.backend.modelsResponse;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C1039Gc0;
import defpackage.C5896pG;
import defpackage.EF0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0013R\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonSignalInList;", "", "", "buySum", "I", "getBuySum", "()I", "sellSum", "getSellSum", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "icon", "getIcon", "setIcon", "(Ljava/lang/String;)V", "iconId", "Ljava/lang/Integer;", "getIconId", "()Ljava/lang/Integer;", "setIconId", "(Ljava/lang/Integer;)V", "percent", "getPercent", "setPercent", "", "best", "Z", "getBest", "()Z", "setBest", "(Z)V", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonSignalInList {
    private boolean best;
    private final int buySum;

    @NotNull
    private String icon;

    @Nullable
    private Integer iconId;

    @NotNull
    private final String id;

    @NotNull
    private final String name;

    @NotNull
    private String percent;
    private final int sellSum;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSignalInList)) {
            return false;
        }
        CommonSignalInList commonSignalInList = (CommonSignalInList) obj;
        return this.buySum == commonSignalInList.buySum && this.sellSum == commonSignalInList.sellSum && Intrinsics.a(this.id, commonSignalInList.id) && Intrinsics.a(this.name, commonSignalInList.name) && Intrinsics.a(this.icon, commonSignalInList.icon) && Intrinsics.a(this.iconId, commonSignalInList.iconId) && Intrinsics.a(this.percent, commonSignalInList.percent) && this.best == commonSignalInList.best;
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(EF0.a(this.sellSum, Integer.hashCode(this.buySum) * 31, 31), 31, this.id), 31, this.name), 31, this.icon);
        Integer num = this.iconId;
        return Boolean.hashCode(this.best) + C1039Gc0.b((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.percent);
    }

    @NotNull
    public final String toString() {
        int i = this.buySum;
        int i2 = this.sellSum;
        String str = this.id;
        String str2 = this.name;
        String str3 = this.icon;
        Integer num = this.iconId;
        String str4 = this.percent;
        boolean z = this.best;
        StringBuilder sb = new StringBuilder("CommonSignalInList(buySum=");
        sb.append(i);
        sb.append(", sellSum=");
        sb.append(i2);
        sb.append(", id=");
        C5896pG.b(sb, str, ", name=", str2, ", icon=");
        sb.append(str3);
        sb.append(", iconId=");
        sb.append(num);
        sb.append(", percent=");
        sb.append(str4);
        sb.append(", best=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
