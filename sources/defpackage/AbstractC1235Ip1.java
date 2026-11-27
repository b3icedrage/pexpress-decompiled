package defpackage;

import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ip1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1235Ip1 implements TE0 {
    @NotNull
    public abstract Type O();

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof AbstractC1235Ip1) && Intrinsics.a(O(), ((AbstractC1235Ip1) obj).O());
    }

    public final int hashCode() {
        return O().hashCode();
    }

    @Override // defpackage.WD0
    @Nullable
    public QD0 p(C1758Ph0 fqName) {
        Object next;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator<T> it = k().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.a(((QD0) next).h().a(), fqName)) {
                return (QD0) next;
            }
        }
        next = null;
        return (QD0) next;
    }

    @NotNull
    public final String toString() {
        return getClass().getName() + ": " + O();
    }
}
