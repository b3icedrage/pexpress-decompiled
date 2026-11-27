package defpackage;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4172hI0 implements HC {

    @NotNull
    public static final a d;
    public static final /* synthetic */ IJ0<Object>[] e;

    @NotNull
    public static final C1758Ph0 f;

    @NotNull
    public static final C5638o21 g;

    @NotNull
    public static final QC h;

    @NotNull
    public final T01 a;

    @NotNull
    public final Function1<S01, InterfaceC4675jU> b;

    @NotNull
    public final I51 c;

    /* JADX INFO: renamed from: hI0$a */
    public static final class a {
    }

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        e = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(C4172hI0.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        d = new a();
        f = C4194hP1.l;
        C1836Qh0 c1836Qh0 = C4194hP1.a.c;
        C5638o21 c5638o21F = c1836Qh0.f();
        Intrinsics.checkNotNullExpressionValue(c5638o21F, "shortName(...)");
        g = c5638o21F;
        C1758Ph0 topLevelFqName = c1836Qh0.g();
        Intrinsics.checkNotNullExpressionValue(topLevelFqName, "toSafe(...)");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        C1758Ph0 c1758Ph0E = topLevelFqName.e();
        h = new QC(c1758Ph0E, SI0.a(c1758Ph0E, "parent(...)", topLevelFqName, "shortName(...)"));
    }

    public C4172hI0() {
        throw null;
    }

    public C4172hI0(C2720aS0 storageManager, T01 moduleDescriptor) {
        C3962gI0 computeContainingDeclaration = C3962gI0.e;
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(computeContainingDeclaration, "computeContainingDeclaration");
        this.a = moduleDescriptor;
        this.b = computeContainingDeclaration;
        this.c = new C2720aS0.h(storageManager, new C3752fI0(0, this, storageManager));
    }

    @Override // defpackage.HC
    @Nullable
    public final FC a(@NotNull QC classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        if (!Intrinsics.a(classId, h)) {
            return null;
        }
        return (IC) Nm2.f(this.c, e[0]);
    }

    @Override // defpackage.HC
    @NotNull
    public final Collection<FC> b(@NotNull C1758Ph0 packageFqName) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        if (!Intrinsics.a(packageFqName, f)) {
            return C6702t60.d;
        }
        return C5487nJ1.b((IC) Nm2.f(this.c, e[0]));
    }

    @Override // defpackage.HC
    public final boolean c(@NotNull C1758Ph0 packageFqName, @NotNull C5638o21 name) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.a(name, g) && Intrinsics.a(packageFqName, f);
    }
}
