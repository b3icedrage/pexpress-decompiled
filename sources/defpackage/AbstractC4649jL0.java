package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4649jL0 implements InterfaceC0726Cc, InterfaceC5702oL0 {
    public int d;

    @NotNull
    public abstract List<N62> T0();

    @NotNull
    public abstract C5655o62 U0();

    @NotNull
    public abstract InterfaceC6494s62 V0();

    public abstract boolean W0();

    @NotNull
    public abstract AbstractC4649jL0 X0(@NotNull AbstractC6331rL0 abstractC6331rL0);

    @NotNull
    public abstract P92 Y0();

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4649jL0)) {
            return false;
        }
        AbstractC4649jL0 abstractC4649jL0 = (AbstractC4649jL0) obj;
        if (W0() != abstractC4649jL0.W0()) {
            return false;
        }
        P92 a = Y0();
        P92 b = abstractC4649jL0.Y0();
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        C3136cM1 context = C3136cM1.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return C1589Ne.w(context, a, b);
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.d;
        if (i != 0) {
            return i;
        }
        if (C3686f.n(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (W0() ? 1 : 0) + ((T0().hashCode() + (V0().hashCode() * 31)) * 31);
        }
        this.d = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        return C2979bd.a(U0());
    }

    @NotNull
    public abstract QY0 v();
}
