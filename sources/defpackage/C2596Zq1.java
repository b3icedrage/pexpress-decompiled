package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Zq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2596Zq1 {
    public final K01 a;
    public final G60 b;
    public final C4975kt1 c;
    public final C5608nt1 d;
    public final com.bumptech.glide.load.data.b e;
    public final C5857p42 f;
    public final C5616nw0 g;
    public final C8047zX h = new C8047zX();
    public final C6140qR0 i = new C6140qR0();
    public final C5751ob0.c j;

    /* JADX INFO: renamed from: Zq1$a */
    public static class a extends RuntimeException {
    }

    /* JADX INFO: renamed from: Zq1$b */
    public static final class b extends a {
    }

    /* JADX INFO: renamed from: Zq1$c */
    public static class c extends a {
    }

    /* JADX INFO: renamed from: Zq1$d */
    public static class d extends a {
        public d(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: renamed from: Zq1$e */
    public static class e extends a {
    }

    public C2596Zq1() {
        C5751ob0.c cVar = new C5751ob0.c(new C1516Mf1(20), new C5961pb0(), new C6171qb0());
        this.j = cVar;
        this.a = new K01(cVar);
        this.b = new G60();
        this.c = new C4975kt1();
        this.d = new C5608nt1();
        this.e = new com.bumptech.glide.load.data.b();
        this.f = new C5857p42();
        this.g = new C5616nw0();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C4975kt1 c4975kt1 = this.c;
        synchronized (c4975kt1) {
            try {
                ArrayList<String> arrayList2 = new ArrayList(c4975kt1.a);
                c4975kt1.a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    c4975kt1.a.add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        c4975kt1.a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public final void a(@NonNull Class cls, @NonNull E60 e60) {
        G60 g60 = this.b;
        synchronized (g60) {
            g60.a.add(new G60.a(cls, e60));
        }
    }

    @NonNull
    public final void b(@NonNull Class cls, @NonNull InterfaceC5398mt1 interfaceC5398mt1) {
        C5608nt1 c5608nt1 = this.d;
        synchronized (c5608nt1) {
            c5608nt1.a.add(new C5608nt1.a(cls, interfaceC5398mt1));
        }
    }

    @NonNull
    public final void c(@NonNull Class cls, @NonNull Class cls2, @NonNull J01 j01) {
        K01 k01 = this.a;
        synchronized (k01) {
            J11 j11 = k01.a;
            synchronized (j11) {
                try {
                    J11.b bVar = new J11.b(cls, cls2, j01);
                    ArrayList arrayList = j11.a;
                    arrayList.add(arrayList.size(), bVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            k01.b.a.clear();
        }
    }

    @NonNull
    public final void d(@NonNull String str, @NonNull Class cls, @NonNull Class cls2, @NonNull InterfaceC4765jt1 interfaceC4765jt1) {
        C4975kt1 c4975kt1 = this.c;
        synchronized (c4975kt1) {
            c4975kt1.a(str).add(new C4975kt1.a<>(cls, cls2, interfaceC4765jt1));
        }
    }

    @NonNull
    public final ArrayList e() {
        ArrayList arrayList;
        C5616nw0 c5616nw0 = this.g;
        synchronized (c5616nw0) {
            arrayList = c5616nw0.a;
        }
        if (arrayList.isEmpty()) {
            throw new b("Failed to find image header parser.");
        }
        return arrayList;
    }

    @NonNull
    public final <Model> List<I01<Model, ?>> f(@NonNull Model model) {
        List<I01<Model, ?>> listUnmodifiableList;
        K01 k01 = this.a;
        k01.getClass();
        Class<?> cls = model.getClass();
        synchronized (k01) {
            K01.a.C0069a c0069a = (K01.a.C0069a) k01.b.a.get(cls);
            listUnmodifiableList = c0069a == null ? null : c0069a.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(k01.a.b(cls));
                if (((K01.a.C0069a) k01.b.a.put(cls, new K01.a.C0069a(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new c("Failed to find any ModelLoaders registered for model class: " + model.getClass());
        }
        int size = listUnmodifiableList.size();
        List<I01<Model, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            I01<Model, ?> i01 = listUnmodifiableList.get(i);
            if (i01.a(model)) {
                if (z) {
                    arrayList = new ArrayList<>(size - i);
                    z = false;
                }
                arrayList.add(i01);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new c("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + model);
    }

    @NonNull
    public final <X> com.bumptech.glide.load.data.a<X> g(@NonNull X x) {
        com.bumptech.glide.load.data.a<X> aVarB;
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            try {
                UE.d(x);
                com.bumptech.glide.load.data.a.InterfaceC0302a interfaceC0302a = (com.bumptech.glide.load.data.a.InterfaceC0302a) bVar.a.get(x.getClass());
                if (interfaceC0302a == null) {
                    for (com.bumptech.glide.load.data.a.InterfaceC0302a interfaceC0302a2 : bVar.a.values()) {
                        if (interfaceC0302a2.a().isAssignableFrom(x.getClass())) {
                            interfaceC0302a = interfaceC0302a2;
                            break;
                        }
                    }
                }
                if (interfaceC0302a == null) {
                    interfaceC0302a = com.bumptech.glide.load.data.b.b;
                }
                aVarB = interfaceC0302a.b(x);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarB;
    }

    @NonNull
    public final void h(@NonNull com.bumptech.glide.load.data.a.InterfaceC0302a interfaceC0302a) {
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            bVar.a.put(interfaceC0302a.a(), interfaceC0302a);
        }
    }

    @NonNull
    public final void i(@NonNull Class cls, @NonNull Class cls2, @NonNull InterfaceC6867tt1 interfaceC6867tt1) {
        C5857p42 c5857p42 = this.f;
        synchronized (c5857p42) {
            c5857p42.a.add(new C5857p42.a(cls, cls2, interfaceC6867tt1));
        }
    }
}
