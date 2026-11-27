package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3118cG1 implements Comparable<AbstractC3118cG1> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull AbstractC3118cG1 abstractC3118cG1) {
        return Long.valueOf(i()).compareTo(Long.valueOf(abstractC3118cG1.i()));
    }

    public long e(@NotNull AbstractC3118cG1 abstractC3118cG1) {
        return i() - abstractC3118cG1.i();
    }

    public long f(@Nullable AbstractC3118cG1 abstractC3118cG1) {
        return (abstractC3118cG1 == null || compareTo(abstractC3118cG1) >= 0) ? i() : abstractC3118cG1.i();
    }

    public abstract long i();
}
