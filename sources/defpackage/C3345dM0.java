package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3345dM0 implements InterfaceC3135cM0 {

    @Nullable
    public C7147vD0 d;

    @Override // defpackage.InterfaceC3135cM0
    @NotNull
    public final AppCompatImageView C() {
        C7147vD0 c7147vD0 = this.d;
        Intrinsics.checkNotNull(c7147vD0);
        AppCompatImageView languageIcon = c7147vD0.e;
        Intrinsics.checkNotNullExpressionValue(languageIcon, "languageIcon");
        return languageIcon;
    }

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC3135cM0
    public final ConstraintLayout G() {
        C7147vD0 c7147vD0 = this.d;
        Intrinsics.checkNotNull(c7147vD0);
        ConstraintLayout languageRoot = c7147vD0.h;
        Intrinsics.checkNotNullExpressionValue(languageRoot, "languageRoot");
        return languageRoot;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.item_language, viewGroup, false);
        int i = R.id.language_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C3476e.h(viewInflate, R.id.language_icon);
        if (appCompatImageView != null) {
            i = R.id.language_name;
            TextView textView = (TextView) C3476e.h(viewInflate, R.id.language_name);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                if (C3476e.h(viewInflate, R.id.language_separator) != null) {
                    C7147vD0 c7147vD0 = new C7147vD0(constraintLayout, appCompatImageView, textView, constraintLayout);
                    this.d = c7147vD0;
                    Intrinsics.checkNotNull(c7147vD0);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
                i = R.id.language_separator;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC3135cM0
    @NotNull
    public final ConstraintLayout a() {
        C7147vD0 c7147vD0 = this.d;
        Intrinsics.checkNotNull(c7147vD0);
        ConstraintLayout constraintLayout = c7147vD0.d;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // defpackage.InterfaceC3135cM0
    @NotNull
    public final TextView y() {
        C7147vD0 c7147vD0 = this.d;
        Intrinsics.checkNotNull(c7147vD0);
        TextView languageName = c7147vD0.g;
        Intrinsics.checkNotNullExpressionValue(languageName, "languageName");
        return languageName;
    }
}
