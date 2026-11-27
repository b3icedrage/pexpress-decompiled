package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class J11 {
    public static final c e = new c();
    public static final a f = new a();
    public final ArrayList a;
    public final c b;
    public final HashSet c;
    public final C5751ob0.c d;

    public static class a implements I01<Object, Object> {
        @Override // defpackage.I01
        public final boolean a(@NonNull Object obj) {
            return false;
        }

        @Override // defpackage.I01
        public final I01.a<Object> b(@NonNull Object obj, int i, int i2, @NonNull C4227ha1 c4227ha1) {
            return null;
        }
    }

    public static class b<Model, Data> {
        public final Class<Model> a;
        public final Class<Data> b;
        public final J01<? extends Model, ? extends Data> c;

        public b(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull J01<? extends Model, ? extends Data> j01) {
            this.a = cls;
            this.b = cls2;
            this.c = j01;
        }
    }

    public static class c {
    }

    public J11(@NonNull C5751ob0.c cVar) {
        c cVar2 = e;
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = cVar;
        this.b = cVar2;
    }

    @NonNull
    public final synchronized <Model, Data> I01<Model, Data> a(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b bVar : this.a) {
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.a.isAssignableFrom(cls) && bVar.b.isAssignableFrom(cls2)) {
                    this.c.add(bVar);
                    arrayList.add(bVar.c.d(this));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.b;
                C5751ob0.c cVar2 = this.d;
                cVar.getClass();
                return new I11(arrayList, cVar2);
            }
            if (arrayList.size() == 1) {
                return (I01) arrayList.get(0);
            }
            if (z) {
                return f;
            }
            throw new C2596Zq1.c("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList b(@NonNull Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.a) {
                if (!this.c.contains(bVar) && bVar.a.isAssignableFrom((Class<?>) cls)) {
                    this.c.add(bVar);
                    arrayList.add(bVar.c.d(this));
                    this.c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList c(@NonNull Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a.isAssignableFrom((Class<?>) cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }
}
