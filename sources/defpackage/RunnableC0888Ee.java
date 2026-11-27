package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: renamed from: Ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0888Ee implements Runnable {
    public final /* synthetic */ TextView d;
    public final /* synthetic */ Typeface e;
    public final /* synthetic */ int g;

    public RunnableC0888Ee(TextView textView, Typeface typeface, int i) {
        this.d = textView;
        this.e = typeface;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.setTypeface(this.e, this.g);
    }
}
