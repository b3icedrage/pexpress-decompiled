package io.sentry.android.replay.capture;

import defpackage.BG;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class z<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return BG.a(Long.valueOf(((io.sentry.rrweb.b) t).e), Long.valueOf(((io.sentry.rrweb.b) t2).e));
    }
}
