package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7485wp0 extends AbstractC6578sX1 {
    public final /* synthetic */ C6644sp0.c e;
    public final /* synthetic */ C6536sJ1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7485wp0(String str, C6644sp0.c cVar, C6536sJ1 c6536sJ1) {
        super(str, true);
        this.e = cVar;
        this.f = c6536sJ1;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, sJ1] */
    @Override // defpackage.AbstractC6578sX1
    public final long a() {
        long jA;
        int i;
        C0922Ep0[] c0922Ep0Arr;
        C6644sp0.c cVar = this.e;
        C6536sJ1 settings = this.f;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        C3027bp1 c3027bp1 = new C3027bp1();
        C6644sp0 c6644sp0 = cVar.e;
        synchronized (c6644sp0.B) {
            synchronized (c6644sp0) {
                try {
                    C6536sJ1 c6536sJ1 = c6644sp0.v;
                    ?? c6536sJ2 = new C6536sJ1();
                    c6536sJ2.b(c6536sJ1);
                    c6536sJ2.b(settings);
                    c3027bp1.d = c6536sJ2;
                    jA = ((long) c6536sJ2.a()) - ((long) c6536sJ1.a());
                    c0922Ep0Arr = (jA == 0 || c6644sp0.e.isEmpty()) ? null : (C0922Ep0[]) c6644sp0.e.values().toArray(new C0922Ep0[0]);
                    C6536sJ1 c6536sJ3 = (C6536sJ1) c3027bp1.d;
                    Intrinsics.checkNotNullParameter(c6536sJ3, "<set-?>");
                    c6644sp0.v = c6536sJ3;
                    c6644sp0.n.c(new C6854tp0(c6644sp0.g + " onSettings", c6644sp0, c3027bp1), 0L);
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                c6644sp0.B.c((C6536sJ1) c3027bp1.d);
            } catch (IOException e) {
                c6644sp0.f(e);
            }
            Unit unit2 = Unit.a;
        }
        if (c0922Ep0Arr == null) {
            return -1L;
        }
        for (C0922Ep0 c0922Ep0 : c0922Ep0Arr) {
            synchronized (c0922Ep0) {
                c0922Ep0.f += jA;
                if (jA > 0) {
                    c0922Ep0.notifyAll();
                }
                Unit unit3 = Unit.a;
            }
        }
        return -1L;
    }
}
