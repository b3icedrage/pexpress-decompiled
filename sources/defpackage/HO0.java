package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class HO0 implements InterfaceC2973bb1 {

    @NotNull
    public final LO0 a;

    @NotNull
    public final InterfaceC5618nx<C1758Ph0, GO0> b;

    public HO0(@NotNull KE0 components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.a = new LO0(components, L62.a.a, new C5669oA0());
        this.b = components.a.d();
    }

    @Override // defpackage.InterfaceC2548Za1
    @NotNull
    public final List<GO0> a(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return VE.c(d(fqName));
    }

    @Override // defpackage.InterfaceC2973bb1
    public final boolean b(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.a.a.b.getClass();
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        new C1001Fp1(fqName);
        return false;
    }

    @Override // defpackage.InterfaceC2973bb1
    public final void c(@NotNull C1758Ph0 fqName, @NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        UE.b(packageFragments, d(fqName));
    }

    public final GO0 d(C1758Ph0 fqName) throws Throwable {
        this.a.a.b.getClass();
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        C5483nI0 c5483nI0 = new C5483nI0(1, this, new C1001Fp1(fqName));
        C2720aS0.b bVar = (C2720aS0.b) this.b;
        bVar.getClass();
        Object objInvoke = bVar.invoke(new C2720aS0.e(fqName, c5483nI0));
        if (objInvoke != null) {
            return (GO0) objInvoke;
        }
        C2720aS0.b.a(3);
        throw null;
    }

    @Override // defpackage.InterfaceC2548Za1
    public final Collection o(C1758Ph0 fqName, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        List<C1758Ph0> listInvoke = d(fqName).o.invoke();
        return listInvoke == null ? C5653o60.d : listInvoke;
    }

    @NotNull
    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.a.a.o;
    }
}
