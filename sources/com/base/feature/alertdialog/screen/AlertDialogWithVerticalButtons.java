package com.base.feature.alertdialog.screen;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.pexpress.tool.R;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C3838fi0;
import defpackage.C6333rM;
import defpackage.I9;
import defpackage.InterfaceC1060Gj0;
import defpackage.J9;
import defpackage.M9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/alertdialog/screen/AlertDialogWithVerticalButtons;", "Lcom/base/feature/alertdialog/screen/SimpleAlertDialogWithBinding;", "Lfi0;", "FeatureAlertDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlertDialogWithVerticalButtons extends SimpleAlertDialogWithBinding<C3838fi0> {

    @NotNull
    public final M9 h;

    @NotNull
    public final String i;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3838fi0> {
        public static final a m = new a(3, C3838fi0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/alertdialog/databinding/FragmentDefaultDialogButtonsVerticalBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C3838fi0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.fragment_default_dialog_buttons_vertical, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.active_btn;
            Button button = (Button) C3476e.h(viewInflate, R.id.active_btn);
            if (button != null) {
                i = R.id.active_btn_layout;
                FrameLayout frameLayout = (FrameLayout) C3476e.h(viewInflate, R.id.active_btn_layout);
                if (frameLayout != null) {
                    i = R.id.button_view;
                    if (((LinearLayout) C3476e.h(viewInflate, R.id.button_view)) != null) {
                        i = R.id.icon;
                        ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.icon);
                        if (imageView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i = R.id.passive_btn;
                            Button button2 = (Button) C3476e.h(viewInflate, R.id.passive_btn);
                            if (button2 != null) {
                                i = R.id.progress_circular;
                                if (((SpinKitView) C3476e.h(viewInflate, R.id.progress_circular)) != null) {
                                    i = R.id.spacer;
                                    if (((Space) C3476e.h(viewInflate, R.id.spacer)) != null) {
                                        i = R.id.subtitle;
                                        TextView textView = (TextView) C3476e.h(viewInflate, R.id.subtitle);
                                        if (textView != null) {
                                            i = R.id.title;
                                            TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.title);
                                            if (textView2 != null) {
                                                return new C3838fi0(constraintLayout, button, frameLayout, imageView, button2, textView, textView2);
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
    public AlertDialogWithVerticalButtons(@NotNull M9 dialogData) {
        super(dialogData);
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.h = dialogData;
        this.i = "ALERT_VERTICAL_BUTTONS";
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
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3838fi0> g() {
        return this.j;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    public final void j(@Nullable Dialog dialog) {
        C3838fi0 c3838fi0 = (C3838fi0) i();
        M9 m9 = this.h;
        Integer num = m9.a;
        if (num != null) {
            c3838fi0.k.setText(m(num.intValue()));
        }
        Integer num2 = m9.c;
        if (num2 != null) {
            c3838fi0.j.setText(l(num2.intValue()));
        }
        String str = m9.d;
        if (str != null) {
            c3838fi0.j.setText(str);
        }
        Integer num3 = m9.f;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            ImageView icon = c3838fi0.h;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            C3435dm0.d(icon, iIntValue);
        }
        TextView subtitle = ((C3838fi0) i()).j;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        String str2 = m9.d;
        subtitle.setVisibility(((str2 == null || str2.equals("")) && m9.c == null) ? 8 : 0);
        C3838fi0 c3838fi1 = (C3838fi0) i();
        Button passiveBtn = c3838fi1.i;
        Intrinsics.checkNotNullExpressionValue(passiveBtn, "passiveBtn");
        passiveBtn.setVisibility(m9.h == null ? 8 : 0);
        FrameLayout activeBtnLayout = c3838fi1.g;
        Intrinsics.checkNotNullExpressionValue(activeBtnLayout, "activeBtnLayout");
        activeBtnLayout.setVisibility(m9.g == null ? 8 : 0);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C6333rM.getColor(requireContext(), R.color.defaultPassiveButtonColor));
        Button button = c3838fi1.i;
        button.setBackgroundTintList(colorStateListValueOf);
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(C6333rM.getColor(requireContext(), m9.i));
        Button button2 = c3838fi1.e;
        button2.setBackgroundTintList(colorStateListValueOf2);
        button2.setTextColor(C6333rM.getColor(requireContext(), m9.j));
        int i = 0;
        button.setOnClickListener(new I9(this, i));
        button2.setOnClickListener(new J9(this, i));
        Integer num4 = m9.g;
        if (num4 != null) {
            button2.setText(getString(num4.intValue()));
        }
        Integer num5 = m9.h;
        if (num5 != null) {
            button.setText(getString(num5.intValue()));
        }
    }
}
