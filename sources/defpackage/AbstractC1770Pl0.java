package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Pl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1770Pl0 extends RY0 {
    public static final /* synthetic */ IJ0<Object>[] d;

    @NotNull
    public final V b;

    @NotNull
    public final I51 c;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        d = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(AbstractC1770Pl0.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public AbstractC1770Pl0(@NotNull C2720aS0 storageManager, @NotNull V containingClass) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.b = containingClass;
        C8053zZ c8053zZ = new C8053zZ(this, 1);
        storageManager.getClass();
        this.c = new C2720aS0.h(storageManager, c8053zZ);
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) Nm2.f(this.c, d[0]);
        if (list.isEmpty()) {
            return C5653o60.d;
        }
        C3558eN1 c3558eN1 = new C3558eN1();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC0671Bj1) && Intrinsics.a(((InterfaceC0671Bj1) obj).getName(), name)) {
                c3558eN1.add(obj);
            }
        }
        return c3558eN1;
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Collection<InterfaceC3765fM1> d(@NotNull C5638o21 name, @NotNull JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) Nm2.f(this.c, d[0]);
        if (list.isEmpty()) {
            return C5653o60.d;
        }
        C3558eN1 c3558eN1 = new C3558eN1();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC3765fM1) && Intrinsics.a(((InterfaceC3765fM1) obj).getName(), name)) {
                c3558eN1.add(obj);
            }
        }
        return c3558eN1;
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    @NotNull
    public final Collection<InterfaceC4675jU> e(@NotNull LY kindFilter, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.a(LY.n.b)) {
            return C5653o60.d;
        }
        return (List) Nm2.f(this.c, d[0]);
    }

    @NotNull
    public abstract List<InterfaceC2076Tj0> h();
}
