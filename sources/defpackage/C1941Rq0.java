package defpackage;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: renamed from: Rq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1941Rq0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return BG.a((Float) ((Pair) t2).e, (Float) ((Pair) t).e);
    }
}
