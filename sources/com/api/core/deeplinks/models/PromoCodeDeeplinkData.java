package com.api.core.deeplinks.models;

import defpackage.C1039Gc0;
import defpackage.C1575Mz0;
import defpackage.C5491nL;
import defpackage.C5896pG;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/api/core/deeplinks/models/PromoCodeDeeplinkData;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "code", "getCode", "", "timeSeconds", "J", "getTimeSeconds", "()J", "percent", "getPercent", "Core_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PromoCodeDeeplinkData {

    @NotNull
    private final String code;

    @NotNull
    private final String id;

    @NotNull
    private final String percent;

    @InterfaceC2691aI1(C1575Mz0.TIME)
    private final long timeSeconds;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeDeeplinkData)) {
            return false;
        }
        PromoCodeDeeplinkData promoCodeDeeplinkData = (PromoCodeDeeplinkData) obj;
        return Intrinsics.a(this.id, promoCodeDeeplinkData.id) && Intrinsics.a(this.code, promoCodeDeeplinkData.code) && this.timeSeconds == promoCodeDeeplinkData.timeSeconds && Intrinsics.a(this.percent, promoCodeDeeplinkData.percent);
    }

    public final int hashCode() {
        return this.percent.hashCode() + C5491nL.a(C1039Gc0.b(this.id.hashCode() * 31, 31, this.code), 31, this.timeSeconds);
    }

    @NotNull
    public final String toString() {
        String str = this.id;
        String str2 = this.code;
        long j = this.timeSeconds;
        String str3 = this.percent;
        StringBuilder sbA = C5896pG.a("PromoCodeDeeplinkData(id=", str, ", code=", str2, ", timeSeconds=");
        sbA.append(j);
        sbA.append(", percent=");
        sbA.append(str3);
        sbA.append(")");
        return sbA.toString();
    }
}
