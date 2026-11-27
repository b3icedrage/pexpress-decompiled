package com.api.core.backend.domain.models.abstractModels;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.R51;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR$\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/api/core/backend/domain/models/abstractModels/WebSocketRequestAbstract;", "", "<init>", "()V", "", "token", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "", "vector", "Ljava/lang/Integer;", "getVector", "()Ljava/lang/Integer;", "setVector", "(Ljava/lang/Integer;)V", "action", "getAction", "b", AppMeasurementSdk.ConditionalUserProperty.NAME, "Ljava/lang/Object;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "requestId", "getRequestId", "setRequestId", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WebSocketRequestAbstract {

    @Nullable
    private transient String action;

    @Nullable
    private transient Object name;

    @Nullable
    private transient String requestId;

    @Nullable
    private transient String token;

    @Nullable
    private transient Integer vector;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getName() {
        return this.name;
    }

    public final void b(@Nullable String str) {
        this.action = str;
    }

    public final void c(@Nullable String str) {
        this.name = str;
    }

    public final void d(@Nullable String str) {
        this.token = str;
    }
}
