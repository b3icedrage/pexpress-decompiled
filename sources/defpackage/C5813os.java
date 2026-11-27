package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: os, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5813os extends AbstractC5603ns {
    @Override // defpackage.AbstractC5603ns
    @NotNull
    public final <T extends InterfaceC6856tq> InterfaceC6856tq a(@NotNull RI0<T> bindingProvider) {
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        if (Intrinsics.a(bindingProvider, c2251Vp1.b(InterfaceC3698f22.class))) {
            return new C3908g22();
        }
        if (Intrinsics.a(bindingProvider, c2251Vp1.b(InterfaceC3135cM0.class))) {
            return new C3345dM0();
        }
        if (Intrinsics.a(bindingProvider, c2251Vp1.b(InterfaceC3699f3.class))) {
            return new C3909g3();
        }
        if (Intrinsics.a(bindingProvider, c2251Vp1.b(InterfaceC3681ey0.class))) {
            return new C3891fy0();
        }
        if (Intrinsics.a(bindingProvider, c2251Vp1.b(InterfaceC4151hB0.class))) {
            return new C4361iB0();
        }
        if (Intrinsics.a(bindingProvider, c2251Vp1.b(InterfaceC3385dZ1.class))) {
            return new C3594eZ1();
        }
        throw new IllegalStateException(("BindingProviderFactory exception: did not expect this type of " + bindingProvider).toString());
    }
}
