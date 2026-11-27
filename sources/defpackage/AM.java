package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AM {
    @NotNull
    public static final String a(@NotNull Context context, @NotNull Object source) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof Integer) {
            String string = context.getString(((Number) source).intValue());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (source instanceof String) {
            return (String) source;
        }
        throw new IllegalStateException("source type should be either Int or String.");
    }

    public static final void b(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
        intent.setFlags(268435456);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(C5491nL.c("https://play.google.com/store/apps/details?id=", packageName)));
        intent2.setFlags(268435456);
        if (intent2.resolveActivity(context.getPackageManager()) == null) {
            return;
        }
        context.startActivity(intent2);
    }

    @NotNull
    public static final String c(@NotNull ApplicationC0963Fd applicationC0963Fd, @NotNull String key) {
        Object flags;
        ApplicationInfo applicationInfo;
        Intrinsics.checkNotNullParameter(applicationC0963Fd, "<this>");
        Intrinsics.checkNotNullParameter(key, "str");
        PackageManager packageManager = applicationC0963Fd.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        String packageName = applicationC0963Fd.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        int i = AbstractC0978Fi.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            PackageManager.ApplicationInfoFlags applicationInfoFlagsOf = PackageManager.ApplicationInfoFlags.of(UserVerificationMethods.USER_VERIFY_PATTERN);
            Intrinsics.checkNotNullExpressionValue(applicationInfoFlagsOf, "of(...)");
            flags = new AbstractC0978Fi.b(applicationInfoFlagsOf);
        } else {
            flags = new AbstractC0978Fi.a(UserVerificationMethods.USER_VERIFY_PATTERN);
        }
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(flags, "flags");
        if (i2 >= 33) {
            if (!(flags instanceof AbstractC0978Fi.b)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            applicationInfo = packageManager.getApplicationInfo(packageName, ((AbstractC0978Fi.b) flags).b);
            Intrinsics.checkNotNull(applicationInfo);
        } else {
            if (!(flags instanceof AbstractC0978Fi.a)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            applicationInfo = packageManager.getApplicationInfo(packageName, ((AbstractC0978Fi.a) flags).b);
            Intrinsics.checkNotNull(applicationInfo);
        }
        Bundle metaData = applicationInfo.metaData;
        Intrinsics.checkNotNullExpressionValue(metaData, "metaData");
        Intrinsics.checkNotNullParameter(metaData, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String string = metaData.getString(key);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("No mapping of the desired type exists for the given key or a null value is explicitly associated with key.");
    }
}
