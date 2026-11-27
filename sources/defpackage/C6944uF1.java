package defpackage;

import io.sentry.ILogger;
import io.sentry.transport.l;
import io.sentry.util.g;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: uF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6944uF1 {
    public final /* synthetic */ ILogger a;
    public final /* synthetic */ String b;
    public final /* synthetic */ S10 c;
    public final /* synthetic */ File d;

    public /* synthetic */ C6944uF1(ILogger iLogger, String str, S10 s10, File file) {
        this.a = iLogger;
        this.b = str;
        this.c = s10;
        this.d = file;
    }

    public final void a() {
        File file = this.d;
        NG1 ng1 = NG1.DEBUG;
        String str = this.b;
        ILogger iLogger = this.a;
        iLogger.a(ng1, "Started processing cached files from %s", str);
        final S10 s10 = this.c;
        ILogger iLogger2 = s10.b;
        try {
            iLogger2.a(ng1, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: R10
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return s10.a(str2);
                }
            });
            if (fileArrListFiles == null) {
                iLogger2.a(NG1.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
            } else {
                iLogger2.a(ng1, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        String absolutePath = file2.getAbsolutePath();
                        LW1 lw1 = s10.d;
                        if (!lw1.contains(absolutePath)) {
                            l lVarH = s10.a.h();
                            if (lVarH != null && lVarH.f(EnumC5932pS.All)) {
                                iLogger2.a(NG1.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                                break;
                            } else {
                                iLogger2.a(NG1.DEBUG, "Processing file: %s", absolutePath);
                                s10.b(file2, g.a(new S10.a(s10.c, s10.b, absolutePath, lw1)));
                                Thread.sleep(100L);
                            }
                        } else {
                            iLogger2.a(NG1.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                        }
                    } else {
                        iLogger2.a(NG1.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                    }
                }
            }
        } catch (Throwable th) {
            iLogger2.c(NG1.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
        iLogger.a(NG1.DEBUG, "Finished processing cached files from %s", str);
    }
}
