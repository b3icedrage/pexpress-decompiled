package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class WE extends VE {
    @NotNull
    public static IntRange d(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static <T> int e(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    @NotNull
    public static <T> List<T> f(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? C1371Kj.b(elements) : C5653o60.d;
    }

    @NotNull
    public static <T> List<T> g(@Nullable T t) {
        return t != null ? VE.c(t) : C5653o60.d;
    }

    @NotNull
    public static ArrayList h(@NotNull Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C5572nj(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> i(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : VE.c(list.get(0));
        }
        return C5653o60.d;
    }

    public static final void j(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i2, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i2 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i + ").");
    }

    public static void k() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void l() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
