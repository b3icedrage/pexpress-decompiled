package com.base.core.backend.modelsResponse;

import defpackage.C1039Gc0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonSetConversionResponse;", "", "", "affiliateId", "Ljava/lang/String;", "getAffiliateId", "()Ljava/lang/String;", "setAffiliateId", "(Ljava/lang/String;)V", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonSetConversionResponse {

    @NotNull
    private String affiliateId;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonSetConversionResponse) && Intrinsics.a(this.affiliateId, ((CommonSetConversionResponse) obj).affiliateId);
    }

    public final int hashCode() {
        return this.affiliateId.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.d("CommonSetConversionResponse(affiliateId=", this.affiliateId, ")");
    }
}
