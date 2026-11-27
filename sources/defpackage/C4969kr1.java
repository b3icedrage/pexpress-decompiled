package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4969kr1 extends C2784ak0 implements Function1<Long, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        long jLongValue = l.longValue();
        C5515nT c5515nT = (C5515nT) this.e;
        synchronized (c5515nT) {
            c5515nT.t("events", jLongValue);
        }
        return Unit.a;
    }
}
