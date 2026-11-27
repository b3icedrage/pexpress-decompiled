package io.sentry.android.replay.capture;

import defpackage.ML0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends ML0 implements Function0<Unit> {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ AbstractC4515a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object obj, Integer num, AbstractC4515a abstractC4515a) {
        super(0);
        this.d = obj;
        this.e = num;
        this.g = abstractC4515a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        io.sentry.android.replay.k kVar = this.g.h;
        if (kVar != null) {
            kVar.k("segment.id", String.valueOf(this.e));
        }
        return Unit.a;
    }
}
