package com.google.android.material.snackbar;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final /* synthetic */ BaseTransientBottomBar a;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void a(@NonNull View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.a.b(0);
    }
}
