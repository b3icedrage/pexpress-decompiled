package io.sentry.android.replay.capture;

import defpackage.C2912bH1;
import defpackage.ML0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends ML0 implements Function0<Unit> {
    public final /* synthetic */ Object d;
    public final /* synthetic */ C2912bH1.b e;
    public final /* synthetic */ AbstractC4515a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj, C2912bH1.b bVar, AbstractC4515a abstractC4515a) {
        super(0);
        this.d = obj;
        this.e = bVar;
        this.g = abstractC4515a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        io.sentry.android.replay.k kVar = this.g.h;
        if (kVar != null) {
            kVar.k("replay.type", String.valueOf(this.e));
        }
        return Unit.a;
    }
}
