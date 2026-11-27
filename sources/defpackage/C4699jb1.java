package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4699jb1 {
    public static PackageInfo a(PackageManager packageManager, String packageName) throws PackageManager.NameNotFoundException {
        AbstractC3601eb1 flags = AbstractC3601eb1.a;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(flags, "flags");
        if (Build.VERSION.SDK_INT >= 33) {
            if (!(flags instanceof AbstractC3601eb1.b)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, ((AbstractC3601eb1.b) flags).b);
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        if (!(flags instanceof AbstractC3601eb1.a)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((AbstractC3601eb1.a) flags).getClass();
        PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, 0);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }
}
