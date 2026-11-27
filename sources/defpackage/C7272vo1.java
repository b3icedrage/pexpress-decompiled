package defpackage;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7272vo1 implements Kf2 {

    @NotNull
    public final HashMap<XY0, ArrayList<b>> d = new HashMap<>();
    public int e;

    /* JADX INFO: renamed from: vo1$a */
    public static final class a implements InterfaceC6013po1 {

        @NotNull
        public final Bitmap a;
        public final boolean b;

        public a(@NotNull Bitmap bitmap, boolean z) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.a = bitmap;
            this.b = z;
        }

        @Override // defpackage.InterfaceC6013po1
        public final boolean a() {
            return this.b;
        }

        @Override // defpackage.InterfaceC6013po1
        @NotNull
        public final Bitmap b() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: vo1$b */
    public static final class b {
        public final int a;

        @NotNull
        public final WeakReference<Bitmap> b;
        public final boolean c;
        public final int d;

        public b(int i, @NotNull WeakReference<Bitmap> bitmap, boolean z, int i2) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.a = i;
            this.b = bitmap;
            this.c = z;
            this.d = i2;
        }
    }

    /* JADX INFO: renamed from: vo1$c */
    public static final class c<T> implements Predicate<b> {
        public static final c a = new c();

        @Override // java.util.function.Predicate
        public final boolean test(b bVar) {
            b it = bVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.b.get() == null;
        }
    }

    @Override // defpackage.Kf2
    public final synchronized void a(int i) {
        if (i >= 10 && i != 20) {
            e();
        }
    }

    @Override // defpackage.Kf2
    @Nullable
    public final synchronized InterfaceC6013po1 b(@NotNull XY0 key) {
        a aVar;
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            ArrayList<b> arrayList = this.d.get(key);
            a aVar2 = null;
            if (arrayList == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(arrayList, "cache[key] ?: return null");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                b bVar = arrayList.get(i);
                Bitmap it = bVar.b.get();
                if (it != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    aVar = new a(it, bVar.c);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar2 = aVar;
                    break;
                }
            }
            int i2 = this.e;
            this.e = i2 + 1;
            if (i2 >= 10) {
                e();
            }
            return aVar2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.Kf2
    public final synchronized boolean c(@NotNull Bitmap bitmap) {
        boolean z;
        try {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            int iIdentityHashCode = System.identityHashCode(bitmap);
            Collection<ArrayList<b>> collectionValues = this.d.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "cache.values");
            Iterator<T> it = collectionValues.iterator();
            loop0: while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                ArrayList values = (ArrayList) it.next();
                Intrinsics.checkNotNullExpressionValue(values, "values");
                int size = values.size();
                for (int i = 0; i < size; i++) {
                    if (((b) values.get(i)).a == iIdentityHashCode) {
                        values.remove(i);
                        z = true;
                        break loop0;
                    }
                }
            }
            int i2 = this.e;
            this.e = i2 + 1;
            if (i2 >= 10) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Override // defpackage.Kf2
    public final synchronized void d(@NotNull XY0 key, @NotNull Bitmap bitmap, boolean z, int i) {
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            HashMap<XY0, ArrayList<b>> map = this.d;
            ArrayList<b> arrayList = map.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(key, arrayList);
            }
            ArrayList<b> arrayList2 = arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            b bVar = new b(iIdentityHashCode, new WeakReference(bitmap), z, i);
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList2.add(bVar);
                    break;
                }
                b bVar2 = arrayList2.get(i2);
                Intrinsics.checkNotNullExpressionValue(bVar2, "values[index]");
                b bVar3 = bVar2;
                if (i >= bVar3.d) {
                    if (bVar3.a != iIdentityHashCode || bVar3.b.get() != bitmap) {
                        arrayList2.add(i2, bVar);
                        break;
                    } else {
                        arrayList2.set(i2, bVar);
                        break;
                    }
                }
                i2++;
            }
            int i3 = this.e;
            this.e = i3 + 1;
            if (i3 >= 10) {
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e() {
        WeakReference<Bitmap> weakReference;
        this.e = 0;
        Iterator<ArrayList<b>> it = this.d.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
            ArrayList<b> arrayList = next;
            if (arrayList.size() <= 1) {
                b bVar = (b) CollectionsKt.firstOrNull(arrayList);
                if (((bVar == null || (weakReference = bVar.b) == null) ? null : weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                arrayList.removeIf(c.a);
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }
}
