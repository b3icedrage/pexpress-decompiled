package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7734y11 implements Function1 {
    public final /* synthetic */ B11 d;
    public final /* synthetic */ OQ e;

    public /* synthetic */ C7734y11(B11 b11, OQ oq) {
        this.d = b11;
        this.e = oq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.d.f(((Long) obj).longValue(), this.e);
        return Unit.a;
    }
}
