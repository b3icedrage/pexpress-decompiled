package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: iY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4431iY1 implements TextWatcher {
    public final /* synthetic */ AC0 d;

    public C4431iY1(AC0 ac0) {
        this.d = ac0;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AC0 ac0 = this.d;
        if (ac0 != null) {
            ac0.a();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
