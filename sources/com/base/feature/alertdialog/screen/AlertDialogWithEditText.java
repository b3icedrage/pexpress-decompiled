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
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.pexpress.tool.R;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.C6262r10;
import defpackage.C6333rM;
import defpackage.G9;
import defpackage.H9;
import defpackage.InterfaceC1060Gj0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/alertdialog/screen/AlertDialogWithEditText;", "Lcom/base/feature/alertdialog/screen/SimpleAlertDialogWithBinding;", "Lr10;", "FeatureAlertDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlertDialogWithEditText extends SimpleAlertDialogWithBinding<C6262r10> {

    @NotNull
    public final H9 h;

    @NotNull
    public final String i;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6262r10> {
        public static final a m = new a(3, C6262r10.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/alertdialog/databinding/DialogWithEdittextBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C6262r10 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.dialog_with_edittext, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.active_btn;
            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.active_btn);
            if (materialButton != null) {
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
                                i = R.id.edittext;
                                TextInputEditText textInputEditText = (TextInputEditText) C3476e.h(viewInflate, R.id.edittext);
                                if (textInputEditText != null) {
                                    i = R.id.emailTextInputLayout;
                                    if (((TextInputLayout) C3476e.h(viewInflate, R.id.emailTextInputLayout)) != null) {
                                        i = R.id.icon;
                                        ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.icon);
                                        if (imageView != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            i = R.id.passive_btn;
                                            Button button = (Button) C3476e.h(viewInflate, R.id.passive_btn);
                                            if (button != null) {
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
                                                                return new C6262r10(constraintLayout, materialButton, textView, viewH, textInputEditText, imageView, button, spinKitView, textView2, textView3);
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
    public AlertDialogWithEditText(@NotNull H9 dialogData) {
        super(dialogData);
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.h = dialogData;
        this.i = "DIALOG_WITH_EDIT_TEXT";
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
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6262r10> g() {
        return this.j;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    public final void j(@Nullable Dialog dialog) {
        C6262r10 c6262r10 = (C6262r10) i();
        H9 h9 = this.h;
        Integer num = h9.a;
        if (num != null) {
            c6262r10.l.setText(m(num.intValue()));
        }
        Integer num2 = h9.c;
        if (num2 != null) {
            c6262r10.k.setText(l(num2.intValue()));
        }
        String str = h9.d;
        if (str != null) {
            c6262r10.k.setText(str);
        }
        Integer num3 = h9.f;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            ImageView icon = c6262r10.i;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            C3435dm0.d(icon, iIntValue);
        }
        TextView subtitle = ((C6262r10) i()).k;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        String str2 = h9.d;
        subtitle.setVisibility(((str2 == null || str2.equals("")) && h9.c == null) ? 8 : 0);
        final C6262r10 c6262r11 = (C6262r10) i();
        c6262r11.j.setBackgroundTintList(ColorStateList.valueOf(C6333rM.getColor(requireContext(), R.color.defaultPassiveButtonColor)));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C6333rM.getColor(requireContext(), h9.i));
        MaterialButton materialButton = c6262r11.e;
        materialButton.setBackgroundTintList(colorStateListValueOf);
        materialButton.setTextColor(C6333rM.getColor(requireContext(), h9.j));
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: E9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.h.getClass();
                String.valueOf(c6262r11.h.getText());
                throw null;
            }
        };
        Button button = c6262r11.j;
        button.setOnClickListener(onClickListener);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: F9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.h.getClass();
                String.valueOf(c6262r11.h.getText());
                throw null;
            }
        });
        Integer num4 = h9.g;
        if (num4 != null) {
            materialButton.setText(getString(num4.intValue()));
        }
        Integer num5 = h9.h;
        if (num5 != null) {
            button.setText(getString(num5.intValue()));
        }
        C6262r10 c6262r12 = (C6262r10) i();
        TextInputEditText edittext = c6262r12.h;
        Intrinsics.checkNotNullExpressionValue(edittext, "edittext");
        edittext.addTextChangedListener(new G9(c6262r12));
        View disclaimerSeparator = ((C6262r10) i()).g;
        Intrinsics.checkNotNullExpressionValue(disclaimerSeparator, "disclaimerSeparator");
        disclaimerSeparator.setVisibility(8);
    }
}
