package com.impl.core.backend.abstractModels;

import com.api.core.backend.domain.models.abstractModels.WebSocketRequestAbstract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/impl/core/backend/abstractModels/RawWebSocketRequest;", "Lcom/api/core/backend/domain/models/abstractModels/WebSocketRequestAbstract;", "", "rawMessage", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RawWebSocketRequest extends WebSocketRequestAbstract {

    @NotNull
    private final String rawMessage;

    public RawWebSocketRequest(@NotNull String rawMessage) {
        Intrinsics.checkNotNullParameter(rawMessage, "rawMessage");
        this.rawMessage = rawMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRawMessage() {
        return this.rawMessage;
    }
}
