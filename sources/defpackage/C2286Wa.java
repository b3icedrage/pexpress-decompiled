package defpackage;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import io.sentry.android.core.b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2286Wa implements InterfaceC7874yh {
    public static boolean d(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        } catch (RuntimeException e) {
            b0.e("WebViewLinks", "launch failed: ".concat(e.getClass().getSimpleName()));
            return false;
        }
    }

    @Override // defpackage.InterfaceC7874yh
    @SuppressLint({"QueryPermissionsNeeded"})
    public final boolean a(@NotNull Context context, @NotNull C7664xh link) {
        ActivityInfo activityInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(link, "link");
        String str = link.c;
        if (str == null) {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            int i = Build.VERSION.SDK_INT;
            Intent intent = link.a;
            ResolveInfo resolveInfoResolveActivity = i >= 33 ? packageManager.resolveActivity(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.resolveActivity(intent, 0);
            str = (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName;
        }
        return Intrinsics.a(str, context.getPackageName());
    }

    @Override // defpackage.InterfaceC7874yh
    public final boolean b(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(packageName))).addCategory("android.intent.category.BROWSABLE").addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        if (d(context, intentAddFlags)) {
            return true;
        }
        Intent intentAddFlags2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(packageName))).addCategory("android.intent.category.BROWSABLE").addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags2, "addFlags(...)");
        return d(context, intentAddFlags2);
    }

    @Override // defpackage.InterfaceC7874yh
    public final boolean c(@NotNull Context context, @NotNull C7664xh link) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(link, "link");
        return d(context, link.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r1 == null) goto L17;
     */
    @Override // defpackage.InterfaceC7874yh
    @android.annotation.SuppressLint({"UseKtx"})
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C7664xh parse(@org.jetbrains.annotations.NotNull java.lang.String r6) throws java.net.URISyntaxException {
        /*
            r5 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r1 = defpackage.C6620si2.b(r6)
            r2 = 0
            if (r1 != 0) goto Ld
            goto L48
        Ld:
            java.lang.String r3 = "intent"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L2a
            java.lang.String r3 = "android-app"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1e
            goto L2a
        L1e:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r1.<init>(r3, r6)
            goto L49
        L2a:
            r1 = 1
            android.content.Intent r6 = android.content.Intent.parseUri(r6, r1)     // Catch: java.lang.Exception -> L31
            r1 = r6
            goto L46
        L31:
            r6 = move-exception
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r1 = "cannot parse intent uri: "
            java.lang.String r6 = r1.concat(r6)
            java.lang.String r1 = "WebViewLinks"
            io.sentry.android.core.b0.e(r1, r6)
            r1 = r2
        L46:
            if (r1 != 0) goto L49
        L48:
            return r2
        L49:
            java.lang.String r6 = "browser_fallback_url"
            java.lang.String r3 = r1.getStringExtra(r6)
            if (r3 == 0) goto L63
            java.util.Set<java.lang.String> r4 = defpackage.C6620si2.a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Set<java.lang.String> r0 = defpackage.C6620si2.a
            java.lang.String r4 = defpackage.C6620si2.b(r3)
            boolean r0 = kotlin.collections.CollectionsKt.z(r0, r4)
            if (r0 == 0) goto L63
            goto L64
        L63:
            r3 = r2
        L64:
            r1.removeExtra(r6)
            xh r6 = new xh
            r1.setComponent(r2)
            r1.setSelector(r2)
            int r0 = r1.getFlags()
            r2 = 1007159312(0x3c080810, float:0.0083027035)
            r0 = r0 & r2
            r1.setFlags(r0)
            java.lang.String r0 = "android.intent.category.BROWSABLE"
            r1.addCategory(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r0)
            java.lang.String r0 = r1.getScheme()
            java.lang.String r2 = r1.getPackage()
            r6.<init>(r1, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2286Wa.parse(java.lang.String):xh");
    }
}
