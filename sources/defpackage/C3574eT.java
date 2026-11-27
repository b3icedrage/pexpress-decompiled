package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3574eT<T> {

    @NotNull
    public final GP1 a = C1589Ne.i(C6502s82.b);

    @NotNull
    public final EP1<T> a() {
        return (EP1) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final void b(@NotNull EP1 newState) {
        GP1 gp1;
        Object value;
        EP1 ep1;
        Intrinsics.checkNotNullParameter(newState, "newState");
        do {
            gp1 = this.a;
            value = gp1.getValue();
            ep1 = (EP1) value;
            if (ep1 instanceof C0605An1 ? true : Intrinsics.a(ep1, C6502s82.b)) {
                ep1 = newState;
            } else if (ep1 instanceof C4669jS) {
                if (newState.a > ep1.a) {
                    ep1 = newState;
                }
            } else if (!(ep1 instanceof C7649xd0)) {
                throw new C6489s51();
            }
        } while (!gp1.d(value, ep1));
    }
}
