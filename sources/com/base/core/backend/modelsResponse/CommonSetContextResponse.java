package com.base.core.backend.modelsResponse;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonSetContextResponse;", "", "", "result", "Z", "getResult", "()Z", "setResult", "(Z)V", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonSetContextResponse {
    private boolean result;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonSetContextResponse) && this.result == ((CommonSetContextResponse) obj).result;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.result);
    }

    @NotNull
    public final String toString() {
        return "CommonSetContextResponse(result=" + this.result + ")";
    }
}
