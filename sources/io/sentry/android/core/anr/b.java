package io.sentry.android.core.anr;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        a aVar = (a) obj;
        a aVar2 = (a) obj2;
        return Float.compare((aVar.b + 1.0f) * aVar.f * aVar.a, (aVar2.b + 1.0f) * aVar2.f * aVar2.a);
    }
}
