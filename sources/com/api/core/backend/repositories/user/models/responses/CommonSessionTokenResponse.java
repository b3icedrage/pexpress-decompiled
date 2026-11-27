package com.api.core.backend.repositories.user.models.responses;

import defpackage.C1039Gc0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonSessionTokenResponse;", "", "", "token", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonSessionTokenResponse {

    @NotNull
    private final String token;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonSessionTokenResponse) && Intrinsics.a(this.token, ((CommonSessionTokenResponse) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.d("CommonSessionTokenResponse(token=", this.token, ")");
    }
}
