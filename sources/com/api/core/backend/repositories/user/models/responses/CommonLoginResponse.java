package com.api.core.backend.repositories.user.models.responses;

import defpackage.C5896pG;
import defpackage.C6315rG;
import defpackage.InterfaceC1247It1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonLoginResponse;", "LIt1;", "LrG;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "ssid", "c", "method", "b", "token", "d", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonLoginResponse implements InterfaceC1247It1<C6315rG> {

    @Nullable
    private final String method;

    @Nullable
    private final String ssid;

    @Nullable
    private final String code = null;

    @Nullable
    private final String token = null;

    public CommonLoginResponse(@Nullable String str, @Nullable String str2) {
        this.ssid = str;
        this.method = str2;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSsid() {
        return this.ssid;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Override // defpackage.InterfaceC1247It1
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C6315rG a() {
        String str = this.ssid;
        if (str == null) {
            str = "";
        }
        return new C6315rG(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonLoginResponse)) {
            return false;
        }
        CommonLoginResponse commonLoginResponse = (CommonLoginResponse) obj;
        return Intrinsics.a(this.code, commonLoginResponse.code) && Intrinsics.a(this.ssid, commonLoginResponse.ssid) && Intrinsics.a(this.method, commonLoginResponse.method) && Intrinsics.a(this.token, commonLoginResponse.token);
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ssid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.method;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.token;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.code;
        String str2 = this.ssid;
        String str3 = this.method;
        String str4 = this.token;
        StringBuilder sbA = C5896pG.a("CommonLoginResponse(code=", str, ", ssid=", str2, ", method=");
        sbA.append(str3);
        sbA.append(", token=");
        sbA.append(str4);
        sbA.append(")");
        return sbA.toString();
    }
}
