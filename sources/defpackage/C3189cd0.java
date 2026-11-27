package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3189cd0 extends ML0 implements Function1 {
    public static final C3189cd0 e = new C3189cd0(1, 0);
    public static final C3189cd0 g = new C3189cd0(1, 1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3189cd0(int i, int i2) {
        super(i);
        this.d = i2;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [ML0, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                File file = (File) obj;
                Intrinsics.checkNotNullParameter(file, "it");
                Intrinsics.checkNotNullParameter(file, "file");
                String filePath = file.getCanonicalFile().getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(filePath, "file.canonicalFile.absolutePath");
                Intrinsics.checkNotNullParameter(filePath, "filePath");
                return new CM1(filePath);
            default:
                C4235hc1 it = (C4235hc1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                StringBuilder sb = new StringBuilder("position ");
                sb.append(it.a);
                sb.append(": '");
                return C1039Gc0.e(sb, (String) it.b.invoke(), '\'');
        }
    }
}
