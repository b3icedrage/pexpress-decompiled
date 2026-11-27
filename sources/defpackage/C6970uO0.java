package defpackage;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6970uO0 implements InterfaceC2396Xc {

    @NotNull
    public final LO0 d;

    @NotNull
    public final WD0 e;
    public final boolean g;

    @NotNull
    public final VY0<QD0, InterfaceC1583Nc> h;

    public C6970uO0(@NotNull LO0 c, @NotNull WD0 annotationOwner, boolean z) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.d = c;
        this.e = annotationOwner;
        this.g = z;
        this.h = c.a.a.f(new C6760tO0(this, 0));
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean P(@NotNull C1758Ph0 c1758Ph0) {
        return InterfaceC2396Xc.b.b(this, c1758Ph0);
    }

    @Override // defpackage.InterfaceC2396Xc
    public final boolean isEmpty() {
        return this.e.k().isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC1583Nc> iterator() {
        WD0 wd0 = this.e;
        C42 c42M = JH1.m(CollectionsKt.y(wd0.k()), this.h);
        C5638o21 c5638o21 = VD0.a;
        C2139Ue0 c2139Ue0O = JH1.o(c42M, VD0.a(C4194hP1.a.m, wd0, this.d));
        Intrinsics.checkNotNullParameter(c2139Ue0O, "<this>");
        return new C7439wd0.a(JH1.i(c2139Ue0O, new YE1(1)));
    }

    @Override // defpackage.InterfaceC2396Xc
    @Nullable
    public final InterfaceC1583Nc p(@NotNull C1758Ph0 fqName) {
        InterfaceC1583Nc interfaceC1583NcInvoke;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        WD0 wd0 = this.e;
        QD0 qd0P = wd0.p(fqName);
        if (qd0P != null && (interfaceC1583NcInvoke = this.h.invoke(qd0P)) != null) {
            return interfaceC1583NcInvoke;
        }
        C5638o21 c5638o21 = VD0.a;
        return VD0.a(fqName, wd0, this.d);
    }
}
