package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5998pk1 {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <M extends AbstractC0673Bk0.c<M>, T> T a(@NotNull AbstractC0673Bk0.c<M> cVar, @NotNull AbstractC0673Bk0.e<M, T> extension) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (cVar.l(extension)) {
            return (T) cVar.k(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <M extends AbstractC0673Bk0.c<M>, T> T b(@NotNull AbstractC0673Bk0.c<M> cVar, @NotNull AbstractC0673Bk0.e<M, List<T>> extension, int i) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        cVar.o(extension);
        C0727Cc0<AbstractC0673Bk0.d> c0727Cc0 = cVar.d;
        c0727Cc0.getClass();
        AbstractC0673Bk0.d dVar = extension.d;
        if (!dVar.g) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objE = c0727Cc0.e(dVar);
        if (i >= (objE == null ? 0 : ((List) objE).size())) {
            return null;
        }
        cVar.o(extension);
        if (!dVar.g) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objE2 = c0727Cc0.e(dVar);
        if (objE2 != null) {
            return (T) extension.a(((List) objE2).get(i));
        }
        throw new IndexOutOfBoundsException();
    }
}
