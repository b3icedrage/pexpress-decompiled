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
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.pexpress.tool.R;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C6053q10;
import defpackage.C6333rM;
import defpackage.D9;
import defpackage.InterfaceC1060Gj0;
import defpackage.ViewOnClickListenerC7740y3;
import defpackage.ViewOnClickListenerC7950z3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/alertdialog/screen/AlertDialogWithCheckBox;", "Lcom/base/feature/alertdialog/screen/SimpleAlertDialogWithBinding;", "Lq10;", "FeatureAlertDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlertDialogWithCheckBox extends SimpleAlertDialogWithBinding<C6053q10> {

    @NotNull
    public final D9 h;

    @NotNull
    public final String i;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6053q10> {
        public static final a m = new a(3, C6053q10.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/alertdialog/databinding/DialogWithCheckboxBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C6053q10 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.dialog_with_checkbox, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.active_btn;
            Button button = (Button) C3476e.h(viewInflate, R.id.active_btn);
            if (button != null) {
                i = R.id.active_btn_layout;
                if (((FrameLayout) C3476e.h(viewInflate, R.id.active_btn_layout)) != null) {
                    i = R.id.button_view;
                    if (((LinearLayout) C3476e.h(viewInflate, R.id.button_view)) != null) {
                        i = R.id.checkbox;
                        MaterialCheckBox materialCheckBox = (MaterialCheckBox) C3476e.h(viewInflate, R.id.checkbox);
                        if (materialCheckBox != null) {
                            i = R.id.checkbox_text;
                            if (((TextView) C3476e.h(viewInflate, R.id.checkbox_text)) != null) {
                                i = R.id.disclaimer;
                                TextView textView = (TextView) C3476e.h(viewInflate, R.id.disclaimer);
                                if (textView != null) {
                                    i = R.id.disclaimer_separator;
                                    View viewH = C3476e.h(viewInflate, R.id.disclaimer_separator);
                                    if (viewH != null) {
                                        i = R.id.icon;
                                        ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.icon);
                                        if (imageView != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            i = R.id.passive_btn;
                                            Button button2 = (Button) C3476e.h(viewInflate, R.id.passive_btn);
                                            if (button2 != null) {
                                                i = R.id.progress_circular;
                                                SpinKitView spinKitView = (SpinKitView) C3476e.h(viewInflate, R.id.progress_circular);
                                                if (spinKitView != null) {
                                                    i = R.id.spacer;
                                                    if (((Space) C3476e.h(viewInflate, R.id.spacer)) != null) {
                                                        i = R.id.subtitle;
                                                        TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.subtitle);
                                                        if (textView2 != null) {
                                                            i = R.id.title;
                                                            TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.title);
                                                            if (textView3 != null) {
                                                                i = R.id.title_layout;
                                                                if (((Barrier) C3476e.h(viewInflate, R.id.title_layout)) != null) {
                                                                    return new C6053q10(constraintLayout, button, materialCheckBox, textView, viewH, imageView, button2, spinKitView, textView2, textView3);
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
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogWithCheckBox(@NotNull D9 dialogData) {
        super(dialogData);
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.h = dialogData;
        this.i = "DIALOG_WITH_CHECKBOX";
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
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6053q10> g() {
        return this.j;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    public final void j(@Nullable Dialog dialog) {
        C6053q10 c6053q10 = (C6053q10) i();
        D9 d9 = this.h;
        Integer num = d9.a;
        if (num != null) {
            c6053q10.l.setText(m(num.intValue()));
        }
        Integer num2 = d9.c;
        if (num2 != null) {
            c6053q10.k.setText(l(num2.intValue()));
        }
        String str = d9.d;
        if (str != null) {
            c6053q10.k.setText(str);
        }
        Integer num3 = d9.f;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            ImageView icon = c6053q10.i;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            C3435dm0.d(icon, iIntValue);
        }
        TextView subtitle = ((C6053q10) i()).k;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        String str2 = d9.d;
        subtitle.setVisibility(((str2 == null || str2.equals("")) && d9.c == null) ? 8 : 0);
        C6053q10 c6053q11 = (C6053q10) i();
        c6053q11.j.setBackgroundTintList(ColorStateList.valueOf(C6333rM.getColor(requireContext(), R.color.defaultPassiveButtonColor)));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C6333rM.getColor(requireContext(), d9.i));
        Button button = c6053q11.e;
        button.setBackgroundTintList(colorStateListValueOf);
        button.setTextColor(C6333rM.getColor(requireContext(), d9.j));
        ViewOnClickListenerC7740y3 viewOnClickListenerC7740y3 = new ViewOnClickListenerC7740y3(this, 1);
        Button button2 = c6053q11.j;
        button2.setOnClickListener(viewOnClickListenerC7740y3);
        button.setOnClickListener(new ViewOnClickListenerC7950z3(this, 1));
        Integer num4 = d9.g;
        if (num4 != null) {
            button.setText(getString(num4.intValue()));
        }
        Integer num5 = d9.h;
        if (num5 != null) {
            button2.setText(getString(num5.intValue()));
        }
        View disclaimerSeparator = ((C6053q10) i()).h;
        Intrinsics.checkNotNullExpressionValue(disclaimerSeparator, "disclaimerSeparator");
        disclaimerSeparator.setVisibility(8);
    }
}
