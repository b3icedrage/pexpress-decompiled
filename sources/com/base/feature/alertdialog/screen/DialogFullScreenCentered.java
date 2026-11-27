package com.base.feature.alertdialog.screen;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.pexpress.tool.R;
import defpackage.C2568Zh0;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C3482e10;
import defpackage.C6333rM;
import defpackage.I9;
import defpackage.InterfaceC1060Gj0;
import defpackage.J9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/alertdialog/screen/DialogFullScreenCentered;", "Lcom/base/feature/alertdialog/screen/SimpleAlertDialogWithBinding;", "LZh0;", "FeatureAlertDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DialogFullScreenCentered extends SimpleAlertDialogWithBinding<C2568Zh0> {

    @NotNull
    public final C3482e10 h;

    @NotNull
    public final String i;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2568Zh0> {
        public static final a m = new a(3, C2568Zh0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/alertdialog/databinding/FragmentCentredDialogBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C2568Zh0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.fragment_centred_dialog, viewGroup2, false);
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
                                            i = R.id.text_view;
                                            if (((ConstraintLayout) C3476e.h(viewInflate, R.id.text_view)) != null) {
                                                i = R.id.title;
                                                TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.title);
                                                if (textView2 != null) {
                                                    return new C2568Zh0(constraintLayout, button, frameLayout, imageView, constraintLayout, button2, textView, textView2);
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
    public DialogFullScreenCentered(@NotNull C3482e10 dialogData) {
        super(dialogData);
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.h = dialogData;
        this.i = "FULL_SCREEN_DIALOG";
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
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C2568Zh0> g() {
        return this.j;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    public final void j(@Nullable Dialog dialog) {
        Window window;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -1;
            window.setAttributes(layoutParams);
        }
        C2568Zh0 c2568Zh0 = (C2568Zh0) i();
        C3482e10 c3482e10 = this.h;
        Integer num = c3482e10.a;
        if (num != null) {
            c2568Zh0.l.setText(m(num.intValue()));
        }
        Integer num2 = c3482e10.c;
        if (num2 != null) {
            c2568Zh0.k.setText(l(num2.intValue()));
        }
        String str = c3482e10.d;
        if (str != null) {
            c2568Zh0.k.setText(str);
        }
        Integer num3 = c3482e10.f;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            ImageView icon = c2568Zh0.h;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            C3435dm0.d(icon, iIntValue);
        }
        TextView subtitle = ((C2568Zh0) i()).k;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        String str2 = c3482e10.d;
        subtitle.setVisibility(((str2 == null || str2.equals("")) && c3482e10.c == null) ? 8 : 0);
        C2568Zh0 c2568Zh1 = (C2568Zh0) i();
        Button passiveBtn = c2568Zh1.j;
        Intrinsics.checkNotNullExpressionValue(passiveBtn, "passiveBtn");
        passiveBtn.setVisibility(c3482e10.h == null ? 8 : 0);
        FrameLayout activeBtnLayout = c2568Zh1.g;
        Intrinsics.checkNotNullExpressionValue(activeBtnLayout, "activeBtnLayout");
        activeBtnLayout.setVisibility(c3482e10.g == null ? 8 : 0);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C6333rM.getColor(requireContext(), R.color.defaultPassiveButtonColor));
        Button button = c2568Zh1.j;
        button.setBackgroundTintList(colorStateListValueOf);
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(C6333rM.getColor(requireContext(), c3482e10.i));
        Button button2 = c2568Zh1.e;
        button2.setBackgroundTintList(colorStateListValueOf2);
        button2.setTextColor(C6333rM.getColor(requireContext(), c3482e10.j));
        int i = 1;
        button.setOnClickListener(new I9(this, i));
        button2.setOnClickListener(new J9(this, i));
        Integer num4 = c3482e10.g;
        if (num4 != null) {
            button2.setText(getString(num4.intValue()));
        }
        Integer num5 = c3482e10.h;
        if (num5 != null) {
            button.setText(getString(num5.intValue()));
        }
        ((C2568Zh0) i()).i.setBackgroundResource(R.color.transparent);
    }
}
