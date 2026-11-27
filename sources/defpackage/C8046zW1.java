package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8046zW1 {

    @NotNull
    public static final T11 a;

    static {
        R70 r70 = R70.a;
        C6073q60 c6073q60 = new C6073q60(R70.b, C4194hP1.f);
        SC sc = SC.d;
        C5638o21 c5638o21F = C4194hP1.g.f();
        C2720aS0.a aVar = C2720aS0.e;
        T11 t11 = new T11(c6073q60, c5638o21F, aVar);
        t11.l = C01.i;
        C5323mZ.h hVar = C5323mZ.e;
        if (hVar == null) {
            T11.H0(9);
            throw null;
        }
        t11.m = hVar;
        List listC = VE.c(I62.Y0(t11, EnumC3610ed2.IN_VARIANCE, C5638o21.k("T"), 0, aVar));
        if (listC == null) {
            T11.H0(14);
            throw null;
        }
        if (t11.o != null) {
            throw new IllegalStateException("Type parameters are already set for " + t11.getName());
        }
        ArrayList arrayList = new ArrayList(listC);
        t11.o = arrayList;
        t11.n = new ZC(t11, arrayList, t11.p, t11.q);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            T11.H0(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((AC) ((InterfaceC2076Tj0) it.next())).d1(t11.y());
        }
        a = t11;
    }
}
