package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Uj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2154Uj0 implements Function0<Collection<InterfaceC2076Tj0>> {
    public final /* synthetic */ X62 d;
    public final /* synthetic */ AbstractC2314Wj0 e;

    public C2154Uj0(AbstractC2314Wj0 abstractC2314Wj0, X62 x62) {
        this.e = abstractC2314Wj0;
        this.d = x62;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Collection<InterfaceC2076Tj0> invoke() {
        C3558eN1 c3558eN1 = new C3558eN1();
        Iterator<? extends InterfaceC2076Tj0> it = this.e.u().iterator();
        while (it.hasNext()) {
            c3558eN1.add(it.next().b(this.d));
        }
        return c3558eN1;
    }
}
