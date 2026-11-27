package com.base.feature.alertdialog.screen;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;
import defpackage.C2784ak0;
import defpackage.C3476e;
import defpackage.C6216qm1;
import defpackage.C6635sm1;
import defpackage.InterfaceC1060Gj0;
import defpackage.ViewOnClickListenerC3853fm;
import defpackage.ViewOnClickListenerC5228m5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/base/feature/alertdialog/screen/RateAppDialog;", "Lcom/base/feature/alertdialog/screen/SimpleAlertDialogWithBinding;", "Lqm1;", "FeatureAlertDialogBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RateAppDialog extends SimpleAlertDialogWithBinding<C6216qm1> {

    @NotNull
    public final C6635sm1 h;
    public boolean i;

    @NotNull
    public final String j;

    @NotNull
    public final a k;

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6216qm1> {
        public static final a m = new a(3, C6216qm1.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/alertdialog/databinding/RateAppDialogBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final C6216qm1 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.rate_app_dialog, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.active_btn;
            Button button = (Button) C3476e.h(viewInflate, R.id.active_btn);
            if (button != null) {
                i = R.id.close_icon;
                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.close_icon);
                if (imageView != null) {
                    i = R.id.icon;
                    if (((ImageView) C3476e.h(viewInflate, R.id.icon)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        int i2 = R.id.star_container;
                        StarViewGroup starViewGroup = (StarViewGroup) C3476e.h(viewInflate, R.id.star_container);
                        if (starViewGroup != null) {
                            i2 = R.id.subtitle;
                            if (((TextView) C3476e.h(viewInflate, R.id.subtitle)) != null) {
                                i2 = R.id.title;
                                if (((TextView) C3476e.h(viewInflate, R.id.title)) != null) {
                                    return new C6216qm1(constraintLayout, button, imageView, starViewGroup);
                                }
                            }
                        }
                        i = i2;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    public /* synthetic */ class b extends C2784ak0 implements Function1<Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            RateAppDialog rateAppDialog = (RateAppDialog) this.e;
            Button button = ((C6216qm1) rateAppDialog.i()).e;
            Intrinsics.checkNotNull(button);
            button.setVisibility(zBooleanValue ? 0 : 8);
            button.setText(((C6216qm1) rateAppDialog.i()).h.getStarCount() >= 4 ? R.string.rate_us_btn : R.string.share_opinion_btn);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateAppDialog(@NotNull C6635sm1 dialogParams) {
        super(dialogParams);
        Intrinsics.checkNotNullParameter(dialogParams, "dialogParams");
        this.h = dialogParams;
        this.j = "RATE_APP_DIALOG";
        this.k = a.m;
    }

    @Override // defpackage.InterfaceC6923u9
    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getJ() {
        return this.j;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, C6216qm1> g() {
        return this.k;
    }

    @Override // com.api.feature.alertdialog.screens.AlertDialogWithBinding
    public final void j(@Nullable Dialog dialog) {
        ((C6216qm1) i()).h.setupView(new b(1, this, RateAppDialog.class, "updateButton", "updateButton(Z)V", 0));
        ((C6216qm1) i()).e.setOnClickListener(new ViewOnClickListenerC3853fm(this, 1));
        ((C6216qm1) i()).g.setOnClickListener(new ViewOnClickListenerC5228m5(this, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.i || ((C6216qm1) i()).h.getOptionalStarCount() == null) {
            return;
        }
        this.h.t.invoke(Integer.valueOf(((C6216qm1) i()).h.getStarCount()));
    }
}
