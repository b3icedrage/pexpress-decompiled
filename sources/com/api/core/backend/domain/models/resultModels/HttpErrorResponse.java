package com.api.core.backend.domain.models.resultModels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/HttpErrorResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpErrorResponseBase;", "", "code", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HttpErrorResponse extends HttpErrorResponseBase {

    @Nullable
    private final Integer code;

    @Nullable
    private final String message;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpErrorResponse)) {
            return false;
        }
        HttpErrorResponse httpErrorResponse = (HttpErrorResponse) obj;
        return Intrinsics.a(this.code, httpErrorResponse.code) && Intrinsics.a(this.message, httpErrorResponse.message);
    }

    public final int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "HttpErrorResponse(code=" + this.code + ", message=" + this.message + ")";
    }
}
