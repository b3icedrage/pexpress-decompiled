package com.jivosite.sdk.socket;

import defpackage.C6193qg2;
import defpackage.ML0;
import defpackage.V10;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ML0 implements Function0<Unit> {
    public final /* synthetic */ C6193qg2 d;
    public final /* synthetic */ JivoWebSocketService e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C6193qg2 c6193qg2, JivoWebSocketService jivoWebSocketService) {
        super(0);
        this.d = c6193qg2;
        this.e = jivoWebSocketService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        JivoWebSocketService jivoWebSocketService = this.e;
        jivoWebSocketService.e().f(this.d);
        jivoWebSocketService.getState().i(V10.e.a);
        return Unit.a;
    }
}
