package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;
import com.base.feature.activation.screens.big_stories.ActivationBigStoriesFragment;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4082gs extends v<C0615Ar, C4541is> {

    @NotNull
    public static final a f = new a();

    @NotNull
    public final ActivationBigStoriesFragment.c e;

    /* JADX INFO: renamed from: gs$a */
    public static final class a extends p.e<C0615Ar> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C0615Ar c0615Ar, C0615Ar c0615Ar2) {
            C0615Ar oldItem = c0615Ar;
            C0615Ar newItem = c0615Ar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C0615Ar c0615Ar, C0615Ar c0615Ar2) {
            C0615Ar oldItem = c0615Ar;
            C0615Ar newItem = c0615Ar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.a(oldItem.b, newItem.b);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final Object c(C0615Ar c0615Ar, C0615Ar c0615Ar2) {
            C0615Ar oldItem = c0615Ar;
            C0615Ar newItem = c0615Ar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (newItem.c) {
                return Boolean.TRUE;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4082gs(@NotNull ActivationBigStoriesFragment.c onItemClick) {
        super(f);
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.e = onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        C4541is holder = (C4541is) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C0615Ar c0615ArO = o(i);
        Intrinsics.checkNotNullExpressionValue(c0615ArO, "getItem(...)");
        final C0615Ar item = c0615ArO;
        Intrinsics.checkNotNullParameter(item, "item");
        final ActivationBigStoriesFragment.c onItemClick = this.e;
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        E6 e6 = holder.u;
        ImageView activationStoriesRecyclerItemImage = e6.g;
        Intrinsics.checkNotNullExpressionValue(activationStoriesRecyclerItemImage, "activationStoriesRecyclerItemImage");
        C3435dm0.b(activationStoriesRecyclerItemImage, item.b);
        e6.h.setText(e6.d.getContext().getString(item.a));
        e6.e.setOnClickListener(new View.OnClickListener() { // from class: hs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onItemClick.invoke(item);
            }
        });
        if (item.c) {
            e6.d.setBackground(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void h(RecyclerView.C c, int i, List payloads) {
        C4541is holder = (C4541is) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            g(holder, i);
        } else {
            holder.u.d.setBackground(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.activation_stories_recycler_item, parent, false);
        int i2 = R.id.activation_stories_recycler_item_container;
        MaterialCardView materialCardView = (MaterialCardView) C3476e.h(viewInflate, R.id.activation_stories_recycler_item_container);
        if (materialCardView != null) {
            i2 = R.id.activation_stories_recycler_item_image;
            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.activation_stories_recycler_item_image);
            if (imageView != null) {
                i2 = R.id.activation_stories_recycler_item_name;
                TextView textView = (TextView) C3476e.h(viewInflate, R.id.activation_stories_recycler_item_name);
                if (textView != null) {
                    E6 e6 = new E6((FrameLayout) viewInflate, materialCardView, imageView, textView);
                    Intrinsics.checkNotNullExpressionValue(e6, "inflate(...)");
                    return new C4541is(e6);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }
}
