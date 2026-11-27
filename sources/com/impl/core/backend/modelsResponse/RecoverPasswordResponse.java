package com.impl.core.backend.modelsResponse;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import defpackage.C1039Gc0;
import defpackage.InterfaceC1247It1;
import defpackage.WF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/impl/core/backend/modelsResponse/RecoverPasswordResponse;", "Lcom/impl/core/backend/abstractModels/http/HttpPlatformResponse;", "LIt1;", "LWF;", "", "result", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecoverPasswordResponse extends HttpPlatformResponse implements InterfaceC1247It1<WF> {

    @Nullable
    private final String result;

    @Override // defpackage.InterfaceC1247It1
    public final WF a() {
        String str = this.result;
        if (str == null) {
            str = "";
        }
        return new WF(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecoverPasswordResponse) && Intrinsics.a(this.result, ((RecoverPasswordResponse) obj).result);
    }

    public final int hashCode() {
        String str = this.result;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.d("RecoverPasswordResponse(result=", this.result, ")");
    }
}
