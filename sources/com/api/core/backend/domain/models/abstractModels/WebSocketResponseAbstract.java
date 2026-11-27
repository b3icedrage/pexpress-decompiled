package com.api.core.backend.domain.models.abstractModels;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/api/core/backend/domain/models/abstractModels/WebSocketResponseAbstract;", "", "<init>", "()V", "", "action", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.NAME, "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "e", "(Ljava/lang/Object;)V", "requestId", "d", "setRequestId", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WebSocketResponseAbstract {

    @Nullable
    private transient String action;

    @Nullable
    private transient Object name;

    @Nullable
    private transient String requestId;

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getRequestId() {
        return this.requestId;
    }

    public final void e(@Nullable Object obj) {
        this.name = obj;
    }
}
