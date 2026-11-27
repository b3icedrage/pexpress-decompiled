package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class TX1 extends G1 {
    public final /* synthetic */ Context e;
    public final /* synthetic */ TextPaint f;
    public final /* synthetic */ G1 g;
    public final /* synthetic */ SX1 h;

    public TX1(SX1 sx1, Context context, TextPaint textPaint, G1 g1) {
        this.h = sx1;
        this.e = context;
        this.f = textPaint;
        this.g = g1;
    }

    @Override // defpackage.G1
    public final void o(int i) {
        this.g.o(i);
    }

    @Override // defpackage.G1
    public final void p(@NonNull Typeface typeface, boolean z) {
        this.h.g(this.e, this.f, typeface);
        this.g.p(typeface, z);
    }
}
