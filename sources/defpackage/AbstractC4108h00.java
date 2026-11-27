package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4108h00 implements M80 {
    public C3595ea e;

    @NotNull
    public final JZ1 d = new JZ1();
    public final boolean g = true;

    @Override // defpackage.InterfaceC5978pf1
    public void a(@NotNull C3595ea amplitude) {
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        e(amplitude);
        JZ1 jz1 = this.d;
        jz1.getClass();
        Intrinsics.checkNotNullParameter(amplitude, "<set-?>");
        jz1.b = amplitude;
    }

    @Override // defpackage.InterfaceC5978pf1
    public final void e(@NotNull C3595ea c3595ea) {
        Intrinsics.checkNotNullParameter(c3595ea, "<set-?>");
        this.e = c3595ea;
    }

    @Override // defpackage.InterfaceC5978pf1
    @Nullable
    public final C0612Aq g(@NotNull C0612Aq event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return null;
    }

    @Override // defpackage.InterfaceC5978pf1
    @NotNull
    public final InterfaceC5978pf1.a getType() {
        return InterfaceC5978pf1.a.g;
    }

    @NotNull
    public final C3595ea h() {
        C3595ea c3595ea = this.e;
        if (c3595ea != null) {
            return c3595ea;
        }
        Intrinsics.l("amplitude");
        throw null;
    }

    @Nullable
    public final void i(@Nullable C0612Aq c0612Aq) {
        if (this.g) {
            JZ1 jz1 = this.d;
            C0612Aq c0612AqB = jz1.b(InterfaceC5978pf1.a.e, jz1.b(InterfaceC5978pf1.a.d, c0612Aq));
            if (c0612AqB != null) {
                if (c0612AqB instanceof C8133zv0) {
                    c((C8133zv0) c0612AqB);
                    return;
                }
                if (c0612AqB instanceof C2796an0) {
                    f((C2796an0) c0612AqB);
                } else if (c0612AqB instanceof C2605Zt1) {
                    d((C2605Zt1) c0612AqB);
                } else {
                    b(c0612AqB);
                }
            }
        }
    }
}
