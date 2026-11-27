package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6772tS0 implements J71 {
    public static C6772tS0 d;

    @NotNull
    public static final String a(@NotNull O3 o3) {
        Object objA;
        Intrinsics.checkNotNullParameter(o3, "<this>");
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            objA = ((EnumC4164hF1) o3.l().d.getValue()).d;
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        if (objA instanceof C1717Ot1.b) {
            objA = "unknown";
        }
        return (String) objA;
    }

    public static int b(@NonNull Context context, @NonNull String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strD = C0975Fh.d(str);
            if (strD != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerC = C1053Gh.c(context);
                    iC = C1053Gh.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                    if (iC == 0) {
                        iC = C1053Gh.a(appOpsManagerC, strD, iMyUid, C1053Gh.b(context));
                    }
                } else {
                    iC = C0975Fh.c((AppOpsManager) C0975Fh.a(context, AppOpsManager.class), strD, packageName);
                }
                if (iC != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    @NotNull
    public static FC c(@NotNull FC readOnly) {
        Intrinsics.checkNotNullParameter(readOnly, "readOnly");
        C1836Qh0 c1836Qh0G = C4432iZ.g(readOnly);
        String str = RE0.a;
        C1758Ph0 c1758Ph0 = RE0.k.get(c1836Qh0G);
        if (c1758Ph0 != null) {
            FC fcI = C4900kZ.e(readOnly).i(c1758Ph0);
            Intrinsics.checkNotNullExpressionValue(fcI, "getBuiltInClassByFqName(...)");
            return fcI;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public static FC d(C1758Ph0 fqName, RK0 builtIns) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        String str = RE0.a;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        QC qc = RE0.h.get(fqName.i());
        if (qc != null) {
            return builtIns.i(qc.a());
        }
        return null;
    }

    public static final void f(@NotNull InterfaceC1015Fu0 interfaceC1015Fu0, @NotNull String mode) {
        Intrinsics.checkNotNullParameter(interfaceC1015Fu0, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        interfaceC1015Fu0.b("account_mode", mode);
        interfaceC1015Fu0.b("ws.selected_account", mode);
    }

    @Nullable
    public static final Object g(@NotNull CoroutineContext coroutineContext, Object obj, @NotNull Object obj2, @NotNull Function2 function2, @NotNull JM frame) {
        Object objInvoke;
        Object objC = CY1.c(coroutineContext, obj2);
        try {
            TO1 to1 = new TO1(frame, coroutineContext);
            if (function2 == null) {
                objInvoke = C5885pC0.c(function2, obj, to1);
            } else {
                F62.e(2, function2);
                objInvoke = function2.invoke(obj, to1);
            }
            CY1.a(coroutineContext, objC);
            if (objInvoke == MN.d) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            CY1.a(coroutineContext, objC);
            throw th;
        }
    }

    @Override // defpackage.J71
    public Object e() {
        return new LinkedHashMap();
    }
}
