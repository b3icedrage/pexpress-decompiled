package defpackage;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: renamed from: pw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6036pw0 extends ML0 implements Function0<InterfaceC1023Fx.a> {
    public final /* synthetic */ InterfaceC6246qw0.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6036pw0(InterfaceC6246qw0.a aVar) {
        super(0);
        this.d = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1023Fx.a invoke() {
        long jE;
        C6711t81.a aVar = new C6711t81.a();
        Context context = this.d.a;
        Intrinsics.checkNotNullExpressionValue(context, "applicationContext");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File cacheDirectory = new File(context.getCacheDir(), "image_cache");
        cacheDirectory.mkdirs();
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        try {
            StatFs statFs = new StatFs(cacheDirectory.getAbsolutePath());
            jE = f.e((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
        } catch (Exception unused) {
            jE = 10485760;
        }
        aVar.k = new C3677ex(cacheDirectory, jE);
        C6711t81 c6711t81 = new C6711t81(aVar);
        Intrinsics.checkNotNullExpressionValue(c6711t81, "OkHttpClient.Builder()\n …\n                .build()");
        return c6711t81;
    }
}
