package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5972pe {

    @NonNull
    public final TextView a;

    @NonNull
    public final V50 b;

    public C5972pe(@NonNull TextView textView) {
        this.a = textView;
        this.b = new V50(textView);
    }

    @NonNull
    public final InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.b.a.a(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, C3855fm1.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        this.b.a.c(z);
    }

    public final void d(boolean z) {
        this.b.a.d(z);
    }
}
