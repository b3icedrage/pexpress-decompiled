package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Ad2 extends Cd2.b<CharSequence> {
    @Override // Cd2.b
    public final CharSequence a(View view) {
        return Cd2.j.b(view);
    }

    @Override // Cd2.b
    public final void b(View view, CharSequence charSequence) {
        Cd2.j.e(view, charSequence);
    }

    @Override // Cd2.b
    public final boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
