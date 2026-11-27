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
import defpackage.C3628ei0;
import defpackage.C6333rM;
import defpackage.C7133v9;
import defpackage.InterfaceC1060Gj0;
import defpackage.ViewOnClickListenerC5007l3;
import defpackage.ViewOnClickListenerC6713t9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/alertdialog/screen/AlertDialog;", "Lcom/base/feature/alertdialog/screen/SimpleAlertDialogWithBinding;", "Lei0;", "FeatureAlertDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlertDialog extends SimpleAlertDialogWithBinding<C3628ei0> {

    @NotNull
    public final C7133v9 h;

    @NotNull
    public final a i;

    @NotNull
    public final String j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3628ei0> {
        public static final a m = new a(3, C3628ei0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/alertdialog/databinding/FragmentDefaultDialogBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C3628ei0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.fragment_default_dialog, viewGroup2, false);
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
                                        if (((SpinKitView) C3476e.h(viewInflate, R.id.progress_circular)) != null) {
                                            i = R.id.spacer;
                                            if (((Space) C3476e.h(viewInflate, R.id.spacer)) != null) {
                                                i = R.id.subtitle;
                                                TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.subtitle);
                                                if (textView2 != null) {
                                                    i = R.id.title;
                                                    TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.title);
                                                    if (textView3 != null) {
                                                        return new C3628ei0(constraintLayout, button, textView, viewH, imageView, button2, textView2, textView3);
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
    public AlertDialog(@NotNull C7133v9 dialogData) {
        super(dialogData);
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.h = dialogData;
        this.i = a.m;
        this.j = "ALERT_DIALOG";
    }

    @Override // defpackage.InterfaceC6923u9
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getJ() {
        return this.j;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C3628ei0> g() {
        return this.i;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    public final void j(@Nullable Dialog dialog) {
        C3628ei0 c3628ei0 = (C3628ei0) i();
        C7133v9 c7133v9 = this.h;
        Integer num = c7133v9.a;
        if (num != null) {
            c3628ei0.k.setText(m(num.intValue()));
        }
        Integer num2 = c7133v9.c;
        if (num2 != null) {
            c3628ei0.j.setText(l(num2.intValue()));
        }
        String str = c7133v9.d;
        if (str != null) {
            c3628ei0.j.setText(str);
        }
        Integer num3 = c7133v9.f;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            ImageView icon = c3628ei0.h;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            C3435dm0.d(icon, iIntValue);
        }
        TextView subtitle = ((C3628ei0) i()).j;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        String str2 = c7133v9.d;
        subtitle.setVisibility(((str2 == null || str2.equals("")) && c7133v9.c == null) ? 8 : 0);
        View disclaimerSeparator = ((C3628ei0) i()).g;
        Intrinsics.checkNotNullExpressionValue(disclaimerSeparator, "disclaimerSeparator");
        disclaimerSeparator.setVisibility(8);
        C3628ei0 c3628ei1 = (C3628ei0) i();
        c3628ei1.i.setBackgroundTintList(ColorStateList.valueOf(C6333rM.getColor(requireContext(), R.color.defaultPassiveButtonColor)));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C6333rM.getColor(requireContext(), c7133v9.i));
        Button button = c3628ei1.e;
        button.setBackgroundTintList(colorStateListValueOf);
        button.setTextColor(C6333rM.getColor(requireContext(), c7133v9.j));
        ViewOnClickListenerC5007l3 viewOnClickListenerC5007l3 = new ViewOnClickListenerC5007l3(this, 1);
        Button button2 = c3628ei1.i;
        button2.setOnClickListener(viewOnClickListenerC5007l3);
        button.setOnClickListener(new ViewOnClickListenerC6713t9(this, 0));
        Integer num4 = c7133v9.g;
        if (num4 != null) {
            button.setText(getString(num4.intValue()));
        }
        Integer num5 = c7133v9.h;
        if (num5 != null) {
            button2.setText(getString(num5.intValue()));
        }
    }
}
