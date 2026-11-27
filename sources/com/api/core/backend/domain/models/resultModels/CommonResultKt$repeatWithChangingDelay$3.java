package com.api.core.backend.domain.models.resultModels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class CommonResultKt$repeatWithChangingDelay$3 implements Function1<ResultError, Boolean> {
    public static final CommonResultKt$repeatWithChangingDelay$3 INSTANCE = new CommonResultKt$repeatWithChangingDelay$3();

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ResultError resultError) {
        ResultError it = resultError;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.FALSE;
    }
}
