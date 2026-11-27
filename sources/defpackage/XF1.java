package defpackage;

import io.sentry.hints.a;
import io.sentry.protocol.o;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class XF1 implements KD1.b, InterfaceC3981gO1 {
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ XF1(Object obj, Object obj2, Object obj3) {
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
    }

    @Override // KD1.b
    public void a(CI1 ci1) {
        ConcurrentHashMap concurrentHashMap;
        YF1 yf1 = (YF1) this.d;
        if (ci1 == null) {
            yf1.b.getLogger().a(NG1.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        yf1.getClass();
        EG1 eg1 = (EG1) this.e;
        String strG = null;
        CI1.b bVar = eg1.e() != null ? CI1.b.Crashed : null;
        boolean z = CI1.b.Crashed == bVar || eg1.f();
        o oVar = eg1.h;
        String str = (oVar == null || (concurrentHashMap = oVar.j) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) eg1.h.j.get("user-agent");
        Object objB = ((C0841Do0) this.g).b("sentry:typeCheckHint");
        if (objB instanceof a) {
            strG = ((a) objB).g();
            bVar = CI1.b.Abnormal;
        }
        if (!ci1.d(bVar, str, z, strG) || ci1.k == CI1.b.Ok) {
            return;
        }
        ci1.b(N7.h());
    }

    @Override // defpackage.InterfaceC3981gO1
    public void c(C3352dO1 c3352dO1) {
        C7581xH1 c7581xH1 = (C7581xH1) this.d;
        InterfaceC3981gO1 interfaceC3981gO1 = (InterfaceC3981gO1) this.e;
        if (interfaceC3981gO1 != null) {
            interfaceC3981gO1.c(c3352dO1);
        }
        InterfaceC5014l42 interfaceC5014l42 = c7581xH1.r.i;
        if (interfaceC5014l42 != null) {
            interfaceC5014l42.a(c7581xH1);
        }
        JH jh = c7581xH1.q;
        if (jh != null) {
            ((AtomicReference) this.g).set(jh.a(c7581xH1));
        }
    }
}
