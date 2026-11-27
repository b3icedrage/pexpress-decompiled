package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: vu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7288vu implements InterfaceC7441wd2 {

    @NonNull
    public final RecyclerView d;

    @NonNull
    public final RecyclerView e;

    public C7288vu(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.d = recyclerView;
        this.e = recyclerView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
