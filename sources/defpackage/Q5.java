package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class Q5 implements InterfaceC7441wd2 {

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final RecyclerView e;

    public Q5(@NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView) {
        this.d = frameLayout;
        this.e = recyclerView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
