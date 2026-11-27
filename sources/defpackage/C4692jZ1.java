package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4692jZ1 extends v<C1709Or, AZ1> {

    @NotNull
    public static final a i = new a();

    @NotNull
    public final AbstractC5603ns e;

    @NotNull
    public final InterfaceC3804fZ1 f;

    @NotNull
    public final C5325mZ1 g;
    public boolean h;

    /* JADX INFO: renamed from: jZ1$a */
    public static final class a extends p.e<C1709Or> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C1709Or c1709Or, C1709Or c1709Or2) {
            C1709Or oldItem = c1709Or;
            C1709Or newItem = c1709Or2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C1709Or c1709Or, C1709Or c1709Or2) {
            C1709Or oldItem = c1709Or;
            C1709Or newItem = c1709Or2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return b.k(oldItem.a, newItem.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4692jZ1(@NotNull AbstractC5603ns bindingFactory, @NotNull InterfaceC3804fZ1 timeItemResourcesProvider, @NotNull C5325mZ1 onItemClick) {
        super(i);
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        Intrinsics.checkNotNullParameter(timeItemResourcesProvider, "timeItemResourcesProvider");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.e = bindingFactory;
        this.f = timeItemResourcesProvider;
        this.g = onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i2) {
        TextView textViewH;
        AZ1 holder = (AZ1) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C1709Or c1709OrO = o(i2);
        Intrinsics.checkNotNullExpressionValue(c1709OrO, "getItem(...)");
        C1709Or betDurationSelection = c1709OrO;
        Intrinsics.checkNotNullParameter(betDurationSelection, "betDurationSelection");
        holder.y = betDurationSelection;
        long j = betDurationSelection.a;
        b.a aVar = b.e;
        long jR = b.r(j, R40.SECONDS);
        InterfaceC3385dZ1 interfaceC3385dZ1 = holder.u;
        Context context = interfaceC3385dZ1.b().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        interfaceC3385dZ1.getTitle().setText(N7.C(jR, context));
        View viewB = interfaceC3385dZ1.b();
        boolean z = betDurationSelection.b;
        viewB.setEnabled(!z);
        interfaceC3385dZ1.getTitle().setTypeface(null, z ? 1 : 0);
        interfaceC3385dZ1.n().setChecked(z);
        boolean z2 = holder.x;
        if (!z2 && (textViewH = interfaceC3385dZ1.h()) != null) {
            textViewH.setText("");
        }
        boolean z3 = betDurationSelection.d && !z2;
        if (z3) {
            interfaceC3385dZ1.getIcon().setColorFilter(holder.v.a());
        } else {
            interfaceC3385dZ1.getIcon().clearColorFilter();
        }
        boolean z4 = !z3;
        interfaceC3385dZ1.getTitle().setEnabled(z4);
        interfaceC3385dZ1.b().setClickable(z4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RI0 bindingProvider = C2017Sp1.a.b(InterfaceC3385dZ1.class);
        AbstractC5603ns abstractC5603ns = this.e;
        abstractC5603ns.getClass();
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        InterfaceC3385dZ1 interfaceC3385dZ1 = (InterfaceC3385dZ1) abstractC5603ns.a(bindingProvider);
        C6621sj.g(interfaceC3385dZ1, parent);
        return new AZ1(interfaceC3385dZ1, this.f, this.g, this.h);
    }
}
