package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0787Cw0 {

    @NotNull
    public final AppCompatImageView a;

    @Nullable
    public final ProgressBar b;

    @Nullable
    public final AppCompatImageView c;

    @Nullable
    public final TextView d;

    @Nullable
    public final AppCompatImageView e;

    public C0787Cw0(@NotNull ViewGroup layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        View viewFindViewById = layout.findViewById(R.id.image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "layout.findViewById(R.id.image)");
        this.a = (AppCompatImageView) viewFindViewById;
        this.b = (ProgressBar) layout.findViewById(R.id.progress);
        this.c = (AppCompatImageView) layout.findViewById(R.id.status);
        this.d = (TextView) layout.findViewById(R.id.error);
        this.e = (AppCompatImageView) layout.findViewById(R.id.placeholder);
    }
}
