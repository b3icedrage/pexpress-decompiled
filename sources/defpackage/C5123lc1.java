package defpackage;

import java.util.Comparator;

/* JADX INFO: renamed from: lc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5123lc1<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return BG.a(Integer.valueOf(((C4235hc1) t2).a), Integer.valueOf(((C4235hc1) t).a));
    }
}
