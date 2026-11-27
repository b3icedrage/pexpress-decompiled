package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1602Nh0 implements OS1 {
    public final Object d;

    public C1602Nh0(Context context) {
        this.d = context;
    }

    @Override // defpackage.OS1
    @Nullable
    public InterfaceC6013po1 b(@NotNull XY0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // defpackage.OS1
    public void c(@NotNull XY0 key, @NotNull Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ((Kf2) this.d).d(key, bitmap, z, C3057c.g(bitmap));
    }

    public void d(Path path) {
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5231m52 c5231m52 = (C5231m52) arrayList.get(size);
            C7857yc2.a aVar = C7857yc2.a;
            if (c5231m52 != null && !c5231m52.a) {
                C7857yc2.a(path, c5231m52.d.l() / 100.0f, c5231m52.e.l() / 100.0f, c5231m52.f.l() / 360.0f);
            }
        }
    }

    public C1602Nh0() {
        this.d = new ArrayList();
    }

    public C1602Nh0(@NotNull Kf2 weakMemoryCache) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        this.d = weakMemoryCache;
    }

    @Override // defpackage.OS1
    public void a(int i) {
    }
}
