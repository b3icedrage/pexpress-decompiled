package defpackage;

import android.webkit.MimeTypeMap;
import io.sentry.instrumentation.file.f;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Pc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1743Pc0 implements InterfaceC5122lc0<File> {
    public final boolean a;

    public C1743Pc0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final boolean a(File file) {
        File data = file;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(data, "data");
        return true;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final String b(File file) {
        File data = file;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!this.a) {
            String path = data.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "data.path");
            return path;
        }
        return data.getPath() + ':' + data.lastModified();
    }

    @Override // defpackage.InterfaceC5122lc0
    public final Object c(C2509Yn1 c2509Yn1, Object obj, LM1 lm1, C4695ja1 c4695ja1, S60 s60) {
        File file = (File) obj;
        Logger logger = J81.a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new ZN1(Cm2.e(new IA0(f.a.a(file, new FileInputStream(file)), LZ1.d)), MimeTypeMap.getSingleton().getMimeTypeFromExtension(C6179qd0.e(file)), DS.g);
    }
}
