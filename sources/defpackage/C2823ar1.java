package defpackage;

import android.os.Trace;
import com.bumptech.glide.a;
import java.util.List;

/* JADX INFO: renamed from: ar1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2823ar1 implements InterfaceC4742jm0<C2596Zq1> {
    public boolean a;
    public final /* synthetic */ a b;
    public final /* synthetic */ List c;
    public final /* synthetic */ AbstractC0972Fg d;

    public C2823ar1(a aVar, List list, AbstractC0972Fg abstractC0972Fg) {
        this.b = aVar;
        this.c = list;
        this.d = abstractC0972Fg;
    }

    @Override // defpackage.InterfaceC4742jm0
    public final C2596Zq1 get() {
        if (this.a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.a = true;
        try {
            return C3033br1.a(this.b, this.c, this.d);
        } finally {
            this.a = false;
            Trace.endSection();
        }
    }
}
