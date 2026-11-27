package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: iE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnScrollChangeListenerC4371iE1 implements View.OnScrollChangeListener {
    public final /* synthetic */ C4839kE1 a;

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        C4839kE1 c4839kE1 = this.a;
        if (!c4839kE1.a || Build.VERSION.SDK_INT > 27) {
            return;
        }
        c4839kE1.a = false;
        view.scrollTo(0, i4);
    }
}
