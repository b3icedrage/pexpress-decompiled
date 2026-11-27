package com.impl.core.backend.abstractModels.http;

import defpackage.C1039Gc0;
import defpackage.InterfaceC2691aI1;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/impl/core/backend/abstractModels/http/SessionIdResponseImpl;", "", "", "sessionId", "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SessionIdResponseImpl {

    @InterfaceC2691aI1("demoSessionId")
    @NotNull
    private final String sessionId;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionIdResponseImpl) && Intrinsics.a(this.sessionId, ((SessionIdResponseImpl) obj).sessionId);
    }

    public final int hashCode() {
        return this.sessionId.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.d("SessionIdResponseImpl(sessionId=", this.sessionId, ")");
    }
}
