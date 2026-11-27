package com.api.resources;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.pexpress.tool.R;
import defpackage.C3211ci2;
import defpackage.C3476e;
import defpackage.C3645em1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/api/resources/WebViewLoaderView;", "Landroid/widget/LinearLayout;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "g", "Z", "getShowLogo", "()Z", "setShowLogo", "(Z)V", "showLogo", "getShowSecurityNote", "setShowSecurityNote", "showSecurityNote", "CommonResources_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebViewLoaderView extends LinearLayout {

    @NotNull
    public final C3211ci2 d;

    @Nullable
    public final Integer e;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean showLogo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(R.layout.web_view_loader_view, this);
        int i = R.id.web_view_loader_dots;
        SpinKitView spinKitView = (SpinKitView) C3476e.h(this, R.id.web_view_loader_dots);
        if (spinKitView != null) {
            i = R.id.web_view_loader_logo;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) C3476e.h(this, R.id.web_view_loader_logo);
            if (lottieAnimationView != null) {
                i = R.id.web_view_loader_security_note;
                LinearLayout linearLayout = (LinearLayout) C3476e.h(this, R.id.web_view_loader_security_note);
                if (linearLayout != null) {
                    C3211ci2 c3211ci2 = new C3211ci2(this, spinKitView, lottieAnimationView, linearLayout);
                    Intrinsics.checkNotNullExpressionValue(c3211ci2, "inflate(...)");
                    this.d = c3211ci2;
                    TypedValue typedValue = new TypedValue();
                    Integer num = null;
                    typedValue = context.getTheme().resolveAttribute(R.attr.webViewLoaderLogo, typedValue, true) ? typedValue : null;
                    if (typedValue != null) {
                        int i2 = typedValue.resourceId;
                        Integer numValueOf = Integer.valueOf(i2);
                        if (i2 != 0) {
                            num = numValueOf;
                        }
                    }
                    this.e = num;
                    this.showLogo = true;
                    setOrientation(1);
                    if (num != null) {
                        lottieAnimationView.setAnimation(num.intValue());
                    }
                    TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3645em1.b, 0, 0);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                    setShowLogo(typedArrayObtainStyledAttributes.getBoolean(0, true));
                    setShowSecurityNote(typedArrayObtainStyledAttributes.getBoolean(1, false));
                    Unit unit = Unit.a;
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    public final boolean getShowLogo() {
        return this.showLogo;
    }

    public final boolean getShowSecurityNote() {
        LinearLayout webViewLoaderSecurityNote = this.d.h;
        Intrinsics.checkNotNullExpressionValue(webViewLoaderSecurityNote, "webViewLoaderSecurityNote");
        return webViewLoaderSecurityNote.getVisibility() == 0;
    }

    public final void setShowLogo(boolean z) {
        this.showLogo = z;
        boolean z2 = z && this.e != null;
        C3211ci2 c3211ci2 = this.d;
        LottieAnimationView webViewLoaderLogo = c3211ci2.g;
        Intrinsics.checkNotNullExpressionValue(webViewLoaderLogo, "webViewLoaderLogo");
        webViewLoaderLogo.setVisibility(z2 ? 0 : 8);
        SpinKitView webViewLoaderDots = c3211ci2.e;
        Intrinsics.checkNotNullExpressionValue(webViewLoaderDots, "webViewLoaderDots");
        webViewLoaderDots.setVisibility(z2 ? 8 : 0);
    }

    public final void setShowSecurityNote(boolean z) {
        LinearLayout webViewLoaderSecurityNote = this.d.h;
        Intrinsics.checkNotNullExpressionValue(webViewLoaderSecurityNote, "webViewLoaderSecurityNote");
        webViewLoaderSecurityNote.setVisibility(z ? 0 : 8);
    }
}
