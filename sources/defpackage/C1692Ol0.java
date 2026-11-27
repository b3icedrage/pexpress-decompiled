package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ol0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1692Ol0 extends G1 {
    public final /* synthetic */ ArrayList<InterfaceC4675jU> e;
    public final /* synthetic */ AbstractC1770Pl0 f;

    public C1692Ol0(ArrayList<InterfaceC4675jU> arrayList, AbstractC1770Pl0 abstractC1770Pl0) {
        this.e = arrayList;
        this.f = abstractC1770Pl0;
    }

    @Override // defpackage.G1
    public final void a(InterfaceC1490Lx fakeOverride) {
        Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
        C1346Ka1.r(fakeOverride, null);
        this.e.add(fakeOverride);
    }

    @Override // defpackage.G1
    public final void e(InterfaceC1490Lx fromSuper, InterfaceC1490Lx fromCurrent) {
        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f.b + ": " + fromSuper + " vs " + fromCurrent).toString());
    }
}
