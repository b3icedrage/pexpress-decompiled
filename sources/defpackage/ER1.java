package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ER1 extends v<C3496e42, b> {

    @NotNull
    public static final a h = new a();
    public final boolean e;

    @NotNull
    public final C4205hT0 f;

    @NotNull
    public final C4415iT0 g;

    public static final class a extends p.e<C3496e42> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C3496e42 c3496e42, C3496e42 c3496e43) {
            C3496e42 oldItem = c3496e42;
            C3496e42 newItem = c3496e43;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C3496e42 c3496e42, C3496e42 c3496e43) {
            C3496e42 oldItem = c3496e42;
            C3496e42 newItem = c3496e43;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.b == newItem.b;
        }
    }

    public static final class b extends RecyclerView.C {

        @NotNull
        public final C3077c42 u;
        public final boolean v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C3077c42 binding, boolean z) {
            super(binding.d);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.u = binding;
            this.v = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ER1(boolean z, @NotNull C4205hT0 onItemClick, @NotNull C4415iT0 onShowDetailsClick) {
        super(h);
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onShowDetailsClick, "onShowDetailsClick");
        this.e = z;
        this.f = onItemClick;
        this.g = onShowDetailsClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        b holder = (b) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C3496e42 c3496e42O = o(i);
        Intrinsics.checkNotNullExpressionValue(c3496e42O, "getItem(...)");
        final C3496e42 item = c3496e42O;
        Intrinsics.checkNotNullParameter(item, "item");
        final C4205hT0 onItemClick = this.f;
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        final C4415iT0 onShowDetailsClick = this.g;
        Intrinsics.checkNotNullParameter(onShowDetailsClick, "onShowDetailsClick");
        C3077c42 c3077c42 = holder.u;
        c3077c42.d.setOnClickListener(new View.OnClickListener() { // from class: FR1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onItemClick.invoke(item);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: GR1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onShowDetailsClick.invoke(item);
            }
        };
        FrameLayout strategySelectionShowDetailsFrame = c3077c42.p;
        strategySelectionShowDetailsFrame.setOnClickListener(onClickListener);
        ImageButton strategySelectionArrowNextButton = c3077c42.e;
        Intrinsics.checkNotNullExpressionValue(strategySelectionArrowNextButton, "strategySelectionArrowNextButton");
        strategySelectionArrowNextButton.setVisibility(8);
        MaterialRadioButton strategySelectionRadioButton = c3077c42.k;
        Intrinsics.checkNotNullExpressionValue(strategySelectionRadioButton, "strategySelectionRadioButton");
        strategySelectionRadioButton.setVisibility(0);
        TextView strategySelectionShowDetails = c3077c42.o;
        Intrinsics.checkNotNullExpressionValue(strategySelectionShowDetails, "strategySelectionShowDetails");
        boolean z = holder.v;
        strategySelectionShowDetails.setVisibility(z ? 0 : 8);
        Intrinsics.checkNotNullExpressionValue(strategySelectionShowDetailsFrame, "strategySelectionShowDetailsFrame");
        strategySelectionShowDetailsFrame.setVisibility(z ? 0 : 8);
        MA1.f(c3077c42, item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C3077c42 c3077c42B = C3077c42.b(LayoutInflater.from(parent.getContext()).inflate(R.layout.trading_strategy_inner_info, parent, false));
        Intrinsics.checkNotNullExpressionValue(c3077c42B, "inflate(...)");
        return new b(c3077c42B, this.e);
    }
}
