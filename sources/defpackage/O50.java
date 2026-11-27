package defpackage;

import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class O50 {
    public final a a;

    public static class a extends b {
        public final EditText a;
        public final W50 b;

        public a(@NonNull EditText editText) {
            this.a = editText;
            W50 w50 = new W50(editText);
            this.b = w50;
            editText.addTextChangedListener(w50);
            if (P50.b == null) {
                synchronized (P50.a) {
                    try {
                        if (P50.b == null) {
                            P50 p50 = new P50();
                            try {
                                P50.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, P50.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            P50.b = p50;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            editText.setEditableFactory(P50.b);
        }
    }

    public static class b {
    }

    public O50(@NonNull EditText editText) {
        this.a = new a(editText);
    }
}
