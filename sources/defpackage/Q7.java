package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Q7 implements InterfaceC5739oX1 {
    public final /* synthetic */ MaterialToolbar d;
    public final /* synthetic */ MaterialToolbar e;
    public final /* synthetic */ MaterialToolbar g;

    public Q7(MaterialToolbar materialToolbar, MaterialToolbar materialToolbar2, MaterialToolbar materialToolbar3) {
        this.d = materialToolbar;
        this.e = materialToolbar2;
        this.g = materialToolbar3;
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void a(@NotNull Drawable result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.g.setLogo(result);
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void c(@Nullable Drawable drawable) {
        this.e.setLogo(drawable);
    }

    @Override // defpackage.InterfaceC5739oX1
    public final void d(@Nullable Drawable drawable) {
        this.d.setLogo(drawable);
    }
}
