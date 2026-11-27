package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class CI0 implements QY0 {
    public static final /* synthetic */ IJ0<Object>[] f;

    @NotNull
    public final LO0 b;

    @NotNull
    public final GO0 c;

    @NotNull
    public final KO0 d;

    @NotNull
    public final I51 e;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        f = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(CI0.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public CI0(@NotNull LO0 c, @NotNull FE0 jPackage, @NotNull GO0 packageFragment) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.b = c;
        this.c = packageFragment;
        this.d = new KO0(c, jPackage, packageFragment);
        C2720aS0 c2720aS0 = c.a.a;
        D1 d1 = new D1(this, 2);
        c2720aS0.getClass();
        this.e = new C2720aS0.h(c2720aS0, d1);
    }

    @Override // defpackage.QY0
    @NotNull
    public final Set<C5638o21> a() {
        QY0[] qy0ArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (QY0 qy0 : qy0ArrH) {
            C2904bF.o(linkedHashSet, qy0.a());
        }
        linkedHashSet.addAll(this.d.a());
        return linkedHashSet;
    }

    @Override // defpackage.QY0
    @NotNull
    public final Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        i(name, location);
        QY0[] qy0ArrH = h();
        Collection collectionB = this.d.b(name, location);
        for (QY0 qy0 : qy0ArrH) {
            collectionB = QD1.a(collectionB, qy0.b(name, location));
        }
        return collectionB == null ? C6702t60.d : collectionB;
    }

    @Override // defpackage.QY0
    @NotNull
    public final Set<C5638o21> c() {
        QY0[] qy0ArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (QY0 qy0 : qy0ArrH) {
            C2904bF.o(linkedHashSet, qy0.c());
        }
        linkedHashSet.addAll(this.d.c());
        return linkedHashSet;
    }

    @Override // defpackage.QY0
    @NotNull
    public final Collection<InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        i(name, location);
        QY0[] qy0ArrH = h();
        Collection<InterfaceC3765fM1> collectionD = this.d.d(name, location);
        for (QY0 qy0 : qy0ArrH) {
            collectionD = QD1.a(collectionD, qy0.d(name, location));
        }
        return collectionD == null ? C6702t60.d : collectionD;
    }

    @Override // defpackage.InterfaceC2602Zs1
    @NotNull
    public final Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        QY0[] qy0ArrH = h();
        Collection<InterfaceC4675jU> collectionE = this.d.e(kindFilter, nameFilter);
        for (QY0 qy0 : qy0ArrH) {
            collectionE = QD1.a(collectionE, qy0.e(kindFilter, nameFilter));
        }
        return collectionE == null ? C6702t60.d : collectionE;
    }

    @Override // defpackage.InterfaceC2602Zs1
    @Nullable
    public final InterfaceC5044lD f(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        i(name, location);
        KO0 ko0 = this.d;
        ko0.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        InterfaceC5044lD interfaceC5044lD = null;
        FC fcV = ko0.v(name, null);
        if (fcV != null) {
            return fcV;
        }
        for (QY0 qy0 : h()) {
            InterfaceC5044lD interfaceC5044lDF = qy0.f(name, location);
            if (interfaceC5044lDF != null) {
                if (!(interfaceC5044lDF instanceof InterfaceC5257mD) || !((GY0) interfaceC5044lDF).Q()) {
                    return interfaceC5044lDF;
                }
                if (interfaceC5044lD == null) {
                    interfaceC5044lD = interfaceC5044lDF;
                }
            }
        }
        return interfaceC5044lD;
    }

    @Override // defpackage.QY0
    @Nullable
    public final Set<C5638o21> g() {
        HashSet hashSetA = SY0.a(C1526Mj.h(h()));
        if (hashSetA == null) {
            return null;
        }
        hashSetA.addAll(this.d.g());
        return hashSetA;
    }

    public final QY0[] h() {
        return (QY0[]) Nm2.f(this.e, f[0]);
    }

    public final void i(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        KE0 ke0 = this.b.a;
        C5208m0.n(ke0.n, location, this.c, name);
    }

    @NotNull
    public final String toString() {
        return "scope for " + this.c;
    }
}
