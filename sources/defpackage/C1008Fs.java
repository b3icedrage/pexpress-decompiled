package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1008Fs implements InterfaceC0930Es {
    @Override // defpackage.InterfaceC0930Es
    @NonNull
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.InterfaceC0930Es
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.InterfaceC0930Es
    @NonNull
    public final Bitmap d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.InterfaceC0930Es
    public final void e() {
    }

    @Override // defpackage.InterfaceC0930Es
    public final void a(int i) {
    }
}
