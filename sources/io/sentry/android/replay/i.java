package io.sentry.android.replay;

import defpackage.BG;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return BG.a(Long.valueOf(((l) t).b), Long.valueOf(((l) t2).b));
    }
}
