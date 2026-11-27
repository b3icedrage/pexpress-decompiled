package com.api.core.backend.domain.models.responseModels;

import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/ServerResponse;", "", "", "address", "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "", "connectionTime", "Ljava/lang/Long;", "getConnectionTime", "()Ljava/lang/Long;", "setConnectionTime", "(Ljava/lang/Long;)V", "", "success", "Ljava/lang/Boolean;", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ServerResponse {

    @Nullable
    private final String address = "";

    @Nullable
    private Long connectionTime = null;

    @Nullable
    private Boolean success = null;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerResponse)) {
            return false;
        }
        ServerResponse serverResponse = (ServerResponse) obj;
        return Intrinsics.a(this.address, serverResponse.address) && Intrinsics.a(this.connectionTime, serverResponse.connectionTime) && Intrinsics.a(this.success, serverResponse.success);
    }

    public final int hashCode() {
        String str = this.address;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.connectionTime;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.success;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ServerResponse(address=" + this.address + ", connectionTime=" + this.connectionTime + ", success=" + this.success + ")";
    }
}
