package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: zd2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8071zd2 extends Cd2.b<CharSequence> {
    @Override // Cd2.b
    public final CharSequence a(View view) {
        return Cd2.h.b(view);
    }

    @Override // Cd2.b
    public final void b(View view, CharSequence charSequence) {
        Cd2.h.h(view, charSequence);
    }

    @Override // Cd2.b
    public final boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
