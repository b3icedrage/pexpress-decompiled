package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxg1;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "ensureNoObfuscatedPrefStore", "(Landroid/content/Context;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7662xg1 {

    @NotNull
    public static final C7662xg1 INSTANCE = new C7662xg1();

    private C7662xg1() {
    }

    public final void ensureNoObfuscatedPrefStore(@NotNull Context context) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            File file = new File(context.getDataDir(), "shared_prefs");
            File file2 = new File(file, "OneSignal.xml");
            if (file.exists() && file.isDirectory() && !file2.exists() && (fileArrListFiles = file.listFiles()) != null) {
                for (File prefsFile : fileArrListFiles) {
                    Intrinsics.checkNotNullExpressionValue(prefsFile, "prefsFile");
                    if (context.getSharedPreferences(C6179qd0.f(prefsFile), 0).contains("GT_PLAYER_ID")) {
                        prefsFile.renameTo(file2);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            NS0.log(EnumC5513nS0.ERROR, "error attempting to fix obfuscated preference store", th);
        }
    }
}
