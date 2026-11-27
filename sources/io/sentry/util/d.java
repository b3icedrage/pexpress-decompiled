package io.sentry.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static CopyOnWriteArrayList a(@Nullable CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((io.sentry.internal.eventprocessor.a) it.next()).getClass();
                arrayList.add(null);
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}
