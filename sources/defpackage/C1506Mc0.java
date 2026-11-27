package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: renamed from: Mc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1506Mc0 extends AbstractC2313Wj<AssetFileDescriptor> {
    @Override // defpackage.InterfaceC6771tS
    @NonNull
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.AbstractC2313Wj
    public final void d(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // defpackage.AbstractC2313Wj
    public final AssetFileDescriptor f(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }
}
