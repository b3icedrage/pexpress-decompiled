package com.api.core.backend.repositories.user.models.requests;

import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/CryptoEnableRequest;", "", "", "userId", "J", "getUserId", "()J", "", "cryptoEnable", "Z", "getCryptoEnable", "()Z", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CryptoEnableRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @InterfaceC2691aI1("crypto_enable")
    private final boolean cryptoEnable = true;

    @InterfaceC2691aI1("user_id")
    private final long userId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/CryptoEnableRequest$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CryptoEnableRequest(long j) {
        this.userId = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoEnableRequest)) {
            return false;
        }
        CryptoEnableRequest cryptoEnableRequest = (CryptoEnableRequest) obj;
        return this.userId == cryptoEnableRequest.userId && this.cryptoEnable == cryptoEnableRequest.cryptoEnable;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.cryptoEnable) + (Long.hashCode(this.userId) * 31);
    }

    @NotNull
    public final String toString() {
        return "CryptoEnableRequest(userId=" + this.userId + ", cryptoEnable=" + this.cryptoEnable + ")";
    }
}
