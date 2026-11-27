package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.jivosite.sdk.ui.views.JivoRatingBar;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1852Qm1 {

    @Nullable
    public final TextView a;

    @Nullable
    public final TextView b;

    @Nullable
    public final JivoRatingBar c;

    @Nullable
    public final TextInputLayout d;

    @Nullable
    public final MaterialButton e;

    public C1852Qm1(@NotNull ViewGroup layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.a = (TextView) layout.findViewById(R.id.title);
        this.b = (TextView) layout.findViewById(R.id.description);
        this.c = (JivoRatingBar) layout.findViewById(R.id.rating);
        this.d = (TextInputLayout) layout.findViewById(R.id.commentLayout);
        this.e = (MaterialButton) layout.findViewById(R.id.sendUserInfo);
    }
}
