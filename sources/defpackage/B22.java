package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class B22<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return BG.a(Boolean.valueOf(((C3279d22) t2).w), Boolean.valueOf(((C3279d22) t).w));
    }
}
