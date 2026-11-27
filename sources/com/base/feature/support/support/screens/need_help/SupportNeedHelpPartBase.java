package com.base.feature.support.support.screens.need_help;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.v;
import com.api.feature.navigation.adder.SimpleFragmentInflate;
import com.google.android.material.imageview.ShapeableImageView;
import com.pexpress.tool.R;
import defpackage.A40;
import defpackage.C1523Mi;
import defpackage.C1699On1;
import defpackage.C2017Sp1;
import defpackage.C2151Ui0;
import defpackage.C2639a31;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C5189lv;
import defpackage.C6300rB;
import defpackage.C6610sg0;
import defpackage.C7331w6;
import defpackage.C7652xe;
import defpackage.C7955z40;
import defpackage.EnumC4403iP0;
import defpackage.FP0;
import defpackage.InterfaceC1060Gj0;
import defpackage.InterfaceC3770fO0;
import defpackage.K9;
import defpackage.LV1;
import defpackage.MV1;
import defpackage.NV1;
import defpackage.OV1;
import defpackage.PV1;
import defpackage.Sd2;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/support/support/screens/need_help/SupportNeedHelpPartBase;", "Lcom/api/feature/navigation/adder/SimpleFragmentInflate;", "LPV1;", "La31;", "FeatureSupportBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportNeedHelpPartBase extends SimpleFragmentInflate<PV1, C2639a31> {

    @NotNull
    public final Sd2 l;

    @NotNull
    public final a m;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2639a31> {
        public static final a m = new a(3, C2639a31.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/support/databinding/NeedHelpPartBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C2639a31 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.need_help_part, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.chat_with_support_surface_container;
            View viewH = C3476e.h(viewInflate, R.id.chat_with_support_surface_container);
            if (viewH != null) {
                int i2 = R.id.crisp_chat_with_support_surface_caption;
                if (((TextView) C3476e.h(viewH, R.id.crisp_chat_with_support_surface_caption)) != null) {
                    i2 = R.id.crisp_chat_with_support_surface_counter;
                    ImageView imageView = (ImageView) C3476e.h(viewH, R.id.crisp_chat_with_support_surface_counter);
                    if (imageView != null) {
                        i2 = R.id.crisp_chat_with_support_surface_image_container;
                        if (((ShapeableImageView) C3476e.h(viewH, R.id.crisp_chat_with_support_surface_image_container)) != null) {
                            i2 = R.id.crisp_chat_with_support_surface_title;
                            if (((TextView) C3476e.h(viewH, R.id.crisp_chat_with_support_surface_title)) != null) {
                                i2 = R.id.indicator;
                                TextView textView = (TextView) C3476e.h(viewH, R.id.indicator);
                                if (textView != null) {
                                    C6300rB c6300rB = new C6300rB((CardView) viewH, imageView, textView);
                                    int i3 = R.id.need_help_caption;
                                    if (((TextView) C3476e.h(viewInflate, R.id.need_help_caption)) != null) {
                                        i3 = R.id.need_help_title;
                                        TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.need_help_title);
                                        if (textView2 != null) {
                                            return new C2639a31((ConstraintLayout) viewInflate, c6300rB, textView2);
                                        }
                                    }
                                    i = i3;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewH.getResources().getResourceName(i2)));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public SupportNeedHelpPartBase(@NotNull Sd2 viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        this.l = viewModelFactory;
        this.m = a.m;
    }

    @Override // defpackage.InterfaceC3092c81
    public final void a() {
        ((C2639a31) k()).e.d.setOnClickListener(new K9(this, 2));
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C6610sg0 c6610sg0 = ((PV1) obj).k;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new MV1(viewLifecycleOwner, c6610sg0, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1699On1 c1699On1 = ((PV1) obj2).j;
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new NV1(viewLifecycleOwner2, c1699On1, null, this), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        C6610sg0 c6610sg1 = ((PV1) obj3).l;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new OV1(viewLifecycleOwner3, c6610sg1, null, this), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        ((PV1) obj4).f.a();
    }

    @Override // defpackage.InterfaceC2415Xi0
    @NotNull
    public final v c() {
        C1523Mi c1523Mi = new C1523Mi(this, 6);
        InterfaceC3770fO0 interfaceC3770fO0A = XO0.a(EnumC4403iP0.e, new C7331w6(new C7955z40(this, 4), 4));
        return C2151Ui0.a(this, C2017Sp1.a.b(PV1.class), new A40(interfaceC3770fO0A, 3), new LV1(interfaceC3770fO0A), c1523Mi);
    }

    @Override // defpackage.InterfaceC2311Wi0
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2639a31> g() {
        return this.m;
    }
}
