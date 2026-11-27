package com.base.feature.alertdialog.screen;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C6333rM;
import defpackage.InterfaceC1060Gj0;
import defpackage.T00;
import defpackage.U00;
import defpackage.ViewOnClickListenerC7740y3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/alertdialog/screen/DialogCoupon;", "Lcom/base/feature/alertdialog/screen/SimpleAlertDialogWithBinding;", "LT00;", "FeatureAlertDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DialogCoupon extends SimpleAlertDialogWithBinding<T00> {

    @NotNull
    public final U00 h;

    @NotNull
    public final String i;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, T00> {
        public static final a m = new a(3, T00.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/alertdialog/databinding/DialogCouponBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final T00 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.dialog_coupon, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.active_btn;
            TextView textView = (TextView) C3476e.h(viewInflate, R.id.active_btn);
            if (textView != null) {
                i = R.id.cut_end;
                if (((ImageView) C3476e.h(viewInflate, R.id.cut_end)) != null) {
                    i = R.id.cut_start;
                    if (((ImageView) C3476e.h(viewInflate, R.id.cut_start)) != null) {
                        i = R.id.dotted_view;
                        if (C3476e.h(viewInflate, R.id.dotted_view) != null) {
                            i = R.id.icon;
                            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.icon);
                            if (imageView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                i = R.id.passiveBtn;
                                if (((TextView) C3476e.h(viewInflate, R.id.passiveBtn)) != null) {
                                    i = R.id.spacer;
                                    if (((Space) C3476e.h(viewInflate, R.id.spacer)) != null) {
                                        i = R.id.subtitle;
                                        TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.subtitle);
                                        if (textView2 != null) {
                                            i = R.id.time;
                                            TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.time);
                                            if (textView3 != null) {
                                                i = R.id.title;
                                                TextView textView4 = (TextView) C3476e.h(viewInflate, R.id.title);
                                                if (textView4 != null) {
                                                    return new T00(constraintLayout, textView, imageView, textView2, textView3, textView4);
                                                }
                                            }
                                        }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogCoupon(@NotNull U00 dialogData) {
        super(dialogData);
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.h = dialogData;
        this.i = "DIALOG_COUPON";
        this.j = a.m;
    }

    @Override // defpackage.InterfaceC6923u9
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, T00> g() {
        return this.j;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    public final void j(@Nullable Dialog dialog) {
        T00 t00 = (T00) i();
        U00 u00 = this.h;
        Integer num = u00.a;
        if (num != null) {
            t00.i.setText(m(num.intValue()));
        }
        Integer num2 = u00.c;
        if (num2 != null) {
            t00.h.setText(l(num2.intValue()));
        }
        String str = u00.d;
        if (str != null) {
            t00.h.setText(str);
        }
        Integer num3 = u00.f;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            ImageView icon = t00.g;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            C3435dm0.d(icon, iIntValue);
        }
        TextView subtitle = ((T00) i()).h;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        String str2 = u00.d;
        subtitle.setVisibility(((str2 == null || str2.equals("")) && u00.c == null) ? 8 : 0);
        T00 t01 = (T00) i();
        t01.e.setBackgroundTintList(ColorStateList.valueOf(C6333rM.getColor(requireContext(), u00.i)));
        int color = C6333rM.getColor(requireContext(), u00.j);
        TextView textView = t01.e;
        textView.setTextColor(color);
        textView.setOnClickListener(new ViewOnClickListenerC7740y3(this, 2));
        Integer num4 = u00.g;
        if (num4 != null) {
            textView.setText(getString(num4.intValue()));
        }
    }
}
