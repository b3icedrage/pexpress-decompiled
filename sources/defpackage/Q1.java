package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class Q1 extends ClickableSpan {
    public final int d;
    public final C5426n2 e;
    public final int g;

    public Q1(int i, @NonNull C5426n2 c5426n2, int i2) {
        this.d = i;
        this.e = c5426n2;
        this.g = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(@NonNull View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.d);
        this.e.a.performAction(this.g, bundle);
    }
}
