package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class Ee2 implements Runnable {
    public final /* synthetic */ View d;

    public Ee2(View view) {
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.d;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
