package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: renamed from: Vq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2252Vq implements K81 {
    public final Object d;

    public /* synthetic */ C2252Vq(C1602Nh0 c1602Nh0) {
        C2698aL c2698aL = new C2698aL(c1602Nh0);
        this.d = Im2.a(new PO(Im2.a(new C7970z8(Im2.a(new tn2(c2698aL, Im2.a(new C5571ni2(c2698aL)))), Im2.a(new OV(c2698aL)), c2698aL))));
    }

    @Override // defpackage.K81
    @NonNull
    public C3006bj2 N(View view, @NonNull C3006bj2 c3006bj2) {
        int iA = c3006bj2.a();
        BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) this.d;
        baseTransientBottomBar.n = iA;
        baseTransientBottomBar.o = c3006bj2.b();
        baseTransientBottomBar.p = c3006bj2.c();
        baseTransientBottomBar.g();
        return c3006bj2;
    }

    public C2252Vq(BaseTransientBottomBar baseTransientBottomBar) {
        this.d = baseTransientBottomBar;
    }
}
