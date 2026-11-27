package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SY0 {
    @Nullable
    public static final HashSet a(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<C5638o21> setG = ((QY0) it.next()).g();
            if (setG == null) {
                return null;
            }
            C2904bF.o(hashSet, setG);
        }
        return hashSet;
    }
}
