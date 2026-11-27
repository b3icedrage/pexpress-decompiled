package com.base.core.backend.modelsOurSideRequest.events;

import defpackage.C1039Gc0;
import defpackage.C5807oq;
import defpackage.C5896pG;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/base/core/backend/modelsOurSideRequest/events/EventGoogleAnalyticRequest;", "", "", "tid", "Ljava/lang/String;", "getTid", "()Ljava/lang/String;", "cid", "getCid", "appInstanceId", "getAppInstanceId", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EventGoogleAnalyticRequest {

    @InterfaceC2691aI1("app_instance_id")
    @NotNull
    private final String appInstanceId;

    @NotNull
    private final String cid;

    @NotNull
    private final String tid;

    public EventGoogleAnalyticRequest(@NotNull String tid, @NotNull String cid, @NotNull String appInstanceId) {
        Intrinsics.checkNotNullParameter(tid, "tid");
        Intrinsics.checkNotNullParameter(cid, "cid");
        Intrinsics.checkNotNullParameter(appInstanceId, "appInstanceId");
        this.tid = tid;
        this.cid = cid;
        this.appInstanceId = appInstanceId;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventGoogleAnalyticRequest)) {
            return false;
        }
        EventGoogleAnalyticRequest eventGoogleAnalyticRequest = (EventGoogleAnalyticRequest) obj;
        return Intrinsics.a(this.tid, eventGoogleAnalyticRequest.tid) && Intrinsics.a(this.cid, eventGoogleAnalyticRequest.cid) && Intrinsics.a(this.appInstanceId, eventGoogleAnalyticRequest.appInstanceId);
    }

    public final int hashCode() {
        return this.appInstanceId.hashCode() + C1039Gc0.b(this.tid.hashCode() * 31, 31, this.cid);
    }

    @NotNull
    public final String toString() {
        String str = this.tid;
        String str2 = this.cid;
        return C5807oq.b(C5896pG.a("EventGoogleAnalyticRequest(tid=", str, ", cid=", str2, ", appInstanceId="), this.appInstanceId, ")");
    }
}
