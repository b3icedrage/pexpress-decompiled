package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: so1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6642so1 implements OS1 {
    public final C6852to1 d;
    public final Kf2 e;
    public final InterfaceC1086Gs g;

    /* JADX INFO: renamed from: so1$a */
    public static final class a implements InterfaceC6013po1 {

        @NotNull
        public final Bitmap a;
        public final boolean b;
        public final int c;

        public a(@NotNull Bitmap bitmap, boolean z, int i) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.a = bitmap;
            this.b = z;
            this.c = i;
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

    public C6642so1(@NotNull Kf2 weakMemoryCache, @NotNull InterfaceC1086Gs referenceCounter, int i) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        this.e = weakMemoryCache;
        this.g = referenceCounter;
        this.d = new C6852to1(this, i);
    }

    @Override // defpackage.OS1
    public final synchronized void a(int i) {
        if (i >= 40) {
            synchronized (this) {
                this.d.trimToSize(-1);
            }
        } else if (10 <= i && 20 > i) {
            C6852to1 c6852to1 = this.d;
            c6852to1.trimToSize(c6852to1.size() / 2);
        }
    }

    @Override // defpackage.OS1
    public final InterfaceC6013po1 b(XY0 key) {
        a aVar;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(key, "key");
            aVar = this.d.get(key);
        }
        return aVar;
    }

    @Override // defpackage.OS1
    public final synchronized void c(@NotNull XY0 key, @NotNull Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int iG = C3057c.g(bitmap);
        if (iG > this.d.maxSize()) {
            if (this.d.remove(key) == null) {
                this.e.d(key, bitmap, z, iG);
            }
        } else {
            this.g.c(bitmap);
            this.d.put(key, new a(bitmap, z, iG));
        }
    }
}
