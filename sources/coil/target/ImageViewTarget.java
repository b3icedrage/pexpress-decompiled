package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.FP0;
import defpackage.InterfaceC1127Hf1;
import defpackage.O42;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcoil/target/ImageViewTarget;", "LHf1;", "Landroid/widget/ImageView;", "LO42;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "coil-base_release"}, k = 1, mv = {1, 4, 1})
public class ImageViewTarget implements InterfaceC1127Hf1<ImageView>, O42, DefaultLifecycleObserver {
    public boolean d;

    @NotNull
    public final AppCompatImageView e;

    public ImageViewTarget(@NotNull AppCompatImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.e = view;
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void a(@NotNull Drawable result) {
        Intrinsics.checkNotNullParameter(result, "result");
        g(result);
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void c(@Nullable Drawable drawable) {
        g(drawable);
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void d(@Nullable Drawable drawable) {
        g(drawable);
    }

    @Override // defpackage.InterfaceC7234ve2
    public final ImageView e() {
        return this.e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageViewTarget) {
            return Intrinsics.a(this.e, ((ImageViewTarget) obj).e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC1127Hf1
    public final void f() {
        g(null);
    }

    public final void g(@Nullable Drawable drawable) {
        AppCompatImageView appCompatImageView = this.e;
        Object drawable2 = appCompatImageView.getDrawable();
        if (!(drawable2 instanceof Animatable)) {
            drawable2 = null;
        }
        Animatable animatable = (Animatable) drawable2;
        if (animatable != null) {
            animatable.stop();
        }
        appCompatImageView.setImageDrawable(drawable);
        h();
    }

    public final void h() {
        Object drawable = this.e.getDrawable();
        if (!(drawable instanceof Animatable)) {
            drawable = null;
        }
        Animatable animatable = (Animatable) drawable;
        if (animatable != null) {
            if (this.d) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(@NotNull FP0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.d = true;
        h();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(@NotNull FP0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.d = false;
        h();
    }

    @NotNull
    public final String toString() {
        return "ImageViewTarget(view=" + this.e + ')';
    }
}
