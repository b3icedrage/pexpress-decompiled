package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class L51 extends AbstractC0961Fc0 {

    @NotNull
    public final EnumC6594sc0 a;

    public L51() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L51) && this.a == ((L51) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "NotValidFieldState(cause=" + this.a + ")";
    }

    public L51(@NotNull EnumC6594sc0 cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.a = cause;
    }

    public /* synthetic */ L51(int i) {
        this(EnumC6594sc0.d);
    }
}
