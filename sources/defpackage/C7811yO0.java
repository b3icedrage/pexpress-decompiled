package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7811yO0 implements Function1 {
    public final FO0 d;
    public final LO0 e;

    public C7811yO0(FO0 fo0, LO0 lo0) {
        this.d = fo0;
        this.e = lo0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C5638o21 name = (C5638o21) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        FO0 fo0 = this.d;
        boolean zContains = fo0.r.invoke().contains(name);
        FC fc = fo0.n;
        LO0 lo0 = this.e;
        if (zContains) {
            KE0 ke0 = lo0.a;
            QC qcF = C4900kZ.f(fc);
            Intrinsics.checkNotNull(qcF);
            C7065up1 c7065up1A = ke0.b.a(new C3740fE0(qcF.d(name), fo0.o, 2));
            if (c7065up1A != null) {
                C7180vO0 c7180vO0 = new C7180vO0(lo0, fc, c7065up1A, null);
                lo0.a.s.m(c7180vO0);
                return c7180vO0;
            }
        } else if (fo0.s.invoke().contains(name)) {
            CQ0 cq0B = VE.b();
            lo0.a.x.e(fc, name, cq0B, lo0);
            CQ0 cq0A = VE.a(cq0B);
            int g = cq0A.getG();
            if (g != 0) {
                if (g == 1) {
                    return (FC) CollectionsKt.U(cq0A);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + cq0A).toString());
            }
        } else {
            InterfaceC6520sE0 interfaceC6520sE0 = fo0.t.invoke().get(name);
            if (interfaceC6520sE0 != null) {
                C2720aS0 c2720aS0 = lo0.a.a;
                C4640jI0 c4640jI0 = new C4640jI0(fo0, 3);
                c2720aS0.getClass();
                C2720aS0.h hVar = new C2720aS0.h(c2720aS0, c4640jI0);
                KE0 ke1 = lo0.a;
                return C5867p70.T0(ke1.a, fo0.n, name, hVar, C3043bv.h(lo0, interfaceC6520sE0), ke1.j.a(interfaceC6520sE0));
            }
        }
        return null;
    }
}
