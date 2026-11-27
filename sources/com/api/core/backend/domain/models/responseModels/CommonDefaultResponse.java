package com.api.core.backend.domain.models.responseModels;

import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CommonDefaultResponse;", "", "", "status", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "", "code", "I", R51.PUSH_ADDITIONAL_DATA_KEY, "()I", "setCode", "(I)V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonDefaultResponse {
    private int code;

    @NotNull
    private String status;

    public CommonDefaultResponse(@NotNull String status, int i) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.code = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonDefaultResponse)) {
            return false;
        }
        CommonDefaultResponse commonDefaultResponse = (CommonDefaultResponse) obj;
        return Intrinsics.a(this.status, commonDefaultResponse.status) && this.code == commonDefaultResponse.code;
    }

    public final int hashCode() {
        return Integer.hashCode(this.code) + (this.status.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CommonDefaultResponse(status=" + this.status + ", code=" + this.code + ")";
    }
}
