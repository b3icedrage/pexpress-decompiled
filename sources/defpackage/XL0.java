package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.api.resources.CenteredToolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class XL0 implements WL0 {

    @Nullable
    public C2776ai0 d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.WL0
    @NotNull
    public final CenteredToolbar I() {
        C2776ai0 c2776ai0 = this.d;
        Intrinsics.checkNotNull(c2776ai0);
        CenteredToolbar fragmentChangeLanguageToolbar = c2776ai0.g;
        Intrinsics.checkNotNullExpressionValue(fragmentChangeLanguageToolbar, "fragmentChangeLanguageToolbar");
        return fragmentChangeLanguageToolbar;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_change_language_repeat, viewGroup, false);
        int i = R.id.fragment_change_language_app_bar_layout;
        if (((AppBarLayout) C3476e.h(viewInflate, R.id.fragment_change_language_app_bar_layout)) != null) {
            i = R.id.fragment_change_language_recycler;
            RecyclerView recyclerView = (RecyclerView) C3476e.h(viewInflate, R.id.fragment_change_language_recycler);
            if (recyclerView != null) {
                i = R.id.fragment_change_language_toolbar;
                CenteredToolbar centeredToolbar = (CenteredToolbar) C3476e.h(viewInflate, R.id.fragment_change_language_toolbar);
                if (centeredToolbar != null) {
                    i = R.id.fragment_change_save_btn;
                    MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.fragment_change_save_btn);
                    if (materialButton != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        C2776ai0 c2776ai0 = new C2776ai0(constraintLayout, recyclerView, centeredToolbar, materialButton);
                        this.d = c2776ai0;
                        Intrinsics.checkNotNull(c2776ai0);
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.WL0
    @NotNull
    public final RecyclerView p() {
        C2776ai0 c2776ai0 = this.d;
        Intrinsics.checkNotNull(c2776ai0);
        RecyclerView fragmentChangeLanguageRecycler = c2776ai0.e;
        Intrinsics.checkNotNullExpressionValue(fragmentChangeLanguageRecycler, "fragmentChangeLanguageRecycler");
        return fragmentChangeLanguageRecycler;
    }

    @Override // defpackage.WL0
    @NotNull
    public final MaterialButton s() {
        C2776ai0 c2776ai0 = this.d;
        Intrinsics.checkNotNull(c2776ai0);
        MaterialButton fragmentChangeSaveBtn = c2776ai0.h;
        Intrinsics.checkNotNullExpressionValue(fragmentChangeSaveBtn, "fragmentChangeSaveBtn");
        return fragmentChangeSaveBtn;
    }
}
