package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.f;
import io.sentry.instrumentation.file.k;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: vG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7155vG {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static long b = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: vG$a */
    public static final class a {
        public static final a d;
        public static final HashMap e;
        public static final /* synthetic */ a[] g;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("X86_32", 0);
            a aVar2 = new a("X86_64", 1);
            a aVar3 = new a("ARM_UNKNOWN", 2);
            a aVar4 = new a("PPC", 3);
            a aVar5 = new a("PPC64", 4);
            a aVar6 = new a("ARMV6", 5);
            a aVar7 = new a("ARMV7", 6);
            a aVar8 = new a("UNKNOWN", 7);
            d = aVar8;
            a aVar9 = new a("ARMV7S", 8);
            a aVar10 = new a("ARM64", 9);
            g = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
            HashMap map = new HashMap(4);
            e = map;
            map.put("armeabi-v7a", aVar7);
            map.put("armeabi", aVar6);
            map.put("arm64-v8a", aVar10);
            map.put("x86", aVar);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                b0.d("FirebaseCrashlytics", str, e);
            }
        }
    }

    public static String b(File file) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        String str = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new k(new f(file)), UserVerificationMethods.USER_VERIFY_ALL);
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String[] strArrSplit = Pattern.compile("\\s*:\\s*").split(line, 2);
                            if (strArrSplit.length > 1 && strArrSplit[0].equals("MemTotal")) {
                                str = strArrSplit[1];
                                break;
                            }
                            th = th;
                            bufferedReader2 = bufferedReader;
                            a(bufferedReader2, "Failed to close system file reader.");
                            throw th;
                        } catch (Exception e) {
                            e = e;
                            b0.d("FirebaseCrashlytics", "Error parsing " + file, e);
                            a(bufferedReader, "Failed to close system file reader.");
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                    }
                }
                a(bufferedReader, "Failed to close system file reader.");
                return str;
            } catch (Exception e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int c() {
        boolean zG = g();
        ?? r0 = zG;
        if (h()) {
            r0 = (zG ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static int d(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static synchronized long e() {
        long j;
        int i;
        try {
            if (b == -1) {
                String strB = b(new File("/proc/meminfo"));
                long j2 = 0;
                if (!TextUtils.isEmpty(strB)) {
                    String upperCase = strB.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j = Long.parseLong(upperCase.split("KB")[0].trim());
                            i = UserVerificationMethods.USER_VERIFY_ALL;
                        } else if (upperCase.endsWith("MB")) {
                            j = Long.parseLong(upperCase.split("MB")[0].trim());
                            i = 1048576;
                        } else if (upperCase.endsWith("GB")) {
                            j = Long.parseLong(upperCase.split("GB")[0].trim());
                            i = 1073741824;
                        } else {
                            b0.f("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: ".concat(upperCase), null);
                        }
                        j2 = j * ((long) i);
                    } catch (NumberFormatException e) {
                        b0.d("FirebaseCrashlytics", "Unexpected meminfo format while computing RAM: " + upperCase, e);
                    }
                }
                b = j2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public static String f(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = a;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static boolean g() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static boolean h() {
        boolean zG = g();
        String str = Build.TAGS;
        if ((zG || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zG && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static String i(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return f(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            b0.d("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e);
            return "";
        }
    }

    public static String j(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}
