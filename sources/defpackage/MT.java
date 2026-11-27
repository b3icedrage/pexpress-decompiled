package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MT {
    public static final <T extends LT> void a(@NotNull T t, @NotNull Function1<? super T, Unit>[] alternativeFormats, @NotNull Function1<? super T, Unit> primaryFormat) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(alternativeFormats, "alternativeFormats");
        Intrinsics.checkNotNullParameter(primaryFormat, "primaryFormat");
        if (!(t instanceof InterfaceC3058c0)) {
            throw new IllegalStateException("impossible");
        }
        Function1[] function1Arr = (Function1[]) Arrays.copyOf(alternativeFormats, alternativeFormats.length);
        F62.e(1, primaryFormat);
        ((InterfaceC3058c0) t).p(function1Arr, primaryFormat);
    }

    public static final void b(@NotNull LT lt, char c) {
        Intrinsics.checkNotNullParameter(lt, "<this>");
        lt.d(String.valueOf(c));
    }

    public static final <T extends LT> void c(@NotNull T t, @NotNull String ifZero, @NotNull Function1<? super T, Unit> format) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(ifZero, "ifZero");
        Intrinsics.checkNotNullParameter(format, "format");
        if (!(t instanceof InterfaceC3058c0)) {
            throw new IllegalStateException("impossible");
        }
        F62.e(1, format);
        ((InterfaceC3058c0) t).b(ifZero, format);
    }
}
