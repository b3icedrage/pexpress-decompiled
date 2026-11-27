package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MA0 extends Vi2.b {
    public final View b;
    public int c;
    public int d;
    public final int[] e = new int[2];

    public MA0(View view) {
        this.b = view;
    }

    @Override // Vi2.b
    @NonNull
    public final C3006bj2 a(@NonNull C3006bj2 c3006bj2, @NonNull List<Vi2> list) {
        for (Vi2 vi2 : list) {
            if ((vi2.a.c() & 8) != 0) {
                this.b.setTranslationY(C7013uc.c(vi2.a.b(), this.d, 0));
                break;
            }
        }
        return c3006bj2;
    }
}
