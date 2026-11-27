package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class P70 implements InterfaceC6494s62 {

    @NotNull
    public final Q70 a;

    @NotNull
    public final String[] b;

    @NotNull
    public final String c;

    public P70(@NotNull Q70 kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.a = kind;
        this.b = formatParams;
        A70[] a70Arr = A70.d;
        String str = kind.d;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String str3 = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{str2}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        this.c = str3;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final Collection<AbstractC4649jL0> a() {
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final List<H62> b() {
        return C5653o60.d;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final InterfaceC5044lD c() {
        R70.a.getClass();
        return R70.c;
    }

    @Override // defpackage.InterfaceC6494s62
    public final boolean e() {
        return false;
    }

    @Override // defpackage.InterfaceC6494s62
    @NotNull
    public final RK0 t() {
        return (TU) TU.f.getValue();
    }

    @NotNull
    public final String toString() {
        return this.c;
    }
}
