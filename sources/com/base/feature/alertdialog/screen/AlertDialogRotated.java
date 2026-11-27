package com.base.feature.alertdialog.screen;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.pexpress.tool.R;
import defpackage.B9;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C4048gi0;
import defpackage.C6333rM;
import defpackage.C7133v9;
import defpackage.C9;
import defpackage.InterfaceC1060Gj0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/alertdialog/screen/AlertDialogRotated;", "Lcom/base/feature/alertdialog/screen/SimpleAlertDialogWithBinding;", "Lgi0;", "FeatureAlertDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlertDialogRotated extends SimpleAlertDialogWithBinding<C4048gi0> {

    @NotNull
    public final C7133v9 h;

    @NotNull
    public final String i;

    @NotNull
    public final a j;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C4048gi0> {
        public static final a m = new a(3, C4048gi0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/alertdialog/databinding/FragmentDefaultDialogRotatedBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C4048gi0 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C4048gi0.b(p0, viewGroup, zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogRotated(@NotNull C7133v9 dialogData) {
        super(dialogData);
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        this.h = dialogData;
        this.i = "TEST_DIALOG_HORIZONTAL";
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
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C4048gi0> g() {
        return this.j;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    public final void j(@Nullable Dialog dialog) {
        Window window;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -2;
            layoutParams.height = -1;
            window.setAttributes(layoutParams);
        }
        C4048gi0 c4048gi0 = (C4048gi0) i();
        C7133v9 c7133v9 = this.h;
        Integer num = c7133v9.a;
        if (num != null) {
            c4048gi0.k.setText(m(num.intValue()));
        }
        Integer num2 = c7133v9.c;
        if (num2 != null) {
            c4048gi0.j.setText(l(num2.intValue()));
        }
        Integer num3 = c7133v9.f;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            ImageView icon = c4048gi0.h;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            C3435dm0.d(icon, iIntValue);
        }
        Integer num4 = c7133v9.g;
        if (num4 != null) {
            c4048gi0.e.setText(getString(num4.intValue()));
        }
        Integer num5 = c7133v9.h;
        if (num5 != null) {
            c4048gi0.i.setText(getString(num5.intValue()));
        }
        TextView subtitle = ((C4048gi0) i()).j;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        String str = c7133v9.d;
        subtitle.setVisibility(((str == null || str.equals("")) && c7133v9.c == null) ? 8 : 0);
        C4048gi0 c4048gi1 = (C4048gi0) i();
        c4048gi1.i.setBackgroundTintList(ColorStateList.valueOf(C6333rM.getColor(requireContext(), R.color.defaultPassiveButtonColor)));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C6333rM.getColor(requireContext(), c7133v9.i));
        Button button = c4048gi1.e;
        button.setBackgroundTintList(colorStateListValueOf);
        button.setTextColor(C6333rM.getColor(requireContext(), c7133v9.j));
        c4048gi1.i.setOnClickListener(new B9(this, 0));
        button.setOnClickListener(new C9(this, 0));
    }
}
