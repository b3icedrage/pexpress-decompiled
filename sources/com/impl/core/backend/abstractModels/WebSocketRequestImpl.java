package com.impl.core.backend.abstractModels;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/impl/core/backend/abstractModels/WebSocketRequestImpl;", "T", "Lcom/impl/core/backend/abstractModels/WebSocketRequestAbstractImpl;", "<init>", "()V", "payload", "Ljava/lang/Object;", "e", "()Ljava/lang/Object;", "", "requestName", "Ljava/lang/String;", "getRequestName", "()Ljava/lang/String;", "responseName", "getResponseName", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WebSocketRequestImpl<T> extends WebSocketRequestAbstractImpl {

    @Nullable
    private final transient T payload;

    @Nullable
    private final transient String requestName;

    @Nullable
    private final transient String responseName;

    @Nullable
    public T e() {
        return this.payload;
    }
}
