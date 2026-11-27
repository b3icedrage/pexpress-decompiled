package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class VN0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return BG.a(Long.valueOf(((UN0.a) t).b), Long.valueOf(((UN0.a) t2).b));
    }
}
