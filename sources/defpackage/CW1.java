package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class CW1 implements InterfaceC1088Gs1<Drawable> {

    @NotNull
    public final ImageView d;

    @Nullable
    public final String e;
    public final int g;

    @NotNull
    public final Handler h;

    public CW1(@NotNull ImageView imageView, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        this.d = imageView;
        this.e = str;
        this.g = i;
        this.h = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.InterfaceC1088Gs1
    public final /* bridge */ /* synthetic */ boolean c(Object obj, InterfaceC5529nX1 interfaceC5529nX1) {
        return false;
    }

    @Override // defpackage.InterfaceC1088Gs1
    public final boolean g(@Nullable C2160Ul0 c2160Ul0, @Nullable InterfaceC5529nX1 interfaceC5529nX1) {
        this.h.post(new RunnableC3329dH(this, 5));
        return true;
    }
}
