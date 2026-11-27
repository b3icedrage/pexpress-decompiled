package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class U91 extends I0 {

    @NotNull
    public static final U91 a = new U91();

    @NotNull
    public static final List<TB> b;

    static {
        C5638o21 c5638o21 = V91.i;
        PY0.b bVar = PY0.b.b;
        TB tb = new TB(c5638o21, new InterfaceC6510sB[]{bVar, new Wc2.a(1)});
        TB tb2 = new TB(V91.j, new InterfaceC6510sB[]{bVar, new Wc2.a(2)}, PY.g);
        C5638o21 c5638o22 = V91.a;
        Q41 q41 = Q41.a;
        Wc2.a aVar = new Wc2.a(2);
        C4367iD0 c4367iD0 = C4367iD0.a;
        TB tb3 = new TB(c5638o22, new InterfaceC6510sB[]{bVar, q41, aVar, c4367iD0});
        TB tb4 = new TB(V91.b, new InterfaceC6510sB[]{bVar, q41, new Wc2.a(3), c4367iD0});
        TB tb5 = new TB(V91.c, new InterfaceC6510sB[]{bVar, q41, new Wc2.b(), c4367iD0});
        TB tb6 = new TB(V91.g, new InterfaceC6510sB[]{bVar});
        C5638o21 c5638o23 = V91.f;
        Wc2.d dVar = Wc2.d.b;
        AbstractC2527Yt1.a aVar2 = AbstractC2527Yt1.a.c;
        TB tb7 = new TB(c5638o23, new InterfaceC6510sB[]{bVar, dVar, q41, aVar2});
        C5638o21 c5638o24 = V91.h;
        Wc2.c cVar = Wc2.c.b;
        TB tb8 = new TB(c5638o24, new InterfaceC6510sB[]{bVar, cVar});
        TB tb9 = new TB(V91.k, new InterfaceC6510sB[]{bVar, cVar});
        TB tb10 = new TB(V91.l, new InterfaceC6510sB[]{bVar, cVar, aVar2});
        TB tb11 = new TB(V91.p, new InterfaceC6510sB[]{bVar, dVar, q41});
        TB tb12 = new TB(V91.q, new InterfaceC6510sB[]{bVar, dVar, q41});
        TB tb13 = new TB(V91.d, new InterfaceC6510sB[]{PY0.a.b}, QY.h);
        TB tb14 = new TB(V91.e, new InterfaceC6510sB[]{bVar, AbstractC2527Yt1.b.c, dVar, q41});
        TB tb15 = new TB(V91.s, new InterfaceC6510sB[]{bVar, dVar, q41});
        TB tb16 = new TB(V91.r, new InterfaceC6510sB[]{bVar, cVar});
        TB tb17 = new TB(WE.f(V91.n, V91.o), new InterfaceC6510sB[]{bVar}, RY.h);
        TB tb18 = new TB(V91.t, new InterfaceC6510sB[]{bVar, AbstractC2527Yt1.c.c, dVar, q41});
        Regex regex = V91.m;
        InterfaceC6510sB[] checks = {bVar, cVar};
        RB additionalChecks = RB.e;
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
        b = WE.f(tb, tb2, tb3, tb4, tb5, tb6, tb7, tb8, tb9, tb10, tb11, tb12, tb13, tb14, tb15, tb16, tb17, tb18, new TB(null, regex, null, additionalChecks, (InterfaceC6510sB[]) Arrays.copyOf(checks, 2)));
    }
}
