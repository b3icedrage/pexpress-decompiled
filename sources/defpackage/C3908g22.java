package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: g22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3908g22 implements InterfaceC3698f22 {

    @Nullable
    public AD0 d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.item_trading_asset, viewGroup, false);
        int i = R.id.all_view;
        LinearLayout linearLayout = (LinearLayout) C3476e.h(viewInflate, R.id.all_view);
        if (linearLayout != null) {
            i = R.id.asset_icon;
            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.asset_icon);
            if (imageView != null) {
                i = R.id.asset_name;
                TextView textView = (TextView) C3476e.h(viewInflate, R.id.asset_name);
                if (textView != null) {
                    i = R.id.asset_percents;
                    TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.asset_percents);
                    if (textView2 != null) {
                        LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                        AD0 ad0 = new AD0(linearLayout2, linearLayout, imageView, textView, textView2);
                        this.d = ad0;
                        Intrinsics.checkNotNull(ad0);
                        Intrinsics.checkNotNullExpressionValue(linearLayout2, "getRoot(...)");
                        return linearLayout2;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC3698f22
    @NotNull
    public final View b() {
        AD0 ad0 = this.d;
        Intrinsics.checkNotNull(ad0);
        LinearLayout linearLayout = ad0.d;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
        return linearLayout;
    }

    @Override // defpackage.InterfaceC3698f22
    @NotNull
    public final ImageView getIcon() {
        AD0 ad0 = this.d;
        Intrinsics.checkNotNull(ad0);
        ImageView assetIcon = ad0.g;
        Intrinsics.checkNotNullExpressionValue(assetIcon, "assetIcon");
        return assetIcon;
    }

    @Override // defpackage.InterfaceC3698f22
    @NotNull
    public final TextView getTitle() {
        AD0 ad0 = this.d;
        Intrinsics.checkNotNull(ad0);
        TextView assetName = ad0.h;
        Intrinsics.checkNotNullExpressionValue(assetName, "assetName");
        return assetName;
    }

    @Override // defpackage.InterfaceC3698f22
    @NotNull
    public final TextView h() {
        AD0 ad0 = this.d;
        Intrinsics.checkNotNull(ad0);
        TextView assetPercents = ad0.i;
        Intrinsics.checkNotNullExpressionValue(assetPercents, "assetPercents");
        return assetPercents;
    }

    @Override // defpackage.InterfaceC3698f22
    @NotNull
    public final LinearLayout z() {
        AD0 ad0 = this.d;
        Intrinsics.checkNotNull(ad0);
        LinearLayout allView = ad0.e;
        Intrinsics.checkNotNullExpressionValue(allView, "allView");
        return allView;
    }
}
