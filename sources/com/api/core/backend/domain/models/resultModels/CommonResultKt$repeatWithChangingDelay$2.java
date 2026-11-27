package com.api.core.backend.domain.models.resultModels;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.time.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class CommonResultKt$repeatWithChangingDelay$2 implements Function1<b, b> {
    public static final CommonResultKt$repeatWithChangingDelay$2 INSTANCE = new CommonResultKt$repeatWithChangingDelay$2();

    @Override // kotlin.jvm.functions.Function1
    public final b invoke(b bVar) {
        return new b(b.q(2, bVar.d));
    }
}
