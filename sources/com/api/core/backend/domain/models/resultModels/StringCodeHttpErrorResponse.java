package com.api.core.backend.domain.models.resultModels;

import defpackage.C4694ja0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/StringCodeHttpErrorResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpErrorResponseBase;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "message", "getMessage", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StringCodeHttpErrorResponse extends HttpErrorResponseBase {

    @Nullable
    private final String code;

    @Nullable
    private final String message;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringCodeHttpErrorResponse)) {
            return false;
        }
        StringCodeHttpErrorResponse stringCodeHttpErrorResponse = (StringCodeHttpErrorResponse) obj;
        return Intrinsics.a(this.code, stringCodeHttpErrorResponse.code) && Intrinsics.a(this.message, stringCodeHttpErrorResponse.message);
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return C4694ja0.a("StringCodeHttpErrorResponse(code=", this.code, ", message=", this.message, ")");
    }
}
