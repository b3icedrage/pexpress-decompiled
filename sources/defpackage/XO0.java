package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/LazyKt")
public class XO0 {
    @NotNull
    public static <T> InterfaceC3770fO0<T> a(@NotNull EnumC4403iP0 mode, @NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            return new KW1(initializer, null, 2, null);
        }
        if (iOrdinal == 1) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            C4623jC1 c4623jC1 = new C4623jC1();
            c4623jC1.d = initializer;
            c4623jC1.e = Y72.a;
            return c4623jC1;
        }
        if (iOrdinal != 2) {
            throw new C6489s51();
        }
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        C4146h92 c4146h92 = new C4146h92();
        c4146h92.d = initializer;
        c4146h92.e = Y72.a;
        return c4146h92;
    }

    @NotNull
    public static KW1 b(@NotNull Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new KW1(initializer, null, 2, null);
    }
}
