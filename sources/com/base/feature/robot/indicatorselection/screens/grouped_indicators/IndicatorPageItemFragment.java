package com.base.feature.robot.indicatorselection.screens.grouped_indicators;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.api.core.SimpleViewModelFragment;
import com.pexpress.tool.R;
import defpackage.AbstractC5603ns;
import defpackage.C0718Bz0;
import defpackage.C1728Ox0;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C2846az0;
import defpackage.C5189lv;
import defpackage.C6333rM;
import defpackage.C7091uy0;
import defpackage.C7288vu;
import defpackage.C7301vy0;
import defpackage.C7512wy0;
import defpackage.C7652xe;
import defpackage.CP;
import defpackage.EnumC2121Ty0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC6396rf0;
import defpackage.N4;
import defpackage.S4;
import defpackage.Sd2;
import defpackage.T4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/indicatorselection/screens/grouped_indicators/IndicatorPageItemFragment;", "Lcom/api/core/SimpleViewModelFragment;", "LBz0;", "Lvu;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndicatorPageItemFragment extends SimpleViewModelFragment<C0718Bz0, C7288vu> {

    @NotNull
    public final Sd2 j;

    @NotNull
    public final EnumC2121Ty0 k;

    @NotNull
    public final AbstractC5603ns l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C7288vu> {
        public static final a m = new a(3, C7288vu.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/BottomSheetWithTabsItemFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C7288vu k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.bottom_sheet_with_tabs_item_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            if (viewInflate == null) {
                throw new NullPointerException("rootView");
            }
            RecyclerView recyclerView = (RecyclerView) viewInflate;
            return new C7288vu(recyclerView, recyclerView);
        }
    }

    public IndicatorPageItemFragment(@NotNull Sd2 viewModelFactory, @NotNull EnumC2121Ty0 type, @NotNull AbstractC5603ns bindingFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(bindingFactory, "bindingFactory");
        this.j = viewModelFactory;
        this.k = type;
        this.l = bindingFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        return C2151Ui0.a(this, C2017Sp1.a.b(C0718Bz0.class), new S4(this, 2), new T4(this, 1), new N4(this, 5));
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C7288vu> g() {
        return this.m;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C7288vu c7288vuK = k();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C7091uy0 c7091uy0 = new C7091uy0(1, obj, C0718Bz0.class, "onNewSelect", "onNewSelect(Lcom/api/preferences/domain/models/Indicator;)V", 0);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C7301vy0 c7301vy0 = new C7301vy0(1, obj2, C0718Bz0.class, "onShowDetailsClick", "onShowDetailsClick(Lcom/api/preferences/domain/models/Indicator;)V", 0);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C1728Ox0 c1728Ox0 = new C1728Ox0(this.l, c7091uy0, c7301vy0, new CP(1, obj3, C0718Bz0.class, "onShowConfigClick", "onShowConfigClick(Lcom/api/preferences/domain/models/Indicator;)V", 0, 1));
        RecyclerView recyclerView = c7288vuK.e;
        recyclerView.setAdapter(c1728Ox0);
        q qVar = new q(getContext(), 1);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Drawable drawable = C6333rM.getDrawable(requireContext(), R.drawable.default_recycler_bottom_sheet_dvivider);
        Intrinsics.checkNotNull(drawable);
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        qVar.a = drawable;
        recyclerView.g(qVar);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        InterfaceC6396rf0<List<C2846az0>> interfaceC6396rf0 = ((C0718Bz0) obj4).s;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C7512wy0(viewLifecycleOwner, interfaceC6396rf0, null, this), 3);
    }
}
