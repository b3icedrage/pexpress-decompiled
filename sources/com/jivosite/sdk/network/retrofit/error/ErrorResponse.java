package com.jivosite.sdk.network.retrofit.error;

import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/jivosite/sdk/network/retrofit/error/ErrorResponse;", "", "", "isOk", "", "", "violationList", "<init>", "(ZLjava/util/Map;)V", "copy", "(ZLjava/util/Map;)Lcom/jivosite/sdk/network/retrofit/error/ErrorResponse;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ErrorResponse {
    public final boolean a;

    @NotNull
    public final Map<String, String> b;

    public ErrorResponse(@InterfaceC5477nG0(name = "ok") boolean z, @InterfaceC5477nG0(name = "violation_list") @NotNull Map<String, String> violationList) {
        Intrinsics.checkNotNullParameter(violationList, "violationList");
        this.a = z;
        this.b = violationList;
    }

    @NotNull
    public final ErrorResponse copy(@InterfaceC5477nG0(name = "ok") boolean isOk, @InterfaceC5477nG0(name = "violation_list") @NotNull Map<String, String> violationList) {
        Intrinsics.checkNotNullParameter(violationList, "violationList");
        return new ErrorResponse(isOk, violationList);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj;
        return this.a == errorResponse.a && Intrinsics.a(this.b, errorResponse.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.b.hashCode() + (r0 * 31);
    }

    @NotNull
    public final String toString() {
        return "ErrorResponse(isOk=" + this.a + ", violationList=" + this.b + ')';
    }
}
