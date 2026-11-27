package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: xa2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7639xa2 {
    public final Context a;
    public final InterfaceC0921Ep b;
    public final T80 c;
    public final Ak2 d;
    public final Executor e;
    public final JW1 f;
    public final InterfaceC3529eE g;
    public final InterfaceC3529eE h;
    public final LD i;

    public C7639xa2(Context context, InterfaceC0921Ep interfaceC0921Ep, T80 t80, Ak2 ak2, Executor executor, JW1 jw1, InterfaceC3529eE interfaceC3529eE, InterfaceC3529eE interfaceC3529eE2, LD ld) {
        this.a = context;
        this.b = interfaceC0921Ep;
        this.c = t80;
        this.d = ak2;
        this.e = executor;
        this.f = jw1;
        this.g = interfaceC3529eE;
        this.h = interfaceC3529eE2;
        this.i = ld;
    }

    public final void a(C1778Po c1778Po, int i) {
        C1931Rn c1931RnA;
        U42 u42 = this.b.get(c1778Po.a);
        AbstractC1077Gp.a aVar = AbstractC1077Gp.a.d;
        new C1931Rn(aVar, 0L);
        final long j = 0;
        while (true) {
            C6588sa2 c6588sa2 = new C6588sa2(this, c1778Po);
            JW1 jw1 = this.f;
            if (!((Boolean) jw1.g(c6588sa2)).booleanValue()) {
                final C1778Po c1778Po2 = c1778Po;
                jw1.g(new JW1.a() { // from class: wa2
                    @Override // JW1.a
                    public final Object c() {
                        C7639xa2 c7639xa2 = this.d;
                        c7639xa2.c.w(c7639xa2.g.d() + j, c1778Po2);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) jw1.g(new C6798ta2(this, c1778Po));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (u42 == null) {
                OS0.a("Uploader", "Unknown backend for %s, deleting event batch for it...", c1778Po);
                c1931RnA = new C1931Rn(AbstractC1077Gp.a.g, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC6809td1) it.next()).a());
                }
                if (c1778Po.b() != null) {
                    LD ld = this.i;
                    Objects.requireNonNull(ld);
                    UD ud = (UD) jw1.g(new C5959pa2(ld));
                    C7060uo.a aVar2 = new C7060uo.a();
                    aVar2.f = new HashMap();
                    aVar2.d = Long.valueOf(this.g.d());
                    aVar2.e = Long.valueOf(this.h.d());
                    aVar2.a = "GDT_CLIENT_METRICS";
                    H60 h60 = new H60("proto");
                    ud.getClass();
                    C1142Hk1 c1142Hk1 = AbstractC6627sk1.a;
                    c1142Hk1.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c1142Hk1.a(ud, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    aVar2.c = new B60(h60, byteArrayOutputStream.toByteArray());
                    arrayList.add(u42.b(aVar2.b()));
                }
                c1931RnA = u42.a(new C1853Qn(arrayList, c1778Po.b));
            }
            AbstractC1077Gp.a aVar3 = AbstractC1077Gp.a.e;
            AbstractC1077Gp.a aVar4 = c1931RnA.a;
            if (aVar4 == aVar3) {
                final C1778Po c1778Po3 = c1778Po;
                jw1.g(new JW1.a() { // from class: ua2
                    @Override // JW1.a
                    public final Object c() {
                        C7639xa2 c7639xa2 = this.d;
                        T80 t80 = c7639xa2.c;
                        t80.n1(iterable);
                        t80.w(c7639xa2.g.d() + j, c1778Po3);
                        return null;
                    }
                });
                this.d.b(c1778Po3, i + 1, true);
                return;
            }
            C1778Po c1778Po4 = c1778Po;
            jw1.g(new C5481nH1(this, iterable));
            if (aVar4 == aVar) {
                long jMax = Math.max(j, c1931RnA.b);
                if (c1778Po4.b() != null) {
                    jw1.g(new C7218va2(this, 0));
                }
                j = jMax;
            } else if (aVar4 == AbstractC1077Gp.a.h) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strG = ((AbstractC6809td1) it2.next()).a().g();
                    if (map.containsKey(strG)) {
                        map.put(strG, Integer.valueOf(((Integer) map.get(strG)).intValue() + 1));
                    } else {
                        map.put(strG, 1);
                    }
                }
                jw1.g(new C1896Rb0(this, map));
            }
            c1778Po = c1778Po4;
        }
    }
}
