package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5483nI0 implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object g;

    public /* synthetic */ C5483nI0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                JE0.a javaResolverCache = JE0.a;
                Intrinsics.checkNotNullExpressionValue(javaResolverCache, "EMPTY");
                C7180vO0 c7180vO0 = (C7180vO0) this.e;
                Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
                LO0 lo0 = c7180vO0.n;
                KE0 ke0 = lo0.a;
                Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
                KE0 components = new KE0(ke0.a, ke0.b, ke0.c, ke0.d, ke0.e, ke0.f, ke0.h, ke0.i, ke0.j, ke0.k, ke0.l, ke0.m, ke0.n, ke0.o, ke0.p, ke0.q, ke0.r, ke0.s, ke0.t, ke0.u, ke0.v, ke0.w);
                Intrinsics.checkNotNullParameter(lo0, "<this>");
                Intrinsics.checkNotNullParameter(components, "components");
                LO0 lo1 = new LO0(components, lo0.b, lo0.c);
                InterfaceC4675jU interfaceC4675jUE = c7180vO0.e();
                Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
                return new C7180vO0(lo1, interfaceC4675jUE, c7180vO0.l, (FC) this.g);
            default:
                return new GO0(((HO0) this.e).a, (FE0) this.g);
        }
    }
}
