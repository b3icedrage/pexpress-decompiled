package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: aI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2689aI<T> implements InterfaceC1210Ih0<T> {

    @NotNull
    public final List<Pair<Function1<T, Boolean>, InterfaceC1210Ih0<T>>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public C2689aI(@NotNull List<? extends Pair<? extends Function1<? super T, Boolean>, ? extends InterfaceC1210Ih0<? super T>>> formatters) {
        Intrinsics.checkNotNullParameter(formatters, "formatters");
        this.a = formatters;
    }
}
