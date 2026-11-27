package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2603Zt implements Fe2.b {
    @Override // Fe2.b
    @NonNull
    public final C3006bj2 a(View view, @NonNull C3006bj2 c3006bj2, @NonNull Fe2.c cVar) {
        cVar.d = c3006bj2.a() + cVar.d;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        boolean z = view.getLayoutDirection() == 1;
        int iB = c3006bj2.b();
        int iC = c3006bj2.c();
        int i = cVar.a + (z ? iC : iB);
        cVar.a = i;
        int i2 = cVar.c;
        if (!z) {
            iB = iC;
        }
        int i3 = i2 + iB;
        cVar.c = i3;
        view.setPaddingRelative(i, cVar.b, i3, cVar.d);
        return c3006bj2;
    }
}
