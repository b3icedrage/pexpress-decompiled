package com.base.feature.robot.indicatormanualconfig;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.A40;
import defpackage.C1523Mi;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2784ak0;
import defpackage.C3471dy0;
import defpackage.C3476e;
import defpackage.C4101gy0;
import defpackage.C4250hg0;
import defpackage.C4779jy0;
import defpackage.C5189lv;
import defpackage.C6045pz0;
import defpackage.C6255qz0;
import defpackage.C6333rM;
import defpackage.C6674sz0;
import defpackage.C7;
import defpackage.C7331w6;
import defpackage.C7652xe;
import defpackage.C7955z40;
import defpackage.EnumC4403iP0;
import defpackage.EnumC7224vc0;
import defpackage.FP0;
import defpackage.I9;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.J9;
import defpackage.K9;
import defpackage.Sd2;
import defpackage.ViewOnClickListenerC3273d10;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/indicatormanualconfig/IndicatorsManualConfigBottomSheetDialogFragment;", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBindingBottomSheetDialogFragment;", "Lsz0;", "Ljy0;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndicatorsManualConfigBottomSheetDialogFragment extends SimpleBindingBottomSheetDialogFragment<C6674sz0, C4779jy0> {

    @NotNull
    public final Sd2 i;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C4779jy0> {
        public static final a m = new a(3, C4779jy0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/IndicatorManualConfigBottomSheetFragmentBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C4779jy0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.indicator_manual_config_bottom_sheet_fragment, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.bottom_sheet_with_recycler_close_icon;
            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.bottom_sheet_with_recycler_close_icon);
            if (imageView != null) {
                i = R.id.bottom_sheet_with_recycler_title;
                TextView textView = (TextView) C3476e.h(viewInflate, R.id.bottom_sheet_with_recycler_title);
                if (textView != null) {
                    i = R.id.indicator_manual_config_reset_btn;
                    MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.indicator_manual_config_reset_btn);
                    if (materialButton != null) {
                        i = R.id.indicator_manual_config_save_button;
                        MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.indicator_manual_config_save_button);
                        if (materialButton2 != null) {
                            i = R.id.indicator_manual_config_toolbar;
                            if (((LinearLayout) C3476e.h(viewInflate, R.id.indicator_manual_config_toolbar)) != null) {
                                i = R.id.indicators_manual_config_recycler;
                                RecyclerView recyclerView = (RecyclerView) C3476e.h(viewInflate, R.id.indicators_manual_config_recycler);
                                if (recyclerView != null) {
                                    i = R.id.manual_config_spacer;
                                    if (C3476e.h(viewInflate, R.id.manual_config_spacer) != null) {
                                        return new C4779jy0((LinearLayout) viewInflate, imageView, textView, materialButton, materialButton2, recyclerView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public /* synthetic */ class b extends C7 implements Function2<String, EnumC7224vc0, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, EnumC7224vc0 enumC7224vc0) {
            String p0 = str;
            EnumC7224vc0 p1 = enumC7224vc0;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((C6674sz0) this.d).n(p0, p1, true);
            return Unit.a;
        }
    }

    public /* synthetic */ class c extends C2784ak0 implements Function1<EnumC7224vc0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EnumC7224vc0 enumC7224vc0) {
            EnumC7224vc0 id = enumC7224vc0;
            Intrinsics.checkNotNullParameter(id, "p0");
            C6674sz0 c6674sz0 = (C6674sz0) this.e;
            c6674sz0.getClass();
            Intrinsics.checkNotNullParameter(id, "id");
            C3471dy0 c3471dy0O = c6674sz0.o(id);
            if (c3471dy0O != null) {
                Number number = c3471dy0O.b;
                if (number instanceof Double) {
                    c6674sz0.n(String.valueOf(number.doubleValue() + 0.1d), id, false);
                } else if (number instanceof Integer) {
                    c6674sz0.n(String.valueOf(number.intValue() + 1), id, false);
                }
            }
            return Unit.a;
        }
    }

    public /* synthetic */ class d extends C2784ak0 implements Function1<EnumC7224vc0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EnumC7224vc0 enumC7224vc0) {
            EnumC7224vc0 id = enumC7224vc0;
            Intrinsics.checkNotNullParameter(id, "p0");
            C6674sz0 c6674sz0 = (C6674sz0) this.e;
            c6674sz0.getClass();
            Intrinsics.checkNotNullParameter(id, "id");
            C3471dy0 c3471dy0O = c6674sz0.o(id);
            if (c3471dy0O != null) {
                Number number = c3471dy0O.b;
                if (number instanceof Double) {
                    c6674sz0.n(String.valueOf(number.doubleValue() - 0.1d), id, false);
                } else if (number instanceof Integer) {
                    c6674sz0.n(String.valueOf(number.intValue() - 1), id, false);
                }
            }
            return Unit.a;
        }
    }

    public /* synthetic */ class e extends C2784ak0 implements Function1<EnumC7224vc0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EnumC7224vc0 enumC7224vc0) {
            EnumC7224vc0 p0 = enumC7224vc0;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C6674sz0) this.e).q(p0);
            return Unit.a;
        }
    }

    public /* synthetic */ class f extends C2784ak0 implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((IndicatorsManualConfigBottomSheetDialogFragment) this.e).j();
            return Unit.a;
        }
    }

    public IndicatorsManualConfigBottomSheetDialogFragment(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.i = viewModelFactory;
        this.j = a.m;
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C1523Mi c1523Mi = new C1523Mi(this, 3);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7331w6(new C7955z40(this, 1), 2));
        return C2151Ui0.a(this, C2017Sp1.a.b(C6674sz0.class), new A40(interfaceC3770fO0A, 1), new C6045pz0(interfaceC3770fO0A), c1523Mi);
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBindingBottomSheetDialogFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C4779jy0> g() {
        return this.j;
    }

    public final void j() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Object systemService = C6333rM.getSystemService(contextRequireContext, InputMethodManager.class);
        if (systemService == null) {
            throw new IllegalStateException("The class is not a supported system service.");
        }
        ((InputMethodManager) systemService).hideSoftInputFromWindow(i().d.getWindowToken(), 0);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        ((C6674sz0) obj).s();
    }

    @Override // com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object obj = this.g;
        Intrinsics.checkNotNull(obj);
        C4250hg0 c4250hg0 = ((C6674sz0) obj).l;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C6255qz0(viewLifecycleOwner, c4250hg0, null, this), 3);
        i().d.setOnClickListener(new ViewOnClickListenerC3273d10(this, 2));
        i().e.setOnClickListener(new I9(this, 3));
        i().h.setOnClickListener(new J9(this, 2));
        i().i.setOnClickListener(new K9(this, 1));
        C4779jy0 c4779jy0I = i();
        Object obj2 = this.g;
        Intrinsics.checkNotNull(obj2);
        b bVar = new b(2, obj2, C6674sz0.class, "editField", "editField(Ljava/lang/String;Lcom/base/feature/robot/indicatormanualconfig/FieldId;Z)V", 0);
        Object obj3 = this.g;
        Intrinsics.checkNotNull(obj3);
        c cVar = new c(1, obj3, C6674sz0.class, "onPlusClick", "onPlusClick(Lcom/base/feature/robot/indicatormanualconfig/FieldId;)V", 0);
        Object obj4 = this.g;
        Intrinsics.checkNotNull(obj4);
        d dVar = new d(1, obj4, C6674sz0.class, "onMinusClick", "onMinusClick(Lcom/base/feature/robot/indicatormanualconfig/FieldId;)V", 0);
        Object obj5 = this.g;
        Intrinsics.checkNotNull(obj5);
        c4779jy0I.j.setAdapter(new C4101gy0(bVar, cVar, dVar, new e(1, obj5, C6674sz0.class, "onFinishEdit", "onFinishEdit(Lcom/base/feature/robot/indicatormanualconfig/FieldId;)V", 0), new f(0, this, IndicatorsManualConfigBottomSheetDialogFragment.class, "onClearFocus", "onClearFocus()V", 0)));
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }
}
