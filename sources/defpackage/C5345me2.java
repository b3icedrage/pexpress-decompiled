package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: me2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5345me2 {
    public final WeakReference<View> a;

    public C5345me2(View view) {
        this.a = new WeakReference<>(view);
    }

    @NonNull
    public final void a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    @NonNull
    public final void c(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    @NonNull
    public final void d(InterfaceC5765oe2 interfaceC5765oe2) {
        View view = this.a.get();
        if (view != null) {
            if (interfaceC5765oe2 != null) {
                view.animate().setListener(new C5132le2(interfaceC5765oe2, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    @NonNull
    public final void e(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
