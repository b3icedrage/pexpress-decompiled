package io.sentry.android.replay.capture;

import defpackage.ML0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4518d extends ML0 implements Function0<Unit> {
    public final /* synthetic */ Object d;
    public final /* synthetic */ io.sentry.protocol.u e;
    public final /* synthetic */ AbstractC4515a g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4518d(Object obj, io.sentry.protocol.u uVar, AbstractC4515a abstractC4515a) {
        super(0);
        this.d = obj;
        this.e = uVar;
        this.g = abstractC4515a;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        io.sentry.android.replay.k kVar = this.g.h;
        if (kVar != null) {
            kVar.k("replay.id", String.valueOf(this.e));
        }
        return Unit.a;
    }
}
