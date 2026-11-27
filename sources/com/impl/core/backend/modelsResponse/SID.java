package com.impl.core.backend.modelsResponse;

import com.api.core.backend.domain.models.abstractModels.WebSocketResponseAbstract;
import defpackage.C1039Gc0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/impl/core/backend/modelsResponse/SID;", "Lcom/api/core/backend/domain/models/abstractModels/WebSocketResponseAbstract;", "", "sid", "Ljava/lang/String;", "getSid", "()Ljava/lang/String;", "Companion", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SID extends WebSocketResponseAbstract {

    @NotNull
    public static final String NAME = "40";

    @NotNull
    private final String sid;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SID) && Intrinsics.a(this.sid, ((SID) obj).sid);
    }

    public final int hashCode() {
        return this.sid.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.d("SID(sid=", this.sid, ")");
    }
}
