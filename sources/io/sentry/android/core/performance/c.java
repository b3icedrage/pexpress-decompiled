package io.sentry.android.core.performance;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Comparable<c> {

    @NotNull
    public final i d = new i();

    @NotNull
    public final i e = new i();

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c cVar2 = cVar;
        int iCompare = Long.compare(this.d.g, cVar2.d.g);
        return iCompare == 0 ? Long.compare(this.e.g, cVar2.e.g) : iCompare;
    }
}
