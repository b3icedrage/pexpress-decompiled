package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2883b81 extends AbstractC1112Ha1.c {

    @NotNull
    public final AbstractC1112Ha1 a;

    @NotNull
    public final XF0 b;

    @NotNull
    public final InterfaceC1060Gj0<Long, Long, JM<? super Unit>, Object> c;

    @NotNull
    public final InterfaceC0942Ew d;

    public C2883b81(@NotNull AbstractC1112Ha1 delegate, @NotNull XF0 callContext, @NotNull InterfaceC1060Gj0 listener) {
        InterfaceC0942Ew interfaceC0942EwD;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = delegate;
        this.b = callContext;
        this.c = listener;
        if (delegate instanceof AbstractC1112Ha1.a) {
            interfaceC0942EwD = C7652xe.a(((AbstractC1112Ha1.a) delegate).d());
        } else if (delegate instanceof AbstractC1112Ha1.b) {
            InterfaceC0942Ew.a.getClass();
            interfaceC0942EwD = (InterfaceC0942Ew) InterfaceC0942Ew.a.b.getValue();
        } else if (delegate instanceof AbstractC1112Ha1.c) {
            interfaceC0942EwD = ((AbstractC1112Ha1.c) delegate).d();
        } else {
            if (!(delegate instanceof AbstractC1112Ha1.d)) {
                throw new C6489s51();
            }
            interfaceC0942EwD = SN.a(C6215qm0.d, callContext, true, new C2659a81(this, null)).e;
        }
        this.d = interfaceC0942EwD;
    }

    @Override // defpackage.AbstractC1112Ha1
    @Nullable
    public final Long a() {
        return this.a.a();
    }

    @Override // defpackage.AbstractC1112Ha1
    @Nullable
    public final C4651jM b() {
        return this.a.b();
    }

    @Override // defpackage.AbstractC1112Ha1
    @NotNull
    public final InterfaceC2586Zn0 c() {
        return this.a.c();
    }

    @Override // defpackage.AbstractC1112Ha1.c
    @NotNull
    public final InterfaceC0942Ew d() {
        return C3476e.l(this.d, this.b, this.a.a(), this.c);
    }
}
