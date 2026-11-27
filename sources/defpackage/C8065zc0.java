package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8065zc0 implements InterfaceC2391Xa0 {
    @Override // defpackage.InterfaceC2391Xa0
    @NotNull
    public final InterfaceC2391Xa0.a a() {
        return InterfaceC2391Xa0.a.g;
    }

    @Override // defpackage.InterfaceC2391Xa0
    @NotNull
    public final InterfaceC2391Xa0.b b(@NotNull InterfaceC1335Jx superDescriptor, @NotNull InterfaceC1335Jx subDescriptor, @Nullable FC fc) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        boolean z = subDescriptor instanceof InterfaceC0671Bj1;
        InterfaceC2391Xa0.b bVar = InterfaceC2391Xa0.b.g;
        if (!z || !(superDescriptor instanceof InterfaceC0671Bj1)) {
            return bVar;
        }
        InterfaceC0671Bj1 interfaceC0671Bj1 = (InterfaceC0671Bj1) subDescriptor;
        InterfaceC0671Bj1 interfaceC0671Bj2 = (InterfaceC0671Bj1) superDescriptor;
        if (!Intrinsics.a(interfaceC0671Bj1.getName(), interfaceC0671Bj2.getName())) {
            return bVar;
        }
        if (LL.h(interfaceC0671Bj1) && LL.h(interfaceC0671Bj2)) {
            return InterfaceC2391Xa0.b.d;
        }
        return (LL.h(interfaceC0671Bj1) || LL.h(interfaceC0671Bj2)) ? InterfaceC2391Xa0.b.e : bVar;
    }
}
