package defpackage;

import com.google.firebase.perf.session.gauges.GaugeManager;
import io.sentry.android.core.C4498i;
import io.sentry.util.C4527a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class VU implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ VU(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                UU.b bVar = UU.b.this;
                boolean zQ = bVar.e.q();
                InterfaceC1649Nx interfaceC1649Nx = (InterfaceC1649Nx) this.g;
                if (zQ) {
                    interfaceC1649Nx.b(bVar, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC1649Nx.a(bVar, (C0935Et1) this.h);
                    return;
                }
            case 1:
                ((GaugeManager) this.e).lambda$stopCollectingGauges$3((String) this.g, (EnumC1134Hi) this.h);
                return;
            default:
                C2688aH1 c2688aH1 = (C2688aH1) this.g;
                C4498i c4498i = (C4498i) this.e;
                if (c4498i.t.get()) {
                    return;
                }
                ArrayList<C1445Lh1.a> arrayList = c4498i.q;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                C4527a.C0404a c0404aA = c4498i.A.a();
                try {
                    for (C1445Lh1.a aVar : arrayList) {
                        arrayList2.add(new C1445Lh1(aVar.a, aVar.b, aVar.d, aVar.c, Double.valueOf(aVar.e), aVar.f, c2688aH1));
                    }
                    arrayList.clear();
                    c0404aA.close();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1171Hu0) this.h).m((C1445Lh1) it.next());
                    }
                    return;
                } catch (Throwable th) {
                    try {
                        c0404aA.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
        }
    }
}
