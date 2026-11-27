package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: kt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4975kt1 {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();

    /* JADX INFO: renamed from: kt1$a */
    public static class a<T, R> {
        public final Class<T> a;
        public final Class<R> b;
        public final InterfaceC4765jt1<T, R> c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, InterfaceC4765jt1<T, R> interfaceC4765jt1) {
            this.a = cls;
            this.b = cls2;
            this.c = interfaceC4765jt1;
        }
    }

    @NonNull
    public final synchronized List<a<?, ?>> a(@NonNull String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.a.contains(str)) {
                this.a.add(str);
            }
            arrayList = (List) this.b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList b(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if ((aVar.a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.b)) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }
}
