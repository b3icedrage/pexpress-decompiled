package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BM0 implements InterfaceC5569ni0 {

    @Nullable
    public C5359mi0 d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC5569ni0
    @NotNull
    public final ImageView N() {
        C5359mi0 c5359mi0 = this.d;
        Intrinsics.checkNotNull(c5359mi0);
        ImageView progressLayout = c5359mi0.g;
        Intrinsics.checkNotNullExpressionValue(progressLayout, "progressLayout");
        return progressLayout;
    }

    @Override // defpackage.InterfaceC5569ni0
    @NotNull
    public final TextView Q() {
        C5359mi0 c5359mi0 = this.d;
        Intrinsics.checkNotNull(c5359mi0);
        TextView titleLaunchApp = c5359mi0.h;
        Intrinsics.checkNotNullExpressionValue(titleLaunchApp, "titleLaunchApp");
        return titleLaunchApp;
    }

    @Override // defpackage.InterfaceC5569ni0
    @Nullable
    public final TextView S() {
        C5359mi0 c5359mi0 = this.d;
        if (c5359mi0 != null) {
            return c5359mi0.e;
        }
        return null;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_launch_app, viewGroup, false);
        int i = R.id.icon_app;
        if (((ImageView) C3476e.h(viewInflate, R.id.icon_app)) != null) {
            i = R.id.progress_inner_text;
            TextView textView = (TextView) C3476e.h(viewInflate, R.id.progress_inner_text);
            if (textView != null) {
                i = R.id.progress_layout;
                ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.progress_layout);
                if (imageView != null) {
                    i = R.id.title_launch_App;
                    TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.title_launch_App);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        C5359mi0 c5359mi0 = new C5359mi0(imageView, textView, textView2, constraintLayout);
                        this.d = c5359mi0;
                        Intrinsics.checkNotNull(c5359mi0);
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
