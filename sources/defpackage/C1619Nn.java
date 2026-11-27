package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1619Nn {

    @Nullable
    public RecyclerView a;

    @NotNull
    public final a b = new a();

    /* JADX INFO: renamed from: Nn$a */
    public static final class a extends RecyclerView.g {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i, int i2) {
            RecyclerView recyclerView;
            if (i != 0 || (recyclerView = C1619Nn.this.a) == null || recyclerView == null) {
                return;
            }
            recyclerView.f0(i);
        }
    }

    public final void a(@Nullable RecyclerView recyclerView) {
        RecyclerView.e adapter;
        RecyclerView.e adapter2;
        RecyclerView recyclerView2 = this.a;
        a aVar = this.b;
        if (recyclerView2 != null && (adapter2 = recyclerView2.getAdapter()) != null) {
            adapter2.a.unregisterObserver(aVar);
        }
        this.a = recyclerView;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.n(aVar);
    }
}
