package androidx.work;

import androidx.annotation.NonNull;
import defpackage.GA0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends GA0 {
    @Override // defpackage.GA0
    @NonNull
    public final b a(@NonNull ArrayList arrayList) throws Throwable {
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((b) it.next()).a));
        }
        aVar.a(map);
        b bVar = new b(aVar.a);
        b.c(bVar);
        return bVar;
    }
}
