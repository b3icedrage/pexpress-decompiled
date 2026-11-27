package com.jivosite.sdk.socket;

import defpackage.C6193qg2;
import defpackage.GN1;
import defpackage.ML0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ML0 implements Function1<GN1, Unit> {
    public final /* synthetic */ C6193qg2 d;
    public final /* synthetic */ JivoWebSocketService e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C6193qg2 c6193qg2, JivoWebSocketService jivoWebSocketService) {
        super(1);
        this.d = c6193qg2;
        this.e = jivoWebSocketService;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GN1 gn1) {
        GN1 socketErrorHandler = gn1;
        Intrinsics.checkNotNullParameter(socketErrorHandler, "$this$socketErrorHandler");
        a consumer = new a(this.d, this.e);
        socketErrorHandler.getClass();
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        socketErrorHandler.a = consumer;
        return Unit.a;
    }
}
