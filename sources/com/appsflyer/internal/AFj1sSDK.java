package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.C1039Gc0;
import defpackage.C1526Mj;
import defpackage.C1717Ot1;
import defpackage.C1795Pt1;
import defpackage.C2017Sp1;
import defpackage.C2251Vp1;
import defpackage.C5488nK;
import defpackage.RI0;
import java.util.ConcurrentModificationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1sSDK {

    @NotNull
    private final Intent AFKeystoreWrapper;

    public AFj1sSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.AFKeystoreWrapper = intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AFKeystoreWrapper(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.getStringExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Parcelable U_(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.getParcelableExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent V_(AFj1sSDK aFj1sSDK, String str, long j) {
        return aFj1sSDK.AFKeystoreWrapper.putExtra(str, j);
    }

    public final boolean AFLogger(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) AFLogger(new C5488nK(2, this, str), C1039Gc0.d("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Nullable
    public final <T extends Parcelable> T S_(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) AFLogger(new Function0() { // from class: com.appsflyer.internal.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFj1sSDK.U_(this.d, str);
            }
        }, C1039Gc0.d("Error while trying to read ", str, " extra from intent"), null, true);
    }

    @Nullable
    public final Intent T_(@NotNull final String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) AFLogger(new Function0() { // from class: com.appsflyer.internal.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFj1sSDK.V_(this.d, str, j);
            }
        }, C1039Gc0.d("Error while trying to write ", str, " extra to intent"), null, true);
    }

    @Nullable
    public final String registerClient(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) AFLogger(new Function0() { // from class: com.appsflyer.internal.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFj1sSDK.AFKeystoreWrapper(this.d, str);
            }
        }, C1039Gc0.d("Error while trying to read ", str, " extra from intent"), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerClient(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.hasExtra(str);
    }

    private final <T> T AFLogger(Function0<? extends T> function0, String str, T t, boolean z) {
        Object objInvoke;
        Object obj;
        Object objA;
        Object obj2;
        Object obj3;
        synchronized (this.AFKeystoreWrapper) {
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                objInvoke = function0.invoke();
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                objInvoke = (T) C1795Pt1.a(th);
            }
            C2251Vp1 c2251Vp1 = C2017Sp1.a;
            RI0[] ri0Arr = {c2251Vp1.b(ConcurrentModificationException.class), c2251Vp1.b(ArrayIndexOutOfBoundsException.class)};
            Throwable thA = C1717Ot1.a(objInvoke);
            if (thA == null) {
                obj2 = t;
                objA = objInvoke;
            } else {
                try {
                    try {
                        if (!C1526Mj.m(ri0Arr, c2251Vp1.b(thA.getClass()))) {
                            throw thA;
                        }
                        if (z) {
                            T t2 = t;
                            objA = AFLogger(function0, str, t2, false);
                            obj2 = t2;
                        } else {
                            T t3 = t;
                            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, str, thA, false, false, false, false, 72, null);
                            objA = t3;
                            obj2 = t3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = c2251Vp1;
                        C1717Ot1.a aVar3 = C1717Ot1.e;
                        objA = C1795Pt1.a(th);
                        obj2 = obj;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = t;
                }
            }
            Throwable thA2 = C1717Ot1.a(objA);
            if (thA2 == null) {
                obj3 = objA;
            } else {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, str, thA2, false, false, false, false, 72, null);
                obj3 = (T) obj2;
            }
        }
        return (T) obj3;
    }
}
