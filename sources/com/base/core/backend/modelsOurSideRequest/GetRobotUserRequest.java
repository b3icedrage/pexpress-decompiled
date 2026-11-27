package com.base.core.backend.modelsOurSideRequest;

import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/base/core/backend/modelsOurSideRequest/GetRobotUserRequest;", "", "", "action", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "", "userId", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "setUserId", "(Ljava/lang/Long;)V", "Companion", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetRobotUserRequest {

    @Nullable
    private String action = "";

    @InterfaceC2691aI1("user_id")
    @Nullable
    private Long userId = 0L;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRobotUserRequest)) {
            return false;
        }
        GetRobotUserRequest getRobotUserRequest = (GetRobotUserRequest) obj;
        return Intrinsics.a(this.action, getRobotUserRequest.action) && Intrinsics.a(this.userId, getRobotUserRequest.userId);
    }

    public final int hashCode() {
        String str = this.action;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.userId;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "GetRobotUserRequest(action=" + this.action + ", userId=" + this.userId + ")";
    }
}
