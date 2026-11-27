package defpackage;

import java.util.Comparator;

/* JADX INFO: renamed from: Cq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0769Cq0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return BG.a(Double.valueOf(((C2244Vn0) t2).c), Double.valueOf(((C2244Vn0) t).c));
    }
}
