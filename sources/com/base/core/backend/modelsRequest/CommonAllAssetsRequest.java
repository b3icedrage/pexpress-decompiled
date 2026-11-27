package com.base.core.backend.modelsRequest;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/base/core/backend/modelsRequest/CommonAllAssetsRequest;", "", "", "", "mode", "Ljava/util/List;", "getMode", "()Ljava/util/List;", "setMode", "(Ljava/util/List;)V", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonAllAssetsRequest {

    @NotNull
    private List<String> mode;

    public CommonAllAssetsRequest() {
        ArrayList mode = new ArrayList();
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonAllAssetsRequest) && Intrinsics.a(this.mode, ((CommonAllAssetsRequest) obj).mode);
    }

    public final int hashCode() {
        return this.mode.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CommonAllAssetsRequest(mode=" + this.mode + ")";
    }
}
