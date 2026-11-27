package com.api.core.backend.domain.models.responseModels;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import defpackage.C7365wG;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/GetVPNResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "", "", "result", "Ljava/util/List;", "getResult", "()Ljava/util/List;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetVPNResponse extends HttpResponse<List<String>> {

    @Nullable
    private final List<String> result;

    @Nullable
    public final C7365wG e() {
        List<String> list = this.result;
        if (list != null) {
            return new C7365wG(list);
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetVPNResponse) && Intrinsics.a(this.result, ((GetVPNResponse) obj).result);
    }

    public final int hashCode() {
        List<String> list = this.result;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public final String toString() {
        return "GetVPNResponse(result=" + this.result + ")";
    }
}
