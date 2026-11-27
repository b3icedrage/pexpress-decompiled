package com.base.feature.robot.indicatorselection.screens.shared;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import defpackage.C2784ak0;
import defpackage.C3435dm0;
import defpackage.C3476e;
import defpackage.InterfaceC1060Gj0;
import defpackage.T82;
import defpackage.ViewOnClickListenerC0714By;
import defpackage.W82;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/base/feature/robot/indicatorselection/screens/shared/UnlockIndicatorsBottomSheetFragment;", "Lcom/api/feature/bottomsheetdialog/utils/SimpleBottomSheetWithDataFragment;", "LT82;", "LW82;", "FeatureRobotBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnlockIndicatorsBottomSheetFragment extends SimpleBottomSheetWithDataFragment<T82, W82> {

    public /* synthetic */ class a extends C2784ak0 implements InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, T82> {
        public static final a m = new a(3, T82.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/base/feature/robot/databinding/UnlockIndicatorsBottomSheetBinding;", 0);

        @Override // defpackage.InterfaceC1060Gj0
        public final T82 k(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p0 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean zBooleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p0, "p0");
            View viewInflate = p0.inflate(R.layout.unlock_indicators_bottom_sheet, viewGroup2, false);
            if (zBooleanValue) {
                viewGroup2.addView(viewInflate);
            }
            int i = R.id.button;
            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.button);
            if (materialButton != null) {
                i = R.id.description;
                TextView textView = (TextView) C3476e.h(viewInflate, R.id.description);
                if (textView != null) {
                    i = R.id.image;
                    ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.image);
                    if (imageView != null) {
                        i = R.id.image_card;
                        if (((MaterialCardView) C3476e.h(viewInflate, R.id.image_card)) != null) {
                            i = R.id.title;
                            TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.title);
                            if (textView2 != null) {
                                i = R.id.top_drag_icon;
                                if (((ImageView) C3476e.h(viewInflate, R.id.top_drag_icon)) != null) {
                                    return new T82(imageView, textView, textView2, (ConstraintLayout) viewInflate, materialButton);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment
    @NotNull
    public final InterfaceC1060Gj0<LayoutInflater, ViewGroup, Boolean, T82> g() {
        return a.m;
    }

    @Override // com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment
    public final void i(W82 w82) {
        W82 data = w82;
        Intrinsics.checkNotNullParameter(data, "data");
        T82 t82J = j();
        ImageView image = t82J.h;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        C3435dm0.c(image, data.a, R.drawable.big_picture_placeholder);
        t82J.i.setText(getString(data.b));
        t82J.g.setText(getString(data.c));
        t82J.e.setOnClickListener(new ViewOnClickListenerC0714By(1, this, data));
    }
}
