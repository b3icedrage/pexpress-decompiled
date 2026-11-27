package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afErrorLog = 1;
    private static char force = 61826;
    private static int i = -234967815;
    private static long v = -6857616994649640574L;
    private static int w;
    private final AFj1mSDK AFKeystoreWrapper;
    private final AFd1xSDK AFLogger;
    private final AFj1cSDK d;
    private final AFf1fSDK e;
    private final AFc1iSDK registerClient;
    private final AFd1jSDK unregisterClient;

    public AFd1sSDK(AFd1xSDK aFd1xSDK, AFc1iSDK aFc1iSDK, AFd1jSDK aFd1jSDK, AFj1mSDK aFj1mSDK, AFj1cSDK aFj1cSDK, AFf1fSDK aFf1fSDK) {
        this.AFLogger = aFd1xSDK;
        this.registerClient = aFc1iSDK;
        this.unregisterClient = aFd1jSDK;
        this.AFKeystoreWrapper = aFj1mSDK;
        this.d = aFj1cSDK;
        this.e = aFf1fSDK;
    }

    private static void a(String str, char c, int i2, String str2, String str3, Object[] objArr) {
        char[] charArray;
        int i3 = $10 + 69;
        $11 = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            charArray = str3.toCharArray();
            $11 = ($10 + 69) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = charArray2.length;
        char[] cArr3 = new char[length2];
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(charArray2, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr4 = new char[length3];
        aFk1pSDK.AFKeystoreWrapper = 0;
        $11 = ($10 + 103) % UserVerificationMethods.USER_VERIFY_PATTERN;
        while (true) {
            int i4 = aFk1pSDK.AFKeystoreWrapper;
            if (i4 >= length3) {
                objArr[0] = new String(cArr4);
                return;
            }
            $10 = ($11 + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i5 = (i4 + 3) % 4;
            int i6 = cArr2[i4 % 4] * 32718;
            char c2 = cArr3[(i4 + 2) % 4];
            char c3 = (char) ((i6 + c2) % 65535);
            aFk1pSDK.AFLogger = c3;
            cArr3[i5] = (char) (((cArr2[i5] * 32718) + c2) / 65535);
            cArr2[i5] = c3;
            cArr4[i4] = (char) (((((long) (cArr[i4] ^ c3)) ^ (v ^ (-6857616994649640574L))) ^ ((long) ((int) (((long) i) ^ (-6857616994649640574L))))) ^ ((long) ((char) (((long) force) ^ (-6857616994649640574L)))));
            aFk1pSDK.AFKeystoreWrapper = i4 + 1;
        }
    }

    public static /* synthetic */ Object d(Object[] objArr, int i2, int i3, int i4) {
        int i5 = (((~(i2 | i4)) | (~i3)) * 529) + (((~((~i4) | i2)) | (~(i2 | i3))) * 529) + (i3 * 530) + (i2 * 530) + 1058;
        if (i5 != 1) {
            return i5 != 2 ? registerClient(objArr) : unregisterClient(objArr);
        }
        return AFKeystoreWrapper(objArr);
    }

    public final AFd1pSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str) {
        byte[] bArr;
        int i2 = afErrorLog + 65;
        w = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i2 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1bSDK.getInstance;
                    Object method = map2.get(1360275338);
                    if (method == null) {
                        method = ((Class) AFa1bSDK.AFLogger((char) KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionType(0L) + 198, 35 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("unregisterClient", Map.class, String.class);
                        map2.put(1360275338, method);
                    }
                    bArr = (byte[]) ((Method) method).invoke(null, objArr);
                    int i3 = 76 / 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                try {
                    Object[] objArr2 = {map, str};
                    Map map3 = AFa1bSDK.getInstance;
                    Object method2 = map3.get(1360275338);
                    if (method2 == null) {
                        method2 = ((Class) AFa1bSDK.AFLogger((char) ((-1) - TextUtils.lastIndexOf("", '0')), 197 - Process.getGidForName(""), 35 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("unregisterClient", Map.class, String.class);
                        map3.put(1360275338, method2);
                    }
                    bArr = (byte[]) ((Method) method2).invoke(null, objArr2);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            byte[] bArr2 = bArr;
            AFj1mSDK aFj1mSDK = this.AFKeystoreWrapper;
            AFd1pSDK<String> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(aFj1mSDK.d(aFj1mSDK.unregisterClient(AFj1mSDK.i()), false), bArr2, "POST", Collections.EMPTY_MAP, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
            afErrorLog = (w + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return aFd1pSDK;
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
    }

    public final AFd1pSDK<String> AFLogger(Map<String, Object> map, String str) {
        int i2 = afErrorLog + 77;
        w = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i2 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1bSDK.getInstance;
                    Object method = map2.get(1360275338);
                    if (method == null) {
                        method = ((Class) AFa1bSDK.AFLogger((char) Color.green(0), 199 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 35)).getMethod("unregisterClient", Map.class, String.class);
                        map2.put(1360275338, method);
                    }
                    return (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(this.AFKeystoreWrapper.unregisterClient(AFj1mSDK.force()), (byte[]) ((Method) method).invoke(null, objArr), "POST", Collections.EMPTY_MAP, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFa1bSDK.getInstance;
                Object method2 = map3.get(1360275338);
                if (method2 == null) {
                    method2 = ((Class) AFa1bSDK.AFLogger((char) View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 198, 35 - Drawable.resolveOpacity(0, 0))).getMethod("unregisterClient", Map.class, String.class);
                    map3.put(1360275338, method2);
                }
                throw null;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
        return null;
    }

    public final AFd1pSDK<String> registerClient(Map<String, Object> map, String str) {
        w = (afErrorLog + 73) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1bSDK.getInstance;
            Object method = map2.get(1360275338);
            if (method == null) {
                method = ((Class) AFa1bSDK.AFLogger((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 198, 35 - Color.blue(0))).getMethod("unregisterClient", Map.class, String.class);
                map2.put(1360275338, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            w = (afErrorLog + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(this.AFKeystoreWrapper.unregisterClient(AFj1mSDK.e()), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    public final AFd1pSDK<String> unregisterClient(Map<String, Object> map, String str) {
        afErrorLog = (w + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1bSDK.getInstance;
            Object method = map2.get(1360275338);
            if (method == null) {
                method = ((Class) AFa1bSDK.AFLogger((char) Color.green(0), KeyEvent.keyCodeFromString("") + 198, 34 - TextUtils.lastIndexOf("", '0'))).getMethod("unregisterClient", Map.class, String.class);
                map2.put(1360275338, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            afErrorLog = (w + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
            AFj1mSDK aFj1mSDK = this.AFKeystoreWrapper;
            return (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(aFj1mSDK.d(aFj1mSDK.unregisterClient(AFj1mSDK.v()), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(LogTag.ENGAGEMENT, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    public final AFd1pSDK<Map<String, String>> d(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        Map<String, Object> mapRegisterClient = registerClient();
        String strValueOf = String.valueOf(mapRegisterClient.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(mapRegisterClient.get("counter")));
        map.put("Af-Meta-Model", String.valueOf(mapRegisterClient.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(mapRegisterClient.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(mapRegisterClient.get("sdk")));
        Object[] objArr = new Object[1];
        a("羅˓鷐ᜃ", (char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.red(0), "\u0000\u0000\u0000\u0000", "\u0a53ꊲꗖ잢͓䎯샌齶肋瑴⩂⒃", objArr);
        map.put(((String) objArr[0]).intern(), AFKeystoreWrapper(str3, string, "GET", string, str, str2, strValueOf));
        AFd1pSDK<Map<String, String>> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(AFj1mSDK.AFKeystoreWrapper(str, str2), null, "GET", map, false), new AFd1hSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
        int i2 = afErrorLog + 57;
        w = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 == 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AFd1sSDK aFd1sSDK = (AFd1sSDK) objArr[0];
        AFd1oSDK aFd1oSDK = (AFd1oSDK) objArr[1];
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[2];
        w = (afErrorLog + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFd1pSDK aFd1pSDKD = aFd1sSDK.d(aFd1oSDK, aFd1iSDK, aFd1sSDK.AFLogger());
        int i2 = afErrorLog + 49;
        w = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
        return aFd1pSDKD;
    }

    private static /* synthetic */ Object unregisterClient(Object[] objArr) {
        String str;
        String str2;
        String str3;
        AFd1sSDK aFd1sSDK = (AFd1sSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        String str4 = (String) objArr[3];
        ((Number) objArr[4]).intValue();
        AFd1jSDK aFd1jSDK = aFd1sSDK.unregisterClient;
        Intrinsics.checkNotNullParameter(str4, "");
        if (zBooleanValue) {
            int i2 = afErrorLog + 113;
            w = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i2 % 2 == 0) {
                str = AFd1jSDK.unregisterClient;
            } else {
                AFd1jSDK.Companion aFa1tSDK = AFd1jSDK.INSTANCE;
                throw null;
            }
        } else {
            str = AFd1jSDK.AFLogger;
        }
        if (!(!zBooleanValue2)) {
            int i3 = w + 13;
            afErrorLog = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i3 % 2 == 0) {
                throw null;
            }
            str2 = "stg";
        } else {
            afErrorLog = (w + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
            str2 = "";
        }
        Locale locale = Locale.US;
        if (AFd1jSDK.AFKeystoreWrapper()) {
            w = (afErrorLog + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
            str3 = (String) aFd1jSDK.w.getValue();
        } else {
            str3 = "";
        }
        String str5 = String.format(locale, str, Arrays.copyOf(new Object[]{str3, str2, aFd1jSDK.d(), str4}, 4));
        Intrinsics.checkNotNullExpressionValue(str5, "");
        AFd1oSDK aFd1oSDK = new AFd1oSDK(str5, "GET");
        aFd1oSDK.v = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        return (AFd1pSDK) d(new Object[]{aFd1sSDK, aFd1oSDK, new AFd1lSDK()}, -1128782579, 1128782579, System.identityHashCode(aFd1sSDK));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0085 A[PHI: r0
      0x0085: PHI (r0v12 com.appsflyer.internal.AFj1mSDK) = (r0v11 com.appsflyer.internal.AFj1mSDK), (r0v17 com.appsflyer.internal.AFj1mSDK) binds: [B:15:0x0083, B:12:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    public final AFd1pSDK<String> AFLogger(AFh1pSDK aFh1pSDK, String str, AFd1zSDK aFd1zSDK) {
        AFj1mSDK aFj1mSDK;
        boolean z;
        boolean z2;
        boolean z3;
        String strD;
        int i2;
        w = (afErrorLog + 107) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            try {
                Object[] objArr = {aFh1pSDK, str, aFd1zSDK};
                boolean z4 = true;
                Map map = AFa1bSDK.getInstance;
                Object method = map.get(1865617178);
                if (method == null) {
                    method = ((Class) AFa1bSDK.AFLogger((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.getSize(0) + 198, ((byte) KeyEvent.getModifierMetaStateMask()) + 36)).getMethod("registerClient", AFh1pSDK.class, String.class, AFd1zSDK.class);
                    map.put(1865617178, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                AFLogger(aFh1pSDK, bArr);
                int i3 = w + 95;
                afErrorLog = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i3 % 2 == 0) {
                    aFj1mSDK = this.AFKeystoreWrapper;
                    Intrinsics.checkNotNullParameter(aFh1pSDK, "");
                    int i4 = 81 / 0;
                    if (aFh1pSDK.v == null) {
                        if (aFh1pSDK.w != null) {
                        }
                    }
                    z = aFh1pSDK instanceof AFh1lSDK;
                    z2 = aFh1pSDK instanceof AFh1kSDK;
                    z3 = aFh1pSDK instanceof AFg1uSDK;
                    if (aFh1pSDK instanceof AFh1hSDK) {
                        afErrorLog = (w + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        strD = AFj1mSDK.afInfoLog();
                    } else if (z2) {
                        strD = AFj1mSDK.registerClient();
                    } else if (z) {
                        strD = AFj1mSDK.AFLogger();
                        afErrorLog = (w + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    } else if (z3) {
                        strD = AFj1mSDK.w();
                    } else if (z4) {
                        if (aFh1pSDK.afWarnLog < 2) {
                            strD = AFj1mSDK.unregisterClient();
                        } else {
                            strD = AFj1mSDK.AFKeystoreWrapper();
                        }
                    } else {
                        strD = AFj1mSDK.d();
                    }
                    AFd1pSDK<String> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(aFj1mSDK.d(AFj1mSDK.AFKeystoreWrapper(aFj1mSDK.unregisterClient(strD), z), z3), bArr, "POST", aFh1pSDK.registerClient, aFh1pSDK.unregisterClient), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
                    i2 = w + 13;
                    afErrorLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i2 % 2 == 0) {
                        int i5 = 65 / 0;
                    }
                    return aFd1pSDK;
                }
                aFj1mSDK = this.AFKeystoreWrapper;
                Intrinsics.checkNotNullParameter(aFh1pSDK, "");
                if (aFh1pSDK.v == null) {
                    if (aFh1pSDK.w != null) {
                    }
                }
                z = aFh1pSDK instanceof AFh1lSDK;
                z2 = aFh1pSDK instanceof AFh1kSDK;
                z3 = aFh1pSDK instanceof AFg1uSDK;
                if (aFh1pSDK instanceof AFh1hSDK) {
                    afErrorLog = (w + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    strD = AFj1mSDK.afInfoLog();
                } else if (z2) {
                    strD = AFj1mSDK.registerClient();
                } else if (z) {
                    strD = AFj1mSDK.AFLogger();
                    afErrorLog = (w + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
                } else if (z3) {
                    strD = AFj1mSDK.w();
                } else if (z4) {
                    if (aFh1pSDK.afWarnLog < 2) {
                        strD = AFj1mSDK.unregisterClient();
                    } else {
                        strD = AFj1mSDK.AFKeystoreWrapper();
                    }
                } else {
                    strD = AFj1mSDK.d();
                }
                AFd1pSDK<String> aFd1pSDK2 = (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(aFj1mSDK.d(AFj1mSDK.AFKeystoreWrapper(aFj1mSDK.unregisterClient(strD), z), z3), bArr, "POST", aFh1pSDK.registerClient, aFh1pSDK.unregisterClient), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
                i2 = w + 13;
                afErrorLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i2 % 2 == 0) {
                    int i6 = 65 / 0;
                }
                return aFd1pSDK2;
                z4 = false;
                z = aFh1pSDK instanceof AFh1lSDK;
                z2 = aFh1pSDK instanceof AFh1kSDK;
                z3 = aFh1pSDK instanceof AFg1uSDK;
                if (aFh1pSDK instanceof AFh1hSDK) {
                    afErrorLog = (w + 117) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    strD = AFj1mSDK.afInfoLog();
                } else if (z2) {
                    strD = AFj1mSDK.registerClient();
                } else if (z) {
                    strD = AFj1mSDK.AFLogger();
                    afErrorLog = (w + 113) % UserVerificationMethods.USER_VERIFY_PATTERN;
                } else if (z3) {
                    strD = AFj1mSDK.w();
                } else if (z4) {
                    if (aFh1pSDK.afWarnLog < 2) {
                        strD = AFj1mSDK.unregisterClient();
                    } else {
                        strD = AFj1mSDK.AFKeystoreWrapper();
                    }
                } else {
                    strD = AFj1mSDK.d();
                }
                AFd1pSDK<String> aFd1pSDK3 = (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(aFj1mSDK.d(AFj1mSDK.AFKeystoreWrapper(aFj1mSDK.unregisterClient(strD), z), z3), bArr, "POST", aFh1pSDK.registerClient, aFh1pSDK.unregisterClient), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
                i2 = w + 13;
                afErrorLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i2 % 2 == 0) {
                    int i7 = 65 / 0;
                }
                return aFd1pSDK3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    public final AFd1pSDK<Map<String, Object>> AFKeystoreWrapper(String str, String str2) {
        w = (afErrorLog + 7) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFd1pSDK<Map<String, Object>> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, AFd1qSDK.unregisterClient(this.AFKeystoreWrapper.AFKeystoreWrapper(str), this.registerClient.d.d.getPackageName(), AFb1jSDK.AFLogger(this.registerClient.AFKeystoreWrapper), str, str2), AFd1rSDK.INSTANCE}, -1128782579, 1128782579, System.identityHashCode(this));
        int i2 = afErrorLog + 57;
        w = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 == 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    private Map<String, Object> registerClient() {
        HashMap map = new HashMap();
        map.put("build_number", "7.0.1");
        map.put("counter", Integer.valueOf(this.registerClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a("偫蛄昿쿮", (char) (61030 - KeyEvent.keyCodeFromString("")), Color.argb(0, 0, 0, 0) + 1065796688, "\u0000\u0000\u0000\u0000", "\ud9b1׆䒺솧\udbec", objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        map.put("app_version_name", this.registerClient.r_().versionName);
        map.put("app_id", this.registerClient.d.d.getPackageName());
        map.put("platformextension", this.d.unregisterClient());
        int i2 = w + 17;
        afErrorLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final AFd1pSDK<String> d(@NonNull String str) {
        AFd1oSDK aFd1oSDK = new AFd1oSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFd1oSDK.v = 10000;
        aFd1oSDK.w = false;
        AFd1pSDK<String> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, aFd1oSDK, new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
        w = (afErrorLog + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFd1pSDK;
    }

    private static String AFKeystoreWrapper(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String strD = AFj1nSDK.d(strJoin, sb.toString());
        int i2 = w + 109;
        afErrorLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return strD;
    }

    public final AFd1vSDK d(Map<String, Object> map, String str) {
        afErrorLog = (w + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1bSDK.getInstance;
                Object method = map2.get(1360275338);
                if (method == null) {
                    method = ((Class) AFa1bSDK.AFLogger((char) View.MeasureSpec.getSize(0), KeyEvent.getDeadChar(0, 0) + 198, 35 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("unregisterClient", Map.class, String.class);
                    map2.put(1360275338, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                if (bArr != null) {
                    return new AFd1vSDK(this.registerClient, bArr);
                }
                AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                w = (afErrorLog + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFd1sSDK aFd1sSDK = (AFd1sSDK) objArr[0];
        AFa1oSDK aFa1oSDK = (AFa1oSDK) objArr[1];
        AFd1pSDK aFd1pSDK = (AFd1pSDK) d(new Object[]{aFd1sSDK, new AFd1oSDK(aFa1oSDK.i, AFg1dSDK.d(aFa1oSDK.d).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFa1oSDK.unregisterClient), new AFa1jSDK()}, -1128782579, 1128782579, System.identityHashCode(aFd1sSDK));
        int i2 = afErrorLog + 11;
        w = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 == 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    private <T> AFd1pSDK<T> d(AFd1oSDK aFd1oSDK, AFd1iSDK<T> aFd1iSDK, boolean z) {
        aFd1oSDK.force = z;
        AFd1xSDK aFd1xSDK = this.AFLogger;
        AFd1pSDK<T> aFd1pSDK = new AFd1pSDK<>(aFd1oSDK, aFd1xSDK.d, aFd1xSDK.AFLogger, aFd1iSDK);
        afErrorLog = (w + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return aFd1pSDK;
    }

    public final AFd1pSDK<String> unregisterClient(@NonNull String str, @NonNull Map<String, String> map, String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", "-1");
        map2.put("uuid", string);
        map2.put("data", map);
        map2.put("meta", registerClient());
        if (str2 != null) {
            w = (afErrorLog + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
            map2.put("brand_domain", str2);
            w = (afErrorLog + 87) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        String string2 = AFg1dSDK.d(map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a("羅˓鷐ᜃ", (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), ViewConfiguration.getKeyRepeatTimeout() >> 16, "\u0000\u0000\u0000\u0000", "\u0a53ꊲꗖ잢͓䎯샌齶肋瑴⩂⒃", objArr);
        map3.put(((String) objArr[0]).intern(), AFKeystoreWrapper(str3, string, "POST", string2));
        AFj1mSDK aFj1mSDK = this.AFKeystoreWrapper;
        Intrinsics.checkNotNullParameter(str, "");
        return d(new AFd1oSDK(AFj1mSDK.AFKeystoreWrapper(str, (String) null), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), new AFd1kSDK(), true);
    }

    @NonNull
    public final AFd1pSDK<AFa1gSDK> registerClient(AFa1oSDK aFa1oSDK) {
        return (AFd1pSDK) d(new Object[]{this, aFa1oSDK}, 232910799, -232910798, System.identityHashCode(this));
    }

    @NonNull
    public final AFd1pSDK<AFh1aSDK> registerClient(boolean z, boolean z2, @NonNull String str, int i2) {
        return (AFd1pSDK) d(new Object[]{this, Boolean.valueOf(z), Boolean.valueOf(z2), str, Integer.valueOf(i2)}, 1895390539, -1895390537, i2);
    }

    public final AFd1pSDK<String> unregisterClient(AFh1nSDK aFh1nSDK) {
        AFd1pSDK<String> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(aFh1nSDK.i, aFh1nSDK.force, "POST", aFh1nSDK.registerClient, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
        int i2 = afErrorLog + 111;
        w = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return aFd1pSDK;
    }

    private boolean AFLogger() {
        boolean z;
        String strAFLogger = this.registerClient.AFLogger("AF_ENABLE_HTTP_CACHE");
        if (strAFLogger != null) {
            afErrorLog = (w + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
            z = Boolean.parseBoolean(strAFLogger);
        } else {
            z = true;
        }
        if ((!z ? (char) 28 : '\f') != '\f') {
            int i2 = afErrorLog + 15;
            w = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i2 % 2 != 0 ? 'N' : '\n') != 'N') {
                return true;
            }
        }
        return false;
    }

    private void AFLogger(AFh1pSDK aFh1pSDK, byte[] bArr) {
        boolean z;
        int i2 = w + 95;
        afErrorLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 != 0) {
            String strAFLogger = this.registerClient.AFLogger("com.appsflyer.security.enable");
            if (strAFLogger != null) {
                z = Boolean.parseBoolean(strAFLogger);
                w = (afErrorLog + 85) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } else {
                z = false;
            }
            if (aFh1pSDK.d() && z) {
                int i3 = w + 109;
                afErrorLog = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i3 % 2 != 0) {
                    if (AFf1fSDK.d(aFh1pSDK, this.registerClient)) {
                        AFf1fSDK.registerClient(aFh1pSDK, bArr);
                        AFLogger.INSTANCE.d(LogTag.SECURITY_SDK, "the module works properly");
                        return;
                    }
                    return;
                }
                AFf1fSDK.d(aFh1pSDK, this.registerClient);
                throw null;
            }
            return;
        }
        this.registerClient.AFLogger("com.appsflyer.security.enable");
        throw null;
    }

    private <T> AFd1pSDK<T> AFLogger(AFd1oSDK aFd1oSDK, AFd1iSDK<T> aFd1iSDK) {
        return (AFd1pSDK) d(new Object[]{this, aFd1oSDK, aFd1iSDK}, -1128782579, 1128782579, System.identityHashCode(this));
    }
}
