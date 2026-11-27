package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VP1 extends RY0 {
    public static final /* synthetic */ IJ0<Object>[] f;

    @NotNull
    public final FZ b;
    public final boolean c;

    @NotNull
    public final I51 d;

    @NotNull
    public final I51 e;

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        f = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(VP1.class), "functions", "getFunctions()Ljava/util/List;")), c2251Vp1.g(new C1373Kj1(c2251Vp1.b(VP1.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public VP1(@NotNull C2720aS0 storageManager, @NotNull FZ containingClass, boolean z) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.b = containingClass;
        this.c = z;
        SC sc = SC.d;
        C7522x1 c7522x1 = new C7522x1(this, 3);
        storageManager.getClass();
        this.d = new C2720aS0.h(storageManager, c7522x1);
        this.e = new C2720aS0.h(storageManager, new DZ(this, 2));
    }

    @Override // defpackage.RY0, defpackage.QY0
    @NotNull
    public final Collection b(@NotNull C5638o21 name, @NotNull S41 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) Nm2.f(this.e, f[1]);
        C3558eN1 c3558eN1 = new C3558eN1();
        for (Object obj : list) {
            if (Intrinsics.a(((InterfaceC0671Bj1) obj).getName(), name)) {
                c3558eN1.add(obj);
            }
        }
        return c3558eN1;
    }

    @Override // defpackage.RY0, defpackage.QY0
    public final Collection d(C5638o21 name, JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) Nm2.f(this.d, f[0]);
        C3558eN1 c3558eN1 = new C3558eN1();
        for (Object obj : list) {
            if (Intrinsics.a(((InterfaceC3765fM1) obj).getName(), name)) {
                c3558eN1.add(obj);
            }
        }
        return c3558eN1;
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    public final Collection e(LY kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        IJ0<Object>[] ij0Arr = f;
        return CollectionsKt.Q((List) Nm2.f(this.d, ij0Arr[0]), (List) Nm2.f(this.e, ij0Arr[1]));
    }

    @Override // defpackage.RY0, defpackage.InterfaceC2602Zs1
    public final InterfaceC5044lD f(C5638o21 name, JT0 location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }
}
