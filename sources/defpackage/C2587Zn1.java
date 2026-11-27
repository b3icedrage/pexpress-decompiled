package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Zn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2587Zn1 implements InterfaceC1086Gs {
    public static final Handler e = new Handler(Looper.getMainLooper());

    @NotNull
    public final C5502nO1<a> a;
    public int b;
    public final Kf2 c;
    public final C2509Yn1 d;

    /* JADX INFO: renamed from: Zn1$a */
    public static final class a {

        @NotNull
        public final WeakReference<Bitmap> a;
        public int b;
        public boolean c;

        public a(@NotNull WeakReference bitmap, boolean z) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.a = bitmap;
            this.b = 0;
            this.c = z;
        }
    }

    /* JADX INFO: renamed from: Zn1$b */
    public static final class b implements Runnable {
        public final /* synthetic */ Bitmap e;

        public b(Bitmap bitmap) {
            this.e = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2587Zn1.this.d.d(this.e);
        }
    }

    public C2587Zn1(@NotNull Kf2 weakMemoryCache, @NotNull C2509Yn1 bitmapPool) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        this.c = weakMemoryCache;
        this.d = bitmapPool;
        this.a = new C5502nO1<>();
    }

    @Override // defpackage.InterfaceC1086Gs
    public final synchronized void a(@NotNull Bitmap bitmap, boolean z) {
        try {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            int iIdentityHashCode = System.identityHashCode(bitmap);
            if (!z) {
                a aVarE = e(iIdentityHashCode, bitmap);
                if (aVarE == null) {
                    aVarE = new a(new WeakReference(bitmap), false);
                    this.a.e(iIdentityHashCode, aVarE);
                }
                aVarE.c = false;
            } else if (e(iIdentityHashCode, bitmap) == null) {
                this.a.e(iIdentityHashCode, new a(new WeakReference(bitmap), true));
            }
            d();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1086Gs
    public final synchronized boolean b(@NotNull Bitmap bitmap) {
        try {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            int iIdentityHashCode = System.identityHashCode(bitmap);
            a aVarE = e(iIdentityHashCode, bitmap);
            boolean z = false;
            if (aVarE == null) {
                return false;
            }
            int i = aVarE.b - 1;
            aVarE.b = i;
            if (i <= 0 && aVarE.c) {
                z = true;
            }
            if (z) {
                C5502nO1<a> c5502nO1 = this.a;
                int iB = U0.b(c5502nO1.h, iIdentityHashCode, c5502nO1.e);
                if (iB >= 0) {
                    Object[] objArr = c5502nO1.g;
                    Object obj = objArr[iB];
                    Object obj2 = C5502nO1.i;
                    if (obj != obj2) {
                        objArr[iB] = obj2;
                        c5502nO1.d = true;
                    }
                }
                this.c.c(bitmap);
                e.post(new b(bitmap));
            }
            d();
            return z;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1086Gs
    public final synchronized void c(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int iIdentityHashCode = System.identityHashCode(bitmap);
        a aVarE = e(iIdentityHashCode, bitmap);
        if (aVarE == null) {
            aVarE = new a(new WeakReference(bitmap), false);
            this.a.e(iIdentityHashCode, aVarE);
        }
        aVarE.b++;
        d();
    }

    public final void d() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 50) {
            ArrayList arrayList = new ArrayList();
            C5502nO1<a> c5502nO1 = this.a;
            int iG = c5502nO1.g();
            for (int i2 = 0; i2 < iG; i2++) {
                if (c5502nO1.h(i2).a.get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Number) arrayList.get(i3)).intValue();
                Object[] objArr = c5502nO1.g;
                Object obj = objArr[iIntValue];
                Object obj2 = C5502nO1.i;
                if (obj != obj2) {
                    objArr[iIntValue] = obj2;
                    c5502nO1.d = true;
                }
            }
        }
    }

    public final a e(int i, Bitmap bitmap) {
        a aVar = (a) this.a.d(i, null);
        if (aVar == null || aVar.a.get() != bitmap) {
            return null;
        }
        return aVar;
    }
}
