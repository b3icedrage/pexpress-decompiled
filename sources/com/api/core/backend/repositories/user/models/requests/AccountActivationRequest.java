package com.api.core.backend.repositories.user.models.requests;

import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u0000 \t2\u00020\u0001:\u0001\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/AccountActivationRequest;", "", "", "userId", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "setUserId", "(Ljava/lang/Long;)V", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountActivationRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @InterfaceC2691aI1("user_id")
    @Nullable
    private Long userId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/AccountActivationRequest$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AccountActivationRequest(@Nullable Long l) {
        this.userId = l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountActivationRequest) && Intrinsics.a(this.userId, ((AccountActivationRequest) obj).userId);
    }

    public final int hashCode() {
        Long l = this.userId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AccountActivationRequest(userId=" + this.userId + ")";
    }

    public AccountActivationRequest() {
        this(0L);
    }
}
