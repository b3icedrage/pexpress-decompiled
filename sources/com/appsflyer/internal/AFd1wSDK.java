package com.appsflyer.internal;

import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1wSDK implements AFd1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] AFLoggerLogLevel = null;
    private static int afInfoLog = 1;
    private static int afWarnLog;
    private static final int d;
    private int AFKeystoreWrapper;
    private final AFc1bSDK e;
    private boolean i;
    private boolean v;
    private AppsFlyerProperties w;
    private List<String> AFLogger = new ArrayList();
    private boolean unregisterClient = true;

    @NonNull
    private final Map<String, Object> registerClient = new HashMap();
    private SecureRandom force = new SecureRandom();

    static {
        force();
        d = 98166;
        int i = afWarnLog + 43;
        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public AFd1wSDK(AFc1bSDK aFc1bSDK) {
        this.w = aFc1bSDK.registerClient();
        String strAFLogger = aFc1bSDK.AFLogger().AFLogger("AF_DISABLE_REMOTE_DEBUGGER");
        this.v = true ^ (strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : false);
        this.AFKeystoreWrapper = 0;
        this.i = false;
        this.e = aFc1bSDK;
    }

    @NonNull
    private synchronized Map<String, Object> AFLoggerLogLevel() {
        Map<String, Object> map;
        int i = afWarnLog + 101;
        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            this.registerClient.put("data", this.AFLogger);
            afDebugLog();
            throw null;
        }
        this.registerClient.put("data", this.AFLogger);
        afDebugLog();
        map = this.registerClient;
        afInfoLog = (afWarnLog + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return map;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AFLoggerLogLevel;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            loop0: while (true) {
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break loop0;
                    }
                    int i3 = $11 + 115;
                    $10 = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i3 % 2 != 0) {
                        iArr3[i2] = (int) (((long) iArr2[i2]) * 8546810173735754695L);
                    } else {
                        iArr3[i2] = (int) (((long) iArr2[i2]) ^ 8546810173735754695L);
                        i2++;
                    }
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AFLoggerLogLevel;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i4 = 0;
            while (i4 < length3) {
                iArr6[i4] = (int) (((long) iArr5[i4]) ^ 8546810173735754695L);
                i4++;
                $11 = ($10 + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1oSDK.AFKeystoreWrapper = 0;
        while (true) {
            int i5 = aFk1oSDK.AFKeystoreWrapper;
            if (i5 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            $10 = ($11 + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i6 = iArr[i5];
            char c = (char) (i6 >> 16);
            cArr[0] = c;
            char c2 = (char) i6;
            cArr[1] = c2;
            char c3 = (char) (iArr[i5 + 1] >> 16);
            cArr[2] = c3;
            char c4 = (char) iArr[i5 + 1];
            cArr[3] = c4;
            aFk1oSDK.AFLogger = (c << 16) + c2;
            aFk1oSDK.d = (c3 << 16) + c4;
            AFk1oSDK.unregisterClient(iArr4);
            for (int i7 = 0; i7 < 16; i7++) {
                $11 = ($10 + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int i8 = aFk1oSDK.AFLogger ^ iArr4[i7];
                aFk1oSDK.AFLogger = i8;
                int iD = AFk1oSDK.d(i8) ^ aFk1oSDK.d;
                int i9 = aFk1oSDK.AFLogger;
                aFk1oSDK.AFLogger = iD;
                aFk1oSDK.d = i9;
            }
            int i10 = aFk1oSDK.AFLogger;
            int i11 = aFk1oSDK.d;
            aFk1oSDK.AFLogger = i11;
            aFk1oSDK.d = i10;
            int i12 = i10 ^ iArr4[16];
            aFk1oSDK.d = i12;
            int i13 = i11 ^ iArr4[17];
            aFk1oSDK.AFLogger = i13;
            cArr[0] = (char) (i13 >>> 16);
            cArr[1] = (char) i13;
            cArr[2] = (char) (i12 >>> 16);
            cArr[3] = (char) i12;
            AFk1oSDK.unregisterClient(iArr4);
            int i14 = aFk1oSDK.AFKeystoreWrapper;
            cArr2[i14 * 2] = cArr[0];
            cArr2[(i14 * 2) + 1] = cArr[1];
            cArr2[(i14 * 2) + 2] = cArr[2];
            cArr2[(i14 * 2) + 3] = cArr[3];
            aFk1oSDK.AFKeystoreWrapper = i14 + 2;
        }
    }

    private synchronized void afDebugLog() {
        this.AFLogger = new ArrayList();
        this.AFKeystoreWrapper = 0;
        int i = afWarnLog + 19;
        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private boolean afErrorLog() {
        if (!this.v || (!this.unregisterClient && !this.i)) {
            afWarnLog = (afInfoLog + 95) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return false;
        }
        int i = afWarnLog + 15;
        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            int i2 = 43 / 0;
        }
        return true;
    }

    private boolean afInfoLog() {
        afInfoLog = (afWarnLog + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
        boolean zAFKeystoreWrapper = this.e.AFKeystoreWrapper().AFKeystoreWrapper("participantInProxy");
        int i = afInfoLog + 125;
        afWarnLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            int i2 = 49 / 0;
        }
        return zAFKeystoreWrapper;
    }

    private void afWarnLog() {
        registerClient(new Object[]{this}, -811614036, 811614038, System.identityHashCode(this));
    }

    private synchronized void e() {
        afWarnLog = (afInfoLog + 11) % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (this.i) {
            return;
        }
        this.i = true;
        try {
            AFLogger("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            afInfoLog = (afWarnLog + 13) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.PROXY, "Error while starting remote debugger", th, true, true, true);
        }
    }

    public static void force() {
        AFLoggerLogLevel = new int[]{-568377693, 1688322947, 854413037, -687779850, -1810683974, 1583969886, -2000849430, -146928909, 707207527, -2090776958, -563356009, 1806852058, -1348460850, 177728571, -1217440324, -910513204, -1775435922, 1154080255};
    }

    public static /* synthetic */ Object registerClient(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (((~(i | i2)) | (~(i3 | i4))) * 49) + (((~((~i) | i5)) | i4 | (~(i | i3))) * (-49)) + (((~(i4 | i5)) | (~(i4 | i))) * 98) + (i2 * (-97)) + (i * 50);
        int i7 = 1;
        if (i6 == 1) {
            return d(objArr);
        }
        if (i6 == 2) {
            AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
            afWarnLog = (afInfoLog + 39) % UserVerificationMethods.USER_VERIFY_PATTERN;
            aFd1wSDK.e.AFKeystoreWrapper().AFLogger("participantInProxy");
            afWarnLog = (afInfoLog + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return null;
        }
        if (i6 != 3) {
            AFd1wSDK aFd1wSDK2 = (AFd1wSDK) objArr[0];
            float fFloatValue = ((Number) objArr[1]).floatValue();
            afWarnLog = (afInfoLog + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
            double d2 = fFloatValue;
            if (d2 >= 1.0d) {
                return Boolean.TRUE;
            }
            if (d2 <= 0.0d) {
                return Boolean.FALSE;
            }
            if (aFd1wSDK2.w() > fFloatValue) {
                return Boolean.FALSE;
            }
            afInfoLog = (afWarnLog + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return Boolean.TRUE;
        }
        String str = (String) objArr[0];
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objArr[1];
        int i8 = (afInfoLog + 123) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afWarnLog = i8;
        if (stackTraceElementArr == null) {
            int i9 = i8 + 57;
            afInfoLog = i9 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i9 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[1] = str;
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        while (i7 < stackTraceElementArr.length) {
            int i10 = afWarnLog + 73;
            afInfoLog = i10 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i10 % 2 == 0) {
                strArr2[i7] = stackTraceElementArr[i7].toString();
                i7 += 50;
            } else {
                strArr2[i7] = stackTraceElementArr[i7].toString();
                i7++;
            }
        }
        return strArr2;
    }

    private static String v() {
        int i = (afWarnLog + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afInfoLog = i;
        int i2 = i + 13;
        afWarnLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 == 0) {
            return "7.0.1";
        }
        throw null;
    }

    private float w() {
        float fNextFloat;
        int i = afWarnLog + 91;
        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            fNextFloat = this.force.nextFloat();
            int i2 = 72 / 0;
        } else {
            fNextFloat = this.force.nextFloat();
        }
        int i3 = afWarnLog + 33;
        afInfoLog = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i3 % 2 != 0) {
            return fNextFloat;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper(String str, String str2) {
        afWarnLog = (afInfoLog + 115) % UserVerificationMethods.USER_VERIFY_PATTERN;
        AFLogger("server_request", str, str2);
        int i = afInfoLog + 51;
        afWarnLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFLogger() {
        afInfoLog = (afWarnLog + 23) % UserVerificationMethods.USER_VERIFY_PATTERN;
        boolean zD = d(AFKeystoreWrapper(this.e.i().unregisterClient.AFLogger), AFKeystoreWrapper(this.e.i().unregisterClient.d));
        if (!zD) {
            registerClient();
            d();
            afWarnLog = (afInfoLog + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return zD;
        }
        int i = afInfoLog + 49;
        afWarnLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            e();
            return zD;
        }
        e();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #2 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0018, B:18:0x0028, B:25:0x0037, B:13:0x0021, B:16:0x0024, B:26:0x0038, B:28:0x0058, B:33:0x0064, B:9:0x001c, B:27:0x003c, B:23:0x0035), top: B:42:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0032 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0032, please report this as an issue */
    @Override // com.appsflyer.internal.AFd1uSDK
    public final synchronized void d() {
        int i;
        try {
            int i2 = afWarnLog;
            afInfoLog = (i2 + 81) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (!this.i) {
                int i3 = i2 + 123;
                afInfoLog = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i3 % 2 != 0) {
                    if (!this.unregisterClient) {
                        i = i2 + 17;
                        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i % 2 != 0) {
                            return;
                        } else {
                            throw null;
                        }
                    }
                    throw th;
                }
                int i4 = 80 / 0;
                if (!this.unregisterClient) {
                    i = i2 + 17;
                    afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i % 2 != 0) {
                        return;
                    } else {
                        throw null;
                    }
                }
                throw th;
            }
            this.i = false;
            this.unregisterClient = false;
            try {
                AFLogger("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                afWarnLog = (afInfoLog + 31) % UserVerificationMethods.USER_VERIFY_PATTERN;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(LogTag.PROXY, "Error while stopping remote debugger", th, true, true, true);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean i() {
        int i = (afWarnLog + 61) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afInfoLog = i;
        boolean z = this.i;
        afWarnLog = (i + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return z;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final synchronized void unregisterClient() {
        try {
            int i = afInfoLog + 13;
            afWarnLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 != 0) {
                this.registerClient.clear();
                this.AFLogger.clear();
                this.AFKeystoreWrapper = 1;
            } else {
                this.registerClient.clear();
                this.AFLogger.clear();
                this.AFKeystoreWrapper = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007b, code lost:
    
        if (r7 == null) goto L11;
     */
    @Override // com.appsflyer.internal.AFd1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v_(java.lang.String r7, android.content.pm.PackageManager r8) {
        /*
            r6 = this;
            int r8 = com.appsflyer.internal.AFd1wSDK.afWarnLog
            int r8 = r8 + 73
            int r0 = r8 % 128
            com.appsflyer.internal.AFd1wSDK.afInfoLog = r0
            int r8 = r8 % 2
            r0 = 1660886871(0x62ff1f57, float:2.353089E21)
            r1 = -1660886869(0xffffffff9d00e0ab, float:-1.705681E-21)
            r2 = -1483898606(0xffffffffa78d8112, float:-3.92753E-15)
            r3 = 1483898607(0x58727eef, float:1.06650796E15)
            if (r8 != 0) goto L4f
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L4b
            int r8 = java.lang.System.identityHashCode(r6)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = registerClient(r7, r3, r2, r8)     // Catch: java.lang.Throwable -> L4b
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFc1bSDK r8 = r6.e     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFf1fSDK r8 = r8.AppsFlyerLib()     // Catch: java.lang.Throwable -> L4b
            java.lang.Object[] r2 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L4b
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r8 = com.appsflyer.internal.AFf1fSDK.unregisterClient(r2, r1, r0, r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFc1bSDK r0 = r6.e     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFd1sSDK r0 = r0.unregisterClient()     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFd1vSDK r7 = r0.d(r7, r8)     // Catch: java.lang.Throwable -> L4b
            r8 = 40
            int r8 = r8 / 0
            if (r7 != 0) goto L90
            goto L7d
        L4b:
            r0 = move-exception
            r7 = r0
            r3 = r7
            goto La8
        L4f:
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L4b
            int r8 = java.lang.System.identityHashCode(r6)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = registerClient(r7, r3, r2, r8)     // Catch: java.lang.Throwable -> L4b
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFc1bSDK r8 = r6.e     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFf1fSDK r8 = r8.AppsFlyerLib()     // Catch: java.lang.Throwable -> L4b
            java.lang.Object[] r2 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L4b
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r8 = com.appsflyer.internal.AFf1fSDK.unregisterClient(r2, r1, r0, r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFc1bSDK r0 = r6.e     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFd1sSDK r0 = r0.unregisterClient()     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFd1vSDK r7 = r0.d(r7, r8)     // Catch: java.lang.Throwable -> L4b
            if (r7 != 0) goto L90
        L7d:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.sdk_base.logger.LogTag r1 = com.appsflyer.sdk_base.logger.LogTag.PROXY     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "Could not send proxy data: request is null"
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r7 = "request was null"
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L4b
            r4 = 0
            r5 = 0
            r0.e(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4b
            return
        L90:
            com.appsflyer.internal.AFc1bSDK r8 = r6.e     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.ExecutorService r8 = r8.d()     // Catch: java.lang.Throwable -> L4b
            Ud0 r0 = new Ud0     // Catch: java.lang.Throwable -> L4b
            r1 = 4
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L4b
            r8.execute(r0)     // Catch: java.lang.Throwable -> L4b
            int r7 = com.appsflyer.internal.AFd1wSDK.afWarnLog
            int r7 = r7 + 17
            int r7 = r7 % 128
            com.appsflyer.internal.AFd1wSDK.afInfoLog = r7
            return
        La8:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.sdk_base.logger.LogTag r1 = com.appsflyer.sdk_base.logger.LogTag.PROXY
            r5 = 0
            java.lang.String r2 = "Could not send proxy data"
            r4 = 0
            r0.e(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.v_(java.lang.String, android.content.pm.PackageManager):void");
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper(String str, int i, String str2) {
        int i2 = afInfoLog + 123;
        afWarnLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 != 0) {
            String[] strArr = new String[5];
            strArr[0] = String.valueOf(i);
            strArr[0] = str2;
            AFLogger("server_response", str, strArr);
        } else {
            AFLogger("server_response", str, String.valueOf(i), str2);
        }
        int i3 = afInfoLog + 119;
        afWarnLog = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i3 % 2 != 0) {
            int i4 = 52 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper() {
        int i = (afInfoLog + 105) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afWarnLog = i;
        this.v = false;
        int i2 = i + 71;
        afInfoLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void unregisterClient(boolean z) {
        afInfoLog = (afWarnLog + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.e.AFKeystoreWrapper().registerClient("participantInProxy", z);
        int i = afWarnLog + 89;
        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            int i2 = 31 / 0;
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.registerClient;
            Object[] objArr = new Object[1];
            a(new int[]{579646829, 1366893693, -1057920183, -376234262}, 5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.registerClient.put("model", Build.MODEL);
            this.registerClient.put("platform", "Android");
            this.registerClient.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    afInfoLog = (afWarnLog + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (str.length() > 0) {
                        int i = afWarnLog + 119;
                        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i % 2 == 0) {
                            this.registerClient.put("advertiserId", str);
                            int i2 = 57 / 0;
                        } else {
                            this.registerClient.put("advertiserId", str);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (str2 != null && str2.length() > 0) {
                int i3 = afWarnLog + 37;
                afInfoLog = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i3 % 2 != 0) {
                    this.registerClient.put("imei", str2);
                } else {
                    this.registerClient.put("imei", str2);
                    throw null;
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.registerClient.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void d(String str, String... strArr) {
        int i = afWarnLog + 87;
        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            AFLogger("public_api_call", str, strArr);
            afInfoLog = (afWarnLog + 97) % UserVerificationMethods.USER_VERIFY_PATTERN;
        } else {
            AFLogger("public_api_call", str, strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFLogger(String str, String str2) {
        int i = afWarnLog + 115;
        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 == 0) {
            AFLogger(null, str, str2);
        } else {
            AFLogger(null, str, str2);
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        String str = (String) objArr[1];
        int i = afWarnLog + 5;
        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            aFd1wSDK.d(str, aFd1wSDK.e.setAndroidIdData());
            return aFd1wSDK.AFLoggerLogLevel();
        }
        aFd1wSDK.d(str, aFd1wSDK.e.setAndroidIdData());
        aFd1wSDK.AFLoggerLogLevel();
        throw null;
    }

    private synchronized void AFLogger(String str, String str2, String str3, String str4) {
        int i = afWarnLog + 117;
        afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            if (i % 2 != 0) {
                this.registerClient.put("sdk_version", str);
                if (str2 != null) {
                    int i2 = afWarnLog + 119;
                    afInfoLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i2 % 2 != 0) {
                        if (str2.length() > 0) {
                            this.registerClient.put("devkey", str2);
                        }
                    } else {
                        str2.length();
                        throw null;
                    }
                }
                if (str3 != null) {
                    int i3 = afInfoLog + 81;
                    afWarnLog = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i3 % 2 == 0) {
                        if (str3.length() > 0) {
                            this.registerClient.put("originalAppsFlyerId", str3);
                        }
                    } else {
                        str3.length();
                        throw null;
                    }
                }
                if (str4 != null) {
                    afWarnLog = (afInfoLog + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (str4.length() > 0) {
                        this.registerClient.put("uid", str4);
                    }
                }
            } else {
                this.registerClient.put("sdk_version", str);
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void registerClient(Throwable th) {
        String message;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            int i = afInfoLog + 121;
            afWarnLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 == 0) {
                message = th.getMessage();
            } else {
                th.getMessage();
                throw null;
            }
        } else {
            message = cause.getMessage();
        }
        AFLogger("exception", simpleName, (String[]) registerClient(new Object[]{message, cause == null ? th.getStackTrace() : cause.getStackTrace()}, -1008260537, 1008260540, (int) System.currentTimeMillis()));
        int i2 = afInfoLog + 17;
        afWarnLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0004, B:9:0x0016, B:11:0x0025, B:18:0x0036, B:28:0x0060, B:30:0x006a), top: B:43:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0050 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0004, B:9:0x0016, B:11:0x0025, B:18:0x0036, B:28:0x0060, B:30:0x006a), top: B:43:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007c A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    private synchronized void d(String str, String str2, String str3, String str4) {
        int i;
        int i2;
        try {
            if (str != null) {
                int i3 = afInfoLog + 9;
                afWarnLog = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i3 % 2 != 0) {
                    str.length();
                    throw null;
                }
                if (str.length() > 0) {
                    afInfoLog = (afWarnLog + 3) % UserVerificationMethods.USER_VERIFY_PATTERN;
                    this.registerClient.put("app_id", str);
                    afWarnLog = (afInfoLog + 27) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                if (str2 != null) {
                    i2 = afWarnLog + 55;
                    afInfoLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i2 % 2 != 0) {
                        if (str2.length() > 0) {
                            this.registerClient.put("app_version", str2);
                        }
                    } else {
                        throw null;
                    }
                }
                if (str3 != null && str3.length() > 0) {
                    this.registerClient.put("channel", str3);
                    afWarnLog = (afInfoLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                if (str4 != null) {
                    i = afWarnLog + 107;
                    afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i % 2 != 0) {
                        if (str4.length() > 0) {
                            this.registerClient.put("preInstall", str4);
                        }
                    } else {
                        throw null;
                    }
                }
            } else {
                if (str2 != null) {
                    i2 = afWarnLog + 55;
                    afInfoLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i2 % 2 != 0) {
                        if (str2.length() > 0) {
                            this.registerClient.put("app_version", str2);
                        }
                    } else {
                        throw null;
                    }
                }
                if (str3 != null) {
                    this.registerClient.put("channel", str3);
                    afWarnLog = (afInfoLog + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
                }
                if (str4 != null) {
                    i = afWarnLog + 107;
                    afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i % 2 != 0) {
                        if (str4.length() > 0) {
                            this.registerClient.put("preInstall", str4);
                        }
                    } else {
                        throw null;
                    }
                }
            }
            throw th;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    private boolean AFKeystoreWrapper(String str) {
        boolean z;
        int i = (afInfoLog + 5) % UserVerificationMethods.USER_VERIFY_PATTERN;
        afWarnLog = i;
        if (str != null) {
            afInfoLog = (i + 25) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (str.trim().length() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (!(!z)) {
            return true;
        }
        return str.equals(this.e.AFLogger().r_().versionName);
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final synchronized void registerClient() {
        afInfoLog = (afWarnLog + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
        this.unregisterClient = false;
        unregisterClient();
        afDebugLog();
        afWarnLog = (afInfoLog + 63) % UserVerificationMethods.USER_VERIFY_PATTERN;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    private static AFh1cSDK AFKeystoreWrapper(AFh1aSDK aFh1aSDK) {
        AFh1gSDK aFh1gSDK;
        AFh1cSDK aFh1cSDK;
        int i;
        int i2 = afWarnLog;
        int i3 = i2 + 93;
        int i4 = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
        afInfoLog = i4;
        if (i3 % 2 == 0) {
            int i5 = 20 / 0;
            if (aFh1aSDK != null) {
                aFh1gSDK = aFh1aSDK.registerClient;
                if (aFh1gSDK != null) {
                    aFh1cSDK = aFh1gSDK.unregisterClient;
                    i = i4 + 51;
                    afWarnLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i % 2 == 0) {
                        return aFh1cSDK;
                    }
                    throw null;
                }
            }
        } else if (aFh1aSDK != null) {
            aFh1gSDK = aFh1aSDK.registerClient;
            if (aFh1gSDK != null) {
                aFh1cSDK = aFh1gSDK.unregisterClient;
                i = i4 + 51;
                afWarnLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i % 2 == 0) {
                    return aFh1cSDK;
                }
                throw null;
            }
        }
        afInfoLog = (i2 + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return null;
    }

    private synchronized void AFLogger(String str, String str2, String... strArr) {
        String string;
        if (!(!afErrorLog())) {
            int i = afWarnLog + 79;
            afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 == 0) {
                throw null;
            }
            if (this.AFKeystoreWrapper < 98304) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strJoin = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(jCurrentTimeMillis);
                        sb.append(" ");
                        sb.append(Thread.currentThread().getId());
                        sb.append(" _/AppsFlyer_7.0.1 [");
                        sb.append(str);
                        sb.append("] ");
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(strJoin);
                        string = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jCurrentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" ");
                        sb2.append(str2);
                        sb2.append("/AppsFlyer_7.0.1 ");
                        sb2.append(strJoin);
                        string = sb2.toString();
                    }
                    int length = this.AFKeystoreWrapper + (string.length() << 1);
                    int i2 = d;
                    boolean z = false;
                    if (length > i2) {
                        string = string.substring(0, (i2 - this.AFKeystoreWrapper) / 2);
                        z = true;
                    }
                    this.AFLogger.add(string);
                    this.AFKeystoreWrapper += string.length() << 1;
                    if (z) {
                        afInfoLog = (afWarnLog + 49) % UserVerificationMethods.USER_VERIFY_PATTERN;
                        this.AFLogger.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.AFKeystoreWrapper += 138;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private Map<String, Object> registerClient(String str) {
        return (Map) registerClient(new Object[]{this, str}, 1483898607, -1483898606, System.identityHashCode(this));
    }

    private synchronized void d(String str, AFc1eSDK aFc1eSDK) {
        try {
            String string = this.w.getString("remote_debug_static_data");
            this.registerClient.clear();
            if (string != null) {
                try {
                    this.registerClient.putAll(AFg1dSDK.unregisterClient(new JSONObject(string)));
                    afInfoLog = (afWarnLog + 121) % UserVerificationMethods.USER_VERIFY_PATTERN;
                } catch (Throwable unused) {
                }
            } else {
                AFKeystoreWrapper(this.e.AFLogger().AFLogger(), aFc1eSDK.AFLoggerLogLevel, aFc1eSDK.force);
                StringBuilder sb = new StringBuilder("7.0.1.");
                sb.append(AFa1tSDK.unregisterClient);
                String string2 = sb.toString();
                AFf1fSDK aFf1fSDKAppsFlyerLib = this.e.AppsFlyerLib();
                AFLogger(string2, (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDKAppsFlyerLib}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDKAppsFlyerLib)), this.w.getString("KSAppsFlyerId"), AFb1jSDK.AFLogger(this.e.AFLogger().AFKeystoreWrapper));
                try {
                    int i = this.e.AFLogger().r_().versionCode;
                    String strAFLogger = this.e.AFLogger().AFLogger("CHANNEL");
                    if (strAFLogger != null) {
                        int i2 = afInfoLog + 15;
                        afWarnLog = i2 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i2 % 2 == 0) {
                            if (strAFLogger.equals("")) {
                                strAFLogger = null;
                            }
                        } else {
                            strAFLogger.equals("");
                            throw null;
                        }
                    }
                    d(str, String.valueOf(i), strAFLogger, this.w.getString("preInstallName"));
                    afWarnLog = (afInfoLog + 77) % UserVerificationMethods.USER_VERIFY_PATTERN;
                } catch (Throwable unused2) {
                }
                this.w.set("remote_debug_static_data", new JSONObject(this.registerClient).toString());
            }
            this.registerClient.put("launch_counter", String.valueOf(this.e.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0)));
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean AFLogger(@NonNull AFh1cSDK aFh1cSDK, AFh1cSDK aFh1cSDK2) {
        if (!(!aFh1cSDK.equals(aFh1cSDK2))) {
            afWarnLog = (afInfoLog + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return afInfoLog();
        }
        boolean zBooleanValue = ((Boolean) registerClient(new Object[]{this, Float.valueOf(aFh1cSDK.AFKeystoreWrapper)}, 830139978, -830139978, System.identityHashCode(this))).booleanValue();
        unregisterClient(zBooleanValue);
        afInfoLog = (afWarnLog + 33) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return zBooleanValue;
    }

    private synchronized boolean d(AFh1cSDK aFh1cSDK, AFh1cSDK aFh1cSDK2) {
        try {
            if (aFh1cSDK == null) {
                registerClient(new Object[]{this}, -811614036, 811614038, System.identityHashCode(this));
                return false;
            }
            if (TimeUnit.SECONDS.toMillis(aFh1cSDK.AFLogger) <= AFh1cSDK.registerClient()) {
                return false;
            }
            afInfoLog = (afWarnLog + 93) % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (!(this.e.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) <= aFh1cSDK.unregisterClient)) {
                return false;
            }
            if (!AFLogger(aFh1cSDK, aFh1cSDK2)) {
                afWarnLog = (afInfoLog + 45) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return false;
            }
            if (!AFKeystoreWrapper(aFh1cSDK.d)) {
                return false;
            }
            if (!d(aFh1cSDK.i)) {
                afInfoLog = (afWarnLog + 57) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return false;
            }
            int i = afWarnLog + 73;
            afInfoLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i % 2 != 0) {
                return true;
            }
            int i2 = 72 / 0;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    private static boolean d(String str) {
        int i = afInfoLog + 75;
        afWarnLog = i % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i % 2 != 0) {
            int i2 = 7 / 0;
            if (str != null) {
                if (str.trim().length() != 0) {
                    new AFd1ySDK();
                    return AFd1ySDK.registerClient(v(), str);
                }
            }
        } else if (str != null) {
            if (str.trim().length() != 0) {
                new AFd1ySDK();
                return AFd1ySDK.registerClient(v(), str);
            }
        }
        int i3 = afInfoLog + 41;
        afWarnLog = i3 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i3 % 2 != 0) {
            int i4 = 68 / 0;
        }
        return true;
    }

    private boolean d(float f) {
        return ((Boolean) registerClient(new Object[]{this, Float.valueOf(f)}, 830139978, -830139978, System.identityHashCode(this))).booleanValue();
    }

    private static String[] d(String str, StackTraceElement[] stackTraceElementArr) {
        return (String[]) registerClient(new Object[]{str, stackTraceElementArr}, -1008260537, 1008260540, (int) System.currentTimeMillis());
    }
}
