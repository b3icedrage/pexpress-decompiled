package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3687f0 implements InterfaceC2973bb1 {

    @NotNull
    public final C2720aS0 a;

    @NotNull
    public final C1705Op1 b;

    @NotNull
    public final T01 c;
    public C6163qZ d;

    @NotNull
    public final VY0<C1758Ph0, InterfaceC2392Xa1> e;

    public AbstractC3687f0(@NotNull C2720aS0 storageManager, @NotNull C1705Op1 finder, @NotNull T01 moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        this.a = storageManager;
        this.b = finder;
        this.c = moduleDescriptor;
        this.e = storageManager.f(new C3477e0(this, 0));
    }

    @Override // defpackage.InterfaceC2548Za1
    @NotNull
    public final List<InterfaceC2392Xa1> a(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return WE.g(this.e.invoke(fqName));
    }

    @Override // defpackage.InterfaceC2973bb1
    public final boolean b(@NotNull C1758Ph0 packageFqName) {
        InputStream inputStreamA;
        InterfaceC0726Cc interfaceC0726CcA;
        Intrinsics.checkNotNullParameter(packageFqName, "fqName");
        VY0<C1758Ph0, InterfaceC2392Xa1> vy0 = this.e;
        Object obj = ((C2720aS0.j) vy0).e.get(packageFqName);
        if (obj == null || obj == C2720aS0.l.e) {
            C6532sI0 c6532sI0 = (C6532sI0) this;
            Intrinsics.checkNotNullParameter(packageFqName, "fqName");
            C1705Op1 c1705Op1 = c6532sI0.b;
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            if (packageFqName.h(C4194hP1.k)) {
                C6661sv.m.getClass();
                String strA = C6661sv.a(packageFqName);
                c1705Op1.b.getClass();
                inputStreamA = C0783Cv.a(strA);
            } else {
                inputStreamA = null;
            }
            interfaceC0726CcA = inputStreamA != null ? C0627Av.a.a(packageFqName, c6532sI0.a, c6532sI0.c, inputStreamA) : null;
        } else {
            interfaceC0726CcA = (InterfaceC2392Xa1) vy0.invoke(packageFqName);
        }
        return interfaceC0726CcA == null;
    }

    @Override // defpackage.InterfaceC2973bb1
    public final void c(@NotNull C1758Ph0 fqName, @NotNull ArrayList packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        UE.b(packageFragments, this.e.invoke(fqName));
    }

    @Override // defpackage.InterfaceC2548Za1
    @NotNull
    public final Collection<C1758Ph0> o(@NotNull C1758Ph0 fqName, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return C6702t60.d;
    }
}
