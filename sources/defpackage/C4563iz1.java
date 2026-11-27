package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: iz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4563iz1 implements InterfaceC4315hz1 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final C1699On1 b;

    public C4563iz1() {
        GP1 gp1I = C1589Ne.i(EnumC4105gz1.d);
        this.a = gp1I;
        this.b = C4466ii.f(gp1I);
    }

    @Override // defpackage.InterfaceC4315hz1
    public final void a(@NotNull EnumC4105gz1 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GP1 gp1 = this.a;
        gp1.getClass();
        gp1.m(null, state);
    }

    @Override // defpackage.InterfaceC4315hz1
    @NotNull
    public final C1699On1 b() {
        return this.b;
    }
}
