package defpackage;

import android.text.Editable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class P50 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile P50 b;
    public static Class<?> c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = c;
        return cls != null ? new C5079lO1(cls, charSequence) : super.newEditable(charSequence);
    }
}
