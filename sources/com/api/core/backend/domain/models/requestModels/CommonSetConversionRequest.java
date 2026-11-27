package com.api.core.backend.domain.models.requestModels;

import defpackage.C1039Gc0;
import defpackage.C5896pG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/CommonSetConversionRequest;", "", "", "location", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "setLocation", "(Ljava/lang/String;)V", "clickUrl", "getClickUrl", "setClickUrl", "clickTime", "getClickTime", "setClickTime", "referId", "getReferId", "setReferId", "tr", "getTr", "setTr", "prefId", "getPrefId", "setPrefId", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonSetConversionRequest {

    @NotNull
    private String clickTime;

    @NotNull
    private String clickUrl;

    @NotNull
    private String location;

    @NotNull
    private String prefId;

    @NotNull
    private String referId;

    @NotNull
    private String tr;

    public CommonSetConversionRequest(@NotNull String location, @NotNull String clickUrl, @NotNull String clickTime, @NotNull String referId, @NotNull String tr) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(clickUrl, "clickUrl");
        Intrinsics.checkNotNullParameter(clickTime, "clickTime");
        Intrinsics.checkNotNullParameter(referId, "referId");
        Intrinsics.checkNotNullParameter(tr, "tr");
        Intrinsics.checkNotNullParameter("getprofit", "prefId");
        this.location = location;
        this.clickUrl = clickUrl;
        this.clickTime = clickTime;
        this.referId = referId;
        this.tr = tr;
        this.prefId = "getprofit";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonSetConversionRequest)) {
            return false;
        }
        CommonSetConversionRequest commonSetConversionRequest = (CommonSetConversionRequest) obj;
        return Intrinsics.a(this.location, commonSetConversionRequest.location) && Intrinsics.a(this.clickUrl, commonSetConversionRequest.clickUrl) && Intrinsics.a(this.clickTime, commonSetConversionRequest.clickTime) && Intrinsics.a(this.referId, commonSetConversionRequest.referId) && Intrinsics.a(this.tr, commonSetConversionRequest.tr) && Intrinsics.a(this.prefId, commonSetConversionRequest.prefId);
    }

    public final int hashCode() {
        return this.prefId.hashCode() + C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(this.location.hashCode() * 31, 31, this.clickUrl), 31, this.clickTime), 31, this.referId), 31, this.tr);
    }

    @NotNull
    public final String toString() {
        String str = this.location;
        String str2 = this.clickUrl;
        String str3 = this.clickTime;
        String str4 = this.referId;
        String str5 = this.tr;
        String str6 = this.prefId;
        StringBuilder sbA = C5896pG.a("CommonSetConversionRequest(location=", str, ", clickUrl=", str2, ", clickTime=");
        C5896pG.b(sbA, str3, ", referId=", str4, ", tr=");
        sbA.append(str5);
        sbA.append(", prefId=");
        sbA.append(str6);
        sbA.append(")");
        return sbA.toString();
    }
}
