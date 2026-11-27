package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7383wL1 implements InterfaceC7172vL1 {
    @Override // defpackage.InterfaceC7172vL1
    public final void a(@NotNull View anchorView, @NotNull String difference) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(difference, "difference");
        String string = anchorView.getContext().getString(R.string.congrats_text, difference);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Pd2.c(anchorView, string, R.drawable.ic_arrow_up, null, null, anchorView, -1);
    }

    @Override // defpackage.InterfaceC7172vL1
    public final void b(@NotNull View anchorView, @NotNull String difference) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(difference, "difference");
        String string = anchorView.getContext().getString(R.string.unfortunately_you_lost_text, difference);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Pd2.c(anchorView, string, R.drawable.ic_arrow_down, null, null, anchorView, -1);
    }

    @Override // defpackage.InterfaceC7172vL1
    public final void c(@NotNull FrameLayout anchorView) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        String string = anchorView.getContext().getString(R.string.make_your_forecast_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Pd2.c(anchorView, string, R.drawable.ic_question_icon_primary, null, null, anchorView, -1);
    }
}
