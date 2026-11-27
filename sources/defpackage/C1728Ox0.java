package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ox0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1728Ox0 extends v<C2846az0, C2619Zy0> {

    @NotNull
    public static final a i = new a();

    @NotNull
    public final AbstractC5603ns e;

    @NotNull
    public final C2784ak0 f;

    @NotNull
    public final C2784ak0 g;

    @NotNull
    public final C2784ak0 h;

    /* JADX INFO: renamed from: Ox0$a */
    public static final class a extends p.e<C2846az0> {
        @Override // androidx.recyclerview.widget.p.e
        public final boolean a(C2846az0 c2846az0, C2846az0 c2846az1) {
            C2846az0 oldItem = c2846az0;
            C2846az0 newItem = c2846az1;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.p.e
        public final boolean b(C2846az0 c2846az0, C2846az0 c2846az1) {
            C2846az0 oldItem = c2846az0;
            C2846az0 newItem = c2846az1;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.a(oldItem.a.b, newItem.a.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1728Ox0(@NotNull AbstractC5603ns bindingProviderFactory, @NotNull Function1<? super C1491Lx0, Unit> onClick, @NotNull Function1<? super C1491Lx0, Unit> onShowDetailsClick, @NotNull Function1<? super C1491Lx0, Unit> onEditClick) {
        super(i);
        Intrinsics.checkNotNullParameter(bindingProviderFactory, "bindingProviderFactory");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onShowDetailsClick, "onShowDetailsClick");
        Intrinsics.checkNotNullParameter(onEditClick, "onEditClick");
        this.e = bindingProviderFactory;
        this.f = (C2784ak0) onClick;
        this.g = (C2784ak0) onShowDetailsClick;
        this.h = (C2784ak0) onEditClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void g(RecyclerView.C c, int i2) {
        C2619Zy0 holder = (C2619Zy0) c;
        Intrinsics.checkNotNullParameter(holder, "holder");
        C2846az0 c2846az0O = o(i2);
        C1491Lx0 indicatorItem = c2846az0O.a;
        C5488nK onClick = new C5488nK(1, this, c2846az0O);
        final C1569Mx0 onShowDetailsClick = new C1569Mx0(this, c2846az0O);
        C1650Nx0 onEditClick = new C1650Nx0(this, c2846az0O);
        Intrinsics.checkNotNullParameter(indicatorItem, "indicatorItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onShowDetailsClick, "onShowDetailsClick");
        Intrinsics.checkNotNullParameter(onEditClick, "onEditClick");
        InterfaceC3681ey0<?> interfaceC3681ey0 = holder.u;
        Intrinsics.c(interfaceC3681ey0, "null cannot be cast to non-null type com.base.feature.robot.indicatorselection.providers.IndicatorItemBindingProviderBase");
        C3891fy0 c3891fy0 = (C3891fy0) interfaceC3681ey0;
        C3702f32 c3702f32 = c3891fy0.d;
        Intrinsics.checkNotNull(c3702f32);
        MA1.e(c3702f32, indicatorItem, c2846az0O.b, c2846az0O.c);
        C3702f32 c3702f33 = c3891fy0.d;
        Intrinsics.checkNotNull(c3702f33);
        c3702f33.d.setOnClickListener(new ViewOnClickListenerC6903u4(onClick, 3));
        C3702f32 c3702f34 = c3891fy0.d;
        Intrinsics.checkNotNull(c3702f34);
        c3702f34.q.setOnClickListener(new View.OnClickListener() { // from class: Yy0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onShowDetailsClick.invoke();
            }
        });
        C3702f32 c3702f35 = c3891fy0.d;
        Intrinsics.checkNotNull(c3702f35);
        c3702f35.r.setOnClickListener(new XQ(onShowDetailsClick, 1));
        C3702f32 c3702f36 = c3891fy0.d;
        Intrinsics.checkNotNull(c3702f36);
        c3702f36.g.setOnClickListener(new ViewOnClickListenerC5007l3(onEditClick, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.C i(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RI0 bindingProvider = C2017Sp1.a.b(InterfaceC3681ey0.class);
        AbstractC5603ns abstractC5603ns = this.e;
        abstractC5603ns.getClass();
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        InterfaceC3681ey0 interfaceC3681ey0 = (InterfaceC3681ey0) abstractC5603ns.a(bindingProvider);
        C6621sj.g(interfaceC3681ey0, parent);
        return new C2619Zy0(interfaceC3681ey0);
    }
}
