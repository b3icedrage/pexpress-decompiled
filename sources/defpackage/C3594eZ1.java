package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3594eZ1 implements InterfaceC3385dZ1 {

    @Nullable
    public C7988zD0 d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.item_time_select, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i = R.id.fragment_time_select_icon;
        ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.fragment_time_select_icon);
        if (imageView != null) {
            i = R.id.fragment_time_select_radio_button;
            MaterialRadioButton materialRadioButton = (MaterialRadioButton) C3476e.h(viewInflate, R.id.fragment_time_select_radio_button);
            if (materialRadioButton != null) {
                i = R.id.fragment_time_select_title;
                TextView textView = (TextView) C3476e.h(viewInflate, R.id.fragment_time_select_title);
                if (textView != null) {
                    i = R.id.percent;
                    TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.percent);
                    if (textView2 != null) {
                        C7988zD0 c7988zD0 = new C7988zD0(linearLayout, linearLayout, imageView, materialRadioButton, textView, textView2);
                        this.d = c7988zD0;
                        Intrinsics.checkNotNull(c7988zD0);
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "getRoot(...)");
                        return linearLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC3385dZ1
    @NotNull
    public final View b() {
        C7988zD0 c7988zD0 = this.d;
        Intrinsics.checkNotNull(c7988zD0);
        LinearLayout fragmentTimeSelectContainer = c7988zD0.e;
        Intrinsics.checkNotNullExpressionValue(fragmentTimeSelectContainer, "fragmentTimeSelectContainer");
        return fragmentTimeSelectContainer;
    }

    @Override // defpackage.InterfaceC3385dZ1
    @NotNull
    public final ImageView getIcon() {
        C7988zD0 c7988zD0 = this.d;
        Intrinsics.checkNotNull(c7988zD0);
        ImageView fragmentTimeSelectIcon = c7988zD0.g;
        Intrinsics.checkNotNullExpressionValue(fragmentTimeSelectIcon, "fragmentTimeSelectIcon");
        return fragmentTimeSelectIcon;
    }

    @Override // defpackage.InterfaceC3385dZ1
    @NotNull
    public final TextView getTitle() {
        C7988zD0 c7988zD0 = this.d;
        Intrinsics.checkNotNull(c7988zD0);
        TextView fragmentTimeSelectTitle = c7988zD0.i;
        Intrinsics.checkNotNullExpressionValue(fragmentTimeSelectTitle, "fragmentTimeSelectTitle");
        return fragmentTimeSelectTitle;
    }

    @Override // defpackage.InterfaceC3385dZ1
    @NotNull
    public final TextView h() {
        C7988zD0 c7988zD0 = this.d;
        Intrinsics.checkNotNull(c7988zD0);
        TextView percent = c7988zD0.j;
        Intrinsics.checkNotNullExpressionValue(percent, "percent");
        return percent;
    }

    @Override // defpackage.InterfaceC3385dZ1
    @NotNull
    public final MaterialRadioButton n() {
        C7988zD0 c7988zD0 = this.d;
        Intrinsics.checkNotNull(c7988zD0);
        MaterialRadioButton fragmentTimeSelectRadioButton = c7988zD0.h;
        Intrinsics.checkNotNullExpressionValue(fragmentTimeSelectRadioButton, "fragmentTimeSelectRadioButton");
        return fragmentTimeSelectRadioButton;
    }
}
