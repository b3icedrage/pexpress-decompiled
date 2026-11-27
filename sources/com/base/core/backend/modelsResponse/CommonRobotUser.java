package com.base.core.backend.modelsResponse;

import defpackage.C6945uG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonRobotUser;", "", "LuG;", "user", "LuG;", "getUser", "()LuG;", "setUser", "(LuG;)V", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonRobotUser {

    @NotNull
    private C6945uG user;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonRobotUser) && Intrinsics.a(this.user, ((CommonRobotUser) obj).user);
    }

    public final int hashCode() {
        return this.user.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CommonRobotUser(user=" + this.user + ")";
    }
}
