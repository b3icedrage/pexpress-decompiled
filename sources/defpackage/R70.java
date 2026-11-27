package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class R70 {

    @NotNull
    public static final R70 a = new R70();

    @NotNull
    public static final D70 b = D70.d;

    @NotNull
    public static final C7757y70 c;

    @NotNull
    public static final O70 d;

    @NotNull
    public static final O70 e;

    @NotNull
    public static final Set<InterfaceC0671Bj1> f;

    static {
        A70[] a70Arr = A70.d;
        String str = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        C5638o21 c5638o21M = C5638o21.m(str);
        Intrinsics.checkNotNullExpressionValue(c5638o21M, "special(...)");
        c = new C7757y70(c5638o21M);
        d = c(Q70.CYCLIC_SUPERTYPES, new String[0]);
        e = c(Q70.ERROR_PROPERTY_TYPE, new String[0]);
        f = C5487nJ1.b(new F70());
    }

    @NotNull
    public static final J70 a(@NotNull K70 kind, boolean z, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        if (!z) {
            return new J70(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        }
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams2, "formatParams");
        return new UY1(kind, (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    @NotNull
    public static final J70 b(@NotNull K70 kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @NotNull
    public static final O70 c(@NotNull Q70 kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        C5653o60 arguments = C5653o60.d;
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(formatParams2, "formatParams");
        return e(kind, arguments, d(kind, (String[]) Arrays.copyOf(formatParams2, formatParams2.length)), (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    @NotNull
    public static P70 d(@NotNull Q70 kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new P70(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    @NotNull
    public static O70 e(@NotNull Q70 kind, @NotNull List arguments, @NotNull InterfaceC6494s62 typeConstructor, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        return new O70(typeConstructor, b(K70.ERROR_TYPE_SCOPE, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean f(@Nullable InterfaceC4675jU interfaceC4675jU) {
        if (interfaceC4675jU != null) {
            return (interfaceC4675jU instanceof C7757y70) || (interfaceC4675jU.e() instanceof C7757y70) || interfaceC4675jU == b;
        }
        return false;
    }
}
