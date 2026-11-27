package com.base.core.backend.modelsRequest;

import defpackage.EF;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/base/core/backend/modelsRequest/CommonOrderChangeRequest;", "", "", "userId", "J", "getUserId", "()J", "LEF;", "instrumentType", "LEF;", "getInstrumentType", "()LEF;", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonOrderChangeRequest {

    @NotNull
    private final EF instrumentType;
    private final long userId;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonOrderChangeRequest)) {
            return false;
        }
        CommonOrderChangeRequest commonOrderChangeRequest = (CommonOrderChangeRequest) obj;
        return this.userId == commonOrderChangeRequest.userId && this.instrumentType == commonOrderChangeRequest.instrumentType;
    }

    public final int hashCode() {
        return this.instrumentType.hashCode() + (Long.hashCode(this.userId) * 31);
    }

    @NotNull
    public final String toString() {
        return "CommonOrderChangeRequest(userId=" + this.userId + ", instrumentType=" + this.instrumentType + ")";
    }
}
