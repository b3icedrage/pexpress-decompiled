package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3712f60 implements InterfaceC1086Gs {

    @NotNull
    public static final C3712f60 a = new C3712f60();

    @Override // defpackage.InterfaceC1086Gs
    public final void a(@NotNull Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
    }

    @Override // defpackage.InterfaceC1086Gs
    public final boolean b(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return false;
    }

    @Override // defpackage.InterfaceC1086Gs
    public final void c(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
    }
}
