package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E7<T> extends RecyclerView.e<H7<T>> {

    @NotNull
    public final G7<T> d = new G7<>();

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e(int i) {
        return ((C3555eM1) this).f.get(i).a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        H7 holder = (H7) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        F7<T> item = ((C3555eM1) this).f.get(i);
        G7<T> g7 = this.d;
        g7.getClass();
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i2 = holder.f;
        C5502nO1<D7<T>> c5502nO1 = g7.a;
        D7 d7 = (D7) c5502nO1.d(i2, null);
        if (d7 == null) {
            d7 = (D7) c5502nO1.d(0, null);
        }
        if (d7 == null) {
            throw new IllegalStateException("Where is fallback delegate?");
        }
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.q(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        G7<T> g7 = this.d;
        g7.getClass();
        Intrinsics.checkNotNullParameter(parent, "parent");
        C5502nO1<D7<T>> c5502nO1 = g7.a;
        D7 d7 = (D7) c5502nO1.d(i, null);
        if (d7 == null) {
            d7 = (D7) c5502nO1.d(0, null);
        }
        if (d7 == null) {
            throw new IllegalStateException("Where is fallback delegate?");
        }
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(d7.b, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflater.inflate(layoutResId, parent, false)");
        return d7.a(viewInflate);
    }
}
