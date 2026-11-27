package com.api.core.backend.domain.models.resultModels;

import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/ResultOk;", "", "T", "Lcom/api/core/backend/domain/models/resultModels/CommonResult;", "result", "Ljava/lang/Object;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/Object;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResultOk<T> extends CommonResult<T> {

    @NotNull
    private final T result;

    public ResultOk(@NotNull T result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    @NotNull
    public final T a() {
        return this.result;
    }
}
