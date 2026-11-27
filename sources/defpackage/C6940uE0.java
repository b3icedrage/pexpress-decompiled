package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6940uE0 extends HE0 {

    @NotNull
    public final InterfaceC3765fM1 G;

    @Nullable
    public final InterfaceC3765fM1 H;

    @NotNull
    public final InterfaceC0671Bj1 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6940uE0(@NotNull FC ownerDescriptor, @NotNull InterfaceC3765fM1 getterMethod, @Nullable InterfaceC3765fM1 interfaceC3765fM1, @NotNull InterfaceC0671Bj1 overriddenProperty) {
        super(ownerDescriptor, InterfaceC2396Xc.a.a, getterMethod.q(), getterMethod.d(), interfaceC3765fM1 != null, overriddenProperty.getName(), getterMethod.i(), null, InterfaceC1490Lx.a.d, false, null);
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
        Intrinsics.checkNotNullParameter(overriddenProperty, "overriddenProperty");
        this.G = getterMethod;
        this.H = interfaceC3765fM1;
        this.I = overriddenProperty;
    }
}
