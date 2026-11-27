package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: renamed from: p42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5857p42 {
    public final ArrayList a = new ArrayList();

    /* JADX INFO: renamed from: p42$a */
    public static final class a<Z, R> {
        public final Class<Z> a;
        public final Class<R> b;
        public final InterfaceC6867tt1<Z, R> c;

        public a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull InterfaceC6867tt1<Z, R> interfaceC6867tt1) {
            this.a = cls;
            this.b = cls2;
            this.c = interfaceC6867tt1;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList a(@NonNull Class cls, @NonNull Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.a) {
            if ((aVar.a.isAssignableFrom((Class<?>) cls) && cls2.isAssignableFrom(aVar.b)) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }
}
