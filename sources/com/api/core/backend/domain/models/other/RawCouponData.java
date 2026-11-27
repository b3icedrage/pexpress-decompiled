package com.api.core.backend.domain.models.other;

import defpackage.C1575Mz0;
import defpackage.C5896pG;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/api/core/backend/domain/models/other/RawCouponData;", "", "id", "", "code", "timeSeconds", "", "percent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCode", "getTimeSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPercent", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/api/core/backend/domain/models/other/RawCouponData;", "equals", "", "other", "hashCode", "", "toString", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RawCouponData {

    @Nullable
    private final String code;

    @Nullable
    private final String id;

    @Nullable
    private final String percent;

    @InterfaceC2691aI1(C1575Mz0.TIME)
    @Nullable
    private final Long timeSeconds;

    public RawCouponData(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable String str3) {
        this.id = str;
        this.code = str2;
        this.timeSeconds = l;
        this.percent = str3;
    }

    public static /* synthetic */ RawCouponData copy$default(RawCouponData rawCouponData, String str, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rawCouponData.id;
        }
        if ((i & 2) != 0) {
            str2 = rawCouponData.code;
        }
        if ((i & 4) != 0) {
            l = rawCouponData.timeSeconds;
        }
        if ((i & 8) != 0) {
            str3 = rawCouponData.percent;
        }
        return rawCouponData.copy(str, str2, l, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimeSeconds() {
        return this.timeSeconds;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPercent() {
        return this.percent;
    }

    @NotNull
    public final RawCouponData copy(@Nullable String id, @Nullable String code, @Nullable Long timeSeconds, @Nullable String percent) {
        return new RawCouponData(id, code, timeSeconds, percent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawCouponData)) {
            return false;
        }
        RawCouponData rawCouponData = (RawCouponData) other;
        return Intrinsics.a(this.id, rawCouponData.id) && Intrinsics.a(this.code, rawCouponData.code) && Intrinsics.a(this.timeSeconds, rawCouponData.timeSeconds) && Intrinsics.a(this.percent, rawCouponData.percent);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getPercent() {
        return this.percent;
    }

    @Nullable
    public final Long getTimeSeconds() {
        return this.timeSeconds;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.timeSeconds;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.percent;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.code;
        Long l = this.timeSeconds;
        String str3 = this.percent;
        StringBuilder sbA = C5896pG.a("RawCouponData(id=", str, ", code=", str2, ", timeSeconds=");
        sbA.append(l);
        sbA.append(", percent=");
        sbA.append(str3);
        sbA.append(")");
        return sbA.toString();
    }
}
