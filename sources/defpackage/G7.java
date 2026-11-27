package defpackage;

import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class G7<T> {

    @NotNull
    public final C5502nO1<D7<T>> a = new C5502nO1<>();

    public G7() {
        a(new C0724Cb0(0, R.layout.dg_item_fallback));
    }

    public final <D extends D7<T>> void a(@NotNull D delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        int i = delegate.a;
        C5502nO1<D7<T>> c5502nO1 = this.a;
        if (((D7) c5502nO1.d(i, null)) != null) {
            throw new IllegalArgumentException("The delegate has been already added: ".concat(delegate.getClass().getSimpleName()).toString());
        }
        c5502nO1.e(delegate.a, delegate);
    }
}
