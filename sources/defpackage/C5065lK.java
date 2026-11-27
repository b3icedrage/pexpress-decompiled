package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5065lK implements InterfaceC4855kK {

    @NotNull
    public final ZN a = new ZN();

    @Override // defpackage.InterfaceC4855kK
    public final void a(@NotNull AbstractC4645jK state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ZN zn = this.a;
        zn.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        zn.i(state);
        if (zn.c > 0) {
            zn.m(state);
        }
    }

    @Override // defpackage.InterfaceC4855kK
    @NotNull
    public final ZN getState() {
        return this.a;
    }
}
