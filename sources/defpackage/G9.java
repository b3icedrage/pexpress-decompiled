package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class G9 implements TextWatcher {
    public final /* synthetic */ C6262r10 d;

    public G9(C6262r10 c6262r10) {
        this.d = c6262r10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Nullable Editable editable) {
        this.d.e.setEnabled(!(editable == null || editable.length() == 0));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}
