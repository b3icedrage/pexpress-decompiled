package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import io.sentry.android.core.b0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3470dy {

    @NotNull
    public final Context a;

    public C3470dy(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public static void b(File file) {
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile() && file2.lastModified() < jCurrentTimeMillis) {
                        arrayList.add(file2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                Unit unit = Unit.a;
            }
            C1717Ot1.a aVar2 = C1717Ot1.e;
        } catch (Throwable th) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            C1795Pt1.a(th);
        }
    }

    public final C3261cy a(String str, String str2, boolean z) {
        Object objA;
        Context context = this.a;
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            if (externalFilesDir == null) {
                objA = null;
            } else {
                b(externalFilesDir);
                File fileCreateTempFile = File.createTempFile(str + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + "_", str2, externalFilesDir);
                Uri uriB = FileProvider.c(context, "com.pexpress.tool.fileprovider").b(fileCreateTempFile);
                Intrinsics.checkNotNullExpressionValue(uriB, "getUriForFile(...)");
                Intrinsics.checkNotNull(fileCreateTempFile);
                objA = new C3261cy(uriB, z, fileCreateTempFile);
            }
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            b0.d("CameraOutputFiles", "Cannot create a camera output file", thA);
        }
        return (C3261cy) (objA instanceof C1717Ot1.b ? null : objA);
    }
}
