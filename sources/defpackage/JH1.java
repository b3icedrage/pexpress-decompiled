package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
public class JH1 extends GH1 {
    public static <T> int f(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                WE.k();
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> Sequence<T> g(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return sequence;
        }
        return sequence instanceof InterfaceC3494e40 ? ((InterfaceC3494e40) sequence).a(i) : new C2642a40(sequence, i);
    }

    @NotNull
    public static C7439wd0 h(@NotNull Sequence sequence, @NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new C7439wd0(sequence, true, predicate);
    }

    @NotNull
    public static C7439wd0 i(@NotNull Sequence sequence, @NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new C7439wd0(sequence, false, predicate);
    }

    @Nullable
    public static <T> T j(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @NotNull
    public static C2139Ue0 k(@NotNull Sequence sequence, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new C2139Ue0(sequence, transform, IH1.m);
    }

    public static <T> T l(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @NotNull
    public static C42 m(@NotNull Sequence sequence, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new C42(sequence, transform);
    }

    @NotNull
    public static C7439wd0 n(@NotNull Sequence sequence, @NotNull Function1 transform) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        C42 c42 = new C42(sequence, transform);
        Intrinsics.checkNotNullParameter(c42, "<this>");
        return i(c42, new YE1(1));
    }

    @NotNull
    public static C2139Ue0 o(@NotNull C42 c42, Object obj) {
        Intrinsics.checkNotNullParameter(c42, "<this>");
        Object[] elements = {obj};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Sequence[] elements2 = {c42, C1526Mj.i(elements)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return FH1.c(C1526Mj.i(elements2));
    }

    @NotNull
    public static <T> List<T> p(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Iterator<? extends T> it = sequence.iterator();
        if (!it.hasNext()) {
            return C5653o60.d;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return VE.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
