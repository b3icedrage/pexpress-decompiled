package com.impl.core.backend.modelsResponse;

import com.api.core.backend.domain.models.abstractModels.WebSocketResponseAbstract;
import defpackage.C1039Gc0;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/impl/core/backend/modelsResponse/ErrorResponse;", "Lcom/api/core/backend/domain/models/abstractModels/WebSocketResponseAbstract;", "", "errorMessage", "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ErrorResponse extends WebSocketResponseAbstract {

    @InterfaceC2691aI1("error")
    @Nullable
    private final String errorMessage;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorResponse) && Intrinsics.a(this.errorMessage, ((ErrorResponse) obj).errorMessage);
    }

    public final int hashCode() {
        String str = this.errorMessage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public final String toString() {
        return C1039Gc0.d("ErrorResponse(errorMessage=", this.errorMessage, ")");
    }
}
