package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6671sy0 implements TextWatcher {
    public final /* synthetic */ C6461ry0 d;
    public final /* synthetic */ EnumC7224vc0 e;

    public C6671sy0(C6461ry0 c6461ry0, EnumC7224vc0 enumC7224vc0) {
        this.d = c6461ry0;
        this.e = enumC7224vc0;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        C6461ry0 c6461ry0 = this.d;
        c6461ry0.v.invoke(String.valueOf(charSequence), this.e);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
