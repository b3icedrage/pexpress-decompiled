package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class FH1 extends EH1 {
    @NotNull
    public static HK a(@NotNull Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return b(new EH0(it, 2));
    }

    @NotNull
    public static HK b(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof HK ? (HK) sequence : new HK(sequence);
    }

    @NotNull
    public static final C2139Ue0 c(@NotNull Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        C5117lb iterator = new C5117lb(2);
        if (!(sequence instanceof C42)) {
            return new C2139Ue0(sequence, new C6433rp(1), iterator);
        }
        C42 c42 = (C42) sequence;
        c42.getClass();
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return new C2139Ue0(c42.a, c42.b, iterator);
    }

    @NotNull
    public static HK d(@NotNull Function0 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return b(new C0907Ek0(nextFunction, new X(nextFunction, 2)));
    }

    @NotNull
    public static <T> Sequence<T> e(@Nullable T t, @NotNull Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return t == null ? C6492s60.a : new C0907Ek0(new C7239vg(t, 6), nextFunction);
    }
}
