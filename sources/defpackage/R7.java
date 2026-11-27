package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class R7 implements InterfaceC5739oX1 {
    public final /* synthetic */ MaterialToolbar d;

    public R7(MaterialToolbar materialToolbar) {
        this.d = materialToolbar;
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void a(@NotNull Drawable result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.d.setLogo(result);
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void c(@Nullable Drawable drawable) {
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void d(@Nullable Drawable drawable) {
    }
}
