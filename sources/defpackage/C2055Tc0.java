package defpackage;

import io.sentry.instrumentation.file.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Tc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2055Tc0 implements C1899Rc0.d<InputStream> {
    @Override // defpackage.C1899Rc0.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.C1899Rc0.d
    public final void b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // defpackage.C1899Rc0.d
    public final InputStream c(File file) {
        return f.a.a(file, new FileInputStream(file));
    }
}
