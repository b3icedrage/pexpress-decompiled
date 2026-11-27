package com.api.core.backend.domain.models.abstractModels;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/abstractModels/EmptyWebSocketResponse;", "", "message", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/Object;", "setMessage", "(Ljava/lang/Object;)V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EmptyWebSocketResponse {

    @Nullable
    private Object message = null;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmptyWebSocketResponse) && Intrinsics.a(this.message, ((EmptyWebSocketResponse) obj).message);
    }

    public final int hashCode() {
        Object obj = this.message;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public final String toString() {
        return "EmptyWebSocketResponse(message=" + this.message + ")";
    }
}
