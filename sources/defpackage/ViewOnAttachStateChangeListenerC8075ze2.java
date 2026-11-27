package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import coil.memory.ViewTargetRequestDelegate;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ze2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC8075ze2 implements View.OnAttachStateChangeListener {
    public ViewTargetRequestDelegate d;

    @Nullable
    public volatile UUID e;
    public boolean g;
    public boolean h = true;
    public final C2703aM1<Object, Bitmap> i = new C2703aM1<>();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (this.h) {
            this.h = false;
            return;
        }
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.d;
        if (viewTargetRequestDelegate != null) {
            this.g = true;
            viewTargetRequestDelegate.d.a(viewTargetRequestDelegate.e);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.h = false;
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.d;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.c();
        }
    }
}
