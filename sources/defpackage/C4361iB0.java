package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4361iB0 implements InterfaceC4151hB0 {

    @Nullable
    public C3941gB0 d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.instruction_item, viewGroup, false);
        int i = R.id.description;
        TextView textView = (TextView) C3476e.h(viewInflate, R.id.description);
        if (textView != null) {
            i = R.id.title;
            TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.title);
            if (textView2 != null) {
                MaterialCardView materialCardView = (MaterialCardView) viewInflate;
                C3941gB0 c3941gB0 = new C3941gB0(materialCardView, textView, textView2);
                this.d = c3941gB0;
                Intrinsics.checkNotNull(c3941gB0);
                Intrinsics.checkNotNullExpressionValue(materialCardView, "getRoot(...)");
                return materialCardView;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.InterfaceC4151hB0
    @NotNull
    public final View b() {
        C3941gB0 c3941gB0 = this.d;
        Intrinsics.checkNotNull(c3941gB0);
        MaterialCardView materialCardView = c3941gB0.d;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "getRoot(...)");
        return materialCardView;
    }

    @Override // defpackage.InterfaceC4151hB0
    @NotNull
    public final TextView getDescription() {
        C3941gB0 c3941gB0 = this.d;
        Intrinsics.checkNotNull(c3941gB0);
        TextView description = c3941gB0.e;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        return description;
    }

    @Override // defpackage.InterfaceC4151hB0
    @NotNull
    public final TextView getTitle() {
        C3941gB0 c3941gB0 = this.d;
        Intrinsics.checkNotNull(c3941gB0);
        TextView title = c3941gB0.g;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        return title;
    }
}
