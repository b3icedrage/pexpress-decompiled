package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1604Ni implements InterfaceC1446Li {

    @Nullable
    public String a;

    @NotNull
    public final KW1 b = XO0.b(new C1523Mi(this, 0));

    @Override // defpackage.InterfaceC1446Li
    @NotNull
    public final String a() {
        return (String) this.b.getValue();
    }

    @Override // defpackage.InterfaceC1446Li
    public final void b(@NotNull Context context) {
        PackageInfo packageInfoA;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            packageInfoA = C4699jb1.a(packageManager, packageName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfoA = null;
        }
        if (packageInfoA == null || (str = packageInfoA.versionName) == null) {
            str = "1.0.0";
        }
        this.a = str;
    }
}
