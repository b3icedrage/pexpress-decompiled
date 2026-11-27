package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3488e22 extends v<C3279d22, C5006l22> {

    @NotNull
    public static final a g = new a();

    @NotNull
    public final AbstractC5603ns e;

    @NotNull
    public final C5812or1 f;

    /* JADX INFO: renamed from: e22$a */
    public static final class a extends p.e<C3279d22> {
        public static boolean d(C3279d22 c3279d22, C3279d22 c3279d23) {
            return Intrinsics.a(c3279d22.c, c3279d23.c) && Intrinsics.a(c3279d22.f, c3279d23.f) && Intrinsics.a(c3279d22.g, c3279d23.g) && Intrinsics.a(c3279d22.h, c3279d23.h) && c3279d22.i == c3279d23.i && c3279d22.v == c3279d23.v;
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C3279d22 c3279d22, C3279d22 c3279d23) {
            C3279d22 oldItem = c3279d22;
            C3279d22 newItem = c3279d23;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.u == newItem.u && d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C3279d22 c3279d22, C3279d22 c3279d23) {
            C3279d22 oldItem = c3279d22;
            C3279d22 newItem = c3279d23;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.a(oldItem.c, newItem.c);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final Object c(C3279d22 c3279d22, C3279d22 c3279d23) {
            C3279d22 oldItem = c3279d22;
            C3279d22 newItem = c3279d23;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem.u == newItem.u || !d(oldItem, newItem)) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("ONLY_DISABLED", true);
            return bundle;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3488e22(@NotNull AbstractC5603ns bindingFactory, @NotNull C5812or1 onItemClick) {
        super(g);
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.e = bindingFactory;
        this.f = onItemClick;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i) {
        int color;
        final C5006l22 holder = (C5006l22) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C3279d22 c3279d22O = o(i);
        Intrinsics.checkNotNullExpressionValue(c3279d22O, "getItem(...)");
        final C3279d22 tradingAsset = c3279d22O;
        Intrinsics.checkNotNullParameter(tradingAsset, "tradingAsset");
        String str = tradingAsset.c;
        InterfaceC3698f22 interfaceC3698f22 = holder.u;
        interfaceC3698f22.getTitle().setText(str);
        ImageView icon = interfaceC3698f22.getIcon();
        Intrinsics.checkNotNullParameter(icon, "<this>");
        String icon2 = tradingAsset.h;
        Intrinsics.checkNotNullParameter(icon2, "icon");
        C3435dm0.c(icon, icon2, R.drawable.ic_trading_asset_not_loaded_icon);
        TextView textViewH = interfaceC3698f22.h();
        String strC = tradingAsset.c();
        if (strC == null) {
            strC = "—";
        }
        textViewH.setText(strC);
        boolean z = tradingAsset.v;
        interfaceC3698f22.b().setEnabled(!z);
        interfaceC3698f22.h().setSelected(z);
        LinearLayout linearLayoutZ = interfaceC3698f22.z();
        boolean z2 = tradingAsset.u;
        Intrinsics.checkNotNullParameter(linearLayoutZ, "<this>");
        linearLayoutZ.setAlpha(!z2 ? 1.0f : 0.3f);
        interfaceC3698f22.getTitle().setTypeface(null, z ? 1 : 0);
        interfaceC3698f22.b().setOnClickListener(new View.OnClickListener() { // from class: k22
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5006l22 c5006l22 = holder;
                c5006l22.v.invoke(tradingAsset);
            }
        });
        Intrinsics.checkNotNullParameter(tradingAsset, "tradingAsset");
        Context context = interfaceC3698f22.b().getContext();
        TextView textViewH2 = interfaceC3698f22.h();
        Intrinsics.checkNotNull(context);
        boolean z3 = tradingAsset.c() != null;
        Integer num = tradingAsset.f;
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i2 = R.color.textGrey;
        if (!z3) {
            color = context.getColor(R.color.textGrey);
        } else if (z) {
            color = C6333rM.getColor(context, R.color.percentsTextColorSelected);
        } else {
            if (num != null) {
                if (C5006l22.w.e(num.intValue())) {
                    i2 = R.color.percentsTextBestColor;
                } else if (num != null) {
                    if (C5006l22.x.e(num.intValue())) {
                        i2 = R.color.white;
                    }
                }
            } else if (num != null) {
                if (C5006l22.x.e(num.intValue())) {
                    i2 = R.color.white;
                }
            }
            color = context.getColor(i2);
        }
        textViewH2.setTextColor(color);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RI0 bindingProvider = C2017Sp1.a.b(InterfaceC3698f22.class);
        AbstractC5603ns abstractC5603ns = this.e;
        abstractC5603ns.getClass();
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        InterfaceC3698f22 bindingProvider2 = (InterfaceC3698f22) abstractC5603ns.a(bindingProvider);
        C6621sj.g(bindingProvider2, parent);
        Intrinsics.checkNotNullParameter(bindingProvider2, "bindingProvider");
        return new C5006l22(bindingProvider2, this.f);
    }
}
