package com.base.core.backend.modelsRequest;

import defpackage.C5491nL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/base/core/backend/modelsRequest/CommonChangeEmailRequest;", "", "", "action", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "", "userId", "J", "getUserId", "()J", "setUserId", "(J)V", "email", "getEmail", "setEmail", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonChangeEmailRequest {

    @NotNull
    private String action;

    @NotNull
    private String email;
    private long userId;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonChangeEmailRequest)) {
            return false;
        }
        CommonChangeEmailRequest commonChangeEmailRequest = (CommonChangeEmailRequest) obj;
        return Intrinsics.a(this.action, commonChangeEmailRequest.action) && this.userId == commonChangeEmailRequest.userId && Intrinsics.a(this.email, commonChangeEmailRequest.email);
    }

    public final int hashCode() {
        return this.email.hashCode() + C5491nL.a(this.action.hashCode() * 31, 31, this.userId);
    }

    @NotNull
    public final String toString() {
        return "CommonChangeEmailRequest(action=" + this.action + ", userId=" + this.userId + ", email=" + this.email + ")";
    }
}
