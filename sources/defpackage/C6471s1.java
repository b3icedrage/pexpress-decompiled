package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6471s1 implements InterfaceC6494s62 {
    public final /* synthetic */ AbstractC6681t1 a;

    public C6471s1(AbstractC6681t1 abstractC6681t1) {
        this.a = abstractC6681t1;
    }

    @Override // defpackage.InterfaceC6494s62
    public final Collection<AbstractC4649jL0> a() {
        Collection<AbstractC4649jL0> collectionA = ((C3269d00) this.a).n0().V0().a();
        Intrinsics.checkNotNullExpressionValue(collectionA, "getSupertypes(...)");
        return collectionA;
    }

    @Override // defpackage.InterfaceC6494s62
    public final List<H62> b() {
        return this.a.U0();
    }

    @Override // defpackage.InterfaceC6494s62
    public final InterfaceC5044lD c() {
        return this.a;
    }

    @Override // defpackage.InterfaceC6494s62
    public final boolean e() {
        return true;
    }

    @Override // defpackage.InterfaceC6494s62
    public final RK0 t() {
        return C4900kZ.e(this.a);
    }

    public final String toString() {
        return "[typealias " + this.a.getName().e() + ']';
    }
}
