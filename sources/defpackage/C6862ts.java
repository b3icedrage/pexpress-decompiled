package defpackage;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6862ts implements InterfaceC5398mt1, InterfaceC3646em2 {
    public final Object d;
    public final Object e;

    public C6862ts(C4066gm2 c4066gm2, C3227cm2 c3227cm2, ED ed) {
        this.d = c4066gm2;
        this.e = c3227cm2;
    }

    @Override // defpackage.InterfaceC4276hm2
    public Object a() {
        return new C3437dm2(((C4066gm2) this.d).d, (C7266vm2) ((C3227cm2) this.e).a(), new LE());
    }

    @Override // defpackage.InterfaceC5398mt1
    @NonNull
    public A60 d(@NonNull C4227ha1 c4227ha1) {
        return A60.e;
    }

    @Override // defpackage.E60
    public boolean f(@NonNull Object obj, @NonNull File file, @NonNull C4227ha1 c4227ha1) {
        return ((C7072us) this.e).f(new C1164Hs((InterfaceC0930Es) this.d, ((BitmapDrawable) ((InterfaceC3667et1) obj).get()).getBitmap()), file, c4227ha1);
    }

    public C6862ts(InterfaceC0930Es interfaceC0930Es, C7072us c7072us) {
        this.d = interfaceC0930Es;
        this.e = c7072us;
    }

    public C6862ts(@NotNull C4750jo1 imageLoader, @NotNull InterfaceC1086Gs referenceCounter) {
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        this.d = imageLoader;
        this.e = referenceCounter;
    }
}
