package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class P7 implements InterfaceC5739oX1 {
    public final /* synthetic */ C3027bp1 d;
    public final /* synthetic */ C3027bp1 e;
    public final /* synthetic */ Context g;
    public final /* synthetic */ C3027bp1 h;

    public P7(C3027bp1 c3027bp1, C3027bp1 c3027bp2, Context context, C3027bp1 c3027bp3) {
        this.d = c3027bp1;
        this.e = c3027bp2;
        this.g = context;
        this.h = c3027bp3;
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void a(@NotNull Drawable result) {
        Intrinsics.checkNotNullParameter(result, "result");
        C3027bp1 c3027bp1 = this.h;
        ProgressBar progressBar = ((C0787Cw0) c3027bp1.d).b;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = ((C0787Cw0) c3027bp1.d).e;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        ((C0787Cw0) c3027bp1.d).a.setImageDrawable(result);
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void c(@Nullable Drawable drawable) {
        C3027bp1 c3027bp1 = this.e;
        ProgressBar progressBar = ((C0787Cw0) c3027bp1.d).b;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        AppCompatImageView appCompatImageView = ((C0787Cw0) c3027bp1.d).e;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
        }
        TextView textView = ((C0787Cw0) c3027bp1.d).d;
        if (textView != null) {
            textView.setText(this.g.getString(R.string.media_uploading_common_error));
        }
        TextView textView2 = ((C0787Cw0) c3027bp1.d).d;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void d(@Nullable Drawable drawable) {
        C3027bp1 c3027bp1 = this.d;
        ProgressBar progressBar = ((C0787Cw0) c3027bp1.d).b;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        AppCompatImageView appCompatImageView = ((C0787Cw0) c3027bp1.d).e;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(0);
        }
        TextView textView = ((C0787Cw0) c3027bp1.d).d;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
