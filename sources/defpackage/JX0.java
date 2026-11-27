package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class JX0 implements K81 {
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;
    public final /* synthetic */ int g;

    public JX0(View view, int i, int i2) {
        this.d = i;
        this.e = view;
        this.g = i2;
    }

    @Override // defpackage.K81
    public final C3006bj2 N(View view, C3006bj2 c3006bj2) {
        int i = c3006bj2.a.f(7).b;
        View view2 = this.e;
        int i2 = this.d;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.g + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return c3006bj2;
    }
}
