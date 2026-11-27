package defpackage;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class WR1 extends AbstractC2313Wj<InputStream> {
    @Override // defpackage.InterfaceC6771tS
    @NonNull
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.AbstractC2313Wj
    public final void d(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // defpackage.AbstractC2313Wj
    public final InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
